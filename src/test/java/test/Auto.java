package test.java.test;

public class Auto{

    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    static int cantidadCreados;

    int cantiadAsientos(){

        return this.asientos.length;
    }

    String verificarIntegridad(){

        if(this.registro==this.motor.registro==this.asientos.registro){

            return "Auto original";
        }
        else{

            return "Las piezas no son originales";
        }
    }

}