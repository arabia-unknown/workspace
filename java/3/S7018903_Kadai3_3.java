//7018903 �x��G��
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;
import java.io.*;

public class S7018903_Kadai3_3 {
    public static void main(String[] arg){

        String[][] data=new String[10][10];

        int M=0,N=0;

        //�t�@�C��:Crypt3-3.txt��ǂݏo��
        try{
            String s;
            File f=new File("Crypt3-3.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            s=br.readLine();
            int count=0;

            //�ǂݏo�����f�[�^��2�����z��Ɋi�[����
            while(s != null){
                data[count]=s.split(",");
                s=br.readLine();
                
                count++;
            }




        }catch(FileNotFoundException e){
            System.out.println("�t�@�C��������܂���");
        }catch(IOException e){
            System.out.println(e);
        }

        //�Í�����������������͂���B
        System.out.print("����:");
        Scanner u=new Scanner(System.in);
        String sentence=u.nextLine();
        String[] sentenceArray=new String[sentence.length()];

        //���͂����������ꕶ�����z��Ɋi�[����B
        System.out.print("�Í���:");
         for(int i=0;i<sentence.length();i++){
             sentenceArray[i]=String.valueOf(sentence.charAt(i));
        }

        //���͂���������Crypt3-3.txt�ɂ��镶������v���邩�̔��������B
        for(int i=0;i<sentenceArray.length;i++) {
             String value1=sentenceArray[i];
             a: for(M=0;M<9;M++) {
                for(N=0;N<9;N++) {
                     String value=data[M][N];
                     if(value.equals(value1)) {
                        System.out.print(N+1);
                        System.out.print(M+1+"�@");
                        break a;
                    }
                    
                }
                if(M==8){
                    System.out.print(19+"�@");//�Ō�܂ň�v���Ȃ������ꍇ@�Ɠ���19���o�͂���B
                }

            }
 
        }
    }
}