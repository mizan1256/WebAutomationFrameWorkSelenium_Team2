package timeUtility;

public class TimeUtil {


    public static void waitFor(int millSec) {
        try {
            Thread.sleep(millSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
