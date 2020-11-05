package kata3;

/**
 *
 * @author josei
 */
public class Kata3 {

    public static void main(String[] args) {
        
        Histograma<String> histograma = new Histograma();
        histograma.increment("ulpgc.es");
        histograma.increment("ull.es");
        histograma.increment("ulpgc.es");
        histograma.increment("dis.ulpgc.es");
        histograma.increment("ulpgc.es");
        histograma.increment("gmail.es");
        
        
        HistogramaDisplay histogramaDisplay = new HistogramaDisplay("Histograma ...", histograma);
        histogramaDisplay.execute();
    }
    
}
