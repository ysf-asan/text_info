import java.io.*;
import java.util.Scanner;

public class metinOzellikleri {
    File file = new File("MetinBelgesi.txt");
    String metin;
    public void metinYaz() throws IOException {
        Scanner girdi = new Scanner(System.in);

        System.out.println("Metin giriniz: ");
        metin = girdi.nextLine();

        if(!file.exists()) {
            file.createNewFile();
        }
        FileWriter fileWriter = new FileWriter(file,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write(metin);
        bufferedWriter.write(" ");
        bufferedWriter.close();
    }
    public void metinOku() throws IOException {
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        String metinOku;

        while((metinOku = br.readLine()) != null){
            System.out.println(metinOku);

        }
        br.close();
    }
    public void kelimeSayma(){
        String dosyaYolu = "MetinBelgesi.txt";

        int kelimeSayisi = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(dosyaYolu))) {
            String satir;
            while ((satir = br.readLine()) != null) {
                String[] kelimeler = satir.split("\\s+");
                kelimeSayisi += kelimeler.length;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Dosyadaki toplam kelime sayısı: " + kelimeSayisi);
}
}

