import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("bireysel için '1' giriniz:\n esnaf için '2' giriniz:\n");
        double secim= input.nextDouble();

        System.out.println("cekmek istediginiz tutari giriniz:");
        double tutar=input.nextDouble();

        System.out.println("kac ayda odemek istediginizi giriniz:");
        double ay=input.nextDouble();
        Faiz faiz = new Faiz();
        try {
            System.out.println("Hesaplanİyor ");
            for (int i = 3; i >= 0; i--) {
                System.out.println( i + "...");
                Thread.sleep(200);
            }
        } catch (InterruptedException exception) {
            System.out.println("Sistem Hatasi");
        }
        if (secim==1)
        {
            double sonuc = faiz.bireysel(tutar) + faiz.time(ay);
            System.out.println(tutar +"TL icin geri odeyeceginiz tutar:"+sonuc +" TL");
        }
        else if (secim==2){
            double sonuc = faiz.esnaf(tutar) + faiz.time(ay);
            System.out.println(tutar +"TL icin geri odeyeceginiz tutar:"+sonuc + " TL");
        }
        else {
            System.out.println(secim +"id li bir kredi secenegi bulunamadi!!!");
        }
    }
}
