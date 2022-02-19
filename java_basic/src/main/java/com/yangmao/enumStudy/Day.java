package com.yangmao.enumStudy;

public enum Day {
    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private Integer type;

    Day(Integer type) {
        this.type = type;
    }

    public Integer getType() {
        return type;
    }
}
