package life.haid.community.community01.dto;

import life.haid.community.community01.model.User;
import lombok.Data;

@Data
public class NotificationDTO {
    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private String typeName;
    private Long outerid;
    private Integer type;
}
