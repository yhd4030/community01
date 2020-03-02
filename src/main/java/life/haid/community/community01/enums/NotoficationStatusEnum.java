package life.haid.community.community01.enums;

public enum NotoficationStatusEnum {
    UNREAD(0),READ(1)
    ;
    private int status;

    NotoficationStatusEnum(int status) {
        this.status = status;
    }

    public int getStatus() {
        return status;
    }
}
