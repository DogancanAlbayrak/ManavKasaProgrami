import java.util.Scanner;

class Main {
    public static void main(String[] args) {

double armut, elma, domates, muz, patlican;
double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.0;

Scanner tutar = new Scanner(System.in);
        System.out.print("Armut kaç kilo ? ");
        armut = tutar.nextDouble();

        System.out.print("Elma kaç kilo ? ");
        elma = tutar.nextDouble();

        System.out.print("Domates kaç kilo ? ");
        domates = tutar.nextDouble();

        System.out.print("Muz kaç kilo ? ");
        muz = tutar.nextDouble();

        System.out.print("Patlıcan kaç kilo ? ");
        patlican = tutar.nextDouble();

        Double toplam = (armut * armutFiyat) + (elma * elmaFiyat) + (domates * domatesFiyat) + (muz * muzFiyat) + (patlican * patlicanFiyat );

        System.out.println("Toplam Tutar : " + toplam + " TL");

    }
}