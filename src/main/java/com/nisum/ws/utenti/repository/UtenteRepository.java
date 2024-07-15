package com.nisum.ws.utenti.repository;

import com.nisum.ws.utenti.model.entity.UtenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UtenteRepository extends JpaRepository<UtenteEntity, Long> {
    Optional<UtenteEntity> findByUsernameAndPassword(String username, String password);
}
