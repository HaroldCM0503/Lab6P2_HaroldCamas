package lab6p2_haroldcamas;

public class Estacionaria extends Consola{
    private int controles;
    private int almacenamiento;
    private String conexion;

    public Estacionaria() {
    }

    public Estacionaria(int controles, int almacenamiento, String conexion, String identificacion, String fabricante, int años, int precio, String modelo) {
        super(identificacion, fabricante, años, precio, modelo);
        this.controles = controles;
        this.almacenamiento = almacenamiento;
        this.conexion = conexion;
    }

    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public String getConexion() {
        return conexion;
    }

    public void setConexion(String conexion) {
        this.conexion = conexion;
    }

    @Override
    public String toString() {
        return "Estacionaria";
    }
}
