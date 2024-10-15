package com.shop.repository;

import com.shop.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {

    // 상품명으로 찾기(0~n개)
    List<Item> findByItemNm(String itemNm);

    //Or 조건
    List<Item> findByItemNmOrItemDetail(String itemNm, String itemDetailNm);
}
