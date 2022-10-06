public class Customer {

    private int customerName;

    public void cameIn() {
        System.out.println("Покупатель " + customerName + " зашел в автосалон");
    }

    public void boughtCar() {
        System.out.println("Покупатель " + customerName + " уехал на новеньком авто");
    }

    public int getCustomerName() {
        return customerName;
    }

    public void setCustomerName(int customerName) {
        this.customerName = customerName;
    }

    @Override
    public String toString() {
        return "name = " + customerName;
    }

    public Customer(int name) {
        this.customerName = name;
    }
}
