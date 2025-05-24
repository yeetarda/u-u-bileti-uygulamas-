package models;

public class Ucak {
    public String model;
    public String marka;
    public String seriNo;
    public int koltukKapasitesi;

    public Ucak(String model, String marka, String seriNo, int koltukKapasitesi) {
        this.model = model;
        this.marka = marka;
        this.seriNo = seriNo;
        this.koltukKapasitesi = koltukKapasitesi;
    }

    @Override
    public String toString() {
        return "Model: " + model + ", Marka: " + marka + ", SeriNo: " + seriNo + ", Kapasite: " + koltukKapasitesi;
    }
}
