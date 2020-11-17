import java.util.List;

public class Caso extends Brote {

    private final String name, id, lastName, fechaNacimiento, fechaInforme, riesgo, correo, genero, dirección, clasificación;
    private final int telefono;


    public Caso(String id, String name, List<Caso> casoList, String name1, String id1, String lastName, String fechaNacimiento, String fechaInforme, String riesgo, String correo, String genero, String dirección, String clasificación, int telefono) {
        super(id, name, casoList);
        this.name = name1;
        this.id = id1;
        this.lastName = lastName;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaInforme = fechaInforme;
        this.riesgo = riesgo;
        this.correo = correo;
        this.genero = genero;
        this.dirección = dirección;
        this.clasificación = clasificación;
        this.telefono = telefono;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getFechaInforme() {
        return fechaInforme;
    }

    public String getRiesgo() {
        return riesgo;
    }

    public String getCorreo() {
        return correo;
    }

    public String getGenero() {
        return genero;
    }

    public String getDirección() {
        return dirección;
    }

    public String getClasificación() {
        return clasificación;
    }

    public int getTelefono() {
        return telefono;
    }


    //Opcional
    @Override
    public String toString() {
        return "Caso{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", lastName='" + lastName + '\'' +
                ", fechaNacimiento='" + fechaNacimiento + '\'' +
                ", fechaInforme='" + fechaInforme + '\'' +
                ", riesgo='" + riesgo + '\'' +
                ", correo='" + correo + '\'' +
                ", genero='" + genero + '\'' +
                ", dirección='" + dirección + '\'' +
                ", clasificación='" + clasificación + '\'' +
                ", telefono=" + telefono +
                ", casoList=" + casoList +
                '}';
    }
}
