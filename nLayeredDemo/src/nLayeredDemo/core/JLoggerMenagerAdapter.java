package nLayeredDemo.core;

import nLayeredDemo.jLoger.JLoggerMenager;

public class JLoggerMenagerAdapter implements LoggerService{
    @Override
    public void logToSystem(String message) {
        JLoggerMenager loggerMenager =new JLoggerMenager();
        loggerMenager.log(message);
    }
}
