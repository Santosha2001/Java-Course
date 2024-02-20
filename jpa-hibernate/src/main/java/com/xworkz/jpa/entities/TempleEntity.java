package com.xworkz.jpa.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "temple")
@Data
@AllArgsConstructor
@NoArgsConstructor
@NamedQuery(name = "findAllByLocation",query = "SELECT en FROM TempleEntity en WHERE en.templeLocation=:location")
@NamedQuery(name = "findAllByEntryFeeGreaterThan", query = "select te from TempleEntity te where te.entryFee>: entryFee ")
@NamedQuery(name = "findAllByEntryFeeBetween", query = "select te from TempleEntity te where te.entryFee >: startFee and te.entryFee <: endFee")
@NamedQuery(name = "findAllByInaguratedDateGreaterThan",query = "select te from TempleEntity te where te.inaguratedDate >: inaguratedDate ")
@NamedQuery(name = "findAllByMainGodAndLocation",query = "select te from TempleEntity te where te.mainGod=: MainGod and te.templeLocation=: Location")
@NamedQuery(name = "findById",query = "select te from TempleEntity te where te.id=: templeId ")
@NamedQuery(name = "findByIdAndMainGod",query = "select te from TempleEntity te where te.id=: TempleId and te.mainGod=: MainGod")
@NamedQuery(name = "findTotal",query = "select count(te) from TempleEntity te")
@NamedQuery(name = "findTempleByMexEntryFee",query = "select max(te.entryFee) from TempleEntity te")
public class TempleEntity {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "templeName")
    private String templeName;

    @Column(name = "templeLocation")
    private String templeLocation;

    @Column(name = "entryFee")
    private double entryFee;

    @Column(name = "vipEntryFee")
    private double vipEntryFee;

    @Column(name = "inaguratedDate")
    private LocalDate inaguratedDate;

    @Column(name = "mainGod")
    private String mainGod;

    @Column(name = "dimension")
    private double dimension;
}
