//7018903 堀井萌希
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.*;

public class S7018903_Kadai3_3 {
    public static void main(String[] arg){

        String[][] data=new String[10][10];

        int M=0,N=0;

        //ファイル:Crypt3-3.txtを読み出す
        try{
            String s;
            File f=new File("Crypt3-3.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            s=br.readLine();
            int count=0;

            //読み出したデータを2次元配列に格納する
            while(s != null){
                data[count]=s.split(",");
                s=br.readLine();
                
                count++;
            }




        }catch(FileNotFoundException e){
            System.out.println("ファイルがありません");
        }catch(IOException e){
            System.out.println(e);
        }

        //暗号化したい文字を入力する。
        System.out.print("入力:");
        Scanner u=new Scanner(System.in);
        String sentence=u.nextLine();
        String[] sentenceArray=new String[sentence.length()];

        //入力した文字を一文字ずつ配列に格納する。
        System.out.print("暗号化:");
         for(int i=0;i<sentence.length();i++){
             sentenceArray[i]=String.valueOf(sentence.charAt(i));
        }

        //入力した文字とCrypt3-3.txtにある文字が一致するかの判定をする。
        for(int i=0;i<sentenceArray.length;i++) {
             String value1=sentenceArray[i];
             a: for(M=0;M<9;M++) {
                for(N=0;N<9;N++) {
                     String value=data[M][N];
                     if(value.equals(value1)) {
                        System.out.print(N+1);
                        System.out.print(M+1+"　");
                        break a;
                    }
                    
                }
                if(M==8){
                    System.out.print(19+"　");//最後まで一致しなかった場合@と同じ19を出力する。
                }

            }
 
        }
    }
}