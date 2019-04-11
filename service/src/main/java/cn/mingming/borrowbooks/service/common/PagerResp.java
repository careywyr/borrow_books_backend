package cn.mingming.borrowbooks.service.common;

import lombok.Data;

import java.util.List;

/**
 * @author CareyWYR
 * @description
 * @date 2018/7/9 15:04
 */
@Data
public class PagerResp<T> {

    private int totalPage;

    private int pageNumber;

    private int pageSize;

    private List<T> list;

    public PagerResp(int totalPage, int pageNumber, int pageSize, List<T> list) {
        this.totalPage = totalPage;
        this.pageNumber = pageNumber;
        this.pageSize = pageSize;
        this.list = list;
    }

    public PagerResp() {
    }
}
