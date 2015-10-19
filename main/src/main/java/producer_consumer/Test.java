package producer_consumer;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Dmitry Natalenko on 15.10.2015.
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Test test = new Test();
        test.run();
    }

    private void run(){
        LinkedBlockingQueue<Customer> pool = new LinkedBlockingQueue<>();
        Cashbox cashbox1 = new Cashbox(pool);
        cashbox1.setNumber(1);
        Cashbox cashbox2 = new Cashbox(pool);
        cashbox2.setNumber(2);
        Cashbox cashbox3 = new Cashbox(pool);
        cashbox3.setNumber(3);
        Cashbox cashbox4 = new Cashbox(pool);
        cashbox4.setNumber(4);

        Queue queue = new  Queue(pool);

        Thread p = new Thread(queue);
        Thread t1 = new Thread(cashbox1);
        Thread t2 = new Thread(cashbox2);
        Thread t3 = new Thread(cashbox3);
        Thread t4 = new Thread(cashbox4);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        p.start();
    }
}
