package com.example.RideIt.Service;

import com.example.RideIt.Models.Driver;
import com.example.RideIt.Repository.DriverRepository;
import com.example.RideIt.Transformer.DriverTransformer;
import com.example.RideIt.dto.Request.DriverRequest;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    public final DriverRepository driverRepository;

    DriverService(DriverRepository driverRepository){this.driverRepository=driverRepository;
    }


    private DriverTransformer driverTransformer=new DriverTransformer();
    public String addDriver(DriverRequest driverRequest){

        Driver driver=driverTransformer.driverToTransformer(driverRequest);

        driverRepository.save(driver);

        return "Driver and Cab saved successfully";
    }
}
