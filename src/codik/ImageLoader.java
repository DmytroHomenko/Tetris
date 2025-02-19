package codik;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageLoader {
    public static BufferedImage loadImage(String path ) {
        try {
            return ImageIO.read(new File("data" + path));
        }
        catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        return null;
    }

}
