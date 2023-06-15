package org.example;

public class Main {
    public static void main(String[] args) {

        String wordToEncrypt="hello world";
        String key= "dice";

        VigenereCipher vigenereCipher= new VigenereCipher();
        String encrypted= vigenereCipher.encrypt(wordToEncrypt,key);
        System.out.println(encrypted);

        String decrypted= vigenereCipher.decrypt(encrypted,key);
        System.out.println(decrypted);




    }
}