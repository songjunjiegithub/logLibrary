package learn.log4j.main;


import learn.log4j.utils.Log4jOutputPath;
import org.apache.log4j.Logger;

/**
 * @author junjie
 * @date 2021年11月14日 10:48
 */
public class Log4jTest {
    static {
        Log4jOutputPath.setPath();
    }
    private final static Logger logger = Logger.getLogger(Log4jTest.class);

    public static void main(String[] args) {
        logger.debug("This is debug message.");
        logger.info("This is debug message.");
        logger.error("This is debug message.");
    }
}
