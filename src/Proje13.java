import java.util.Scanner;

public class Proje13 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Üçgenin kenar uzunluklarını giriniz:");

        System.out.print("Kenar 1: ");
        double kenar1 = scanner.nextDouble();

        System.out.print("Kenar 2: ");
        double kenar2 = scanner.nextDouble();

        System.out.print("Kenar 3: ");
        double kenar3 = scanner.nextDouble();

        if (ucgenOluyorMu(kenar1, kenar2, kenar3)) {
            System.out.println("Bu kenar uzunlukları ile bir üçgen oluşturulabilir.");

            if (kenar1 == kenar2 && kenar2 == kenar3) {
                System.out.println("Bu üçgen bir eşkenar üçgendir.");
            } else if (kenar1 == kenar2 || kenar1 == kenar3 || kenar2 == kenar3) {
                System.out.println("Bu üçgen bir ikizkenar üçgendir.");
            }

            if (dikKenarMi(kenar1, kenar2, kenar3)) {
                System.out.println("Bu üçgen aynı zamanda bir dik üçgendir.");
            }
        } else {
            System.out.println("Bu kenar uzunlukları ile bir üçgen oluşturulamaz.");
        }

        scanner.close();
    }

    public static boolean ucgenOluyorMu(double kenar1, double kenar2, double kenar3) {
        return (kenar1 + kenar2 > kenar3) && (kenar1 + kenar3 > kenar2) && (kenar2 + kenar3 > kenar1);
    }

    public static boolean dikKenarMi(double kenar1, double kenar2, double kenar3) {
        double[] kenarlar = { kenar1, kenar2, kenar3 };
        java.util.Arrays.sort(kenarlar);
        return Math.pow(kenarlar[0], 2) + Math.pow(kenarlar[1], 2) == Math.pow(kenarlar[2], 2);
    }
}
