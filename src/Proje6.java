import java.util.Scanner;

public class Proje6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int enBuyukSayi = Integer.MIN_VALUE;
        int enBuyukSayiSira = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Sayı " + i + ": ");
            int girilenSayi = scanner.nextInt();

            if (girilenSayi > enBuyukSayi) {
                enBuyukSayi = girilenSayi;
                enBuyukSayiSira = i;
            }
        }

        System.out.println("En büyük sayı: " + enBuyukSayi);
        System.out.println("Bu sayı " + enBuyukSayiSira + ". sırada girildi.");

        scanner.close();
    }
}
