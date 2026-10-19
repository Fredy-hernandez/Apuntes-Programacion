package Java_50_Ejercicios;

public class Ej_2_ConversiónTemperatura {
    public static void main (String[] args){
        double c = 36.6;
        double f = (c * 9.0/5.0) + 32;
        double k = c + 273.15;
        System.out.println("Converción a Fahrenheit: " + f + "°");
        System.out.println("Converción a Kelvin: " + k + "°");
    }
}