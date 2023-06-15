package org.example;

public class VigenereCipher {

    private String alphabets;
    public VigenereCipher() {
        alphabets="abcdefghijklmnopqrstuvwxyz";
    }
    public String encrypt(String word, String key) {
        StringBuilder encrypted= new StringBuilder();
        for(int i=0 ; i<word.length();i++) {
            int index= alphabets.indexOf(word.charAt(i));
            if(index == -1) {
                encrypted.append(" ");
                continue;
            }
            else {
                int move=alphabets.indexOf(key.charAt(i%key.length()));
                char c = alphabets.charAt(move+alphabets.indexOf(word.charAt(i)));
                encrypted.append(c);
            }

            System.out.println(encrypted);
        }
        return encrypted.toString();
    }
    public String decrypt(String word, String key) {
        StringBuilder decrypted= new StringBuilder();
        for(int i=0 ; i<word.length();i++) {
            int index= alphabets.indexOf(word.charAt(i));
            if(index == -1) {
                decrypted.append(" ");
                continue;
            }
            else {
                int move=alphabets.indexOf(key.charAt(i%key.length()));
                char c = alphabets.charAt(alphabets.indexOf(word.charAt(i))-move);
                decrypted.append(c);
            }


        }
        return decrypted.toString();
    }


}
