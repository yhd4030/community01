package life.haid.community.community01.mapper;

import life.haid.community.community01.dto.QuestionDTO;
import life.haid.community.community01.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface QuestionMapper {
    @Insert("insert into question_1 (title,description,gmt_create,gmt_modified,creator,tag) values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},#{tag})")
    void create(Question question);

    @Select("select * from question_1 limit #{offset},#{size}")
    List<Question> list(@Param(value = "offset") Integer offset, @Param(value = "size")Integer size);
    @Select("select count(1) from question_1")
    Integer count();
    @Select("select * from question_1 where creator=#{userId} limit #{offset},#{size}")
    List<Question> listByUserId(@Param("userId") Integer userId, @Param(value = "offset") Integer offset, @Param(value = "size")Integer size);

    @Select("select count(1) from question_1 where creator=#{userId}")
    Integer countByUserId(@Param("userId") Integer userId);

    @Select("select * from question_1 where ID=#{id}")
    Question getById(@Param("id") Integer id);
}
