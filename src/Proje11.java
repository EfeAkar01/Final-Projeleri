import java.util.Random;
import java.util.Scanner;

public class Proje11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int oyuncuSkor = 0;
        int bilgisayarSkor = 0;
        int turSayisi = 0;

        while (oyuncuSkor < 3 && bilgisayarSkor < 3) {
            System.out.print("Taş (0), Kağıt (1), Makas (2) seçin: ");
            int oyuncuSecim = scanner.nextInt();

            if (oyuncuSecim < 0 || oyuncuSecim > 2) {
                System.out.println("Geçersiz bir seçim yaptınız. Lütfen tekrar deneyin.");
                continue;
            }

            int bilgisayarSecim = random.nextInt(3);

            System.out.println("Bilgisayarın seçimi: " + bilgisayarSecim);

            if (oyuncuSecim == bilgisayarSecim) {
                System.out.println("Berabere!");
            } else if ((oyuncuSecim == 0 && bilgisayarSecim == 2) ||
                    (oyuncuSecim == 1 && bilgisayarSecim == 0) ||
                    (oyuncuSecim == 2 && bilgisayarSecim == 1)) {
                System.out.println("Kazandınız!");
                oyuncuSkor++;
            } else {
                System.out.println("Bilgisayar kazandı!");
                bilgisayarSkor++;
            }

            turSayisi++;
            System.out.println("Durum: Oyuncu " + oyuncuSkor + " - " + bilgisayarSkor + " Bilgisayar\n");
        }

        if (oyuncuSkor == 3) {
            System.out.println("Tebrikler! Oyunu kazandınız.");
        } else {
            System.out.println("Üzgünüm! Bilgisayar oyunu kazandı.");
        }

        System.out.println("Toplam tur sayısı: " + turSayisi);

        scanner.close();
    }
}
