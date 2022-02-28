import java.util.*;

public class CCC12J4 {
    private int k;
    public CCC12J4(int k) {
        this.k = k;
    }
    private int shift(int pos) {
        return 3 * (pos + 1) + this.k;
    }
    private static char caesar(char c, int shift) {
        return (char)('A' + (c + shift - 'A' + 26) % 26);
    }

    public String decode(CharSequence cipherText) {
        char[] s = new char[cipherText.length()];
        for (int i = 0; i < s.length; i++) {
            s[i] = caesar(cipherText.charAt(i), -this.shift(i));
        }
        return new String(s);
    }

    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int k = Integer.parseInt(in.nextLine());
            CCC12J4 cipher = new CCC12J4(k);
            System.out.println(cipher.decode(in.nextLine()));
        }
    }
}