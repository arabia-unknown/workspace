//7018903 �x��G��
import java.io.*;
public class S7018903_Kadai3_2 {
    static double sqr( double x ){

        return x * x;//2��̌v�Z

    }
    public static void main(String[] args) {
        
        try {
            File file = new File("Data3-2.txt"); // �ǂݍ��ރt�@�C�����w��
            // FileReader�����b�v����BufferedReader�̃C���X�^���X�𐶐�
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s;
            int sum=0,N=0;
            double ssum =0.0,pp=0.0,variance;
            int data[] =new int[1000];
            int intmax = data[0];
            int intmin = data[0];
            while((s=br.readLine()) != null) {//�S���l�̍��v�l�̌v�Z�ƍő�ŏ��l�̔���
                int i = Integer.parseInt(s);
                data[N]=i;
                if(intmax < data[N]){//�ő�l�̔���
                    intmax = data[N];
                }
                if(intmin > data[i]) {//�ŏ��l�̔���
                    intmin = data[i];
                }
                sum+=i;//���v�l
                N++;//�v�f��
            }
            pp=(double)sum/N;//���ϒl�̌v�Z
            for(int i=0;i<N;i++)
            {
                ssum+=sqr(data[i]-pp);//�Q��a
            }
            variance = ssum/N;//���U
            System.out.println("�ő�l : " + intmax);
            System.out.println("�ŏ��l : " + intmin);
            System.out.println("���ϒl : " + Math.round( pp*100.0 )/100.0);
            System.out.println("���U = : " + String.format("%.2f", variance));
            double sd = Math.sqrt(variance);//�W���΍�
            System.out.println("�W���΍� = : " + Math.round( sd*100.0 )/100.0);
            br.close(); // �t�@�C�������
        } catch(IOException e) {
            System.out.println(e);
        }
    }
}
