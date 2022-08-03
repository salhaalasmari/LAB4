public class myPoint {
    int x =0;
    int y=0;

    public myPoint() {
    }

    public myPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public  int[] getXY(){
        int array []= {x , y};
        return array;
    }
    public void setXY(int newX , int newY){
        System.out.println("the new x is ");
        x=newX;
        System.out.print(x);
        System.out.println("the new y is ");
        y=newY;
        System.out.print(y);
    }
    public  double distance(int x2 , int y2){
        return Math.sqrt((y2 - y) * (y2 - y) + (x2 - x) * (x2 - x));
    }
    public  double distance(myPoint another){

        return Math.sqrt((another.getY() - y) * (another.getY() - y) + (another.getX() - x) * (another.getX() - x));
    }
    public double distance(){
        return Math.sqrt((0 - 0) * (0 - 0) + (0 - 0) * (0 - 0));
    }

    @Override
    public String toString() {
        return "myPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
