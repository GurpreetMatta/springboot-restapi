package com.test.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Getter
@Setter
@Table(name = "overviews")
public class OverviewEN {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "id")
  private Long id;

  @Column(name = "name")
  @ToString.Include
  private String name;

  @Column(name = "product_number")
  @ToString.Include
  private String productNumber;

  @Column(name = "brand")
  @ToString.Include
  private String brand;

  @Column(name = "product_category")
  @ToString.Include
  private String productCategory;

  @Column(name = "product_type")
  @ToString.Include
  private String productType;

  @Column(name = "configuration_Type")
  @ToString.Include
  private String configurationType;

  @Column(name = "imgages")
  @ToString.Include
  private String imgages;

  @Column(name = "short_description")
  @ToString.Include
  private String shortDescription;

  @Column(name = "long_description")
  @ToString.Include
  private String longDescription;

  @Column(name = "topic")
  @ToString.Include
  private String topic;
}
