package L17_CopyOfFiles;

public class Main_Compare_Speed {
    public static void main(String[] args) {
        CopyIO copyIO = new CopyIO();
        CopyNIO copyNIO = new CopyNIO();
        CopyGuava copyGuava = new CopyGuava();
        CopyApache copyApache = new CopyApache();



        //option 1 "Copy with one byte (Oracle)"

        long start1 = System.currentTimeMillis();
        copyIO.copy("C:\\Users\\zhaku\\OneDrive\\Рабочий стол\\Primavera\\Chart_Primavera.xlsx", "IO.xlsx");
        long end1 = System.currentTimeMillis();
        System.out.println("Copy with IO: " + (end1 - start1));

        //option 2 "Copy with NIO (Oracle)" library path - https://www.baeldung.com/java-copy-file

        long start2 = System.currentTimeMillis();
        copyNIO.copy("C:\\Users\\zhaku\\OneDrive\\Рабочий стол\\Primavera\\Chart_Primavera.xlsx", "NIO.xlsx");
        long end2 = System.currentTimeMillis();
        System.out.println("Copy with NIO: " + (end2 - start2));

        //option 3 "Copy with NIO (Oracle)" library path - https://repo1.maven.org/maven2/com/google/guava/guava/31.1-jre/

        long start3 = System.currentTimeMillis();
        copyGuava.copy("C:\\Users\\zhaku\\OneDrive\\Рабочий стол\\Primavera\\Chart_Primavera.xlsx", "Guava.xlsx");
        long end3 = System.currentTimeMillis();
        System.out.println("Copy with Guava: " + (end3 - start3));

        // option4 "Apache" library path - https://mvnrepository.com/artifact/commons-io/commons-io/2.11.0

        long start4 = System.currentTimeMillis();
        copyApache.copy("C:\\Users\\zhaku\\OneDrive\\Рабочий стол\\Primavera\\Chart_Primavera.xlsx", "Apache.xlsx");
        long end4 = System.currentTimeMillis();
        System.out.println("Copy with Apache: " + (end4 - start4));



    }

}
