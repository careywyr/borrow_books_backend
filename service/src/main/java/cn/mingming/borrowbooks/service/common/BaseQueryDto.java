package cn.mingming.borrowbooks.service.common;

import lombok.Data;

/**
 * @author CareyWYR
 * @description
 * @date 2018/7/9 15:07
 */
@Data
public class BaseQueryDto {

    private int totalPage;

    private int pageSize;

    private int pageNumber;
}
