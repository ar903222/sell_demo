package com.reyco.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author Reyco
 * @create 2019/6/15-15:48
 */
@Data
public class ResultVO<T> {

    /*错误码*/
    private Integer code;

    /*提示内容*/
    private String msg;

    /*具体内容*/
    private T data;
}
