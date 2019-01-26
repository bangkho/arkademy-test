public class Soal3 {
    public static void main(String[] args) {
        Triangle(10);
    }

    private static void Triangle(int n) {
        if (n <= 10) {
            for (int i = 1; i <= n; i++) {
                for (int l = 1; l <= i; l++) {
                    System.out.print(l + " ");
                }
                System.out.print("\n");
            }
        } else {
            System.out.print("Nilai Maksimal 10");
        }
    }
}
