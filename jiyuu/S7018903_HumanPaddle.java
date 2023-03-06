//7018903 堀井萌希
import java.awt.Graphics;
import java.awt.Color;
public class S7018903_HumanPaddle implements S7018903_Paddle{
    double y,yVal;
    boolean upAccel,downAccel;
    final double GRAVITY = 0.94;
    int player,x;
    public S7018903_HumanPaddle(int player){
        upAccel = false;//上に進んだか
        downAccel = false;//下に進んだか
        y=210;//板の初期位置
        yVal = 0;//板の初速
        if(player == 1){
            x = 20;//プレーヤー1の板のx軸
        }else{
            x = 640;//プレーヤー2の板のx軸
        }
    }
    public void draw(Graphics g){
        g.setColor(Color.white);//白色塗りつぶし
        g.fillRect(x,(int)y,20,80);//四角形の描画
    }
    public void move(){
        if(upAccel){
            yVal -=2;//上への加速度
        }else if(downAccel){
            yVal +=2;//下への加速度
        }else if(!upAccel && !downAccel){
            yVal  = 0;//上も下も押してないときの加速度
        }

        //速度の調整
        if(yVal >= 5){
            yVal = 5;
        }else if(yVal <= -5){
            yVal = -5;
        }
        y+= yVal;

        //画面外に行かない処理
        if(y < 0)
        {
            y=0;
        }
        if(y > 380)
        {
            y=380;
        }
    }
    //上方向のキーが押されているかの判定結果をupAccelに代入
    public void setUpAccel(boolean input){
        upAccel = input;
    }
    //下方向のキーが押されているかの判定結果をupAccelに代入
    public void setDownAccel(boolean input){
        downAccel = input;
    }
    //板の現在のy軸を返す
    public int getY(){
        return (int)y;
    }
    //板の現在のx軸を返す
    public int getX(){
        return (int)x;
    }
}