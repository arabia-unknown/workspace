//7018903 �x��G��
class S7018903_Elephants extends Animals {
    private String food;
    private int run;
    S7018903_Elephants(int w,String food,int run,String name){
        this.weight = w;//�d��
        this.food = food;//�H�ו�
        this.run = run;//���鑬��
        this.groupName = name;//�푰
    }

    void eat(){
        System.out.println(groupName+"�̕��ϑ̏d��"+weight+"kg�ł��B");
        System.out.println(groupName+"��"+food+"��H�ׂ܂��B");
    }
    void running(){
        System.out.println(groupName+"��"+run+"km/h�ő���܂��B");
    }

}