package ss4_class_object.bai_tap.fan;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed;
    boolean status;
    double radius;
    String color;

    public Fan() {
        this.speed = SLOW;
        this.status = false;
        this.radius = 10;
        this.color = "blue";
    }


    private Fan(int speed, boolean status, double radius, String color) {
        this.speed = speed;
        this.status = status;
        this.radius = radius;
        this.color = color;

    }

    public int getSpeed() {
        return this.speed;

    }

    public boolean getIsOn() {
        return true;
    }


    @Override
    public String toString() {
        if (getIsOn()) {
            return "Fan{" +
                    "speed=" + speed +
                    ", status=" + status +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        } else {
            return "Fan{" +
                    "status=" + status +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    '}';
        }
    }
}
