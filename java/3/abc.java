import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.*;

public class abc {
    public static void main(String[] arg){

        String[][] data=new String[10][10];
        //String[] data1=new String[1000];
        int M=0,N=0;
        try{
            String s;
            File f=new File("sample.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            s=br.readLine();
            int count=0;

            // for(int i=0;i<data.length;i++){
                
            //     for(int j=0;j<data[0].length;j++){
            //         s=br.readLine();
            //         data[j]=s.split(",");
                    
            //         System.out.println(data[i][j]);
            //     }
            // }
            while(s != null){
                data[count]=s.split(",");
                s=br.readLine();
                
                count++;
            }


            // while((s=br.readLine()) != null) {
            //     String [] data1 = s.split(",");
            //     data[M][N]=data1[N];
            //     System.out.println(data[M][N]);
            //     if(M<9) {
            //         M++;
            //     }else {
            //         N++;
            //         M=1;
            //     }
            // }

        }catch(IOException e){
            System.out.println("ファイルがありません");
        }

        System.out.print("入力:");
        Scanner u=new Scanner(System.in);
        String sentence=u.nextLine();
        String[] sentenceArray=new String[sentence.length()];

        System.out.print("暗号化:");
         for(int i=0;i<sentence.length();i++){
             sentenceArray[i]=String.valueOf(sentence.charAt(i));
        }


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
                    System.out.print(19+"　");
                }

            }
 
        }
    }
}