import java.util.Scanner;
public class OrtHesaplamaProgrami {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);
int matematik,turkce,muzik,bedenegitimi,sosyal;

        System.out.print("Lütfen Matematik dersinin notunu giriniz :"); matematik = input.nextInt();
        System.out.print("Lütfen Turkce dersinin notunu giriniz :"); turkce =input.nextInt();
        System.out.print("Lütfen Muzik dersinin notunu giriniz :"); muzik=input.nextInt();
        System.out.print("Lütfen Beden Eğitimi dersinin notunu giriniz :"); bedenegitimi=input.nextInt();
        System.out.print("Lütfen Sosyal Bilgiler dersinin notunu giriniz :"); sosyal=input.nextInt();
        int toplam = (matematik+turkce+muzik+bedenegitimi+sosyal);
        double sonuc = toplam/5;
        System.out.println("Ortalamanız :"+sonuc);



    }
}