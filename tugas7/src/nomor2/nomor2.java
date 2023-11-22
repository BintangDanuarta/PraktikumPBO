
package nomor2;

/**
 *
 * @author Bintang Danuarta
 */
import java.util.Scanner;
public class nomor2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai n: ");
        int n = input.nextInt();

        if (n > 10) {
            System.out.println("Nilai n harus lebih kecil atau sama dengan 10.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
