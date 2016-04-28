package com.mx.stickylistview.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by boobooL on 2016/4/28 0028
 * Created 邮箱 ：boobooMX@163.com
 */
public class FilterTwoEntity implements Serializable {
    private String type;
    private List<FilterEntity>list;
    private boolean isSelected;
    private FilterEntity selectedFilterEntity;

    public FilterTwoEntity() {
    }

    public FilterTwoEntity(String type, List<FilterEntity> list) {
        this.type = type;
        this.list = list;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<FilterEntity> getList() {
        return list;
    }

    public void setList(List<FilterEntity> list) {
        this.list = list;
    }

    public boolean isSelected() {
        return isSelected;
    }

    public void setSelected(boolean selected) {
        isSelected = selected;
    }

    public FilterEntity getSelectedFilterEntity() {
        return selectedFilterEntity;
    }

    public void setSelectedFilterEntity(FilterEntity selectedFilterEntity) {
        this.selectedFilterEntity = selectedFilterEntity;
    }
}
