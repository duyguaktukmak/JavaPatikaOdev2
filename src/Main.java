import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       //Değişkenler tanımlanacak
        int mat , fizik ,turkce,tarih,muzik;

        // Scanner sınıfını tanımlayalım

        Scanner input= new Scanner(System.in);

        //Kullanıcıdan değer alalım.
        System.out.println("Matematik notunu giriniz:");
        mat= input.nextInt();

        System.out.println("Fizik notunu giriniz:");
        fizik= input.nextInt();

        System.out.println("Türkçe notunu giriniz:");
        turkce= input.nextInt();

        System.out.println("Tarih notunu giriniz:");
        tarih= input.nextInt();

        System.out.println("Müzik notunu giriniz:");
        muzik=input.nextInt();

        int toplam= (mat+fizik+turkce+tarih+muzik);
        int sonuc=toplam/5;
        System.out.println("Ortalamanız:" + sonuc);

        String result = sonuc>=60 ? "Sınıfı Geçti" : "Sınıfta Kaldı";
        System.out.println(result);

     }
}
