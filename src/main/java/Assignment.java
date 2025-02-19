package main.java;

public class Assignment {
    /**
     * Exercise 1: Calculate movie ticket total
     * Calculate the total cost for a family going to the movies:
     * - Adult tickets cost $12.50 each (2 adults)
     * - Child tickets cost $8.00 each (3 children)
     * - Large popcorn costs $7.25 (1 popcorn to share)
     */
    public static double calculateMovieNight() {
        // TODO: Implement this method

        // Declaring prices as double variables
        double adultTicket = 12.5;
        double childTicket = 8;
        double largePopcorn = 7.25;
        
        // Returning the amount of items sold multiplied by its type of item, then adding them all together
        return ((3 * childTicket) + (2 * adultTicket) + (1 * largePopcorn));
    }

    /**
     * Exercise 2a: Check if someone can rent a car
     * Most rental companies require drivers to be 25 or older
     * @param age the person's age
     * @return true if age is 25 or older, false otherwise
     */
    public static boolean canRentCar(int age) {
        // TODO: Implement this method

        // An inequality to check whether they meet the age criteria
        if (age < 25) {
            return false; 
            }

        if (age >= 25) {
            return true;
            }

        return false; // Can't have conditional return statements only. This will appear in every exercise 
    }

    /**
     * Exercise 2b: Check if password is valid length
     * Password must be at least 8 characters
     * @param password the password to check
     * @return true if password length is 8 or more, false otherwise
     */
    public static boolean isValidPasswordLength(String password) {
        // TODO: Implement this method

        // .length() returns the amount of characters in a given string, then an inequality is used to check whether the password is long enough.
        if (password.length() >= 8) {
            return true;
            }
        if (password.length() < 8) {
            return false;
            }

        return false;
    }

    /**
     * Exercise 2c: Check if it's time for an oil change
     * Car needs oil change every 5000 miles
     * @param mileage the current mileage
     * @param lastChangeMileage the mileage at last oil change
     * @return true if difference is 5000 or more, false otherwise
     */
    public static boolean needsOilChange(int mileage, int lastChangeMileage) {
        // TODO: Implement this method

        // Checks if it has been 5000 miles since your last change, noted as (lastChangeMileage + 5000), then you need a change if your current mileage is equal to or more than that amount.
        if (lastChangeMileage + 5000 <= mileage) {
            return true;
            }
        if (lastChangeMileage + 5000 > mileage) {
            return false;
            }
        
        return false;
    }

    /**
     * Exercise 3: Get message for divisible by 3
     * @param number the number to check
     * @return "Divisible by 3" if number is divisible by 3, "" otherwise
     */
    public static String getDivisibleByThreeMessage(int number) {
        // TODO: Implement this method

        // The "%" is an operator that returns the remainder of the left value divided by the right value, rather than the value itself. Any number that is divisible by 3 and gives an integer value will have a remainder of 0, which is what I'm checking for.
        if (number % 3 == 0) {
            return "Divisible by 3";
            }
        if (number %3 != 0) {
            return ""; // See line 88 on what I'm instructed to return
            }
        
        return "";
    }

    /**
     * Exercise 4: Determine if a year is a leap year
     * @param year the year to check
     * @return "Leap Year" if the year is a leap year, "Not Leap Year" otherwise
     * Hint: a year is a leap year if it's divisible by 4, 
     * except if it's divisible by 100 but not by 400
     */
    public static String getLeapYearMessage(int year) {
        // TODO: Implement this method

        if (year % 4 == 0) { // The same logic from exercise 3 applies here.
            return "Leap Year";
            }
        if (year % 4 != 0 || ((year % 100 == 0) && (year % 400 != 0))) { // For the second part of this if statement. see line 109.
            return "Not Leap Year";
            }
        
        return "Not Leap Year";
    }

    /**
     * Exercise 5: Get ticket price category
     * @param age the person's age
     * @return "Free" if age < 5, "Child Price" if age is 5-12, 
     *         "Student Price" if age is 13-21, "Adult Price" if age is 22+
     */
    public static String getTicketPriceCategory(int age) {
        // TODO: Implement this method

        if (age < 5) {
            return "Free";
            }
        if (age >= 13 || age <= 21) {
            return "Student Price";
            }
        if (age >= 22) {
            return "Adult Price";
            }
        
        return "Adult Price";
    }


}