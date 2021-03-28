package com.mercadolibre.services;

import java.util.Arrays;

public class Mutant extends Thread{
    
    String[] dna = {};

    Mutant(String[] dna) {
        this.dna = dna;
    }
    
    
    @Override
    public void run(){
        
        System.out.println(Arrays.toString(dna));
        System.out.println(isMutant(dna));
        
        
    }
    
    
    
    static public boolean isMutant(String[] dna) {
        int totalDna = 0;
        for (int i = 0; i < dna.length; i++) {
            for (int j = 0; j < dna[i].length(); j++) {
                
                if (j < dna[i].length() - 3) {
                    if (isEqual(dna[i].charAt(j), dna[i].charAt(j + 1), dna[i].charAt(j + 2), dna[i].charAt(j + 3))) {
                        totalDna++;
                    }
                }
                if (i < dna.length - 3) {
                    if (isEqual(dna[i].charAt(j), dna[i + 1].charAt(j), dna[i + 2].charAt(j), dna[i + 3].charAt(j))) {
                        totalDna++;
                    }
                }

                if (i < dna.length - 3 && j < dna[i].length() - 3) {
                    if (isEqual(dna[i].charAt(j), dna[i + 1].charAt(j + 1), dna[i + 2].charAt(j + 2), dna[i + 3].charAt(j + 3))) {
                        totalDna++;
                    }
                }

                if (i >= 3 && j < dna[i].length() - 3) {
                    if (isEqual(dna[i].charAt(j), dna[i - 1].charAt(j + 1), dna[i - 2].charAt(j + 2), dna[i - 3].charAt(j + 3))) {
                        totalDna++;
                    }
                }

                if (totalDna > 1) {
                    return true;
                }

            }

        }

        return false;
    }
    
    
    public static boolean isEqual(char a, char b, char c, char d) {
        return a == b && b == c && c == d;
    }

}
