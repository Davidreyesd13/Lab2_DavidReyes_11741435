
package lab2_davidreyes_11741435;
public class Animal {
String nombre;    
String nombrec;
String Habitat;
String Alimentacion;
String Descrasgos;
String geografica;
int vida;

    public Animal() {
    }

    public Animal(String nombre, String nombrec, String Habitat, String Alimentacion, String Descrasgos, String geografica, int vida) {
        this.nombre = nombre;
        this.nombrec = nombrec;
        this.Habitat = Habitat;
        this.Alimentacion = Alimentacion;
        this.Descrasgos = Descrasgos;
        this.geografica = geografica;
        this.vida = vida;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public String getHabitat() {
        return Habitat;
    }

    public void setHabitat(String Habitat) {
        this.Habitat = Habitat;
    }

    public String getAlimentacion() {
        return Alimentacion;
    }

    public void setAlimentacion(String Alimentacion) {
        this.Alimentacion = Alimentacion;
    }

    public String getDescrasgos() {
        return Descrasgos;
    }

    public void setDescrasgos(String Descrasgos) {
        this.Descrasgos = Descrasgos;
    }

    public String getGeografica() {
        return geografica;
    }

    public void setGeografica(String geografica) {
        this.geografica = geografica;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public String toString() {
        return "Animal{" + "Nombre=" + nombre + ", nombrec=" + nombrec + ", Habitat=" + Habitat + ", Alimentacion=" + Alimentacion + ", Descrasgos=" + Descrasgos + ", geografica=" + geografica + ", vida=" + vida + '}';
    }


}
