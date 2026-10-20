package Ejercicios_Maestra;
import java.util.Scanner;

public class Funcion_Factorial {
    static int factorial(int n){
        int resultado = 1;
        for (int i = 2; i <= n; i++ ){
            resultado *= i;
        }
        return resultado;
    }
    public static void main (String[] args){

    }
}
