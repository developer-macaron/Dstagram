package com.macaron.dstagram.common;

public enum Status {
    ACTIVE("ACTIVE"),
    DELETED("DELETED");

    private final String status;

    Status(String _status) {
        this.status = _status;
    }
}
