package com.itcast.ssm.dao;

import com.itcast.ssm.pojo.Items;

public interface ItemsMapper {
    Items findById(int id);
}
