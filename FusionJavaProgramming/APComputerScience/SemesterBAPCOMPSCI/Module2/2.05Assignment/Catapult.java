public class Catapult {
    private int speed;
    private int angle;

    public Catapult() {
        speed = 0;
        angle = 0;
    }

    public double calcDistance(int speed,int angle) {
        double speedFtPerSec = speed * 1.46667;
        double gravity = 32.174;
        double radians = Math.toRadians(angle);
        double distance = (speedFtPerSec * speedFtPerSec) * Math.sin(2 * radians) / gravity;
        return distance;
    }
}
