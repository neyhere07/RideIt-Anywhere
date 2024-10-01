package com.example.RideIt.Transformer;

import com.example.RideIt.Models.Cab;
import com.example.RideIt.Models.Driver;
import com.example.RideIt.dto.Request.DriverRequest;

public class DriverTransformer {

    private CabTransformer cabTransformer=new CabTransformer();
    public Driver driverToTransformer(DriverRequest driverRequest){

        Cab cab=cabTransformer.cabToTransformer(driverRequest.getCab());


        Driver driver= Driver.builder()
                .name(driverRequest.getName())
                .age(driverRequest.getAge())
                .panNumber(driverRequest.getPanNumber())
                .mobNo(driverRequest.getMobNo())
                .rating(0)
                .cab(cab)
                .build();

        cab.setDriver(driver);
        return driver;
    }
}
