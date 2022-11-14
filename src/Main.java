public class Main {
    public static void main(String[] args){
    MedioDeTransporte camionDisponible = new MedioDeTransporte( 500.0,
            new Dimension(2.5, 1.5 , 4), 3

    );
    objetosTransportables silla = new objetosTransportables("Mesa de Madera" , 2.0,
            new Dimension(0.4, 1, 0.2), false
    );
    }
    objetosTransportables televisor = new objetosTransportables("Televisor" , 5.0,
            new Dimension(2, 3, 1), true
    );
}
