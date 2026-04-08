public class NaveCarguero extends NaveEspacial{

    private float toneladasCarga;

    public NaveCarguero(String matricula, int numMiembros, int nivelCombustible, float toneladasCarga){
        super(matricula, numMiembros, nivelCombustible);
        this.toneladasCarga = toneladasCarga;
    }

    public String realizarMision(){
        return "Escaneando planetas desconocidos...";
    }

    public void cargarSuministros(int cant){
        System.out.println("\nCarga añadida correctamente. \n -Número de cajas: " + cant);
    }

    public void cargarSuministros(float toneladas, String material){
        System.out.println("\nCarga añadida correctamente." +
                           "\n -Cantidad introducida: " + toneladas +
                            "\n -Material introducido: " + material);
    }

    public String toString() {
        return super.toString() + "\nToneladas a bordo: " + toneladasCarga;
    }

}
