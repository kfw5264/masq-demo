package com.masq.common.results;

import com.masq.common.BaseResult;
import com.masq.common.enums.ApiResult;
import lombok.Getter;

/**
 * @author masq
 * @since 2025-06-26
 */
@Getter
public class ApiResponse<T> {

    /**
     * 响应码
     */
    private final Integer code;

    /**
     * 响应消息
     */
    private final String message;

    /**
     * 响应数据
     */
    private final T data;


    private ApiResponse(Integer code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    private ApiResponse(BaseResult result, T data) {
        this(result.getCode(), result.getMessage(), data);
    }

    /**
     * 创建成功结果
     * @param data  响应数据
     * @return ApiResult
     * @param <T> 响应数据类型
     */
    public static <T> ApiResponse<T> success(T data) {
        return new ApiResponse<>(ApiResult.SUCCESS, data);
    }

    /**
     * 不带响应结果的成功返回
     * @return ApiResult
     * @param <T> 响应数据类型
     */
    public static <T> ApiResponse<T> success() {
        return success(null);
    }

    /**
     * 创建失败结果
     * @param result 失败响应码
     * @param data 失败响应数据
     * @return ApiResult
     * @param <T> 响应数据类型
     */
    public static <T> ApiResponse<T> fail(BaseResult result, T data) {
        return new ApiResponse<>(result, data);
    }

    /**
     * 创建失败结果
     * @param result 响应码
     * @return ApiResult
     * @param <T> 响应数据类型
     */
    public static <T> ApiResponse<T> fail(BaseResult result) {
        return fail(result, null);
    }


    /**
     * 创建失败结果
     * @param code 响应码
     * @param message 响应消息
     * @param data 响应数据
     * @return ApiResult
     * @param <T> 响应数据类型
     */
    public static <T> ApiResponse<T> fail(Integer code, String message, T data) {
        return new ApiResponse<>(code, message, data);
    }

    /**
     * 创建失败结果
     * @param code 响应码
     * @param message 响应消息
     * @return ApiResult
     * @param <T> 响应数据类型
     */
    public static <T> ApiResponse<T> fail(Integer code, String message) {
        return fail(code, message, null);
    }
}
