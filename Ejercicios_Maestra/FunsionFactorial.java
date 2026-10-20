package Ejercicios_Maestra;
import java.util.Scanner;

public class FunsionFactorial {
    static int factorial(int n){
        if (n < 0 || n > 12){
            return -1;
        }

        int resultado = 1;
        for (int i = 2; i <= n; i++ ){
            resultado *= i;
        }
        return resultado;
    }
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame la cantidad de números: ");
        int cantidad = sc.nextInt();

        for (int i = 0; i < cantidad; i++){
            System.out.print("Dame un número: ");
            int numero = sc.nextInt();
            int resultadoFactorial = factorial(numero);

            if (resultadoFactorial == -1){
                System.out.println("No existe");
            }else{
                System.out.println(resultadoFactorial);
            }
        }
        sc.close();
    }
}

// Hay que arreglarlo