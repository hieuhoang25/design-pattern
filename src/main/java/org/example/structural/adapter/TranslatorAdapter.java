package org.example.structural.adapter;

public class TranslatorAdapter implements  VietnameseTarget{
    private JapaneseAdaptee adaptee;
    @Override
    public void send(String words) {
        System.out.println("Reading words ...");
        System.out.println(words);
        String vietnameseWords = this.translate(words);
        System.out.println("Sending words ...");
        adaptee.receive(vietnameseWords);
    }
    private String translate(String vietnameseWords) {
        System.out.println("Translated!");
        return "こんにちは";
    }
}
