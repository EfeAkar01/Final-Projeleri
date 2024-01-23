import java.util.Scanner;

public class Proje7 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int buyukSayilarToplam = 0;
        int kucukSayilarToplam = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Sayı " + i + ": ");
            int sayi = scanner.nextInt();

            if (sayi >= 50) {
                buyukSayilarToplam += sayi;
            } else {
                kucukSayilarToplam += sayi;
            }
        }

        if (kucukSayilarToplam != 0) {
            double oran = (double) buyukSayilarToplam / kucukSayilarToplam;
            System.out.println("50 ve üstü olan sayıların toplamı / 50'den küçük olan sayıların toplamı oranı: " + oran);
        } else {
            System.out.println("50'den küçük sayılar girilmediğinden oran hesaplanamıyor.");
        }

        scanner.close();
    }
}
