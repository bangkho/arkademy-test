import java.io.IOException;

public class Soal5 {
    public static void main(String[] args) throws IOException {
        CountChar("khoirudin", "i");
    }

    private static void CountChar(String in, String a) {
        if (in != "" && a != "") {
            int count = 0;

            for (char c : in.toCharArray()) {
                if (c == a.charAt(0)) {
                    count += 1;
                }
            }
            if (count > 0) {
                System.out.println("Pada " + in + " terdapat: " + count + " karakter \"" + a + "\"");
            } else {
                System.out.println("Tidak ditemukan karakter yang sama dengan " + a);
            }
        }
    }
}
