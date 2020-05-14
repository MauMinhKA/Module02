package src.kethua.baitap;

public class MoveablePoint extends Point {
    private float xSpeed, ySpeed;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float[] array = new float[2];
        array[0] = xSpeed;
        array[1] = ySpeed;
        return array;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x=" + xSpeed +
                ", y=" + ySpeed +
                '}';
    }

    public MoveablePoint move() {
        super.setX(super.getX() + xSpeed);
        super.setY(super.getY() + ySpeed);
        return this;
    }

    public static void main(String[] args) {
        MoveablePoint mo = new MoveablePoint(3.5f, 4.5f, 5.5f, 6.5f);
        MoveablePoint oj = mo.move();
        System.out.println("mo" + mo.getX() +"    "+ mo.getY());
        System.out.println("oj " +oj.getX() +"     "+oj.getY());


    }
}

