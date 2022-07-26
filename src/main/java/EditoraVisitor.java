public class EditoraVisitor implements Visitor {

    public String exibir(Editora editora) {
        return editora.aceitar(this);
    }

    @Override
    public String imprimirHQ(HQ hq) {
        return "HQ{" +
                "codigoImpressao=" + hq.getCodigoImpressao() +
                ", titulo='" + hq.getTitulo() + '\'' +
                ", autor='" + hq.getAutor() + '\'' +
                ", categoria='" + hq.getCategoria() + '\'' +
                '}';
    }

    @Override
    public String imprimirLivro(Livro livro) {
        return "HQ{" +
                "codigoImpressao=" + livro.getCodigoImpressao() +
                ", titulo='" + livro.getTitulo() + '\'' +
                ", autor='" + livro.getAutor() + '\'' +
                ", categoria='" + livro.getCategoria() + '\'' +
                '}';
    }

    @Override
    public String imprimirManga(Manga manga) {
        return "HQ{" +
                "codigoImpressao=" + manga.getCodigoImpressao() +
                ", titulo='" + manga.getTitulo() + '\'' +
                ", autor='" + manga.getAutor() + '\'' +
                ", categoria='" + manga.getCategoria() + '\'' +
                '}';
    }

    @Override
    public String imprimirCartoon(Cartoon cartoon) {
        return "HQ{" +
                "codigoImpressao=" + cartoon.getCodigoImpressao() +
                ", titulo='" + cartoon.getTitulo() + '\'' +
                ", autor='" + cartoon.getAutor() + '\'' +
                ", categoria='" + cartoon.getCategoria() + '\'' +
                '}';
    }
}
