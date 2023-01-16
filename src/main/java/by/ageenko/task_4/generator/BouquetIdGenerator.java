package by.ageenko.task_4.generator;

public class BouquetIdGenerator {
    private static int idOfBouquet;

    private BouquetIdGenerator() {
    }

    public static int generateIdOfBouquet() {
        idOfBouquet++;
        return idOfBouquet;
    }
}
