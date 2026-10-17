package ejemplosClase;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        //! EJEMPLO LIBRO
        // Libro libro = new Libro();
        // libro.titulo = "Clean Code";
        // libro.autor = "Robert Martin";
        // libro.paginas = 464;
        // System.out.println(libro.descripcion());

        //! Ejemplo producto
        Producto vacio = new Producto();
        vacio.mostrar();

        Producto cafe = new Producto("Cafe", 12000.0);
        cafe.mostrar();
    }
}
