
import java.lang.reflect.Array;
import java.util.ArrayList;

public class CentroMando {
    public static void main(String[] args) {

        ArrayList<NaveEspacial> Flota = new ArrayList<NaveEspacial>(); //Creamos la lista Flota de la clase Madre NaveEspacial
        NaveCarguero carguero1 = new NaveCarguero("XYZ-456", 12, 560, 45);
        Flota.add(carguero1); //Creamos cada hija y, añadimos los atributos heredados de la Madre

        NaveCombate combate1 = new NaveCombate("COM-234", 68, 120);
        Flota.add(combate1); //idem

        NaveExploracion exploracion1 = new NaveExploracion("EXP-223", 23, 789);
        Flota.add(exploracion1);

        NaveExploracion exploracion2 = new NaveExploracion("EXP-013", 29, 450);
        Flota.add(exploracion2);

        ArrayList<MotorHiperespacial> NavesHiper = new ArrayList<MotorHiperespacial>();
        //Para poder alojar una nueva lista con las naves que tienen Motor Hiperespacial, habrá que crear una lista pero en este caso de la Interfaz.
        NavesHiper.add(exploracion1); //Añadimos las naves
        NavesHiper.add(exploracion2);
        NavesHiper.add(combate1);

        carguero1.cargarSuministros(23);
        carguero1.cargarSuministros(45.3F, "Uranio");


        for(NaveEspacial naves : Flota){ //Recorremos la lista para ejecutar todas las naves de la Flota general
            System.out.println(naves.realizarMision()); //Ejecutamos el metodo comun
        }

        for(MotorHiperespacial naves : NavesHiper){ //Recorremos la lista para ejecutar todas las naves de la Hiperespaciales
            System.out.println(naves.iniciarSaltoLuz()); //Ejecutamos el metodo comun
        }


    }

}