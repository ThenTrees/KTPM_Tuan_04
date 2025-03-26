package implement_state;

import state.State;

public class Cancelled implements State {
    @Override
    public void doAction() {
        System.out.println("Order is cancelled and refund money");
    }
}
