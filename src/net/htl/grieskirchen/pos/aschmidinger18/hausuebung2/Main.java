/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htl.grieskirchen.pos.aschmidinger18.hausuebung2;

/**
 *
 * @author annas
 */
public class Main {
    
    public static void main(String[] args) {
        NumberTester nt = new NumberTester("datei.txt");

        nt.setOddEvenTester((p) -> p % 2 == 0);
        nt.setPrimeTester((p) -> {
            if (p <= 1) {
                return false;
            }
            if (p == 2) {
                return true;
            }

            for (int i = 2; i < p; i++) {

                if (p % i == 0) {
                    return false;
                }
            }
            return true;
        });
        
        nt.setPalindromeTester((p) -> {
            String text = Integer.toString(p);
            String clean = text.replaceAll("\\s+", "").toLowerCase();
            int length = clean.length();
            int forward = 0;
            int backward = length - 1;
            while (backward > forward) {
                char forwardChar = clean.charAt(forward++);
                char backwardChar = clean.charAt(backward--);
                if (forwardChar != backwardChar) {
                    return false;
                }
            }
            return true;
        });

        nt.testFile();
    }
}
