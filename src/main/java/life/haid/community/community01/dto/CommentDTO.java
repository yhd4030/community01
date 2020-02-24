package life.haid.community.community01.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class CommentDTO {
    private Long parentId;
    private String content;
    private Integer type;

    @JsonProperty(value = "parentId")
    public Long getParentId() {
        return parentId;
    }
    @JsonProperty(value = "parentId")
    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }
    @JsonProperty(value = "content")
    public String getContent() {
        return content;
    }
    @JsonProperty(value = "content")
    public void setContent(String content) {
        this.content = content;
    }
    @JsonProperty(value = "type")
    public Integer getType() {
        return type;
    }
    @JsonProperty(value = "type")
    public void setType(Integer type) {
        this.type = type;
    }
}
