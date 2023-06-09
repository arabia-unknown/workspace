import java.io.*;
public class Kadai1_2 {
public static void main(String[] args) {
try {
BufferedReader br = new BufferedReader(
new InputStreamReader(System.in));
String s="";
System.out.print("“ü—Í=");
s = br.readLine();
System.out.println(s);
} catch(IOException e) {
System.out.println("Exception:" + e);
}
}
}