//7018903 �x��G��
import java.util.*;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileNotFoundException;

public class S7018903_Kadai6_3 {
    public static void main(String[] args) {
        //HashMap<String,String> map1 = new HashMap<>();
        HashMap<Integer,String> map2 = new HashMap<>();

        try{
            String s,b;
            String [] a = new String[1000000];
            String[] touhoku = {"�H�c��","�X��","��茧","�R�`��","�{�錧","������"};
            int count1=0,count2=0;
            File f=new File("Data6-3.csv");
            BufferedReader br = new BufferedReader(new FileReader(f));
            BufferedReader bl = new BufferedReader(new FileReader(f));

            s = br.readLine();

            //�ǂݏo�����f�[�^���i�[����
            while((s=br.readLine()) != null){
                //System.out.println(s);
                //s = br.readLine();
                String[] parts = s.split(",");
                String age = parts[2];
                String address = parts[3];
                int num = Integer.parseInt(age);
                
                map2.put(num,address);
                String values="�H�c��";
                //30��̏H�c���o�g�҂̌��o
                if(values.equals(address)&&num>=30&&num<40){
                    count1++;
                    System.out.println("30��̏H�c�o�g�҂�"+count1+"��");
                    System.out.println(s);
                }
                for(int i=0;i<6;i++){
                    if(touhoku[i].equals(address)&&num>=50){
                        count2++;
                    }
                    
                }
            }
            System.out.println("\n");
            System.out.println("50��ȏ��"+count2+"��");
            b = bl.readLine();

            //50�Έȏ�̓��k�o�g�҂̌��o
            while((b=bl.readLine()) != null){
                String[] parts = b.split(",");
                String age = parts[2];
                String address = parts[3];
                int num = Integer.parseInt(age);               
                map2.put(num,address);
                for(int i=0;i<6;i++){
                    if(touhoku[i].equals(address)&&num>=50){
                        System.out.println(b);
                    }
                    
                }
            }


            
            




        }catch(FileNotFoundException e){
            System.out.println("�t�@�C��������܂���");
        }catch(IOException e){
            System.out.println(e);
        }

    }
}