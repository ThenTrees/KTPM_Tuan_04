package implement_state;

import state.State;

public class InitOrder implements State {
    @Override
    public void doAction() {
        System.out.println("Order is in initial state");
    }
}
