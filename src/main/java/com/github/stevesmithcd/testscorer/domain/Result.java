package com.github.stevesmithcd.testscorer.domain;

@SuppressWarnings("unused")
public enum Result {
    SUCCESS,
    FAILED,
    IGNORED;

    boolean failed() {
        return this == FAILED;
    }
}
