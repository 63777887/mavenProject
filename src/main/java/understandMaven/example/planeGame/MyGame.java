package understandMaven.example.planeGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;

public class MyGame extends JFrame {
    File file=new File("/Users/edz/project/mavenProject/src/main/java/understandMaven/example/planeGame/image/feiji.jpg");
//        Image ball=GameUtil.getImage(file);
    @Override
    public void paint(Graphics g) {     //自动调用  g相当于一支画笔
        Color c=g.getColor();
        Font f=g.getFont();
        g.setColor(Color.BLUE);
        g.drawLine(100,100,300,300);
        g.drawRect(100,100,300,300);
        g.drawOval(100,100,300,300);
        g.fillRect(100,100,40,40);
        g.setColor(Color.red);
        g.setFont(new Font("宋体",Font.BOLD,30));
        g.drawString("我是谁?",200,200);
//        g.drawImage(ball,10,10,null);

        g.setColor(c);
        g.setFont(f);
        login.setIcon(new ImageIcon("understandMaven/example/planeGame/image/feiji.jpg"));

    }

    /*
        初始化窗口
         */
    public void lunchFrame(){
        this.setTitle("季哥的飞机游戏");
        this.setVisible(true);  //窗口可见
        this.setSize(500,500);
        this.setLocation(450,200);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        MyGame myGame=new MyGame();
        myGame.lunchFrame();
    }
    private JButton login;
}
