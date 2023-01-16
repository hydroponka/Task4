package by.ageenko.task_4.service.calculation;

import by.ageenko.task_4.entity.Bouquet;
import by.ageenko.task_4.exception.BouquetException;
import by.ageenko.task_4.exception.FlowerException;

import java.util.OptionalInt;

public interface BouquetCalculationService {
    OptionalInt bouquetPrice(Bouquet bouquet) throws BouquetException, FlowerException;
    OptionalInt bouquetLength(Bouquet bouquet) throws BouquetException, FlowerException;
    OptionalInt bouquetWeight(Bouquet bouquet) throws BouquetException, FlowerException;
}
