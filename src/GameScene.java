import javax.swing.text.html.ImageView;
import java.awt.geom.Rectangle2D;

public class GameScene {
    private Camera cam;
    private ImageView start;

    public GameScene(Camera cam, ImageView start) {
        this.cam = cam;
        this.start = start;
    }
