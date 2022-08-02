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

        if (secim==1)
        {
            double sonuc = faiz.bireysel(tutar) + faiz.time(ay);
            System.out.println("sonuc:"+sonuc);
        }
        else if (secim==2){
            double sonuc = faiz.esnaf(tutar) + faiz.time(ay);
            System.out.println("sonuc:"+sonuc);
        }
        else {
            System.out.println("Yanlis vade sectiniz!");
        }
    }
}
