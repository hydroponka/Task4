package by.ageenko.task_4.reader.impl;

import by.ageenko.task_4.entity.CutFlower;
import by.ageenko.task_4.entity.Flower;
import by.ageenko.task_4.entity.PotSize;
import by.ageenko.task_4.entity.PottedFlower;
import by.ageenko.task_4.exception.FlowerException;
import by.ageenko.task_4.reader.FlowerReader;
import by.ageenko.task_4.validator.impl.StringValidatorImpl;
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
    public CutFlower cutFlowerReader(String filename) throws FlowerException {
        CutFlower cutFlower;
        StringValidatorImpl stringValidator = new StringValidatorImpl();
        int[] array;
        String[] strArray;
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
                for (int i = 0; i < strSplit.length; i++) {
                    if (stringValidator.stringNumberValidate(strSplit[i])) {
                        array[i] = Integer.parseInt(strSplit[i]);
                    }
                }
                for (int i = 0; i < strSplit.length; i++) {
                    if (stringValidator.stringTextValidate(strSplit[i])) {
                        strArray[i] = strSplit[i];
                    }
                }
                cutFlower = new CutFlower(strArray[0], Boolean.parseBoolean(strArray[1]), array[2], array[3], array[4]);
            } else {
                logger.log(Level.WARN, "File is empty = {}", filename);
                cutFlower = null;
            }
        } catch (IOException e) {
            logger.log(Level.ERROR, "File not found");
            throw new FlowerException(e);
        }
        return cutFlower;
    }

    @Override
    public PottedFlower pottedFlowerReader(String filename) throws FlowerException {
        StringValidatorImpl stringValidator = new StringValidatorImpl();
        PottedFlower pottedFlower;
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
                for (int i = 0; i < strSplit.length; i++) {
                    if (stringValidator.stringNumberValidate(strSplit[i])) {
                        array[i] = Integer.parseInt(strSplit[i]);
                    }
                }
                for (int i = 0; i < strSplit.length; i++) {
                    if (stringValidator.stringTextValidate(strSplit[i])) {
                        strArray[i] = strSplit[i];
                    }
                }
                pottedFlower = new PottedFlower(strArray[0], array[1], array[2], array[3], PotSize.valueOf(strArray[4].toUpperCase()));
            } else {
                logger.log(Level.WARN, "File is empty = {}", filename);
                pottedFlower = null;
            }
        } catch (IOException e) {
            logger.log(Level.ERROR, "File not found");
            throw new FlowerException(e);
        }
        return pottedFlower;
    }
}