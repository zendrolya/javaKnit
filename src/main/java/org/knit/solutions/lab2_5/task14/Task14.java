package org.knit.solutions.lab2_5.task14;

public class Task14 {
    public static void Run() {
        Element[] elements = {new Files(), new Folders(), new Labels()};
        Visitor virusScaner = new VirusScanner();
        Visitor sizeAnalyzer = new SizeAnalyzer();

        for (Element element : elements) {
            element.accept(virusScaner);
        }

        for (Element element : elements) {
            element.accept(sizeAnalyzer);
        }
    }
}
