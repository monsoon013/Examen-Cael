public class NaveCarguero extends NaveEspacial{
    //En este caso si que tiene un atributo a mayores. Lo creamos
    private float toneladasCarga;
    //El constructor instanciamos el atributo nuevo + los heredados.
    public NaveCarguero(String matricula, int numMiembros, int nivelCombustible, float toneladasCarga){
        super(matricula, numMiembros, nivelCombustible);
        this.toneladasCarga = toneladasCarga;
    }

    //Añadimos el metodo abstracto Realizarmision y que devuelva el mensaje segun la hija
    public String realizarMision(){
        return "\nMatrícula: " + getMatricula() +
                "\nMiembros a bordo: " + getNumMiembros() +
                "\nNivel de combustible: " + getNivelCombustible() +
                "\nEscaneando planetas desconocidos...";
    }
    //Creamos el metodo cargarSuministros pero que reciba un int
    public void cargarSuministros(int cant){
        System.out.println("\nCarga añadida correctamente. \n -Número de cajas: " + cant);
    }
    //Creamos el metodo cargarSuministros pero que reciba un float y el string. Overload
    public void cargarSuministros(float toneladas, String material){
        System.out.println("\nCarga añadida correctamente." +
                           "\n -Cantidad introducida: " + toneladas +
                            "\n -Material introducido: " + material);
    }

}
