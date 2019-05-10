package com.zhan.myshop.service.user.provider.api.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zhan.myshop.commons.domain.TbUser;
import com.zhan.myshop.commons.mapper.TbUserMapper;
import com.zhan.myshop.service.user.api.TbUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author zhan
 * @since 2019-05-09 9:58
 */
@Transactional(readOnly = true)
@Service(version = "${services.versions.user.v1}")
public class TbUserServiceImpl implements TbUserService {
    @Autowired
    TbUserMapper tbUserMapper;

    @Override
    public List<TbUser> selectAll() {
        return tbUserMapper.selectAll();
    }
}
