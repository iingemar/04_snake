package snake.core;

import playn.core.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static playn.core.PlayN.assets;
import static playn.core.PlayN.graphics;
import static playn.core.PlayN.pointer;

/**
 * Created by IntelliJ IDEA.
 * Player: Ingemar
 * Date: 2012-06-10
 * Time: 16:11
 * To change this template use File | Settings | File Templates.
 */
public class GameScreen implements Screen {

    private GameEngine gameEngine;
    private GroupLayer groupLayer;
    private Direction direction;

    public GameScreen(GameEngine gameEngine) {
        this.gameEngine = gameEngine;
        init();
    }
    
    @Override
    public void init() {
        // Create and add background image layer
        Image bgImage = assets().getImage("images/bg.png");
        ImageLayer bgLayer = graphics().createImageLayer(bgImage);
        graphics().rootLayer().add(bgLayer);

        // Create a GroupLayer to hold the sprites
        groupLayer = graphics().createGroupLayer();
        graphics().rootLayer().add(groupLayer);

        Player player = new Player(groupLayer, 0, 0);

    }

    @Override
    public void cleanup() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void pause() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void resume() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void handleMouseUpEvent(Mouse.ButtonEvent buttonEvent) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void handleMouseDownEvent(Mouse.ButtonEvent buttonEvent) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void handleMouseMovedEvent(Mouse.MotionEvent event) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void update(float delta) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void draw() {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
