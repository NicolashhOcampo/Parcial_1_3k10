package org.example.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.envers.Audited;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Audited
@Table(name= "Adn")
public class Adn extends Base {


    @Column(name = "adn_values")
    private String adnList;


    @Setter
    private boolean isMutant;

    public void setAdnList(List<String> adnList) {
        this.adnList = String.join(",", adnList); // Almacenar como String
    }

    public List<String> getAdnList() {
        return Arrays.asList(this.adnList.split(",")); // Convertir a List
    }



}
