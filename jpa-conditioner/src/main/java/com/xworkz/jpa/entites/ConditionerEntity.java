package com.xworkz.jpa.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "conditioner")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "findAllByBrand", query = "SELECT en FROM ConditionerEntity en WHERE en.brand=:brand")
@NamedQuery(name = "findAllByHairType", query = "SELECT en FROM ConditionerEntity en WHERE en.hairType=:hairType")
@NamedQuery(name = "findScentById", query = "SELECT en.scent FROM ConditionerEntity en WHERE en.id=:id")
@NamedQuery(name = "updateNetQuantityByBrand", query = "UPDATE ConditionerEntity en SET en.netQuantity=:netQuantity WHERE en.brand=:brand")
@NamedQuery(name = "updateRecommendedForByBrand", query = "UPDATE ConditionerEntity en SET en.recommendedFor=:recommend WHERE en.brand=:brand")
@NamedQuery(name = "getAllSize", query = "SELECT en.size FROM ConditionerEntity en")
@NamedQuery(name = "getAllBrand", query = "SELECT en.brand FROM ConditionerEntity en")
public class ConditionerEntity {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "size")
    private double size;

    @Column(name = "brand")
    private String brand;

    @Column(name = "itemForm")
    private String itemForm;

    @Column(name = "hairType")
    private String hairType;

    @Column(name = "productBenift")
    private String productBenift;

    @Column(name = "ageRange")
    private String ageRange;

    @Column(name = "recommendedFor")
    private String recommendedFor;

    @Column(name = "netQuantity")
    private double netQuantity;

    @Column(name = "numberOfItems")
    private int numberOfItems;

    @Column(name = "scent")
    private String scent;

    @Column(name = "materialTypeFree")
    private String materialTypeFree;
}
