package com.masq.common.enums;

import com.masq.common.BaseResult;

/**
 * 业务响应码枚举
 * @author masq
 * @since 2025-06-26
 */
public enum ApiResult implements BaseResult {

    /* ================通用响应====================== */
    SUCCESS(100000, "成功"),

    FAIL(100001, "失败"),

    ;

    private final Integer code;

    private final String message;

    ApiResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


    @Override
    public Integer getCode() {
        return 0;
    }

    @Override
    public String getMessage() {
        return "";
    }
}
