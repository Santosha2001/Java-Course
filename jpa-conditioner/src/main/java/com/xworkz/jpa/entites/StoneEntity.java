package com.xworkz.jpa.entites;

import com.sun.istack.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "stone")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "updateStoneSizeByName", query = "UPDATE StoneEntity en SET en.stoneSize=:size WHERE en.stoneName=:name")
@NamedQuery(name = "deleteById", query = "DELETE FROM StoneEntity en WHERE en.id=:id")
@NamedQuery(name = "findAllByColor", query = "SELECT en FROM StoneEntity en WHERE en.stoneColor=:color")
@NamedQuery(name = "findIdByName", query = "SELECT en.id FROM StoneEntity en WHERE en.stoneName=:name")
@NamedQuery(name = "findAllByColorSize", query = "SELECT en FROM StoneEntity en WHERE en.stoneColor=:color AND en.stoneSize=:size")
@NamedQuery(name = "findAll",query = "SELECT en FROM StoneEntity en")
public class StoneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "stoneName")
    @NotNull
    private String stoneName;

    @Column(name = "stoneSize")
    @NotNull
    private String stoneSize;

    @Column(name = "stoneColor")
    @NotNull
    private String stoneColor;

    @Column(name = "stoneWeight")
    @NotNull
    private double stoneWeight;
}
