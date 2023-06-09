import java.io.*;

public class Kadai1_3 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int a, b;
            String s = "";
            System.out.print("®”“ü—Í(a)=");
            s = br.readLine();
            a = Integer.parseInt(s);
            System.out.print("®”“ü—Í(b)=");
            s = br.readLine();
            b = Integer.parseInt(s);
            comp(a, b);
        } catch (IOException e) {
            System.out.println("Exception:" + e);
        }
    }

    public static void comp(int a, int b) {
        if (a > b) {
            System.out.println(a + ">" + b);
        } else if (a < b) {
            System.out.println(a + "<" + b);
        } else if (a == b) {
            System.out.println(a + "=" + b);
        }
    }
}