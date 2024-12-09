public class LivroLivraria {

    private String titulo;
    private String autor;
    private int isbn;
    private String genero;
    private double preco;

    // Construtores
    public LivroLivraria() {
    }

    public LivroLivraria(String titulo, String autor, int isbn, String genero, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.genero = genero;
        this.preco = preco;
    }

    // Métodos de acesso
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

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    //Imprimir
    public String imprimir() {
        return "Titulo: " + titulo +
                "\nAutor: " + autor +
                "\nIsbn: " + isbn +
                "\nGenero: " + genero +
                String.format("\nPreço: R$ %.2f \n", preco);
    }
}
