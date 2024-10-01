package com.example.RideIt.Models;

import com.example.RideIt.Enum.Gender;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;

    String name;

    int age;

    @Column(unique = true,nullable = false)
    String emailId;

    String address;

    @Enumerated(value = EnumType.STRING)
    Gender gender;

    @OneToMany(mappedBy = "customer",cascade =CascadeType.ALL)
    List<TripBooking> bookingList=new ArrayList<>();
}
