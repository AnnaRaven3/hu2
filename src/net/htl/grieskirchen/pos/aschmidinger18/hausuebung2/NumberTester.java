/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htl.grieskirchen.pos.aschmidinger18.hausuebung2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author annas
 */
public class NumberTester {
    
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palidromeTester;
    private File file;
    private String[] lines;
    
    public static void main(String[] args) {
        NumberTester nt = new NumberTester("datei.txt");
        nt.testFile();
        
        String[] text = nt.lines.clone();
        
        nt.oddTester = (int n) -> {
            return n % 2 == 0;
        };
    }
    
    public NumberTester(String fileName){
        file = new File(fileName);
        
        try {
           BufferedReader br = new BufferedReader(new FileReader(file));
        
        String line = br.readLine();
        lines = new String[Integer.parseInt(line)];
        int i = 0;
        while(i < lines.length){
            lines[i] = line;
            line = br.readLine();
            i++;
            
        }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(NumberTester.class.getName()).log(Level.SEVERE, null, ex);
        }



        
        }
        
    public void setOddEvenTester(NumberTest oddTester){
        this.oddTester = oddTester;
    }
    
    public void setPrimeTester(NumberTest primeTester){
        this.primeTester = primeTester;
    }
    
    public void setPalindromeTester(NumberTest palidromeTester){
        this.palidromeTester = palidromeTester;
    }
    
    public void testFile(){
        
    }
    
    public interface NumberTest{
        boolean testNumber(int number);
    }
}
