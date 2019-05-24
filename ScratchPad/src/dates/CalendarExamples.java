package dates;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
import java.util.SimpleTimeZone;

public class CalendarExamples {

    static void simpleCalendar() {
        Calendar calendar = new GregorianCalendar(2017, 0, 25);
        Date date = calendar.getTime();
        System.out.println(date);
    }

    static void simpleCalendar2() {
        GregorianCalendar calendar = new GregorianCalendar(2017, Calendar.JANUARY, 25);
        Date date = calendar.getTime();
        System.out.println(date);
    }

    static  void simpleCalendar3() {
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR, 2107);
        calendar.set(Calendar.MONTH, 0);
        calendar.set(Calendar.DAY_OF_MONTH, 25);
        calendar.set(Calendar.HOUR_OF_DAY, 19);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);

        System.out.println(calendar.getTime());
    }

    static void testAdd() {
        Calendar calendar = new GregorianCalendar(2017, Calendar.JANUARY , 25);
        calendar.set(Calendar.HOUR, 19);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);

        calendar.add(Calendar.MONTH, -2); // To subtract, pass a negative number
        System.out.println(calendar.getTime());
    }

    static void testGet() {
        GregorianCalendar calendar = new GregorianCalendar(2017, Calendar.JANUARY , 25);
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);

        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + calendar.get(Calendar.MONTH));
        System.out.println("Week in the month: " + calendar.get(Calendar.WEEK_OF_MONTH));// Week in this month?

        System.out.println("Day: " + calendar.get(Calendar.DAY_OF_MONTH));

        System.out.println("Hours: " + calendar.get(Calendar.HOUR));
        System.out.println("Minutes: " + calendar.get(Calendar.MINUTE));
        System.out.println("Seconds: " + calendar.get(Calendar.SECOND));
        System.out.println("Milliseconds: " + calendar.get(Calendar.MILLISECOND));
    }

    static void testSimpleFormat() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE, MMMM d, yyyy");
        Calendar calendar = new GregorianCalendar(2107, Calendar.JANUARY, 25);
        calendar.set(Calendar.HOUR, 10);
        calendar.set(Calendar.MINUTE, 42);
        calendar.set(Calendar.SECOND, 12);

        calendar.roll(Calendar.MONTH, -2);
        System.out.println(dateFormat.format(calendar.getTime()));
    }

    public static void main(String[] args) {
        simpleCalendar();
        simpleCalendar2();
        simpleCalendar3();
        testAdd();
        System.out.println();
        testGet();
        System.out.println();
        testSimpleFormat();
    }
}
