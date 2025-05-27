package Services;

import Repository.gestionVentaRepository;
import models.Venta;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class ventaService {

    @Autowired
    private gestionVentaRepository gestionVentaRepository;

    public Venta crearVenta(Venta venta) {
       venta.setFecha(LocalDate.now());
       venta.setEstado("CREADA");
        return gestionVentaRepository.save(venta);
    }

    public List<Venta> listarVentas() {
        return gestionVentaRepository.findAll();
    }

    public Optional<Venta> porId(Long id) {
        return gestionVentaRepository.findById(id);
    }

    public List<Venta> porUsuario(Long usuarioId) {
        return gestionVentaRepository.findByUsuarioId(usuarioId);
    }

}
