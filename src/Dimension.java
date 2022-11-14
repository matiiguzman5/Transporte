public class Dimension {
    private double alto;
    private double ancho;
    private double profundidad;

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    Dimension(double ancho, double alto, double profundidad){
        setAncho(ancho);
        setAlto(alto);
        setProfundidad(profundidad);

    }

}
