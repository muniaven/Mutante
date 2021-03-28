package com.mercadolibre.services;

public class NewDna implements IDna{

    @Override
    public String[] IDna() {
        String[] dna = {"TTHCGA", "CAG1GC", "TTAGT", "AGAAGG", "CCTCTA", "TCACTG"};
        return dna;
    }
    
}
