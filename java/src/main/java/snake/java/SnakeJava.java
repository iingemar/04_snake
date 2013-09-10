package snake.java;

import playn.core.PlayN;
import playn.java.JavaPlatform;

import snake.core.Snake;

public class SnakeJava {

  public static void main(String[] args) {
    JavaPlatform platform = JavaPlatform.register();
    platform.assets().setPathPrefix("snake/resources");
    PlayN.run(new Snake());
  }
}
