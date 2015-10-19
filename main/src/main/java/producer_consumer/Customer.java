package producer_consumer;

/**
 * Created by Dmitry Natalenko on 15.10.2015.
 */
public class Customer {

    private String order;
    private Double balance;
    private Long number;

    public Customer() {
    }

    public Customer(String order) {
        this.order = order;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }
}
