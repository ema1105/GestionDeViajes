package com.GestionAsignaciondeViajes.Gav.Entity;


import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Conductor extends Usuario implements Serializable {


    @Column(nullable = false, unique = true)
    private String licencia;


    @Column
    private boolean disponibilidad;

    @OneToOne
    @JoinColumn(name = "automovil_id", nullable = false)
    private Automovil automovil;

    @OneToMany(mappedBy = "conductor", cascade = CascadeType.ALL)
    private List<Viaje> viajes = new ArrayList<>();

    public Conductor() {
    }

    public Conductor(Long id, String nombre_completo, String apellidos_completos, LocalDate fecha_nacimiento, String numero_telefonico, String nombreUsuario, String contraseña, String numero_documento, String licencia, boolean disponibilidad, Automovil automovil, List<Viaje> viajes) {
        super(id, nombre_completo, apellidos_completos, fecha_nacimiento, numero_telefonico, nombreUsuario, contraseña, numero_documento);
        this.licencia = licencia;
        this.disponibilidad = disponibilidad;
        this.automovil = automovil;
        this.viajes = viajes;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
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

    public List<Viaje> getViajes() {
        return viajes;
    }

    public void setViajes(List<Viaje> viajes) {
        this.viajes = viajes;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Conductor conductor = (Conductor) o;
        return Objects.equals(getLicencia(), conductor.getLicencia());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getLicencia());
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "id=" + id +
                ", Licencia='" + licencia + '\'' +
                ", disponibilidad=" + disponibilidad +
                ", automovil=" + (automovil != null ? automovil.getId() : "N/A") +
                ", cantidad de viajes=" + (viajes != null ? viajes.size() : 0) +
                '}' + super.toString();
    }

}


