public class EnumTest{

    public enum Day {
        SUNDAY, MONDAY, TUESDAY,
        WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    Day day;

    public EnumTest(Day day){
        this.day = day;
    }

    public void theTruth() {
        System.out.println(switch (this.day) {
            case MONDAY -> "Mondays are bad.";
            case FRIDAY -> "Fridays are better.";
            case SATURDAY -> "Weekends are best.";
            case SUNDAY -> "Weekends are best.";
            default -> "Midweek days are so-so.";
        });
    }

    public static void main(String[] args) {
        EnumTest firstDay = new EnumTest(Day.MONDAY);
        firstDay.theTruth();
        EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
        thirdDay.theTruth();
        EnumTest fifthDay = new EnumTest(Day.FRIDAY);
        fifthDay.theTruth();
        EnumTest sixthDay = new EnumTest(Day.SATURDAY);
        sixthDay.theTruth();
        EnumTest seventhDay = new EnumTest(Day.SUNDAY);
        seventhDay.theTruth();
    }
}


