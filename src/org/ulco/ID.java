package org.ulco;

public class ID {
    private int ID = 0;
    private static ID instance = new ID();

    private ID() {}

    public static ID getInstance() { return instance; }

    public int getNewId() {
        return ID++;
    }
}