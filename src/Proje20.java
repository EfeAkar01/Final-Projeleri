import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Proje20 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Doğum tarihinizi (GG.AA.YYYY) formatında giriniz: ");
        String dogumTarihiStr = scanner.next();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        try {
            LocalDate dogumTarihi = LocalDate.parse(dogumTarihiStr, formatter);

            String gunAdi = dogumTarihi.getDayOfWeek().toString();
            System.out.println("Doğduğunuz gün: " + gunAdi);

        } catch (Exception e) {
            System.out.println("Geçersiz tarih formatı. Lütfen doğru formatı kullanın (GG.AA.YYYY).");
        }

        scanner.close();
    }
}
