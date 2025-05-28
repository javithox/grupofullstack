package Repository;

import models.Envio;

import java.util.List;

public interface gestionEnvioRepository extends JpaRepository<Envio, Long> {
    List<Envio> findByVentaId(Long ventaId);
}
