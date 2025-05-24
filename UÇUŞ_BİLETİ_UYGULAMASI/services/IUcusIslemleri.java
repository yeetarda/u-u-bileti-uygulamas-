package services;

public interface IUcusIslemleri {
    void ucuslariListele();
    boolean rezervasyonYap(int ucusIndex, String ad, String soyad, int yas, String telefon, String tcKimlik);
}
