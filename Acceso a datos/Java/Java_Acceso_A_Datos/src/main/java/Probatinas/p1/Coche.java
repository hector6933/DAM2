package Probatinas.p1;

// implements Comparable
public class Coche {

    private String matricula;
    private String vin;
    private String owner;
    private int potencia;

    public Coche() {
    }

    public Coche(String matricula, String vin, String owner, int potencia) {
        this.matricula = matricula;
        this.vin = vin;
        this.owner = owner;
        this.potencia = potencia;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "matricula='" + matricula + '\'' +
                ", vin='" + vin + '\'' +
                ", owner='" + owner + '\'' +
                ", potencia=" + potencia +
                '}';
    }

//    @Override
//    public int compareTo(Object o) {
//        Coche cochetmp = (Coche) o;
//        return this.matricula.compareTo(cochetmp.getMatricula());
//    }

}
