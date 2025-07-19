public class BicicletaElectrica extends Bicicleta implements Electrico {
    @Override
    public void moverse() {
        System.out.println("Bicicleta eléctrica: entregas rápidas con asistencia");
    }
    
    @Override
    public void cargarBateria() {
        System.out.println("Cargando batería al 100%");
    }
}