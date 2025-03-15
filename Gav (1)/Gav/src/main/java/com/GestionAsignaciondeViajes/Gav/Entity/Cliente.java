package com.GestionAsignaciondeViajes.Gav.Entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Cliente extends Usuario {


    public Cliente() {
    }

    public Cliente(Long id, String nombre_completo, String apellidos_completos,
                   LocalDate fecha_nacimiento, String numero_telefonico, String usuario,
                   String contraseña, String numero_documento) {
        super(id, nombre_completo, apellidos_completos, fecha_nacimiento, numero_telefonico, usuario, contraseña, numero_documento);
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", id=" + id +
                '}'+ super.toString();
    }
}


