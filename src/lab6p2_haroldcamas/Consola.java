package lab6p2_haroldcamas;

import java.util.ArrayList;

public class Consola {
    private String identificacion;
    private String fabricante;
    private int años;
    private int precio;
    private ArrayList videojuegos = new ArrayList();
    private String modelo;

    public Consola() {
    }

    public Consola(String identificacion, String fabricante, int años, int precio, String modelo) {
        this.identificacion = identificacion;
        this.fabricante = fabricante;
        this.años = años;
        this.precio = precio;
        this.modelo = modelo;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAños() {
        return años;
    }

    public void setAños(int años) {
        this.años = años;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public ArrayList getVideojuegos() {
        return videojuegos;
    }

    public void setVideojuegos(ArrayList videojuegos) {
        this.videojuegos = videojuegos;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return modelo + "[" + fabricante + "]";
    }
    
    
}
