package udemy.exercise.date;

public class DateExercises {

    // responsible for converting minutes in years and days
    public String convertingYearsAndDays(long minutes) {
        int years = 0;
        int days = 0;
        int hours = 0;

        if (minutes < 0) {
            return "Invalid Value";
        } else {
            hours = (int) minutes / 60;
            days = hours / 24;
            years = days / 365;
            days = days % 365;

            return minutes + " min = " + years + " y and " + days + " d";
        }
    }

    // responsible for checking if the given year is a leap one
    public boolean isLeapYear(int year) {
        if ((year >= 1) && (year <= 9999)) {
            if ((year % 4) > 0) {
                return false;
            } else {
                if ((year % 100) > 0) {
                    return true;
                } else {
                    if ((year % 400) > 0) {
                        return false;
                    } else {
                        return true;
                    }
                }
            }
        } else {
            return false;
        }
    }

    // responsible for returning the quantity of days in a month
    public int getDaysInMonth(int month, int year) {

        int days = 0;

        if (((month < 1) || (month > 12)) || (year < 1) || (year > 9999)) {
            days = -1;
        } else {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    days = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    days = 30;
                    break;
                case 2:
                    boolean leapYear = isLeapYear(year);
                    if (leapYear == false) {
                        days = 28;
                    } else {
                        days = 29;
                    }
                    break;
            }
        }
        return days;
    }
}