package com.example.RideIt.Transformer;

import com.example.RideIt.Models.Cab;
import com.example.RideIt.dto.Request.CabRequest;

public class CabTransformer {
    public Cab cabToTransformer(CabRequest cabRequest){
        return Cab.builder()
                .company(cabRequest.getCompany())
                .cabNo(cabRequest.getCabNo())
                .carModel(cabRequest.getCarModel())
                .farePerKm(cabRequest.getFarePerKm())
                .numberOfSeat(cabRequest.getNumberOfSeat())
                .carType(cabRequest.getCarType())
                .build();
    }
}
