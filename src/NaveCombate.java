public class NaveCombate extends NaveEspacial implements MotorHiperespacial {

    public NaveCombate(String matricula, int numMiembros, int nivelCombustible){
        super(matricula, numMiembros, nivelCombustible);
    }

    public String realizarMision(){
        return "Patrullando sector y armando escudos...";
    }
    public String iniciarSaltoLuz(){
        return "Salto táctico evasivo iniciado";
    }

}
