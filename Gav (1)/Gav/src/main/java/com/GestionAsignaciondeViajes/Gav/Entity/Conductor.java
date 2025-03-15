package com.GestionAsignaciondeViajes.Gav.Entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
public class Conductor extends Usuario implements Serializable {


    @Column(nullable = false, unique = true)
    private String Licencia;

<<<<<<< HEAD
    @Column
    boolean disponibilidad;
=======
    @Column(nullable = false)
    private boolean disponibilidad;
>>>>>>> 236cab9 (AHORA SI EL PROYECTO XD)

    @OneToOne
    private Automovil automovil;

    @ManyToOne
    private Viaje viaje;

    public Conductor() {
    }

    public Conductor(Long id, String nombre_completo, String apellidos_completos,
                     LocalDate fecha_nacimiento, String numero_telefonico, String usuario, String contraseña, String numero_documento) {
        super(id, nombre_completo, apellidos_completos, fecha_nacimiento, numero_telefonico, usuario, contraseña, numero_documento);
    }

    public Conductor(Long id, String licencia, boolean disponibilidad, Automovil automovil, Viaje viaje) {
        this.id = id;
        Licencia = licencia;
        this.disponibilidad = disponibilidad;
        this.automovil = automovil;
        this.viaje = viaje;
    }

    public Conductor(Long id, String nombre_completo, String apellidos_completos, LocalDate fecha_nacimiento,
                     String numero_telefonico, String usuario, String contraseña, String numero_documento, Long id1, String licencia, boolean disponibilidad, Automovil automovil, Viaje viaje) {
        super(id, nombre_completo, apellidos_completos, fecha_nacimiento, numero_telefonico, usuario, contraseña, numero_documento);
        this.id = id1;
        Licencia = licencia;
        this.disponibilidad = disponibilidad;
        this.automovil = automovil;
        this.viaje = viaje;
    }


    public String getLicencia() {
        return Licencia;
    }

    public void setLicencia(String licencia) {
        Licencia = licencia;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

    public Viaje getViaje() {
        return viaje;
    }

    public void setViaje(Viaje viaje) {
        this.viaje = viaje;
    }
    public boolean equals(Object o){
        if(this == o)return true;
        if(!(o instanceof Conductor)) return false;
        if(!super.equals(o)) return false;
        Conductor conductor = (Conductor) o;
        return Objects.equals(id , conductor.id)&&
               Objects.equals(Licencia, conductor.Licencia)&&
               Objects.equals(getUsuario(), conductor.getUsuario())&&
               Objects.equals(getNumero_documento(), conductor.getNumero_documento())&&
               Objects.equals(getNumero_telefonico(), conductor.getNumero_telefonico())&&
               Objects.equals(automovil, conductor.automovil);

    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), id, Licencia, disponibilidad, automovil, viaje);
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "id=" + id +
                ", Licencia='" + Licencia + '\'' +
                ", disponibilidad=" + disponibilidad +
                ", automovil=" + automovil +
                ", viaje=" + viaje +
                '}'+ super.toString();
    }
}


