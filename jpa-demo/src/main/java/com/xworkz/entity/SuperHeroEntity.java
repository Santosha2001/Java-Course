package com.xworkz.entity;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "superhero")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SuperHeroEntity {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "realName")
    private String realName;

    @Column(name = "fictionalName")
    private String fictionalName;

    @Column(name = "country")
    private String country;

    @Column(name = "power")
    private String power;

    @Column(name = "wikeness")
    private String wikeness;

}
