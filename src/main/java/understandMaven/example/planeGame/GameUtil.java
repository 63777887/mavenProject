package understandMaven.example.planeGame;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

public class GameUtil {
    //工具类最好将构造器私有化
    private  GameUtil(){
    }

    /*
    返回指定路径的文件对象
     */

    public static Image getImage(File file){
        BufferedImage bi=null;
        try {
            bi= ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return bi;
    }
}
