package pointvamoveablepoint;

public class MoveAblePoint extends Point {
    private float xSpeed = 9.0f;
    private float ySpeed = 4.0f;


    public MoveAblePoint() {
    }

    public MoveAblePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveAblePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }


    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed(){
        return new float[] {this.xSpeed, this.ySpeed};
    }

    public String toString() {
        return "Điểm di chuyển được: [x=" + x + ", y=" + y + "]";
    }


}
