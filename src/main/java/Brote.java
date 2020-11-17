import java.util.List;

public class Brote {



    //Atributos
    private final String id;
    private final String name;
    List<Caso> casoList;

    //Constructor
    public Brote(String id, String name, List<Caso> casoList) {
        this.id = id;
        this.name = name;
        this.casoList = casoList;
    }


    //Getters y Setters
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Caso> getCasoList() {
        return casoList;
    }

    public void setCasoList(List<Caso> casoList) {
        this.casoList = casoList;
    }

    @Override
    public String toString() {
        return "Brote{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", casoList=" + casoList +
                '}';
    }
}
