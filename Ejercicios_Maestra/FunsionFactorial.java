package Ejercicios_Maestra;
import java.util.Scanner;

public class FunsionFactorial {
    static int factorial(int n){
        int resultado = 1;
        for (int i = 2; i <= n; i++ ){
            resultado *= i;
        }
        return resultado;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 3 numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int primero = factorial(a);
        int segundo = factorial(b);
        int tercero = factorial(c);
        if (factorial(a) == -1){
            System.out.println("No existe");
        }else{
            System.out.println(primero + " ");
        }
        if (factorial(b) == -1){
            System.out.println("No existe");
        }else{
            System.out.println(segundo + " ");
        }
        if (factorial(c) == -1){
            System.out.println("No existe");
        }else{
            System.out.println(tercero + " ");
        }
        sc.close();
    }
}

// Hay que arreglarlo