import java.util.Scanner;

public class DortBes {

    public static void main(String[] args) {

        int sayi;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz:");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i*=4)
        {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for(int j = 1; j <= sayi; j *=5)
        {
            System.out.print(j + " ");
        }

    }
}
