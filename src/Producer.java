public class Producer {
    private String carName;
    private int carCount = 0;

    public int producedCar() {
        System.out.printf("Производитель %s выпустил 1 авто \n", carName);
        return carCount++;
    }

    public Producer(String carName) {
        this.carName = carName;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

}
