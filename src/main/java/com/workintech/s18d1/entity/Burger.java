package com.workintech.s18d1.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Repository;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name="Burger",schema="mOne")
@Repository
public class Burger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name="name")
    private String name;
    @Column(name="price")
    private Double price;
    @Column(name="is_vegan")
    private Boolean isVegan;
    @Enumerated(EnumType.STRING)
    private BreadType breadType;
    @Column(name="contents")
    private String contents;
}
