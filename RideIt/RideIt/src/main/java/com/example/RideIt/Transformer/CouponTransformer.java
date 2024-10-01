package com.example.RideIt.Transformer;

import com.example.RideIt.Models.Coupon;

public class CouponTransformer {

    public static Coupon couponToTransformer(String coupon, int discount){

        return Coupon.builder()
                .coupenCode(coupon)
                .percentageDiscount(discount)
                .build();
    }
}
