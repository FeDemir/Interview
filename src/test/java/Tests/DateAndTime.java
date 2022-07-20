package Tests;

public class DateAndTime {
    public static void main(String[] args) {
        //print today's date
        System.out.println(java.time.LocalDate.now());
        //print today's time
        System.out.println(java.time.LocalTime.now());
        //print today's date and time
        System.out.println(java.time.LocalDateTime.now());

        //print 30 days later's date
        System.out.println(java.time.LocalDate.now().plusDays(30));

        //print today's date in US format
        System.out.println(java.time.LocalDate.now().format(java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy")));
        //print 30 days later's date in US format
        System.out.println(java.time.LocalDate.now().plusDays(30).format(java.time.format.DateTimeFormatter.ofPattern("MM/dd/yyyy")));
                  
    }
}
