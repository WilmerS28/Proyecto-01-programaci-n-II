package Method;

public class Main {
    public static void main(String[] args) {
        VehiculoFactory cocheFactory = new CocheFactory();
        Vehiculo coche = cocheFactory.crearVehiculo();
        coche.conducir(); // Output: Conduciendo un coche.

        VehiculoFactory motoFactory = new MotoFactory();
        Vehiculo moto = motoFactory.crearVehiculo();
        moto.conducir(); // Output: Conduciendo una motocicleta.
    }
}
