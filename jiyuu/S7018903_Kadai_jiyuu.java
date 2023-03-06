//708903 �x��G��
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;
import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;


public class S7018903_Kadai_jiyuu{
    int x=0,y=0;

    public static void main(String[] args) {
        JFrame frame = new JFrame(); // �t���[���𐶐�
    
        frame.setTitle("�z�b�P�["); // �E�B���h�E�^�C�g��
        frame.setSize(700, 500); // �E�B���h�E�T�C�Y
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �~�{�^������
    
        MyPanel panel = new MyPanel(); // MyPanel�𐶐�
        frame.getContentPane().add(panel); // �t���[����MyPanel��\��t����
    
        frame.setVisible(true);
        panel.requestFocus();
        }
}

class MyPanel extends JPanel implements Runnable,KeyListener{
    int panelWidth = 700;//�p�l����
    int panelHeight = 500;//�p�l���c
    int count1=0,count2=0;//���_
    private boolean gamestart,gameover,p1won,p2won,s;
    Thread thread;
    S7018903_HumanPaddle p1;
    S7018903_HumanPaddle2 p2;
    S7018903_Ball b1;

    public MyPanel() {
        this.addKeyListener(this);
        p1 = new S7018903_HumanPaddle(1);
        b1 = new S7018903_Ball();
        p2 = new S7018903_HumanPaddle2(2);
        s = false;
        gamestart = false;//�Q�[�����n�܂��Ă��邩
        gameover = false;//�Q�[���I�[�o�[��
        p1won = false;//�v���[���[1����������
        p2won = false;//�v���[���[2����������
        thread = new Thread(this);
        thread.start();
        
    }
    public void paintComponent(Graphics g) {
        g.setColor(Color.black);//�w�i�F
        g.fillRect(0,0,panelWidth,panelHeight);//�h��Ԃ�
        String c1=Integer.toString(count1);
        String c2=Integer.toString(count2);
        //�^�C�g�����
        if(!gamestart && !s && !gameover){
            g.setColor(Color.red);
            g.setFont(new Font("player1 win", Font.BOLD, 28));
            g.drawString("Press Enter to start", 210, 200);
            g.setFont(new Font("3", Font.PLAIN, 18));
            g.drawString("3�{���ŏ���", 290, 300);
        //���_���̉��
        }else if(!gamestart && s && !gameover){
            g.setColor(Color.red);
            g.setFont(new Font("player1 win", Font.BOLD, 28));
            g.drawString("Press Enter to start", 210, 200);
        }
        //�Q�[���I�[�o�[���͉������Ȃ�
        else if(!gamestart && gameover){


        }
        //�r�����_�\��
        if(s){
            g.setColor(Color.red);
            g.setFont(new Font("", Font.BOLD, 28)); 
            g.drawString("player1", 120, 100);
            g.drawString("player2", 450, 100);
            g.drawString(c1, 160, 150);
            g.drawString(c2, 490, 150);
        }
        //�Q�[���I�[�o�[����Ȃ���Δƃ{�[����`��
        if (!gameover) {
            p1.draw(g);//�v���[���[1�̔�`��
            b1.draw(g);//�{�[���̕`��
            p2.draw(g);//�v���[���[2�̔�`��
        //�v���[���[1���������Ƃ��̏���
        }else if(gameover && p1won){
            g.setColor(Color.red);
			g.setFont(new Font("player1 win", Font.BOLD, 28)); 
            g.drawString("player1 win", 260, 250);
            g.setFont(new Font("3", Font.PLAIN, 25));
            g.drawString("Press Space to retry", 230, 300);
        //�v���[���[2���������Ƃ��̏���
        }else if(gameover && p2won){
            g.setColor(Color.red);
			g.setFont(new Font("player2 win", Font.BOLD, 28)); 
            g.drawString("player2 win", 260, 250);
            g.setFont(new Font("3", Font.PLAIN, 25));
            g.drawString("Press Space to retry", 230, 300);
        }
    }



    public void run() {

        for(;;){
            //Enter�������ꂽ�Ƃ�����J�n
            if(gamestart){
                p1.move();//�v���[���[1�̔̈ړ��J�n
                p2.move();//�{�[���̈ړ��J�n
                b1.move();//�v���[���[2�̔̈ړ��J�n
                b1.checkPaddleCollision(p1,p2);//�̓����蔻�菈���̊J�n
            }

            pointcounter();//�|�C���g�v�Z������
            checkGameOver();//�Q�[���I�[�o�[�̔��菈����
            repaint();
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    //�|�C���g�v�Z����
    public void pointcounter()
    {
        if(!gameover){
            //�v���[���[2�ɓ��_���������Ƃ�
            if(b1.getX() < 0 ){
                count2+=1;//�|�C���g��+1
                //�{�[���Ɣ������ʒu�Ɉړ�
                b1.x=350.0;
                b1.y=250.0;
                p1.y=210;
                p2.y=210;
                s = true;
                gamestart = false;
            }else if(b1.getX() > 680){
                count1+=1;//�|�C���g��+1
                //�{�[���Ɣ������ʒu�Ɉړ�
                b1.x=350.0;
                b1.y=250.0;
                p1.y=210;
                p2.y=210;
                s = true;
                gamestart = false;
            }
        }
    }
    //�Q�[���I�[�o�[���菈��
    public void checkGameOver(){
        if(!gameover){

            //�v���[���[2��3�_�Ƃ������Q�[���I�[�o�[�Ɣ���
            if(count2==3){
                p2won = true;
                gameover = true;
            }

            //�v���[���[1��3�_�Ƃ������Q�[���I�[�o�[�Ɣ���
            if(count1==3){
                p1won = true;
                gameover = true;
            }

            
        }

    }

    public void keyPressed(KeyEvent e){

        //�v���[���[1�̑���(�L�[���������Ƃ�)
        if(e.getKeyCode() == KeyEvent.VK_W){
            p1.setUpAccel(true);
        }else if(e.getKeyCode() == KeyEvent.VK_S)
        {
            p1.setDownAccel(true);
        }
        //�v���[���[2�̑���(�L�[���������Ƃ�)
        if(e.getKeyCode() == KeyEvent.VK_UP){
            p2.setUpAccel(true);
        }else if(e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            p2.setDownAccel(true);
        }
        //Enter�L�[�̑���
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            if(!gamestart){
                gamestart = true;
            }
        //space�L�[�̑���
        }else if(e.getKeyCode() == KeyEvent.VK_SPACE){
            if(gameover){
                //�S�ă��Z�b�g
                p1 = new S7018903_HumanPaddle(1);
                b1 = new S7018903_Ball();
                p2 = new S7018903_HumanPaddle2(2);
                s = false;
                gamestart = false;
                gameover = false;
                p1won = false;
                p2won = false;
                count1=0;
                count2=0;
            }
        }
        

    }
    public void keyReleased(KeyEvent e){
        //�v���[���[1�̑���(�L�[�𗣂����Ƃ�)
        if(e.getKeyCode() == KeyEvent.VK_W){
            p1.setUpAccel(false);
        }else if(e.getKeyCode() == KeyEvent.VK_S)
        {
            p1.setDownAccel(false);
        }
        //�v���[���[2�̑���(�L�[�𗣂����Ƃ�)
        if(e.getKeyCode() == KeyEvent.VK_UP){
            p2.setUpAccel(false);
        }else if(e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            p2.setDownAccel(false);
        }
    }
    public void keyTyped(KeyEvent arg0){
        
    }
}