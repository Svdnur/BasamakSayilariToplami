import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n ;
        int basDegeri;
        int total = 0;

        System.out.println("Lütfen bir sayı giriniz :");
        n = scan.nextInt();

        while(n % 10 != 0) {

            basDegeri = n % 10;
            total += basDegeri;

            n = n / 10 ;

        }
        System.out.println(total);


    }

}
