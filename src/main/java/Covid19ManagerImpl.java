import java.util.HashMap;
import java.util.List;

public class Covid19ManagerImpl implements Covid19Manager {

    private static Covid19Manager instancia;


    private HashMap<String, Brote> diccionarioBrote;

    private List<Brote> brotesDisponibles;

    private List<Caso> casosDeBroteByClasificacion;

    private List<Brote> getBrote;

    private List<Caso> contenedorCasos;

    public Covid19ManagerImpl(HashMap<String, Brote> diccionarioBrote, List<Brote> brotesDisponibles, List<Caso> casosDeBroteByClasificacion, List<Brote> getBrote, List<Caso> contenedorCasos) {
        this.diccionarioBrote = diccionarioBrote;
        this.brotesDisponibles = brotesDisponibles;
        this.casosDeBroteByClasificacion = casosDeBroteByClasificacion;
        this.getBrote = getBrote;
        this.contenedorCasos = contenedorCasos;
    }

    public void addBrote(Brote b) {
       brotesDisponibles.add(b);
    }

    public void getBrote(String idBrote) {

    }

    public void addCaso(Caso c) {
        contenedorCasos.add(c);

    }

    public HashMap<String, Brote> diccionarioBrote() {
        return null;
    }

    public List<Brote> brotesDisponibles() {
        return null;
    }

    public List<Caso> casosDeBroteByClasificacion(Brote B) throws BroteNotFoundException {
        return null;
    }

    public List<Brote> getBrote() {
        return null;
    }

    public List<Caso> contenedorCasos(Brote B) throws BroteNotFoundException {
        return null;
    }

    //Crear instancia de Singleton



}
