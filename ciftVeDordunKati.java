import java.util.Scanner;
public class ciftVeDordunKati {
    public static void main(String[] args) {
        int n;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        do {
            System.out.print("Sayı Giriniz : ");
            n = scan.nextInt();
            if (n % 4 == 0) {
                total += n;
            }
        } while (n % 2 != 1);

        System.out.print("Toplam : " + total);
    }
}
