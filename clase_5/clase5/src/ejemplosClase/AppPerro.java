package ejemplosClase;

public class AppPerro {
    public static void main(String[] args) {
        Perro miPerro = new Perro();
        miPerro.nombre = "Firulais";
        miPerro.raza = "Labrador";
        miPerro.ladrar();

        Perro otroPerro = new Perro();
        otroPerro.nombre = "Rocky";
        otroPerro.ladrar();
    }
}