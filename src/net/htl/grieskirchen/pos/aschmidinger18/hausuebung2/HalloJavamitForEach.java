/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htl.grieskirchen.pos.aschmidinger18.hausuebung2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author annas
 */
public class HalloJavamitForEach {

    /**
     * @param args the command line arguments
     */
    
    List<String> list = new ArrayList<>();
    
    public static void main(String[] args) {
        HalloJavamitForEach hallo = new HalloJavamitForEach();
        hallo.print();
    }
    
    public void print(){
        for (int i = 0; i < 10; i++) {
            list.add("1." + i);
        }
        
        for (String string : list) {
            System.out.println(list.get(list.indexOf(string)));
        }
        
        System.out.println("");
        list.forEach((String s) -> System.out.println(s));
        
        
    }
    
}
