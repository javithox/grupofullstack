package repository;

import models.registroAcceso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistroAccesoRepository extends JpaRepository<registroAcceso, Long> {}
