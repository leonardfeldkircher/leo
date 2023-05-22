package at.leo.firstgame;

import org.newdawn.slick.*;
import org.newdawn.slick.tests.AnimationTest;

public class Rectangels extends BasicGame{
    private float x;
    private float y;
    private float c1x;
    private float c1y;
    private float c2x;
    private float c2y;
    private float speed;

    public enum Direction{RIGHT, DOWN, LEFT, UP}
    private Direction direction = Direction.RIGHT;

    public enum DirectionC1{RIGHT, LEFT}
    private DirectionC1 directionC1 = DirectionC1.RIGHT;
    public enum DirectionC2{DOWN, UP}
    private DirectionC2 directionC2 = DirectionC2.DOWN;


    public Rectangels(String title) {
        super(title);
    }

    @Override
    public void init(GameContainer gameContainer) throws SlickException {
    this.x = 100;
    this.y = 100;
    this.c1x = 5;
    this.c1y = 50;
    this.c2x = 50;
    this.c2y = 5;
    this.speed = 3.0f;

    }

    @Override
    public void update(GameContainer gameContainer, int delta) throws SlickException {

        if (direction == Direction.RIGHT) {
            this.x += (float) delta / this.speed;
            if (x > 600) {
                direction = Direction.DOWN;
            }
        }

        if (direction == Direction.DOWN) {
            this.y += (float) delta / this.speed;
            if (y > 400) {
                direction = Direction.LEFT;
            }
        }

        if (direction == Direction.LEFT) {
            this.x -= (float) delta / this.speed;
            if (x < 100) {
                direction = Direction.UP;
            }
        }

        if (direction == Direction.UP) {
            this.y -= (float) delta / this.speed;
            if (y < 100) {
                direction = Direction.RIGHT;
            }
        }

        if (directionC1 == DirectionC1.RIGHT) {
            this.c2x += (float) delta / this.speed;
            if (c2x > 700) {
                directionC1 = DirectionC1.LEFT;
            }
        }

        if (directionC1 == DirectionC1.LEFT) {
            this.c2x -= (float) delta / this.speed;
            if (c2x < 50) {
                directionC1 = DirectionC1.RIGHT;
            }
        }

        if (directionC2 == DirectionC2.DOWN) {
            this.c1y += (float) delta / this.speed;
            if (c1y > 500) {
                directionC2 = DirectionC2.UP;
            }
        }

        if (directionC2 == DirectionC2.UP) {
            this.c1y -= (float) delta / this.speed;
            if (c1y < 25) {
                directionC2 = DirectionC2.DOWN;
            }
        }
    }


        @Override
        public void render (GameContainer gameContainer, Graphics graphics) throws SlickException {
            graphics.drawRect(this.x, this.y, 100, 100);
            graphics.drawOval(this.c1x, this.c1y, 50, 50);
            graphics.drawOval(this.c2x, this.c2y, 50, 50);
        }

        public static void main (String[]argv){
            try {
                AppGameContainer container = new AppGameContainer(new Rectangels("Rectangels"));
                container.setDisplayMode(800, 600, false);
                container.start();
            } catch (SlickException e) {
                e.printStackTrace();
            }
        }
}
