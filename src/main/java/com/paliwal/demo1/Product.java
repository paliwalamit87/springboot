package com.paliwal.demo1;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity
public class Product {
   @Id
    private int prodId;
    private String prodName;
    private int price;
}
