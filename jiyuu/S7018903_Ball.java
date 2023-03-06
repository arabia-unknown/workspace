import java.awt.Graphics;
import java.awt.Color;
public class S7018903_Ball {
    double xVal,yVal,x,y;

    public S7018903_Ball(){
        x = 350.0;//ボールの初期位置x軸
        y = 250.0;//ボールの初期位置y軸
        xVal = randomballspeed()*randomballdirection();//x方向の向き
        yVal = randomballspeed()*randomballdirection();//y方向の向き
    }

    //ボールの速度
    public double randomballspeed(){
        return (Math.random()*3 + 2);
    }
    //ボールの進行方向
    public double randomballdirection(){
        int rand = (int)(Math.random()*2);
        if(rand == 2)
        return 1;
        else
        return -1;
    }

    public void draw(Graphics g){
        g.setColor(Color.white);//ボールの色
        g.fillOval((int)x-10,(int)y-10,20,20);//円の描画
    }

    //板の当たり判定設定
    public void checkPaddleCollision(S7018903_Paddle p1,S7018903_Paddle p2){

        if(x < 41.0 && x >= 20.0){
            if(y >= p1.getY() - 10 && y <= p1.getY()){
                yVal = -yVal;
            }
            if(y <= p1.getY() + 90 && y >= p1.getY() + 80){
                yVal = -yVal;
            }
        }
        //else if(x >= 40.0 && x <= 50.0){
        else if(x >= 41 && x <= 50){
            if(y >= p1.getY() - 15 && y <= p1.getY() + 95){
                xVal = -xVal;
            }
        }
        
        else if(x > 637 && x <= 660){
            if(y >= p2.getY() - 10 && y <= p2.getY()){
                yVal = -yVal;
            }else if(y <= p2.getY() + 90 && y >= p2.getY() + 80){
                yVal = -yVal;
            }
        }else if(x >= 630 && x <= 637){
            if(y >= p2.getY() -15 && y <= p2.getY() + 95){
                xVal = -xVal;
            }
        }

    }

    //ボールの壁反射処理
    public void move(){
        x += xVal;
        y += yVal;

        if(y<10)
        {
            y=10;
            yVal = -yVal;
        }
        if(y>450){
            y=450;
            yVal = -yVal;
        }
    }
    //ボールの現在のx軸を返す
    public int getX(){
        return (int)x;
    }
    //ボールの現在のy軸を返す
    public int getY(){
        return (int)y;
    }
    
}