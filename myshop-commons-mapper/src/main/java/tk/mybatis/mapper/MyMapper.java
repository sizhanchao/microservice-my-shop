package tk.mybatis.mapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author zhan
 * @since 2019-05-10 9:04
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
