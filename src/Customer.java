public class Customer {

    int name;

    public void cameIn() {
        System.out.println("Покупатель " + name + " зашел в автосалон");
    }

    public void boughtCar() {
        System.out.println("Покупатель " + name + " уехал на новеньком авто");
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "name = " + name;
    }

    public Customer(int name) {
        this.name = name;
    }
}
