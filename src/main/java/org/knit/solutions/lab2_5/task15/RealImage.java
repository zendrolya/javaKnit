package org.knit.solutions.lab2_5.task15;

import java.util.concurrent.ThreadLocalRandom;

class RealImage implements Image {
    public void request() throws InterruptedException {
        System.out.println("Изображение загружается...");
        Thread.sleep(3000);
        System.out.println("Изображение загружено");
    }
}
