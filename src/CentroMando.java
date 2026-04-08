
import java.lang.reflect.Array;
import java.util.ArrayList;

public class CentroMando {
    public static void main(String[] args) {

        ArrayList<NaveEspacial> Flota = new ArrayList<NaveEspacial>();
        NaveCarguero carguero1 = new NaveCarguero("XYZ-456", 12, 560, 45);
        Flota.add(carguero1);

        NaveCombate combate1 = new NaveCombate("COM-234", 68, 120);
        Flota.add(combate1);

        NaveExploracion exploracion1 = new NaveExploracion("EXP-223", 23, 789);
        Flota.add(exploracion1);

        NaveExploracion exploracion2 = new NaveExploracion("EXP-013", 29, 450);
        Flota.add(exploracion2);

        ArrayList<MotorHiperespacial> NavesHiper = new ArrayList<MotorHiperespacial>();
        NavesHiper.add(exploracion1);
        NavesHiper.add(exploracion2);
        NavesHiper.add(combate1);

        for(NaveEspacial naves : Flota){
            System.out.println(naves.realizarMision());
        }

        for(MotorHiperespacial naves : NavesHiper){
            System.out.println(naves.iniciarSaltoLuz());
        }


    }

}