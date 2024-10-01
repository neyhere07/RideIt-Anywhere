package com.example.RideIt.Repository;

import com.example.RideIt.Models.Coupon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CouponRepository extends JpaRepository<Coupon, Integer> {
}
