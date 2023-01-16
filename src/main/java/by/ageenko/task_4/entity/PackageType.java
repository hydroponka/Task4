package by.ageenko.task_4.entity;

public enum PackageType {
    REGULAR(2),
    BASKET(7);

    private double priceOfPackage;

    PackageType(double priceOfPackage){
        this.priceOfPackage = priceOfPackage;
    }

    public double getPriceOfPackage() {
        return priceOfPackage;
    }
}
