package L12_LibMaven_Collections;

//Logging - recording statistics, notes in file, or console etc
// Lag4J - is library
//Appender - place where notification of statistics can send

import org.apache.log4j.Logger;

public class Main_Log4J {
    private static final Logger LOGGER = Logger.getLogger(Main_Log4J.class);

    public static void main(String[] args) {
      LOGGER.error("Text for print");
    }

}
