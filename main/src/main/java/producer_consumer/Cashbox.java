package producer_consumer;

import java.util.Calendar;
import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by Dmitry Natalenko on 15.10.2015.
 */
public class Cashbox implements Runnable{

    private int number;

    private LinkedBlockingQueue<Customer> queue;

    public Cashbox(LinkedBlockingQueue<Customer> queue) {
        this.queue = queue;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void run() {

        Random randNumber = new Random();
        while (true){
            try {

                Customer customer = queue.take();

                System.out.println("Cashbox " + number + " : " + "Покупатель " + customer.getNumber() +
                        ", " + customer.getOrder() + "     " +
                        "\n" + Calendar.getInstance().getTime() + "\n");

                // period  it's time to prepare food
                int period = randNumber.nextInt(15) + 5;
                TimeUnit.SECONDS.sleep(period);

                System.out.println("Заказ номер " + customer.getNumber() + " выполенен.\n");


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
