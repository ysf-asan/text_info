import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        metinOzellikleri metinOzellikleri = new metinOzellikleri();
        Scanner scanner = new Scanner(System.in);
        int secim;
        do {
            System.out.println("1-Metin yaz\n2-Metin oku\n3-Metnin kelimelerini say\n4-Çıkış\nYapmak istediğiniz işlemi seçiniz: ");
            secim = scanner.nextInt();
            switch (secim){
                case 1:
                    metinOzellikleri.metinYaz();
                    break;
                case 2:
                    metinOzellikleri.metinOku();
                    break;
                case 3:
                   metinOzellikleri.kelimeSayma();
                case 4:
                    break;


            }


        } while (secim != 4);




    }}
