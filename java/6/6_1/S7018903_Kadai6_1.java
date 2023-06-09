//7018903 堀井萌希
public class S7018903_Kadai6_1 {
    public static void main(String[] args) {
        
        
        Animals[] a = new Animals[3];

        a[0] = new S7018903_Human(66,"ビックマック",24,"人間");
        a[1] = new S7018903_Elephants(6000,"草",40,"象");
        a[2] = new S7018903_Lion(190,"肉",58,"ライオン");


        for(int i=0; i<3;i++)
        {
            a[i].eat();//食べる
            a[i].running();//走る
        }
    }
        
}