public class Ej_1_IntercambioVariables {
    public static void main(String[] args) {
        int a = 10;
        int b = 25;
        System.out.println("Antes: a=" + a + ", b=" + b);

        a = a + b;   // a = 35
        b = a - b;   // b = 10 (valor original de a)
        a = a - b;   // a = 25 (valor original de b)

        System.out.println("Después: a=" + a + ", b=" + b);
    }
}

