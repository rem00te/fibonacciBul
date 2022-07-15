import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int b = 0, c = 1, a;
        Scanner input = new Scanner(System.in);

        System.out.print("eleman sayısı : ");
        int sayi = input.nextInt();


        for (int i = 1; i <= sayi; i++) {
            a = b + c;
            System.out.println(b + "+" + c + "=" + a);
            b = c;
            c = a;

            System.out.println();
        }
    }
}
