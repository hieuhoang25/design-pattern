package org.example.structural.adapter;

public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter();
        client.send("Xin chào");
    }
}
