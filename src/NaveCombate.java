public class NaveCombate extends NaveEspacial implements MotorHiperespacial {
    //Extends -> para que herede de la Madre
    //Implements -> para que obtenga el metodo unico de la interfaz.
    //Creamos el constructor, dado que no tiene ningún atributo a mayores, añadimos los atributos de la Madre
    // con super()
    public NaveCombate(String matricula, int numMiembros, int nivelCombustible){
        super(matricula, numMiembros, nivelCombustible);
    }
    //Añadimos el metodo abstracto Realizarmision y que devuelva el mensaje segun la hija
    public String realizarMision(){
        return "\nMatrícula: " + getMatricula() +
                "\nMiembros a bordo: " + getNumMiembros() +
                "\nNivel de combustible: " + getNivelCombustible() +
                "\nPatrullando sector y armando escudos...";
    }

    //Añadimos el metodo de la interfaz
    public String iniciarSaltoLuz(){
        return "\nSalto táctico evasivo iniciado";
    }


}
