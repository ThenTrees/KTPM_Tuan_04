package context;

import state.State;

public class OrderContext implements State {
    private State orderState;

    public State getOrderState() {
        return orderState;
    }

    public void setOrderState(State orderState) {
        this.orderState = orderState;
    }

    @Override
    public void doAction() {
        this.orderState.doAction();
    }
}
