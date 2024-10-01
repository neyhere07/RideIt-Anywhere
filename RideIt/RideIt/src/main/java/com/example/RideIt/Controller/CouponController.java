package com.example.RideIt.Controller;

import com.example.RideIt.Service.CouponService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coupon")
@RequiredArgsConstructor
public class CouponController {
    public final CouponService couponService;

    @PostMapping("/addCoupon")
    public ResponseEntity<String> addCoupon(@RequestParam("Coupon-code")String coupon,
                                            @RequestParam("percentage-discount")Integer discount){
        String response = couponService.addCoupon(coupon, discount);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }
}
