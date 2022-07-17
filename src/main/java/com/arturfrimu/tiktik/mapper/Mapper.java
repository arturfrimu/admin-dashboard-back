package com.arturfrimu.tiktik.mapper;

import java.util.List;

public interface Mapper<E, D> {
    E toEntity(D d);

    List<E> toEntity(List<D> ds);

    D toDto(E e);

    List<D> toDto(List<E> es);
}
