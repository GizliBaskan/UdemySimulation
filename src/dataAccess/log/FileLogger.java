package dataAccess.log;

public class FileLogger implements Logger
{
    @Override
    public void log() {
        System.out.println("Logged via File");
    }
}
