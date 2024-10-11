package org.example;

import org.example.entities.Analizador;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Analizador analizador= new Analizador();
        String[] listaADN = {
                "ATGCGA",
                "AAGTGC",
                "ATATGT",
                "AAAAAG",
                "CCCCTA",
                "TCACTG"
        };

        List<String> dna = Arrays.asList(
                "ATGCGA",
                "CAGTAC",
                "TTATGT",
                "AGTAGG",
                "CTCCTA",
                "TCACTG"
        );
        List<String> dna1 = Arrays.asList(
                "AAAA",
                "CCCC",
                "TCAG",
                "GGTC"
        );
        List<String> dna2 = Arrays.asList(
                "TGAC",
                "AGCC",
                "TGAC",
                "GGTC"
        );
        List<String> dna3 = Arrays.asList(
                "TCGGGTGAT",
                "TGATCCTTT",
                "TCCGAGTGA",
                "AAATGTACG",
                "ACGAGTGCT",
                "AGACACATG",
                "GAATTCCAA",
                "CCTACGACC",
                "TGAGTATCC"
        );
        List<String> dna4 = Arrays.asList(
                "TTTTTTTTT",
                "TTTTTTTTT",
                "TTTTTTTTT",
                "TTTTTTTTT",
                "CCGACCGAT",
                "GGCACTCCA",
                "AGGACACTA",
                "CAAGGCACT",
                "GCAGTCCCC"
        );



        if(analizador.isMutant(dna4)){
            System.out.println("Es mutante");
        }else{
            System.out.println("No es mutante");
        }

    }
}