package model;

public enum LinkStatus {
    UNDEFINED, ABSENT, PRESENT;

    public boolean isPresent() {
        return this == PRESENT;
    }

}
