package com.GestionAsignaciondeViajes.Gav.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Objects;

@Entity
public class Automovil implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String Marca;

    @Column(nullable = false)
    private String Modelo;

    @Column(nullable = false)
    private int CapacidadMaxima;

    @Column(nullable = false, unique = true)
    private String Placa;

    @OneToOne
    @JoinColumn(name = "CONDUCTOR", nullable = false)
    private Conductor conductor;

    public Automovil() {
    }

    public Automovil(Long id, String marca, String modelo,
                     int capacidadMaxima, String placa, Conductor conductor) {
        this.id = id;
        Marca = marca;
        Modelo = modelo;
        CapacidadMaxima = capacidadMaxima;
        Placa = placa;
        this.conductor = conductor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public int getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        CapacidadMaxima = capacidadMaxima;
    }

    public String getPlaca() {
        return Placa;
    }

    public void setPlaca(String placa) {
        Placa = placa;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Automovil automovil)) return false;
        return CapacidadMaxima == automovil.CapacidadMaxima &&
                Objects.equals(id, automovil.id) &&
                Objects.equals(Marca, automovil.Marca) &&
                Objects.equals(Modelo, automovil.Modelo) &&
                Objects.equals(Placa, automovil.Placa) &&
                Objects.equals(conductor, automovil.conductor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Marca, Modelo, CapacidadMaxima, Placa, conductor);
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "id=" + id +
                ", Marca='" + Marca + '\'' +
                ", Modelo='" + Modelo + '\'' +
                ", CapacidadMaxima=" + CapacidadMaxima +
                ", Placa='" + Placa + '\'' +
                ", conductor=" + conductor +
                '}';
    }
}
