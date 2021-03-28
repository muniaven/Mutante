
package com.mercadolibre.services;

public class ValidDna {
    
    public static boolean isValidDna(String[] dna) {

        for (int i = 0; i < dna.length; i++) {
            
            if (dna[i].length() < 4 || dna.length < 4 || dna[i].length() != dna.length) {

                return false;

            }
            if (dna[i].matches(".*[^ATCG].*")) {
                return false;
            }

        }

        return true;
    }

}
