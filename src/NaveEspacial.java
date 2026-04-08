public class NaveEspacial {
    private String matricula;
    private int numMiembros;
    private int nivelCombustible;

    public NaveEspacial (String matricula, int numMiembros, int nivelCombustible){
        this.matricula = matricula;
        this.numMiembros = numMiembros;
        this.nivelCombustible = nivelCombustible;
    }

    public String realizarMision(){
        return "Nave Espacial con matrícula: " + matricula +
                "\nNúmeros de miembros: " + numMiembros +
                "\n Nivel de combuestible actual: " + nivelCombustible;

    }

}
