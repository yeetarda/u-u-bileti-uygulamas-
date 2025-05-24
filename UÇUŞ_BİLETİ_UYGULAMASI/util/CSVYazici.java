package util;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CSVYazici {
    public static <T> void yaz(String dosyaAdi, List<T> liste) {
        try (FileWriter writer = new FileWriter(dosyaAdi)) {
            for (T obj : liste) {
                writer.write(obj.toString() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Dosya yazılırken hata oluştu: " + e.getMessage());
        }
    }
}
