package com.GestionAsignaciondeViajes.Gav.Entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
public class Viaje implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String destino;

    @Enumerated(EnumType.STRING)
    private EstadoViaje estadoViaje;

    @Column(nullable = false)
    private double precioViaje;

    @Column(nullable = false)
    private int CantidadPasajeros;

   @Temporal(TemporalType.DATE)
    Date fechaViaje;

   @ManyToOne
   @JoinColumn(name = "CONDUCTOR", nullable = false)
    private Conductor conductor;

   @ManyToOne
   @JoinColumn(name = "CLIENTE", nullable = false)
   private Cliente cliente;

   public enum EstadoViaje{
       SOLICITADO,
       ASIGNADO,
       COMPLETADO,
       CANCELADO,
       EN_CURSO;
   }

    public Viaje() {
    }

    public Viaje(Long id, String destino, EstadoViaje estadoViaje, double precioViaje, int cantidadPasajeros,
                 Date fechaViaje, Conductor conductor, Cliente cliente) {
        this.id = id;
        this.destino = destino;
        this.estadoViaje = estadoViaje;
        this.precioViaje = precioViaje;
        CantidadPasajeros = cantidadPasajeros;
        this.fechaViaje = fechaViaje;
        this.conductor = conductor;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public EstadoViaje getEstadoViaje() {
        return estadoViaje;
    }

    public void setEstadoViaje(EstadoViaje estadoViaje) {
        this.estadoViaje = estadoViaje;
    }

    public double getPrecioViaje() {
        return precioViaje;
    }

    public void setPrecioViaje(double precioViaje) {
        this.precioViaje = precioViaje;
    }

    public int getCantidadPasajeros() {
        return CantidadPasajeros;
    }

    public void setCantidadPasajeros(int cantidadPasajeros) {
        CantidadPasajeros = cantidadPasajeros;
    }

    public Date getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(Date fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Viaje viaje = (Viaje) o;
        return Objects.equals(id, viaje.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Viaje{" +
                "id=" + id +
                ", destino='" + destino + '\'' +
                ", estadoViaje=" + estadoViaje +
                ", precioViaje=" + precioViaje +
                ", CantidadPasajeros=" + CantidadPasajeros +
                ", fechaViaje=" + fechaViaje +
                ", conductor=" + conductor +
                ", cliente=" + cliente +
                '}';
    }
}
