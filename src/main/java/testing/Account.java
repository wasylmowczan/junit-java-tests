package testing;

public class Account {

    private boolean active;
    private Address defaultDeliveryAddress;

    public Account() {
        this.active = false;
    }

    public void activate() {
        this.active= true;
    }

    public boolean isActive() {
        return this.active;
    }

    Address getDefaultDeliveryAddress() {
        return defaultDeliveryAddress;
    }

    void setDefaultDeliveryAddress(Address defaultDeliveryAddress) {
        this.defaultDeliveryAddress = defaultDeliveryAddress;
    }

}
