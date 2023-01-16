package by.ageenko.task_4.service.sort;

import by.ageenko.task_4.entity.Bouquet;
import by.ageenko.task_4.exception.BouquetException;
import by.ageenko.task_4.exception.FlowerException;

public interface SortByFreshnessService {
    void sortByFreshness(Bouquet bouquet) throws BouquetException, FlowerException;
}
