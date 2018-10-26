package com.smalaca.state.enumbased;

public enum State {
    FIRST_STATE {
        @Override
        public void doSomething(Context context) {

        }
    },

    SECOND_STATE {
        @Override
        public void doSomething(Context context) {

        }
    };

    abstract public void doSomething(Context context);
}
