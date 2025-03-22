package org.knit.solutions.lab2_5.task14;

class VirusScanner implements Visitor {
    public void visit(Files files) {
        System.out.println("Антивирус сканирует файлы...");
    }

    public void visit(Folders folders) {
        System.out.println("Антивирус сканирует папки...");
    }

    public void visit(Labels labels) {
        System.out.println("Антивирус сканирует ярлыки...");
    }
}