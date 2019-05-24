package dates;

import java.util.Date;

/**
 *  Date class examples
 */
public class DateExamples1 {

    static void simpleDate() {
        Date date = new Date();
        System.out.println(date);
    }

    static void createDateFromLong() {
        Date date = new Date(1212121212121L);
        System.out.println(date);
    }

    static void compareDates() {
        Date date1 = new Date();
        Date date2 = new Date();

        long dt1 = date1.getTime();
        long dt2 = date1.getTime();

        System.out.println(dt1 > dt2 ?
                "date1 is later than date2" : "date1 is earlier than date2");
    }

    static void testBeforeAfterEquals() throws InterruptedException {
        Date date1 = new Date();
        Thread.sleep(2000); // 2 seconds
        Date date2 = new Date();

        System.out.println(date1.before(date2));
        System.out.println(date1.after(date2));
        System.out.println(date1.equals(date2));
    }



    public static void main(String[] args) throws InterruptedException {
        simpleDate();
        createDateFromLong();
        compareDates();
        testBeforeAfterEquals();
    }
}
