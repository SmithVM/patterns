package producer_consumer;

import java.util.Random;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Created by Dmitry Natalenko on 15.10.2015.
 */
public class Queue implements Runnable {

    private LinkedBlockingQueue<Customer> queue;

    public Queue(LinkedBlockingQueue<Customer> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        long i =0;
        Random randNumber = new Random();
        while (true) {
            i++;
            int choice = randNumber.nextInt(6) + 1;
            Customer customer = new Customer("\n Заказ: " + MenuUtil.foodMap(choice) + "\n Price: " + MenuUtil.priceMap(choice) );
            customer.setNumber(i);
            try {
                // period it's time to come new customer
                int period = randNumber.nextInt(8) + 2;
                queue.put(customer);
                TimeUnit.SECONDS.sleep(period);

                System.out.println("Всего в очереди: " + queue.size() + "\n");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
