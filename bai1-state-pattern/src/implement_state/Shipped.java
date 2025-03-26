package implement_state;

import state.State;

public class Shipped implements State {
    @Override
    public void doAction() {
        System.out.println("Update order state to shipped");
    }
}
