package com.GestionAsignaciondeViajes.Gav.Entity;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Objects;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(nullable = false)
    private String nombre_completo;

    @Column(nullable = false)
    private String apellidos_completos;

    /*FECHA DE NACICMEINTO PARA SABER SI EL USUARIO ES MAYOR DE EDAD*/
    @Column(nullable = false)
    private LocalDate fecha_nacimiento;

    @Column(nullable = false, unique = true)
    private  String numero_telefonico;

    @Enumerated(EnumType.STRING)
    private TipoDocumento tipoDocumento;

    @Column(nullable = false, unique = true)
    private String numero_documento;

    public enum TipoDocumento {
        CEDULA,
        PASAPORTE,
        CEDULA_EXTRANJERIA,
        PERMISO_DE_PERMANENCIA;
    }

    @Column(nullable = false, unique = true)
    private String usuario;

    @Column(nullable = false, unique = true)
    private String contraseña;

    @Enumerated(EnumType.STRING)
    private TipoUsuario tipoUsuario;

    public enum TipoUsuario{
            CLIENTE,
            ADMINISTRADOR,
            CONDUCTOR
    }

<<<<<<< HEAD

=======
>>>>>>> 236cab9 (AHORA SI EL PROYECTO XD)
    public Usuario() {
    }

    public Usuario(Long id, String nombre_completo, String apellidos_completos,
                   LocalDate fecha_nacimiento, String numero_telefonico, String usuario, String contraseña, String numero_documento) {
        this.id = id;
        this.nombre_completo = nombre_completo;
        this.apellidos_completos = apellidos_completos;
        this.fecha_nacimiento = fecha_nacimiento;
        this.numero_telefonico = numero_telefonico;
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.numero_documento = numero_documento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre_completo() {
        return nombre_completo;
    }

    public void setNombre_completo(String nombre_completo) {
        this.nombre_completo = nombre_completo;
    }

    public String getApellidos_completos() {
        return apellidos_completos;
    }

    public void setApellidos_completos(String apellidos_completos) {
        this.apellidos_completos = apellidos_completos;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public String getNumero_telefonico() {
        return numero_telefonico;
    }

    public void setNumero_telefonico(String numero_telefonico) {
        this.numero_telefonico = numero_telefonico;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getNumero_documento() {
        return numero_documento;
    }

    public void setNumero_documento(String numero_documento) {
        this.numero_documento = numero_documento;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Usuario)) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id) &&
                Objects.equals(numero_telefonico, usuario.numero_telefonico) &&
                Objects.equals(usuario, usuario.usuario) &&
                Objects.equals(numero_documento, usuario.numero_documento);
    }


    @Override
    public int hashCode(){
    return Objects.hash(id, numero_telefonico, usuario, numero_documento);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre_completo='" + nombre_completo + '\'' +
                ", apellidos_completos='" + apellidos_completos + '\'' +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", numero_telefonico='" + numero_telefonico + '\'' +
                ", tipoDocumento=" + tipoDocumento +
                ", numero_documento='" + numero_documento + '\'' +
                ", usuario='" + usuario + '\'' +
                ", contraseña='" + contraseña + '\'' +
                '}';
    }
}

