package com.cydeo.entity;

import com.cydeo.enums.DiscountType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Discount extends BaseEntity{

    private BigDecimal discount;
    private String name;

    @Enumerated(EnumType.STRING)
    private DiscountType discountType;

}
