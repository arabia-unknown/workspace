//708903 堀井萌希
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
        JFrame frame = new JFrame(); // フレームを生成
    
        frame.setTitle("ホッケー"); // ウィンドウタイトル
        frame.setSize(700, 500); // ウィンドウサイズ
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ×ボタン処理
    
        MyPanel panel = new MyPanel(); // MyPanelを生成
        frame.getContentPane().add(panel); // フレームにMyPanelを貼り付ける
    
        frame.setVisible(true);
        panel.requestFocus();
        }
}

class MyPanel extends JPanel implements Runnable,KeyListener{
    int panelWidth = 700;//パネル横
    int panelHeight = 500;//パネル縦
    int count1=0,count2=0;//得点
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
        gamestart = false;//ゲームが始まっているか
        gameover = false;//ゲームオーバーか
        p1won = false;//プレーヤー1が勝ったか
        p2won = false;//プレーヤー2が勝ったか
        thread = new Thread(this);
        thread.start();
        
    }
    public void paintComponent(Graphics g) {
        g.setColor(Color.black);//背景色
        g.fillRect(0,0,panelWidth,panelHeight);//塗りつぶし
        String c1=Integer.toString(count1);
        String c2=Integer.toString(count2);
        //タイトル画面
        if(!gamestart && !s && !gameover){
            g.setColor(Color.red);
            g.setFont(new Font("player1 win", Font.BOLD, 28));
            g.drawString("Press Enter to start", 210, 200);
            g.setFont(new Font("3", Font.PLAIN, 18));
            g.drawString("3本先取で勝利", 290, 300);
        //得点時の画面
        }else if(!gamestart && s && !gameover){
            g.setColor(Color.red);
            g.setFont(new Font("player1 win", Font.BOLD, 28));
            g.drawString("Press Enter to start", 210, 200);
        }
        //ゲームオーバー時は何もしない
        else if(!gamestart && gameover){


        }
        //途中得点表示
        if(s){
            g.setColor(Color.red);
            g.setFont(new Font("", Font.BOLD, 28)); 
            g.drawString("player1", 120, 100);
            g.drawString("player2", 450, 100);
            g.drawString(c1, 160, 150);
            g.drawString(c2, 490, 150);
        }
        //ゲームオーバーじゃなければ板とボールを描画
        if (!gameover) {
            p1.draw(g);//プレーヤー1の板を描画
            b1.draw(g);//ボールの描画
            p2.draw(g);//プレーヤー2の板を描画
        //プレーヤー1が勝ったときの処理
        }else if(gameover && p1won){
            g.setColor(Color.red);
			g.setFont(new Font("player1 win", Font.BOLD, 28)); 
            g.drawString("player1 win", 260, 250);
            g.setFont(new Font("3", Font.PLAIN, 25));
            g.drawString("Press Space to retry", 230, 300);
        //プレーヤー2が勝ったときの処理
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
            //Enterが押されたとき動作開始
            if(gamestart){
                p1.move();//プレーヤー1の板の移動開始
                p2.move();//ボールの移動開始
                b1.move();//プレーヤー2の板の移動開始
                b1.checkPaddleCollision(p1,p2);//板の当たり判定処理の開始
            }

            pointcounter();//ポイント計算処理へ
            checkGameOver();//ゲームオーバーの判定処理へ
            repaint();
            try{
                Thread.sleep(10);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    //ポイント計算処理
    public void pointcounter()
    {
        if(!gameover){
            //プレーヤー2に得点が入ったとき
            if(b1.getX() < 0 ){
                count2+=1;//ポイントに+1
                //ボールと板を初期位置に移動
                b1.x=350.0;
                b1.y=250.0;
                p1.y=210;
                p2.y=210;
                s = true;
                gamestart = false;
            }else if(b1.getX() > 680){
                count1+=1;//ポイントに+1
                //ボールと板を初期位置に移動
                b1.x=350.0;
                b1.y=250.0;
                p1.y=210;
                p2.y=210;
                s = true;
                gamestart = false;
            }
        }
    }
    //ゲームオーバー判定処理
    public void checkGameOver(){
        if(!gameover){

            //プレーヤー2が3点とった時ゲームオーバーと判定
            if(count2==3){
                p2won = true;
                gameover = true;
            }

            //プレーヤー1が3点とった時ゲームオーバーと判定
            if(count1==3){
                p1won = true;
                gameover = true;
            }

            
        }

    }

    public void keyPressed(KeyEvent e){

        //プレーヤー1の操作(キーを押したとき)
        if(e.getKeyCode() == KeyEvent.VK_W){
            p1.setUpAccel(true);
        }else if(e.getKeyCode() == KeyEvent.VK_S)
        {
            p1.setDownAccel(true);
        }
        //プレーヤー2の操作(キーを押したとき)
        if(e.getKeyCode() == KeyEvent.VK_UP){
            p2.setUpAccel(true);
        }else if(e.getKeyCode() == KeyEvent.VK_DOWN)
        {
            p2.setDownAccel(true);
        }
        //Enterキーの操作
        if(e.getKeyCode() == KeyEvent.VK_ENTER){
            if(!gamestart){
                gamestart = true;
            }
        //spaceキーの操作
        }else if(e.getKeyCode() == KeyEvent.VK_SPACE){
            if(gameover){
                //全てリセット
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
        //プレーヤー1の操作(キーを離したとき)
        if(e.getKeyCode() == KeyEvent.VK_W){
            p1.setUpAccel(false);
        }else if(e.getKeyCode() == KeyEvent.VK_S)
        {
            p1.setDownAccel(false);
        }
        //プレーヤー2の操作(キーを離したとき)
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