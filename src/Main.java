import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik;

        Scanner scanner=new Scanner(System.in);

        System.out.println("matematik notunuz");
        mat=scanner.nextInt();
        System.out.println("türkçe notunuz");
        turkce=scanner.nextInt();
        System.out.println("fizik notunuz");
        fizik=scanner.nextInt();
        System.out.println("kimya notunuz");
        kimya=scanner.nextInt();
        System.out.println("müzik notunuz");
        muzik=scanner.nextInt();
        if (mat<=0||mat>=100){
            mat=0;
        }
        if (fizik <=  0 || fizik >=  100){
            fizik = 0;
        }

        if (kimya <= 0 || kimya >= 100){ kimya = 0;}

        if (turkce <=  0 || turkce >=  100){turkce = 0;}

        if (muzik <=  0 || muzik >=  100){muzik = 0;}
        System.out.println(fizik);
        double average=(mat+fizik+kimya+turkce+muzik)/5;

        if (average<=55){
            System.out.println("sınıfta kaldınız\nortalamanız: "+average);
        }
        else {
            System.out.println("tebrikler sınıfı geçtiniz!\nortalamanız: "+average);
        }

    }
}
