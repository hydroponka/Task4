package by.ageenko.task_4.service.sort;

import by.ageenko.task_4.entity.Bouquet;
import by.ageenko.task_4.entity.Freshness;
import by.ageenko.task_4.exception.BouquetException;
import by.ageenko.task_4.exception.FlowerException;

public interface SortByFreshnessService {
    void SortByFreshness(Bouquet bouquet) throws BouquetException, FlowerException;
}
