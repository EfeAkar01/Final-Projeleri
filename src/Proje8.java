public class Proje8 {

    public static void main(String[] args) {
        int n = 20;

        int[] fibonacciSerisi = new int[n];


        fibonacciSerisi[0] = 0;
        fibonacciSerisi[1] = 1;


        for (int i = 2; i < n; i++) {
            fibonacciSerisi[i] = fibonacciSerisi[i - 1] + fibonacciSerisi[i - 2];
        }


        System.out.println("Fibonacci Serisi (İlk 20 sayı):");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciSerisi[i] + " ");
        }
    }
}
