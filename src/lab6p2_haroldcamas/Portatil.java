package lab6p2_haroldcamas;

public class Portatil extends Consola{
    private String tamaño;
    private int bateria;
    private boolean estuche;

    public Portatil() {
    }

    public Portatil(String tamaño, int bateria, boolean estuche, String identificacion, String fabricante, int años, int precio, String modelo) {
        super(identificacion, fabricante, años, precio, modelo);
        this.tamaño = tamaño;
        this.bateria = bateria;
        this.estuche = estuche;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    public boolean isEstuche() {
        return estuche;
    }

    public void setEstuche(boolean estuche) {
        this.estuche = estuche;
    }

    @Override
    public String toString() {
        return "Portatil " + super.toString();
    }
}
