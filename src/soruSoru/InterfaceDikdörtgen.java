package soruSoru;

import java.util.Scanner;

public class InterfaceDikdörtgen implements Interfaceislemler{
    Scanner scan=new Scanner(System.in);

    int kenar1=0;
    int kenar2=0;

    @Override
    public void alan() {
        System.out.println("1.kenar zunluğunu giriniz: ");
        kenar1=scan.nextInt();
        System.out.println("2.kenar zunluğunu giriniz: ");
        kenar2=scan.nextInt();
        System.out.println("Alan: "+(kenar1*kenar2));
    }

    @Override
    public void cevre() {
        System.out.println("çevre: "+(2*(kenar1+kenar2)));

    }
}
