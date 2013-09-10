package snake.core;

import playn.core.GroupLayer;
import playn.core.ImageLayer;

import java.util.Random;

import static snake.core.Direction.UP;

public class Player extends Sprite {
    public int SIZE = 40;
    private Frame frame;
    private Direction direction;

    public Player(GroupLayer groupLayer, float x, float y) {
        super(groupLayer, x, y);
        init();
    }

    private void init() {
        // Load sprite
        loadImage("images/snake.png");

        // Set size show
        ImageLayer imageLayer = getImageLayer();
        imageLayer.setWidth(SIZE);
		imageLayer.setHeight(SIZE);

        // Start in random direction
        Random random = new Random();
        int randomDirection = random.nextInt(Direction.values().length);
        setDirection(Direction.values()[randomDirection]);
    }

    public void setFrame(Frame frame) {
        this.frame = frame;
		getImageLayer().setSourceRect(frame.getX(), frame.getY(), SIZE, SIZE);
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
        switch (direction) {
            case UP:
                setFrame(Frame.HEAD_UP);
                break;
            case DOWN:
                setFrame(Frame.HEAD_DOWN);
                break;
            case LEFT:
                setFrame(Frame.HEAD_LEFT);
                break;
            case RIGHT:
                setFrame(Frame.HEAD_RIGHT);
                break;
        }
    }
}
