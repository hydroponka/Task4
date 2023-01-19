package by.ageenko.task_4.reader;

import by.ageenko.task_4.entity.CutFlower;
import by.ageenko.task_4.entity.Flower;
import by.ageenko.task_4.entity.PottedFlower;
import by.ageenko.task_4.exception.FlowerException;

public interface FlowerReader {
    CutFlower cutFlowerReader(String filename) throws FlowerException;
    PottedFlower pottedFlowerReader(String filename) throws FlowerException;

    //Flower testReader(String filename);
}
