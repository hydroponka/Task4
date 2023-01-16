package by.ageenko.task_4.reader.impl;

import by.ageenko.task_4.entity.AsterFlower;
import by.ageenko.task_4.entity.OrchidFlower;
import by.ageenko.task_4.entity.RoseFlower;
import by.ageenko.task_4.exception.FlowerException;
import by.ageenko.task_4.reader.FlowerReader;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FlowerReaderImpl implements FlowerReader {
    static Logger logger = LogManager.getLogger();
    private static final String DEFAULT_FILENAME = "data//EmptyFile.txt";
    private static final String SPACE_SEPARATOR = "\\s+";
    @Override
    public AsterFlower AsterFlowerReader(String filename) throws FlowerException {
        AsterFlower asterFlower;
        int[] array = {};
        String[] strArray = {};
        Path path = Path.of(filename);
        if (!Files.exists(path)) {
            logger.log(Level.INFO, "file {} not exist", filename);
            filename = DEFAULT_FILENAME;
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String strTemp = reader.readLine();
            if (strTemp != null) {
                String[] strSplit = strTemp.split(SPACE_SEPARATOR);
                array = new int[strSplit.length];
                strArray = new String[strSplit.length];
                for (int i = 0; i < strSplit.length - 3; i++) {
                    try {
                        strArray[i] = strSplit[i];
                    } catch (NullPointerException e) {
                        logger.log(Level.ERROR, "String format is incorrect = {}", strSplit[i]);
                    }
                }
                for (int i = strSplit.length - 3; i < strSplit.length; i++) {
                    try {
                        array[i] = Integer.parseInt(strSplit[i]);
                    } catch (NumberFormatException e) {
                        logger.log(Level.ERROR, "Number format is incorrect = {}", strSplit[i]);
                    }
                }
                asterFlower = new AsterFlower(strArray[0], strArray[1], array[2], array[3], array[4]);
            } else {
                logger.log(Level.WARN, "File is empty = {}", filename);
                asterFlower = null;
            }
        } catch (IOException e) {
            logger.log(Level.ERROR, "File not found");
            throw new FlowerException(e);
        }
        return asterFlower;
    }

    @Override
    public OrchidFlower OrchidFlowerReader(String filename) throws FlowerException {
        OrchidFlower orchidFlower;
        int[] array = {};
        String[] strArray = {};
        Path path = Path.of(filename);
        if (!Files.exists(path)) {
            logger.log(Level.INFO, "file {} not exist", filename);
            filename = DEFAULT_FILENAME;
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String strTemp = reader.readLine();
            if (strTemp != null) {
                String[] strSplit = strTemp.split(SPACE_SEPARATOR);
                array = new int[strSplit.length];
                strArray = new String[strSplit.length];
                for (int i = 0; i < strSplit.length - 3; i++) {
                    try {
                        strArray[i] = strSplit[i];
                    } catch (NullPointerException e) {
                        logger.log(Level.ERROR, "String format is incorrect = {}", strSplit[i]);
                    }
                }
                for (int i = strSplit.length - 3; i < strSplit.length; i++) {
                    try {
                        array[i] = Integer.parseInt(strSplit[i]);
                    } catch (NumberFormatException e) {
                        logger.log(Level.ERROR, "Number format is incorrect = {}", strSplit[i]);
                    }
                }
                orchidFlower = new OrchidFlower(strArray[0], strArray[1], array[2], array[3], array[4]);
            } else {
                logger.log(Level.WARN, "File is empty = {}", filename);
                orchidFlower = null;
            }
        } catch (IOException e) {
            logger.log(Level.ERROR, "File not found");
            throw new FlowerException(e);
        }
        return orchidFlower;
    }

    @Override
    public RoseFlower RoseFlowerReader(String filename) throws FlowerException {
        RoseFlower roseFlower;
        int[] array = {};
        String[] strArray = {};
        Path path = Path.of(filename);
        if (!Files.exists(path)) {
            logger.log(Level.INFO, "file {} not exist", filename);
            filename = DEFAULT_FILENAME;
        }
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String strTemp = reader.readLine();
            if (strTemp != null) {
                String[] strSplit = strTemp.split(SPACE_SEPARATOR);
                array = new int[strSplit.length];
                strArray = new String[strSplit.length];
                for (int i = 0; i < strSplit.length - 3; i++) {
                    try {
                        strArray[i] = strSplit[i];
                    } catch (NullPointerException e) {
                        logger.log(Level.ERROR, "String format is incorrect = {}", strSplit[i]);
                    }
                }
                for (int i = strSplit.length - 3; i < strSplit.length; i++) {
                    try {
                        array[i] = Integer.parseInt(strSplit[i]);
                    } catch (NumberFormatException e) {
                        logger.log(Level.ERROR, "Number format is incorrect = {}", strSplit[i]);
                    }
                }
                roseFlower = new RoseFlower(strArray[0], strArray[1], array[2], array[3], array[4]);
            } else {
                logger.log(Level.WARN, "File is empty = {}", filename);
                roseFlower = null;
            }
        } catch (IOException e) {
            logger.log(Level.ERROR, "File not found");
            throw new FlowerException(e);
        }
        return roseFlower;
    }
}
