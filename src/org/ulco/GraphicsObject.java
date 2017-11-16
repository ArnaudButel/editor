package org.ulco;

abstract public class GraphicsObject {
    public GraphicsObject() {
        m_ID = ID.getInstance().getNewId();
    }

    abstract public GraphicsObject copy();

    public int getID() {
        return m_ID;
    }

    protected boolean isGroup() { return false; }

    abstract boolean isClosed(Point pt, double distance);

    abstract void move(Point delta);

    public int size() { return 1; }

    abstract public String toJson();

    abstract public String toString();

    private int m_ID;
}
