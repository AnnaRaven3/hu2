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
    }
}
