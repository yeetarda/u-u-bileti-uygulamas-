package models;

public class Lokasyon {
    public String ulke;
    public String sehir;
    public String havaalani;
    public boolean aktif;

    public Lokasyon(String ulke, String sehir, String havaalani, boolean aktif) {
        this.ulke = ulke;
        this.sehir = sehir;
        this.havaalani = havaalani;
        this.aktif = aktif;
    }

    @Override
    public String toString() {
        return sehir + " (" + havaalani + ") - " + (aktif ? "Aktif" : "Pasif");
    }
}
