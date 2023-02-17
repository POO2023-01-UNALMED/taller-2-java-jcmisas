

import test.Asiento;
import test.Auto;

public class Main {

    public static void main(String[] args){

        Auto carro=new Auto();

        carro.asientos= new Asiento[5];

        carro.asientos[0]=new Asiento();
        carro.asientos[4]=new Asiento();

        System.out.println(carro.cantidadAsientos());

    }

    
}
