//7018903 �x��G��
public class S7018903_Kadai6_1 {
    public static void main(String[] args) {
        
        
        Animals[] a = new Animals[3];

        a[0] = new S7018903_Human(66,"�r�b�N�}�b�N",24,"�l��");
        a[1] = new S7018903_Elephants(6000,"��",40,"��");
        a[2] = new S7018903_Lion(190,"��",58,"���C�I��");


        for(int i=0; i<3;i++)
        {
            a[i].eat();//�H�ׂ�
            a[i].running();//����
        }
    }
        
}