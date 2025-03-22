package org.knit.solutions.lab2_5.task15;

class Proxy implements Image {
    private RealImage realImage;

    public void request() throws InterruptedException {
        if (realImage == null) {
            realImage = new RealImage();
        }
        System.out.println("Прокси передает запрос...");
        realImage.request();
    }
}