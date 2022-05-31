public class minutesToYearsAndDaysCalculator {

    public static void main(String[] args) {
        printYearsAndDays(-525600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long days = minutes / 1440;
            long daysRemained = days % 365;
            System.out.println(minutes + " min = " + years + " y and " + daysRemained + " d");
        }
    }
}
