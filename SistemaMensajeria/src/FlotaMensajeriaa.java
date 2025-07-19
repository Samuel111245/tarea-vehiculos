import java.util.ArrayList;

public class FlotaMensajeriaa {
    public static void main(String[] args) {
        ArrayList<Vehiculo> flota = new ArrayList<>();
        
        flota.add(new Motocicleta());
        flota.add(new Camion());
        flota.add(new Bicicleta());
        flota.add(new BicicletaElectrica());
        
        for (Vehiculo v : flota) {
            v.moverse();
            v.entregar();
            
            if (v instanceof Electrico) {
                ((Electrico)v).cargarBateria();
            }
            System.out.println("------------------");
        }
    }
}