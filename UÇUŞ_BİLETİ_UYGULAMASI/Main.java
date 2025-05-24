import services.UcusServisi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UcusServisi servis = new UcusServisi();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Uçuş Listesi ===");
            servis.ucuslariListele();

            System.out.print("Rezervasyon yapmak istediğiniz uçuş numarasını girin (0 = çıkış): ");
            int secim = sc.nextInt();
            sc.nextLine();

            if (secim == 0) {
                System.out.println("Çıkılıyor.");
                break;
            }

            System.out.print("Adınız: ");
            String ad = sc.nextLine();

            System.out.print("Soyadınız: ");
            String soyad = sc.nextLine();

            System.out.print("Yaşınız: ");
            int yas = sc.nextInt();
            sc.nextLine();

            System.out.print("Telefon Numaranız: ");
            String telefon = sc.nextLine();

            System.out.print("TC Kimlik Numaranız: ");
            String tcKimlik = sc.nextLine();

            boolean basarili = servis.rezervasyonYap(secim, ad, soyad, yas, telefon, tcKimlik);

            if (basarili) {
                System.out.println("Rezervasyon başarılı! Dosyaya kaydedildi.");
            } else {
                System.out.println("Rezervasyon başarısız. Uçakta yer yok veya giriş geçersiz.");
            }
        }
    }
}
