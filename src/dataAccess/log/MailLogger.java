package dataAccess.log;

public class MailLogger implements Logger{
    @Override
    public void log() {
        System.out.println("Logged via Email");
    }
}
