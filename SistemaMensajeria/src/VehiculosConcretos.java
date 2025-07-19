public class Motocicleta extends Vehiculo {
    @Override
    public void moverse() {
        System.out.println("Motocicleta: entregando en zonas urbanas");
    }
}

public class Camion extends Vehiculo {
    @Override
    public void moverse() {
        System.out.println("Camión: transportando carga pesada");
    }
}

public class Bicicleta extends Vehiculo {
    @Override
    public void moverse() {
        System.out.println("Bicicleta: entregas ecológicas");
    }
}

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
