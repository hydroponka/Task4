package by.ageenko.task_4.service.calculation;

import by.ageenko.task_4.entity.Bouquet;
import by.ageenko.task_4.exception.BouquetException;
import by.ageenko.task_4.exception.FlowerException;

import java.util.OptionalInt;

public interface BouquetCalculationService {
    OptionalInt BouquetPrice(Bouquet bouquet) throws BouquetException, FlowerException;
    OptionalInt BouquetLength(Bouquet bouquet) throws BouquetException, FlowerException;
    OptionalInt BouquetWeight(Bouquet bouquet) throws BouquetException, FlowerException;
}
