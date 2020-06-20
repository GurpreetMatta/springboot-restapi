package com.test.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "product")
public class ProductEN {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "product_number")
    @ToString.Include
    private String productNumber;

    @Column(name = "description")
    @ToString.Include
    private String description;

}
