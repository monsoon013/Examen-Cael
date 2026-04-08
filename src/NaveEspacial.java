public abstract class NaveEspacial { //creamos la Madre como una clase abstracta
    //Creamos los atributos
    private String matricula;
    private int numMiembros;
    private int nivelCombustible;
    //Creamos el constructor
    public NaveEspacial (String matricula, int numMiembros, int nivelCombustible){
        this.matricula = matricula;
        this.numMiembros = numMiembros;
        this.nivelCombustible = nivelCombustible;
    }

    //Creamos los getters para hacerlos publicos

    public String getMatricula(){return matricula;}
    public int getNumMiembros(){return numMiembros;}
    public int getNivelCombustible(){return nivelCombustible;}
    //Creamos el metodo abstracto que será diferente para cada hija
    public abstract String realizarMision();


}
