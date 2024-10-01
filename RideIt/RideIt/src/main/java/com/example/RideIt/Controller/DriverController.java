package com.example.RideIt.Controller;

import com.example.RideIt.Service.DriverService;
import com.example.RideIt.dto.Request.DriverRequest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/driver")
public class DriverController {
    public final DriverService driverService;

    DriverController(DriverService driverService){this.driverService=driverService;
    }

    @PostMapping("api/addDriver")
    public ResponseEntity<String> addDriver(@RequestBody DriverRequest driverRequest) {

        String response = driverService.addDriver(driverRequest);

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
