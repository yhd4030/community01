package life.haid.community.community01.model;

public class User {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_1.ID
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_1.ACCOUNT_ID
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    private String accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_1.NAME
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_1.TOKEN
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    private String token;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_1.GMT_CREATE
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_1.GMT_MODIFIED
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column user_1.avatar_url
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    private String avatarUrl;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_1.ID
     *
     * @return the value of user_1.ID
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_1.ID
     *
     * @param id the value for user_1.ID
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_1.ACCOUNT_ID
     *
     * @return the value of user_1.ACCOUNT_ID
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    public String getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_1.ACCOUNT_ID
     *
     * @param accountId the value for user_1.ACCOUNT_ID
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    public void setAccountId(String accountId) {
        this.accountId = accountId == null ? null : accountId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_1.NAME
     *
     * @return the value of user_1.NAME
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_1.NAME
     *
     * @param name the value for user_1.NAME
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_1.TOKEN
     *
     * @return the value of user_1.TOKEN
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    public String getToken() {
        return token;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_1.TOKEN
     *
     * @param token the value for user_1.TOKEN
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_1.GMT_CREATE
     *
     * @return the value of user_1.GMT_CREATE
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_1.GMT_CREATE
     *
     * @param gmtCreate the value for user_1.GMT_CREATE
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_1.GMT_MODIFIED
     *
     * @return the value of user_1.GMT_MODIFIED
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_1.GMT_MODIFIED
     *
     * @param gmtModified the value for user_1.GMT_MODIFIED
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column user_1.avatar_url
     *
     * @return the value of user_1.avatar_url
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    public String getAvatarUrl() {
        return avatarUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column user_1.avatar_url
     *
     * @param avatarUrl the value for user_1.avatar_url
     *
     * @mbg.generated Thu Feb 20 21:50:20 GMT+08:00 2020
     */
    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl == null ? null : avatarUrl.trim();
    }
}