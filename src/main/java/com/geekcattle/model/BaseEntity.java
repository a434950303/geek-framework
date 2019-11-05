package com.geekcattle.model;

import javax.persistence.*;

/**
 * model基础信息
 * @author geekcattle
 */
public class BaseEntity  {

    private static final long serialVersionUID = 4125096758372084309L;

    @Transient
    private Integer offset = 0;

    @Transient
    private Integer limit = 10;

    public Integer getOffset() {
        return offset;
    }

    public void setOffset(Integer offset) {
        this.offset = offset;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
