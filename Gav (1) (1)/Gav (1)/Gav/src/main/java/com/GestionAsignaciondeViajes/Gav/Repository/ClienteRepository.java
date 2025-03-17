package com.GestionAsignaciondeViajes.Gav.Repository;

import com.GestionAsignaciondeViajes.Gav.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
