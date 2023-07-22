package neoflex.singleton;

import java.util.Date;
import java.util.stream.Stream;

//без многопоточки
public class MyLogger {

    private static MyLogger myLogger;
    //для многопоточности
    //private static volatile MyLogger myLogger;

    private MyLogger() {}

    public static MyLogger getInstance() {
        // для многопоточности
     /*   if(myLogger == null) {
            synchronized (MyLogger.class) {
                if(myLogger == null) {
                    myLogger = new MyLogger();
                }
            }
        }*/
        if (myLogger == null) {
            myLogger = new MyLogger();
        }
        return myLogger;
    }

    public static void info(Class<?> classInfo, String info) {
        Date currentDate = new Date();
        System.out.println(currentDate+ " - " + classInfo.getSimpleName() + " - " + info);
    }
}
