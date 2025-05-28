package Services;

import Repository.gestionEnvioRepository;
import models.Envio;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class envioService {

    @Autowired
    private gestionEnvioRepository GestionEnvioRepository;

    public Envio crearEnvio(Envio envio) {
        envio.setEstado("PENDIENTE");
        envio.setFechaEnvio(LocalDate.now());
        envio.setFechaEntrega(LocalDate.now().plusDays(5));
        return GestionEnvioRepository.save(envio);
    }

    public static List<Envio> listar() {
        return GestionEnvioRepository.findAll();
    }

    public Optional<Envio> porId(Long id) {
        return GestionEnvioRepository.findById(id);
    }

}
