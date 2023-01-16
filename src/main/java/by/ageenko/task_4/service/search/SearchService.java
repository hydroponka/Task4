package by.ageenko.task_4.service.search;

import by.ageenko.task_4.entity.Bouquet;
import by.ageenko.task_4.entity.Flower;
import by.ageenko.task_4.exception.BouquetException;
import by.ageenko.task_4.exception.FlowerException;

import java.util.List;

public interface SearchService {
    List<Flower> parserByFlowerLength(Bouquet bouquet, int leftEnd, int rightEnd) throws BouquetException, FlowerException;
    List<Flower> parserByFlowerPrice(Bouquet bouquet, int leftEnd, int rightEnd) throws BouquetException, FlowerException;
}
