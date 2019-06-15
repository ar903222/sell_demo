package com.reyco.enums;

import lombok.Getter;

/**
 * 商品状态
 * @author Reyco
 * @create 2019/6/15-14:51
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架");

    private  Integer code;

    private String  message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
