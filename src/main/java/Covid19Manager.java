import sun.jvm.hotspot.runtime.StaticBaseConstructor;

import java.util.HashMap;
import java.util.List;

public interface Covid19Manager {


    //private List<Brote> brotesDisponibles();

    //Crear un nuevo brote
    public void addBrote(Brote b);



    public void getBrote(String idBrote);

    //
    //public Caso getCaso();


    public void addCaso(Caso c);



    //Operaciones

    //Listar los brotes disponibles


    public HashMap<String, Brote> diccionarioBrote();


    public List<Brote> brotesDisponibles();

    public List<Caso> casosDeBroteByClasificacion(Brote B) throws BroteNotFoundException;

    public List<Brote> getBrote();

    public List<Caso> contenedorCasos(Brote B) throws BroteNotFoundException;




}
