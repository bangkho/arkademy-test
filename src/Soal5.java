import java.io.IOException;

public class Soal5 {
    public static void main(String[] args) throws IOException {
        CountChar("khoirudin", "i");
    }

    private static void CountChar(String in, String a) {
        if (in != "" && a != "") {
            char[] aArr = a.toCharArray();
            int count = 0;

            for (char c : in.toCharArray()) {
                if (c == aArr[0]) {
                    count += 1;
                }
            }
            System.out.println("Pada " + in + " terdapat: " + count + " karakter \"" + a + "\"");
//            System.out.println(count);
        }
    }

}
