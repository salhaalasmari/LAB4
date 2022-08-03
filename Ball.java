public class Ball
{
   float x , y , xDelta , yDelta;
      int redius;

    public Ball(float x , float y , float xDelta , float yDelta ,int redius ) {
        this.x = x;
        this.y=y;
        this.xDelta=xDelta;
        this.yDelta=yDelta;
        this.redius=redius;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float getxDelta() {
        return xDelta;
    }

    public float getyDelta() {
        return yDelta;
    }

    public int getRedius() {
        return redius;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void setRedius(int redius) {
        this.redius = redius;
    }

    public  void move(){
      x+=xDelta;
        System.out.println("X after moving is"+x);
      y+=yDelta;
        System.out.println("y after moving is"+x);

    }
public void reflectHorizontal(){
        xDelta = - xDelta;
    System.out.println("xDelta after reflect Horizontal"+ xDelta);
}
public  void  reflectVertical(){
        yDelta = -yDelta;
    System.out.println("yDelta after reflect Vertical"+yDelta);
}

    @Override
    public String toString() {
        return "Ball [" +
                "x=" + x +
                ", y ] " + y +
                ", speed=(" + xDelta + yDelta+")]" ;
    }
}
