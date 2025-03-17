package com.GestionAsignaciondeViajes.Gav.Repository;

import com.GestionAsignaciondeViajes.Gav.Entity.Viaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ViajeRepository extends JpaRepository<Viaje, Long> {

}
