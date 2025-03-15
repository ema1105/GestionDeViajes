package com.GestionAsignaciondeViajes.Gav.Repository;

import com.GestionAsignaciondeViajes.Gav.Entity.Conductor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConductorRepository extends JpaRepository<Conductor, Long> {
/*
    List<Conductor> findByDisponible(boolean disponibilidad);

    Conductor findByUsuario(String usuario);

    Conductor findByDocumento(String numero_documento);

    boolean existsByUsuario(String usuario);

    boolean existsByDocumento(String numero_documento);

    boolean existsByTelefono(String numero_telefonico);

    boolean existsByTelefonoAndIdNot(String numero_telefonico, Long id);

    boolean existsByDocumentoAndIdNot(String numero_documento, Long id);

    boolean existsByUsuarioAndIdNot(String usuario, Long id);
*/}