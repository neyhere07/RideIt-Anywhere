package com.example.RideIt.Models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String coupenCode;

    int percentageDiscount;
}
