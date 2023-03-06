//7018903 �x��G��
import java.awt.Graphics;
import java.awt.Color;
public class S7018903_HumanPaddle implements S7018903_Paddle{
    double y,yVal;
    boolean upAccel,downAccel;
    final double GRAVITY = 0.94;
    int player,x;
    public S7018903_HumanPaddle(int player){
        upAccel = false;//��ɐi�񂾂�
        downAccel = false;//���ɐi�񂾂�
        y=210;//�̏����ʒu
        yVal = 0;//�̏���
        if(player == 1){
            x = 20;//�v���[���[1�̔�x��
        }else{
            x = 640;//�v���[���[2�̔�x��
        }
    }
    public void draw(Graphics g){
        g.setColor(Color.white);//���F�h��Ԃ�
        g.fillRect(x,(int)y,20,80);//�l�p�`�̕`��
    }
    public void move(){
        if(upAccel){
            yVal -=2;//��ւ̉����x
        }else if(downAccel){
            yVal +=2;//���ւ̉����x
        }else if(!upAccel && !downAccel){
            yVal  = 0;//������������ĂȂ��Ƃ��̉����x
        }

        //���x�̒���
        if(yVal >= 5){
            yVal = 5;
        }else if(yVal <= -5){
            yVal = -5;
        }
        y+= yVal;

        //��ʊO�ɍs���Ȃ�����
        if(y < 0)
        {
            y=0;
        }
        if(y > 380)
        {
            y=380;
        }
    }
    //������̃L�[��������Ă��邩�̔��茋�ʂ�upAccel�ɑ��
    public void setUpAccel(boolean input){
        upAccel = input;
    }
    //�������̃L�[��������Ă��邩�̔��茋�ʂ�upAccel�ɑ��
    public void setDownAccel(boolean input){
        downAccel = input;
    }
    //�̌��݂�y����Ԃ�
    public int getY(){
        return (int)y;
    }
    //�̌��݂�x����Ԃ�
    public int getX(){
        return (int)x;
    }
}