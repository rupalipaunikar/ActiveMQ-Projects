package com.acmq.ptp;

public class HelloActiveMQ {
 
    public static void main(String[] args) throws Exception {
        HelloProducer producer = new HelloProducer();
        HelloConsumer consumer = new HelloConsumer();
        HelloConsumer consumer1 = new HelloConsumer();
 
        Thread threadProducer = new Thread(producer);
        threadProducer.start();
 
        Thread threadConsumer = new Thread(consumer);
        threadConsumer.start();
        
        Thread threadConsumer1 = new Thread(consumer1);
        threadConsumer1.start();
 
    }
}