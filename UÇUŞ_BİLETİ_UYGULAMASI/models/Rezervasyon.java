package models;

public class Rezervasyon {
    public String ad;
    public String soyad;
    public int yas;
    public String telefon;
    public String tcKimlik;
    public Ucus ucus;
    public int koltukNo;

    public Rezervasyon(String ad, String soyad, int yas, String telefon, String tcKimlik, Ucus ucus, int koltukNo) {
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.telefon = telefon;
        this.tcKimlik = tcKimlik;
        this.ucus = ucus;
        this.koltukNo = koltukNo;
    }

    @Override
    public String toString() {
        return ad + "," + soyad + "," + yas + "," + telefon + "," + tcKimlik + "," + ucus.lokasyon.sehir + "," + ucus.saat + "," + koltukNo;
    }
}
