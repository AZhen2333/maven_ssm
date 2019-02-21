package com.itcast.ssm.service.impl;

import com.itcast.ssm.dao.ItemsMapper;
import com.itcast.ssm.pojo.Items;
import com.itcast.ssm.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsMapper itemsMapper;

    @Override
    public Items findById(int id) {
        return itemsMapper.findById(id);
    }
}
