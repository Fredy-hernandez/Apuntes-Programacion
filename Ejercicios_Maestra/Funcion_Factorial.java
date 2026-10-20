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
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame 3 numeros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        sc.close();
    }
}
