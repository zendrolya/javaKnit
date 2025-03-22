package org.knit.solutions.lab2_5.task14;

interface Visitor {
    void visit(Files files);
    void visit(Folders folders);
    void visit(Labels labels);
}