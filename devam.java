import java.util.Scanner;
public class devam {
    public static void main(String[] args) {
       Scanner input= new Scanner(System.in);
        double indeksi;
        System.out.println("Lütfen boyunuzu giriniz: ");
        double boy= input.nextDouble();
        System.out.println(boy);

        System.out.println("Lütfen kilonuzu giriniz: ");
        double kilo= input.nextDouble();
        System.out.println(kilo);
        indeksi=kilo/(boy*boy);
        System.out.println("Vücut kitle indeksiniz: ");
        System.out.println(indeksi);
    }
}
