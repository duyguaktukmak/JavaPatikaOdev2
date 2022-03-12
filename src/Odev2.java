import java.util.Scanner;

public class Odev2 {
    public static void main(String[] args) {
     double tutar,kdvOranı;

        Scanner input= new Scanner(System.in);
        System.out.println("Tutarı giriniz:");
        tutar=input.nextDouble();
        if (tutar>=0 && tutar<=1000){
            kdvOranı=0.18;
            double kdvTutar= tutar*kdvOranı;
        double kvdlifiyat= tutar+kdvTutar;
            System.out.println("Kdv Oranı 0.18 iken yeni fiyat:"+ kvdlifiyat);
        }
        else if(tutar>1000){
        kdvOranı=0.8;
        double kdvTutar= tutar*kdvOranı;
        double kvdlifiyat= tutar+kdvTutar;
        System.out.println("Kdv Oranı 0.8 iken yeni fiyat:"+ kvdlifiyat);
        }
        else{
            System.out.println("Boş Değer");
        }
    }
}
