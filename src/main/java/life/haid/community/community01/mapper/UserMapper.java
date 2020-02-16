package life.haid.community.community01.mapper;

import life.haid.community.community01.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

/**
 * Mapper
 * @mapper的作用是可以给mapper接口自动生成一个实现类
 * MyBatis 避免了几乎所有的 JDBC 代码和手动设置参数以及获取结果集
 */

@Mapper
public interface UserMapper {
    @Insert("insert into USER_1 (name,account_id,token,gmt_create,gmt_modified,avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified},#{avatarUrl})")
    void insert(User user);
    @Select("select * from user_1 where token = #{token}")
    User findByToken(@Param("token") String token);
    @Select("select * from user_1 where token = #{id}")
    User findById(@Param("id") Integer id);
}

