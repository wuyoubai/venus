package com.example.demo.bean.vo;

import com.github.pagehelper.Page;

import java.util.List;

public class PageVO<T> {
    /**
     * 当前页
     */
    private int pageNum;
    /**
     * 每页条数
     */
    private int pageSize;
    /**
     * 总记录条数
     */
    private long total;
    /**
     * 总页数
     */
    private long pages;
    /**
     * 是否还有下一页
     */
    private Integer isMore;
    /**
     * 当前页记录列表
     */
    private List<T> list;

    /**
     * 构造返分页回数据结构
     * @param page 分页基础数据
     * @param list 当前页结果集
     * @param <T> 分页bean
     * @return
     */
    public static <T> PageVO<T> build(Page page, List<T> list){
        PageVO<T> pageVO = new PageVO<>();
        pageVO.setList(list);
        pageVO.setTotal(page.getTotal());
        pageVO.setPages(page.getPages());
        pageVO.setPageNum(page.getPageNum());
        pageVO.setPageSize(page.getPageSize());
        pageVO.setIsMore(page.getPageNum() >= page.getPages() ? 0 : 1);
        return pageVO;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }

    public Integer getIsMore() {
        return isMore;
    }

    public void setIsMore(Integer isMore) {
        this.isMore = isMore;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
