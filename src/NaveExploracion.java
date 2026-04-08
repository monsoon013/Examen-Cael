public class NaveExploracion extends NaveEspacial implements MotorHiperespacial{
    public NaveExploracion(String matricula, int numMiembros, int nivelCombustible){
        super(matricula, numMiembros, nivelCombustible);
    }

    public String realizarMision(){
        return "Escaneando planetas desconocidos...";
    }

    public String iniciarSaltoLuz(){
        return  "Activando hipervisor. Saltando a coordenadas seguras";
    }
}
