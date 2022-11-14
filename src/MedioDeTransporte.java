import java.util.ArrayList;

public class MedioDeTransporte {
    private ArrayList<objetosTransportables> transportables;
    private double capacidadMaxima;
    private double capacidadActual;
    private Dimension dimension;
    private int cantidadMaxima;

    public ArrayList<objetosTransportables> getTransportables() {
        return transportables;
    }

    public void setTransportables(ArrayList<objetosTransportables> transportables) {
        this.transportables = transportables;
    }
    public double getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(double capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public double getCapacidadActual() {
        return capacidadActual;
    }

    public void setCapacidadActual(double capacidadActual) {
        this.capacidadActual = capacidadActual;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    public int getCantidadMaxima() {
        return cantidadMaxima;
    }

    public void setCantidadMaxima(int cantidadMaxima) {
        this.cantidadMaxima = cantidadMaxima;
    }

    public void cargar(objetosTransportables transportables){
        getTransportables().add(transportables);
    }

    MedioDeTransporte(double capacidadMaxima, Dimension dimension, int cantidadMaxima){
        setTransportables(new ArrayList<objetosTransportables>());
        setCapacidadActual(0);
        setCapacidadMaxima(capacidadMaxima);
        setDimension(dimension);
        setCantidadMaxima(cantidadMaxima);
    }
    MedioDeTransporte(double capacidadMaxima, Dimension dimension, int cantidadMaxima, double capacidadActual){
        setTransportables(new ArrayList<objetosTransportables>());
        setCapacidadActual(capacidadActual);
    }
}
