package com.example.RideIt.Service;

import com.example.RideIt.Models.Coupon;
import com.example.RideIt.Repository.CouponRepository;
import com.example.RideIt.Transformer.CouponTransformer;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CouponService {

    public final CouponRepository couponRepository;

    public String addCoupon(String coupon,int discount){

        Coupon coupons= CouponTransformer.couponToTransformer(coupon, discount);

        couponRepository.save(coupons);

        return "coupon added successfully";
    }
}
