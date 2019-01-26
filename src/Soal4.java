import java.io.IOException;

public class Soal4 {
    public static void main(String[] args) throws IOException {
        Handshake(6);
    }

    private static void Handshake(int n) {
        if (n != 0) {
            int sum = 0;
            for (int i = 1; i < n; i++) {
                sum += i;
            }
            System.out.println("Jumlah jabat tangan: " + sum);
        } else {
            System.out.println("Nilai harus lebih dari 0");
        }
    }

}
