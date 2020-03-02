package life.haid.community.community01.exception;

public enum  CustomizeErrorCode implements ICustomizeErrorCode{
    QUESTION_NOT_FOUNT(2001,"你找的问题不在了，要不要换一个试试？"),
    TARGET_PARAM_NOT_FOUNT(2002,"未选择任何问题或评论进行回复"),
    NO_LOGIN(2003,"当前操作需要登录，请登录后重试"),
    SYS_ERROR(2004,"服务器好像不行了，稍后再试试吧！"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006,"回复的评论不存在了，要不要换一个试试？"),
    COMMENT_IS_ENPTY(2007,"输入内容不能为空！"),
    READ_NOTIFICATION_FAIL(2008,"兄弟你这是都别人的信息呢？"),
    NOTIFICATION_NOT_FOUND(2009,"消息莫非是不翼而飞了？"),
    ;

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }


    private Integer code;
    private String message;


    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

}
