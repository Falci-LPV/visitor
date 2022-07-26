import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class EditoraVisitorTest {


    @Test
    void deveImprimirHQ() {
        HQ hq = new HQ(1, "20 Mil Legua Submarinas","Davinci","Comédia");

        EditoraVisitor visitor = new EditoraVisitor();
        assertEquals("HQ{codigoImpressao=1, titulo='20 Mil Legua Submarinas', autor='Davinci', categoria='Comédia'}", visitor.exibir(hq));
    }

    @Test
    void deveImprimirLivro() {
        Livro livro = new Livro(1, "20 Mil Legua Submarinas","Davinci","Comédia");

        EditoraVisitor visitor = new EditoraVisitor();
        assertEquals("HQ{codigoImpressao=1, titulo='20 Mil Legua Submarinas', autor='Davinci', categoria='Comédia'}", visitor.exibir(livro));
    }

    @Test
    void deveImprimirCartoon() {
        Cartoon cartoon = new Cartoon(1, "20 Mil Legua Submarinas","Davinci","Comédia");

        EditoraVisitor visitor = new EditoraVisitor();
        assertEquals("HQ{codigoImpressao=1, titulo='20 Mil Legua Submarinas', autor='Davinci', categoria='Comédia'}", visitor.exibir(cartoon));
    }
    @Test
    void deveImprimirManga() {
        Manga manga = new Manga(1, "20 Mil Legua Submarinas","Davinci","Comédia");

        EditoraVisitor visitor = new EditoraVisitor();
        assertEquals("HQ{codigoImpressao=1, titulo='20 Mil Legua Submarinas', autor='Davinci', categoria='Comédia'}", visitor.exibir(manga));
    }
}