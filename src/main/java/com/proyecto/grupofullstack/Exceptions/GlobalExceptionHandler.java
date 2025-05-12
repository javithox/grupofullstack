package com.proyecto.grupofullstack.Exceptions;

import com.proyecto.grupofullstack.DTO.ErrorDTO;
import com.proyecto.grupofullstack.models.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private ErrorDTO createErrorDTO(int status , Date date, Map<String, String>errorMaps){
        ErrorDTO errorDTO =new ErrorDTO();

        errorDTO.setStatus(status);
        errorDTO.setDate(date);
        errorDTO.setErrors(errorMaps);

        return errorDTO;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDTO> handleValidationFields(MethodArgumentNotValidException exception){
        Map<String,String> errorMaps=new HashMap<>();
        for(FieldError fieldError:exception.getBindingResult().getFieldErrors()){
            errorMaps.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body(this.createErrorDTO(HttpStatus.BAD_REQUEST.value(), new Date(),errorMaps));
    }

    @ExceptionHandler(UsuarioException.class)
    public ResponseEntity<ErrorDTO> handleUsuarioException(UsuarioException exception){
        if(exception.getMessage().contains("no se encuentra en la base de datos")){

            Map<String, String> errorMaps = Collections.singletonMap("Usuario no encontrado",exception.getMessage());
            return ResponseEntity
                    .status(HttpStatus.NOT_FOUND)
                    .body(this.createErrorDTO(HttpStatus.NOT_FOUND.value(), new Date(),errorMaps));
        }else{
            Map<String, String> errorMaps =Collections.singletonMap("Usuario existe",exception.getMessage());
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body(this.createErrorDTO(HttpStatus.CONFLICT.value(),new Date(),errorMaps));

        }
    }
}
