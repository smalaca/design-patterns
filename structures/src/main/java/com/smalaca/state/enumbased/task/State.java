package com.smalaca.state.enumbased.task;

public enum State {
    FIRST {
        @Override
        public void doSomething(Task task) {

        }
    },

    SECOND {
        @Override
        public void doSomething(Task task) {

        }
    };

    abstract public void doSomething(Task task);
}
