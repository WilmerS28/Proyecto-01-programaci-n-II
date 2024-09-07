package Method;

class CocheFactory implements VehiculoFactory {
    public Vehiculo crearVehiculo() {
        return new Coche();
    }
}

class MotoFactory implements VehiculoFactory {
    public Vehiculo crearVehiculo() {
        return new Moto();
    }
}
