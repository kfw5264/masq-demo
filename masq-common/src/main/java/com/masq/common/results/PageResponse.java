package com.masq.common.results;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author masq
 * @since 2025-06-26
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PageResponse<T> {

    private Integer page = 1;

    private Integer size = 10;

    private Long total;

    private T data;
}
