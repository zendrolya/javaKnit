package org.knit.solutions.lab2_5.task14;

class Folders implements Element {
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}