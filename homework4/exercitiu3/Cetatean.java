package homework4.exercitiu3;

public class Cetatean {
    private String prenume;
    private String numeDefamilie;
    private int varsta;

    public String getPrenume() {
        return prenume;
    }

    public String getNumeDefamilie() {
        return numeDefamilie;
    }

    public int getVarsta() {
        return varsta;
    }

    @Override
    public String toString() {
        return "Cetatean{" +
                "prenume='" + prenume + '\'' +
                ", numeDefamilie='" + numeDefamilie + '\'' +
                ", varsta=" + varsta +
                '}';
    }
    Cetatean(Builder builder){
        this.prenume = builder.getPrenume();
        this.numeDefamilie = builder.getNumeDefamilie();
        this.varsta = builder.getVarsta();

    }
}
