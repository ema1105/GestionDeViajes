package com.GestionAsignaciondeViajes.Gav.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Cliente extends Usuario {


    public Cliente() {
    }

    public Cliente(Long id, String nombre_completo, String apellidos_completos, LocalDate fecha_nacimiento, String numero_telefonico, String nombreUsuario, String contraseña, String numero_documento) {
        super(id, nombre_completo, apellidos_completos, fecha_nacimiento, numero_telefonico, nombreUsuario, contraseña, numero_documento);
    }


    @Override
    public String toString() {
        return "Cliente{" + super.toString() + "}";
    }
}


