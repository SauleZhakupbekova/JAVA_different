package L4_Printf_Thread_Sleep_Print_TwoDimensionalList;

public class Printf_Thread_Sleep {
    public static void main(String[] args) throws InterruptedException {
        for(int day = 0; day < 366; day++){
            for(int hour = 0; hour < 24; hour++){
                for(int min = 0; min < 60; min++){
                    for(int sec = 0; sec < 60; sec++){
                        System.out.printf("From the start: %d days, %d hours, %d min, %d sec \n", day, hour, min, sec); //%d - decimal - add variables in number. %s - add variable in text (String). \n - move to next line
                        Thread.sleep(1000); //flow management. Exceptions notification
                    }
                }
            }
        }
    }
}
