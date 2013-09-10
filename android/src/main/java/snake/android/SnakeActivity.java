package snake.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import snake.core.Snake;

public class SnakeActivity extends GameActivity {

  @Override
  public void main(){
    platform().assets().setPathPrefix("snake/resources");
    PlayN.run(new Snake());
  }
}
