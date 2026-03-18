public class timeConverter {

    private final int minsInHour = 60;

    private Double mins;
    public timeConverter(double m) {

        mins = m;

    }




    public Double convertToHours(double mins) {
        return (minsInHour/mins);
    }
}