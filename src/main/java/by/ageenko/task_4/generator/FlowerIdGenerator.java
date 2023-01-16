package by.ageenko.task_4.generator;

public class FlowerIdGenerator {
    private static int idOfFlower;

    private FlowerIdGenerator() {
    }

    public static int generateIdOfArray() {
        idOfFlower++;
        return idOfFlower;
    }
}
