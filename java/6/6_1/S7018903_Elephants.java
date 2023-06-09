//7018903 堀井萌希
class S7018903_Elephants extends Animals {
    private String food;
    private int run;
    S7018903_Elephants(int w,String food,int run,String name){
        this.weight = w;//重さ
        this.food = food;//食べ物
        this.run = run;//走る速さ
        this.groupName = name;//種族
    }

    void eat(){
        System.out.println(groupName+"の平均体重は"+weight+"kgです。");
        System.out.println(groupName+"は"+food+"を食べます。");
    }
    void running(){
        System.out.println(groupName+"は"+run+"km/hで走ります。");
    }

}