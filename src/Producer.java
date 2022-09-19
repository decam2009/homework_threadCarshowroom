public class Producer {
    public String carName;

    public int carCounter = 0;

    public void producedCar() {
        System.out.printf("Производитель %s выпустил 1 авто \n", carName);
        carCounter++;
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
