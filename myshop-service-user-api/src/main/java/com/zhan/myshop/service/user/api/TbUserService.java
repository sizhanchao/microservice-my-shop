package com.zhan.myshop.service.user.api;

import com.zhan.myshop.commons.domain.TbUser;

import java.util.List;

/**
 * @author zhan
 * @since 2019-05-09 9:30
 */
public interface TbUserService {
    List<TbUser> selectAll();
}
