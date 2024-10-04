package homework4.exercitiu3;

public class Builder {
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

    //metode de a inscrie valori la cimpuri
    public Builder prenume(String prenume){
        this.prenume = prenume;
        return this;
    }

    public Builder numeDefamilie(String numeDefamilie){
        this.numeDefamilie = numeDefamilie;
        return this;
    }

    public Builder varsta(int varsta){
        this.varsta = varsta;
        return this;
    }

    public Cetatean build(){
        return new Cetatean(this);
    }

}
