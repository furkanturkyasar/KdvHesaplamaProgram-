import java.util.Scanner;
public class FinalCommit {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double kdvOrani = 0.18,kdvlifiyat,para;
        System.out.print("Para miktarini giriniz: ");
        para = input.nextDouble();
        System.out.println("KDV siz para: "+para);
        System.out.println(para < 1000 ? "Kdv Orani: "+(kdvOrani) : "Kdv Orani: "+(kdvOrani =0.08));
        System.out.println("KDV tutari: "+para * kdvOrani);
        kdvlifiyat = para + (para * kdvOrani);
        System.out.print("KDV li tutari: "+kdvlifiyat);



    }
}
