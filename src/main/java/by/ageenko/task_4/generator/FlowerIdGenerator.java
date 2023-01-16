package by.ageenko.task_4.generator;

public class FlowerIdGenerator {
    private static int idOfFlower;

    private FlowerIdGenerator() {
    }

    public static int generateIdOfFlower() {
        idOfFlower++;
        return idOfFlower;
    }
}
