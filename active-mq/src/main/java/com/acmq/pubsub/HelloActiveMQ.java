package com.acmq.pubsub;

public class HelloActiveMQ {
 
    public static void main(String[] args) throws Exception {
        HelloPublisher producer = new HelloPublisher();
        HelloSubscriber1 consumer = new HelloSubscriber1();
        HelloSubscriber1 consumer1 = new HelloSubscriber1();
 
        Thread threadProducer = new Thread(producer);
        threadProducer.start();
 
        Thread threadConsumer = new Thread(consumer);
        threadConsumer.start();
        
        Thread threadConsumer1 = new Thread(consumer1);
        threadConsumer1.start();
 
    }
}