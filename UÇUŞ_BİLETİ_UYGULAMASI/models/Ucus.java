package models;

import java.util.HashSet;
import java.util.Set;

public class Ucus {
    public Lokasyon lokasyon;
    public String saat;
    public Ucak ucak;
    private Set<Integer> doluKoltuklar;

    public Ucus(Lokasyon lokasyon, String saat, Ucak ucak) {
        this.lokasyon = lokasyon;
        this.saat = saat;
        this.ucak = ucak;
        this.doluKoltuklar = new HashSet<>();
    }

    public boolean yerVarMi() {
        return doluKoltuklar.size() < ucak.koltukKapasitesi;
    }

    public int koltukAyir() {
        for (int i = 1; i <= ucak.koltukKapasitesi; i++) {
            if (!doluKoltuklar.contains(i)) {
                doluKoltuklar.add(i);
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return lokasyon.sehir + " - " + saat + " (" + ucak.model + ")";
    }
}
