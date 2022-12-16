package ru.netology;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Logger {

    protected int num = 1;
    private static Logger logger = null;

    private Date date = new Date();

    private Logger() {
        logger = this;
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg) {
        System.out.println("[" + getDateTime() + num++ + "]" + msg);
    }

    private String getDateTime() {

        GregorianCalendar calendar = new GregorianCalendar();

        StringBuilder s = new StringBuilder()
                .append(calendar.get(Calendar.DAY_OF_MONTH)).append(".")
                .append(calendar.get(Calendar.MONTH)).append(".")
                .append(calendar.get(Calendar.YEAR)).append(" ")
                .append(calendar.get(Calendar.HOUR_OF_DAY)).append(":")
                .append(calendar.get(Calendar.MINUTE)).append(":")
                .append(calendar.get(Calendar.SECOND)).append(" ");
        return s.toString();
    }
}
