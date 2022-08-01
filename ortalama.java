import java.util.Scanner;

public class ortalama {
    public static void main(String[] args) {
        int matematik,fizik,kimya,turkce,tarih,muzik;
        Scanner inp=new Scanner(System.in);

        System.out.print("matematik Notunuz : ");
        matematik=inp.nextInt();

        System.out.print("fizik Notunuz : ");
        fizik=inp.nextInt();

        System.out.print("kimya Notunuz : ");
        kimya=inp.nextInt();

        System.out.print("turkce Notunuz : ");
        turkce=inp.nextInt();

        System.out.print("tarih Notunuz : ");
        tarih=inp.nextInt();

        System.out.print("muzik Notunuz : ");
        muzik=inp.nextInt();


        int topla=matematik+fizik+kimya+turkce+tarih+muzik;
        double ort=topla/6;

        boolean kosul1=ort>=60;

        String str=kosul1 ? "Sınıfı geçtiniz..":"Sınıfta kaldınız";
    }

}
