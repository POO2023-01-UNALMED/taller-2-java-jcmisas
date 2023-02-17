package test;

public class Auto{

    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantidadAsientos(){

        return this.asientos.length;
    }

    String verificarIntegridad(){

        if(this.registro==this.motor.registro){
            int aux=0;

            for (int i=0;i<this.asientos.length;i++){

                if(this.asientos[i].registro!=this.registro){

                    aux=1;
                }
            }

            if(aux==0){

                return "Auto original";
            }
            else{

                return "Las piezas no son originales";
            }
            
        }
        else{

            return "Las piezas no son originales";
        }
    }

}