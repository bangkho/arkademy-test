import java.io.IOException;

public class Soal2 {
    public static void main(String[] args) throws IOException {
        UsernameValidator("khoir.AK");
    }

    private static void UsernameValidator(String in) {
        if (in.length() == 8) {
            if (in.substring(0, 5).equals(in.substring(0, 5).toLowerCase())) {
                if (in.substring(5, 6).equals("_") || in.substring(5, 6).equals(".")) {
                    if (in.substring(6, 8).equals(in.substring(6, 8).toUpperCase())) {
                        System.out.println("Username Valid");
                    } else {
                        System.out.println("Username tidak valid. Username akhir salah");
                    }
                } else {
                    System.out.println("Username tidak valid. Separator salah");
                }
            } else {
                System.out.println("Username tidak valid. Username awal salah");
            }
        } else {
            System.out.println("Username tidak valid. Lebih dari 8 karakter");
        }
    }
}
