import java.util.Scanner;


    public class Main {
    public static void main(String[] args) {

       Scanner input = new Scanner(System.in);

        // Meyve ve sebze fiyatları:
        double armutFiyati = 2.14;
        double elmaFiyati = 3.67;
        double domatesFiyati = 1.11;
        double muzFiyati = 0.95;
        double patlicanFiyati = 5.00;

        //Kg değerlerini belirteceğimiz kısım
        System.out.print("Armut kaç kilo? : ");
        double armutKilo = input.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        double elmaKilo = input.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        double domatesKilo = input.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        double muzKilo = input.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        double patlicanKilo = input.nextDouble();

        //Toplam tutarın hesaplanması

        double armutTutari = armutFiyati * armutKilo ;
        double elmaTutari = elmaFiyati * elmaKilo ;
        double domatesTutari = domatesFiyati * domatesKilo ;
        double muzTutari = muzFiyati * muzKilo ;
        double patlicanTutari = patlicanFiyati * patlicanKilo ;

        double toplamTutar = armutTutari + elmaTutari + domatesTutari + muzTutari + patlicanTutari ;

        System.out.println("Toplam Tutar:  " + toplamTutar + "TL");
    }
}