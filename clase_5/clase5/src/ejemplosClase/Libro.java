package ejemplosClase;

public class Libro {
    private String titulo;
    String autor;
    int paginas;

    //! Constructor vacio mismo nombre de la clase
    public Libro() {
    }

    String descripcion() {
        return titulo + " de " + autor + " (" + paginas + " paginas)";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }
}
