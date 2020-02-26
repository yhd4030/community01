package life.haid.community.community01.mapper;

import life.haid.community.community01.model.Comment;
import life.haid.community.community01.model.CommentExample;
import life.haid.community.community01.model.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {

    int incCommentCount(Comment comment);
}