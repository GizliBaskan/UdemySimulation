package dataAccess.log;

public class BaseLogger{
    private Logger logger;
    public BaseLogger(Logger logger){
        this.logger = logger;
        logger.log();
    }
}
