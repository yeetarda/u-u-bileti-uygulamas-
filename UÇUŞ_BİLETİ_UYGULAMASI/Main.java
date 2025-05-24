import services.UcusServisi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UcusServisi servis = new UcusServisi();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== UÇUŞ LİSTESİ ===");
            servis.ucuslariListele();

            System.out.print("rezervasyon yapmak istediğiniz uçuş numarasını girin (0 = çıkış): ");
            int secim = sc.nextInt();
            sc.nextLine();

            if (secim == 0) {
                System.out.println("çıkılıyor");
                break;
            }

            System.out.print("adınız: ");
            String ad = sc.nextLine();

            System.out.print("soyadınız: ");
            String soyad = sc.nextLine();

            System.out.print("yaşınız: ");
            int yas = sc.nextInt();
            sc.nextLine();

            System.out.print("telefon numaranız: ");
            String telefon = sc.nextLine();

            System.out.print("TC kimlik numaranız: ");
            String tcKimlik = sc.nextLine();
            boolean basarili = servis.rezervasyonYap(secim, ad, soyad, yas, telefon, tcKimlik);

            if (basarili) {
                System.out.println("rezervasyon başarılı dosyaya kaydedildi");
            } else {
                System.out.println("rezervasyon başarısız uçakta yer yok veya giriş geçersiz");
            }
        }
    }
}
