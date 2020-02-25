package life.haid.community.community01.dto;

import life.haid.community.community01.model.User;
import lombok.Data;

@Data
public class CommentDTO {
    private Long id;
    private long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private Long likeCount;
    private String content;
    private User user;

}
