package test;

import enumeracion.Continentes;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
//        System.out.println("Dia 1: " + Dias.DOMINGO);
//        indicarDiaSemana(Dias.MARTES);

          System.out.println("Continente no. 4 " + Continentes.AMERICA);
          System.out.println("No. Paises en el 4to continente: " + Continentes.AMERICA.getPaises());
          System.out.println("No. Habitantes en el 4to continente: " + Continentes.AMERICA.getHabitantes());
          
          System.out.println("Continente no. 1 " + Continentes.AFRICA);
          System.out.println("No. Paises en el 1er continente: " + Continentes.AFRICA.getPaises());
          System.out.println("No. Habitantes en el 1er continente: " + Continentes.AFRICA.getHabitantes());
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case DOMINGO:
                System.out.println("Primer dia de la semana");
                break;
            case LUNES:
                System.out.println("Segundo dia de la semana");
                break;
            case MARTES:
                System.out.println("Tercer dia de la semana");
                break;
            case MIERCOLES:
                System.out.println("Cuarto dia de la semana");
                break;
            case JUEVES:
                System.out.println("Quinto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Sexto dia de la semana");
                break;
            case SABADO: 
                System.out.println("Septimo dia de la semana");
                break;
        }
    }
}
