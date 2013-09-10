package snake.core;

/**
 * Created by IntelliJ IDEA.
 * User: Ingemar
 * Date: 2012-06-17
 * Time: 19:21
 * To change this template use File | Settings | File Templates.
 */
public enum Frame {
    HEAD_LEFT(0, 0),
    HEAD_UP(64, 0),
    HEAD_RIGHT(127, 0),
    HEAD_DOWN(190, 0),
    VERTICAL(254, 0),
    HORIZONTAL(0, 44),
    BOTTOM_RIGHT(64, 44),
    BOTTOM_LEFT(127, 44),
    TOP_LEFT(190, 44),
    TOP_RIGHT(254, 0);

    private int x;
    private int y;

    Frame(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
