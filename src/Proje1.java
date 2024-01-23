import java.util.Random;
import java.util.Scanner;

public class Proje1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 1;
        int max = 100;

        int rasgeleSayi = min + random.nextInt(max - min + 1);
        int kullaniciTahmini;
        int tahminSayisi = 0;

        System.out.println("1 ile 100 arasında bir sayı tuttum. Tahmin et!");

        do {
            System.out.print("Tahmininiz: ");
            kullaniciTahmini = scanner.nextInt();
            tahminSayisi++;

            if (kullaniciTahmini == rasgeleSayi) {
                System.out.println("Tebrikler, ilk seferde buldunuz!");
            } else {
                int fark = Math.abs(rasgeleSayi - kullaniciTahmini);
                String ipucu = (kullaniciTahmini < rasgeleSayi) ? "daha büyük" : "daha küçük";
                System.out.println("Maalesef, yanlış tahmin. Aradaki fark: " + fark + ". Tahminin " + ipucu + " olmalı.");
            }
        } while (kullaniciTahmini != rasgeleSayi);

        System.out.println("Tahmin sayısı: " + tahminSayisi);

        scanner.close();
    }
}
