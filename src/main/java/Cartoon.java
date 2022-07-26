public class Cartoon implements Editora{
    private int codigoImpressao;
    private String titulo;
    private String autor;
    private String categoria;

    public Cartoon(int codigoImpressao, String titulo, String autor, String categoria) {
        this.codigoImpressao = codigoImpressao;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
    }

    public int getCodigoImpressao() {
        return codigoImpressao;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getCategoria() {
        return categoria;
    }
    public String aceitar(Visitor visitor) {
        return visitor.imprimirCartoon(this);
    }
}
