/**
 * ShowCurrentTime
 */
public class ShowCurrentTime {

    public static void main(String[] args) {
        
        //obtain milliseconds since midnight
        long totalMilliseconds = System.currentTimeMillis();

        //obtain the total seconds since midnight
        long totalSeconds = totalMilliseconds / 1000;
         
        //obtain current seconds since midnight
        long currenSeconds = totalSeconds % 60;

        //obtain the totalMinutes
        long totalMinutes = totalSeconds / 60;

        //obtain current Minute
        long currenMinute = totalMinutes % 60;

        //obtain total Hours
        long totalHours = totalMinutes / 60;

        //obtain current Hour
        long currenHour = totalHours % 24;

        System.out.println("current time is " + currenHour + ":" + currenMinute + ":" + currenSeconds + " GMT");
        


         

    }
}