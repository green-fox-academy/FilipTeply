public class Exercise06 {
    public static void main(String[] args) {
        double codingHoursPerDay = 6.0;
        double weeksPerSemester = 17.0;
        double codingHoursPerSemester;
        codingHoursPerSemester = codingHoursPerDay*5*weeksPerSemester;

        System.out.println("Number of hours spent with coding in a semester by an attendee at GFA is " + codingHoursPerSemester);

        double percentageOfCodingHours;

        percentageOfCodingHours = codingHoursPerSemester/(52*17);

        System.out.println("Percentage of the coding hours in the semester is " + percentageOfCodingHours);



        // An average Green Fox attendee codes 6 hours daily
        // The semester is 17 weeks long
        //
        // Print how many hours is spent with coding in a semester by an attendee,
        // if the attendee only codes on workdays.
        //
        // Print the percentage of the coding hours in the semester if the average
        // work hours weekly is 52



    }
}
