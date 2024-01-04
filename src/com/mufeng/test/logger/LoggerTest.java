package com.mufeng.test.logger;

import java.io.IOException;
import java.util.logging.*;

public class LoggerTest {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(LoggerTest.class.getName());
        logger.setLevel(Level.ALL);
        logger.setUseParentHandlers(false);
        ConsoleHandler handler = new ConsoleHandler();
        handler.setLevel(Level.ALL);
        logger.addHandler(handler);
        FileHandler fileHandler = new FileHandler("test.log", true );
        logger.addHandler(fileHandler);
        SimpleFormatter formatter = new SimpleFormatter();
        fileHandler.setFormatter(formatter);
        logger.log(Level.SEVERE, "severe");
        logger.log(Level.WARNING, "warning");
        logger.log(Level.INFO, "info");
        logger.log(Level.CONFIG, "config");
    }
}
