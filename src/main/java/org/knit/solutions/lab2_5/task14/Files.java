package org.knit.solutions.lab2_5.task14;

class Files implements Element {
    private int size = 1000;
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    public int getSize() {
        return size;
    }
}
