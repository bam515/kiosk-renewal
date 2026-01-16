package com.devbam.kioskrenewal.model;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Menu {
    private String id;
    private String name;
    private int price;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
