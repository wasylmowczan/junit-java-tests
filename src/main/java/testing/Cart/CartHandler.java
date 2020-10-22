package testing.Cart;

public interface CartHandler {

    boolean canHandleCart(Cart cart);
    void sendToPrepare(Cart cart);

}
