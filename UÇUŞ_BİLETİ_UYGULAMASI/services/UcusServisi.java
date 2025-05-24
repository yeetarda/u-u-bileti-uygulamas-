package services;

import models.*;
import util.CSVYazici;

import java.util.ArrayList;
import java.util.List;

public class UcusServisi implements IUcusIslemleri {
    private List<Ucus> ucuslar;
    private List<Rezervasyon> rezervasyonlar;

    public UcusServisi() {
        ucuslar = new ArrayList<>();
        rezervasyonlar = new ArrayList<>();

        Lokasyon l1 = new Lokasyon("Türkiye", "İstanbul", "IST", true);
        Lokasyon l2 = new Lokasyon("Fransa", "Paris", "CDG", true);
        Lokasyon l3 = new Lokasyon("Almanya", "Berlin", "BER", true);
        Lokasyon l4 = new Lokasyon("İtalya", "Roma", "FCO", true);
        Lokasyon l5 = new Lokasyon("İspanya", "Madrid", "MAD", true);
        Lokasyon l6 = new Lokasyon("İngiltere", "Londra", "LHR", true);

        Ucak u1 = new Ucak("A320", "Airbus", "A123", 5);
        Ucak u2 = new Ucak("B737", "Boeing", "B456", 6);

        ucuslar.add(new Ucus(l1, "10:00", u1));
        ucuslar.add(new Ucus(l2, "14:30", u1));
        ucuslar.add(new Ucus(l3, "16:45", u2));
        ucuslar.add(new Ucus(l4, "20:00", u2));
        ucuslar.add(new Ucus(l1, "22:15", u2));
        ucuslar.add(new Ucus(l5, "09:00", u1));
        ucuslar.add(new Ucus(l6, "13:30", u2));
    }

    @Override
    public void ucuslariListele() {
        for (int i = 0; i < ucuslar.size(); i++) {
            System.out.println((i + 1) + ") " + ucuslar.get(i));
        }
    }

    @Override
    public boolean rezervasyonYap(int ucusIndex, String ad, String soyad, int yas, String telefon, String tcKimlik) {
        if (ucusIndex < 1 || ucusIndex > ucuslar.size()) return false;

        Ucus ucus = ucuslar.get(ucusIndex - 1);
        if (!ucus.yerVarMi()) return false;

        int koltukNo = ucus.koltukAyir();
        Rezervasyon r = new Rezervasyon(ad, soyad, yas, telefon, tcKimlik, ucus, koltukNo);
        rezervasyonlar.add(r);
        CSVYazici.yaz("rezervasyonlar.csv", rezervasyonlar);
        return true;
    }
}
