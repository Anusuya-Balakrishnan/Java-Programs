package Section4;

public class HourCalculation {

    private static final String INVALID="Invalid Value";
    public static void getDurationString(long minutes, long seconds) {
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            long hour = minutes / 60;
            minutes = minutes % 60;
            String hourString=hour+"h";
            if (hour < 10) {
                hourString = "0" + hourString;
            }
            String minutesString=minutes+"m";
            if (minutes < 10) {
                minutesString = "0" + minutesString;
            }
            String secondsString=seconds+"s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }
            
            System.out.println(hourString + " " + minutesString + " " + secondsString);
        } else {
            System.out.println(INVALID);
        }

    }

    public static void getDurationString(long timevalue) {
        if (timevalue > 0) {
            long minutes = timevalue / 60;
            long seconds = timevalue % 60;
            getDurationString(minutes, seconds);
        } else {
            System.out.println(INVALID);
        }
    }

    public static void main(String[] args) {
        getDurationString(3945L);
        getDurationString(65, 45);
        getDurationString(-41);
        getDurationString(65,9);
    }
}
