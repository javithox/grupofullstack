package Repository;

import models.Venta;

import java.util.List;

public interface gestionVentaRepository extends JpaRepository<Venta, Long> {
    List<Venta> findByUsuarioId(Long usuarioId);
}
