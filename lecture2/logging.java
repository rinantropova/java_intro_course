import java.util.logging.*;
import java.io.IOException;

public class logging {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(logging.class.getName());
        // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.txt");

        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        // XMLFormatter xml = new XMLFormatter();
        fh.setFormatter(sFormat);
        // fh.setFormatter(xml);

        // logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Test logging 1");
        logger.info("Test logging 2");
    }
}
