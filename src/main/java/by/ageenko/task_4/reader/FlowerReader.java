package by.ageenko.task_4.reader;

import by.ageenko.task_4.entity.AsterFlower;
import by.ageenko.task_4.entity.OrchidFlower;
import by.ageenko.task_4.entity.RoseFlower;
import by.ageenko.task_4.exception.FlowerException;

public interface FlowerReader {
    AsterFlower AsterFlowerReader(String filename) throws FlowerException;
    OrchidFlower OrchidFlowerReader(String filename) throws FlowerException;
    RoseFlower RoseFlowerReader(String filename) throws FlowerException;
}
