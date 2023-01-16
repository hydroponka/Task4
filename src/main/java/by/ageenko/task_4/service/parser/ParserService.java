package by.ageenko.task_4.service.parser;

import by.ageenko.task_4.entity.Bouquet;
import by.ageenko.task_4.entity.Flower;
import by.ageenko.task_4.exception.BouquetException;
import by.ageenko.task_4.exception.FlowerException;

import java.util.List;

public interface ParserService {
    List<Flower> ParserByFlowerLength(Bouquet bouquet, int leftEnd, int rightEnd) throws BouquetException, FlowerException;
    List<Flower> ParserByFlowerPrice(Bouquet bouquet, int leftEnd, int rightEnd) throws BouquetException, FlowerException;
}
