package by.ageenko.task_4.service.calculation.impl;

import by.ageenko.task_4.entity.Bouquet;
import by.ageenko.task_4.exception.BouquetException;
import by.ageenko.task_4.exception.FlowerException;
import by.ageenko.task_4.service.calculation.BouquetCalculationService;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.OptionalInt;

public class BouquetCalculationServiceImpl implements BouquetCalculationService {
    static Logger logger = LogManager.getLogger();

    @Override
    public OptionalInt bouquetPrice(Bouquet bouquet) throws BouquetException, FlowerException {
        int bouquetPrice = 0;
        if (bouquet == null) {
            throw new BouquetException("Bouquet is empty");
        } else if (bouquet.getFlowers() == null) {
            throw new FlowerException("Flower list is empty");
        } else if (bouquet.getFlowers().size() != 0) {
            for (int i = 0; i < bouquet.getFlowers().size(); i++) {
                bouquetPrice += bouquet.getFlowers().get(i).getFlowerPrice();
            }
            bouquetPrice += bouquet.getPackageType().getPriceOfPackage();
        } else {
            logger.log(Level.INFO, "Flower list length = 0", bouquet.getFlowers());
            return OptionalInt.empty();
        }
        return OptionalInt.of(bouquetPrice);
    }

    @Override
    public OptionalInt bouquetLength(Bouquet bouquet) throws BouquetException, FlowerException {
        int maxLength = 0;
        if (bouquet == null) {
            throw new BouquetException("Bouquet is empty");
        } else if (bouquet.getFlowers() == null) {
            throw new FlowerException("Flower list is empty");
        } else if (bouquet.getFlowers().size() != 0) {
            for (int i = 0; i < bouquet.getFlowers().size(); i++) {
                if (bouquet.getFlowers().get(i).getFlowerLength()>maxLength){
                    maxLength = (int) bouquet.getFlowers().get(i).getFlowerLength();
                }
            }
        } else {
            logger.log(Level.INFO, "Flower list length = 0", bouquet.getFlowers());
            return OptionalInt.empty();
        }
        return OptionalInt.of(maxLength);
    }

    @Override
    public OptionalInt bouquetWeight(Bouquet bouquet) throws BouquetException, FlowerException {
        int bouquetWeight = 0;
        if (bouquet == null) {
            throw new BouquetException("Bouquet is empty");
        } else if (bouquet.getFlowers() == null) {
            throw new FlowerException("Flower list is empty");
        } else if (bouquet.getFlowers().size() != 0) {
            for (int i = 0; i < bouquet.getFlowers().size(); i++) {
                bouquetWeight += bouquet.getFlowers().get(i).getFlowerWeight();
            }
        } else {
            logger.log(Level.INFO, "Flower list length = 0", bouquet.getFlowers());
            return OptionalInt.empty();
        }
        return OptionalInt.of(bouquetWeight);
    }
}
