import java.util.ArrayList;
import java.util.List;

public class Main {

    private static final int MAXCARS = 5;
    private static final int SLEEPTIME = 2000;
    private static final List<Integer> showRoom = new ArrayList<>();

    public static void main(String[] args) {


        new Thread(() -> {
            for (int i = 0; i <= MAXCARS; i++) {
                Customer customer = new Customer(i);
                synchronized (showRoom) {
                    customer.cameIn();
                    if (showRoom.isEmpty()) {
                        System.out.println("Машин нет");
                        try {
                            showRoom.wait();
                        } catch (InterruptedException e) {
                            return;
                        }
                    }
                    customer.boughtCar();
                    showRoom.remove(0);
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i <= MAXCARS; i++) {
                Producer producer = new Producer("Toyota");
                synchronized (showRoom) {
                    showRoom.add(producer.producedCar());
                    showRoom.notify();
                }
                try {
                    Thread.sleep(SLEEPTIME);
                } catch (InterruptedException e) {
                    return;
                }
            }
        }).start();
    }
}
