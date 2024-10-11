package org.example.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.List;


@NoArgsConstructor
public class AdnRequest {
    private String dna;

    public void setDna(List<String> adnList) {
        this.dna = String.join(",", adnList); // Almacenar como String
    }

    public List<String> getDna() {
        return Arrays.asList(this.dna.split(",")); // Convertir a List
    }

    public String getDnaString(){
        return this.dna;
    }

}
