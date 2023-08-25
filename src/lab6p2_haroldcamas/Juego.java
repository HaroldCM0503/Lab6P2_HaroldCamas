package lab6p2_haroldcamas;

import java.util.Date;

public class Juego {
    private String nombre;
    private String descripcion;
    private Date lanzamiento;
    private int precio;
    private boolean estado;
    private boolean rentable;
    private boolean agregado;
    private int cantidad;

    public Juego() {
    }

    public Juego(String nombre, String descripcion, Date lanzamiento, int precio, boolean estado, boolean rentable, boolean agregado, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.lanzamiento = lanzamiento;
        this.precio = precio;
        this.estado = estado;
        this.rentable = rentable;
        this.agregado = agregado;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getLanzamiento() {
        return lanzamiento;
    }

    public void setLanzamiento(Date lanzamiento) {
        this.lanzamiento = lanzamiento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isRentable() {
        return rentable;
    }

    public void setRentable(boolean rentable) {
        this.rentable = rentable;
    }

    public boolean isAgregado() {
        return agregado;
    }

    public void setAgregado(boolean agregado) {
        this.agregado = agregado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return nombre + "[" + precio + "]" + " ,cant: " + cantidad;
    }
}
