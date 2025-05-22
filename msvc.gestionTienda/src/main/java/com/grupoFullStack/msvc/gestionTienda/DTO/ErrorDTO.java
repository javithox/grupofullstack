package com.grupoFullStack.msvc.gestionTienda.DTO;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Map;
@Getter @Setter

public class ErrorDTO {
    private Integer status;
    private Date date;

    private Map<String,String> errors;

    public String toString(){
        return "{"+
                "status"+status+
                ", date="+date+
                ", erros"+errors+
                '}';
    }
}
