package in.kgcoding.Challenge102;

public enum TrafficColor {

    RED(9000),
    YELLOW(1000),
    GREEN(3000);

    private final int onTimeToMills;

    public int getOnTimeToMills() {
        return onTimeToMills;
    }

    TrafficColor(int onTimeToMills) {
        this.onTimeToMills = onTimeToMills;
    }
}
