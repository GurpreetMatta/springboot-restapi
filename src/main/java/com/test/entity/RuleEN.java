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
@Table(name = "rule")
public class RuleEN {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "feature")
    @ToString.Include
    private String feature;

    @Column(name = "options")
    @ToString.Include
    private String options;

}
