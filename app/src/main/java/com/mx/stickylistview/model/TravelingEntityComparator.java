package com.mx.stickylistview.model;

import java.util.Comparator;

/**
 * Created by boobooL on 2016/4/28 0028
 * Created 邮箱 ：boobooMX@163.com
 */
public class TravelingEntityComparator implements Comparator<TravelingEntity> {
    @Override
    public int compare(TravelingEntity lhs, TravelingEntity rhs) {
        return lhs.getRank()-lhs.getRank();
    }
}
