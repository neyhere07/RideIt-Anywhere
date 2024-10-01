package com.example.RideIt.dto.Request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@FieldDefaults(level = AccessLevel.PRIVATE)

public class DriverRequest {

    String name;

    int age;

    String panNumber;

    String mobNo;

    CabRequest cab;
}
