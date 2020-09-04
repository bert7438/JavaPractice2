package ru.mirea.bert7438.javapratice2.ball;

public class Ball {
    private double x = 0;
    private double y = 0;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setXY(double x, double y){
        setX(x);
        setY(y);
    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Ball(){}

    public void move(double xDisp, double yDisp){
        x+=xDisp;
        y+=yDisp;
    }

    @Override
    public String toString() {
        return "Ball" +
                "(" + x +
                ", " + y +
                ')';
    }
}
