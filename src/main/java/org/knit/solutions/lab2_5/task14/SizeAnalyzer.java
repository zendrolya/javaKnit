package org.knit.solutions.lab2_5.task14;

class SizeAnalyzer implements Visitor {
    public void visit(Files files) {
        System.out.println("Размер всех файлов: " + files.getSize() + " МБ");
    }

    public void visit(Folders folders) {
        System.out.println("Размер всех папок: ");
    }

    public void visit(Labels labels) {
        System.out.println("Ссылки не учитываются!");
    }
}
