package life.haid.community.community01.model;

public class Question {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_1.ID
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_1.title
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_1.gmt_create
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    private Long gmtCreate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_1.gmt_modified
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    private Long gmtModified;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_1.creator
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    private Long creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_1.comment_count
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    private Integer commentCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_1.view_count
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    private Integer viewCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_1.like_count
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    private Integer likeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_1.tag
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    private String tag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column question_1.description
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    private String description;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_1.ID
     *
     * @return the value of question_1.ID
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_1.ID
     *
     * @param id the value for question_1.ID
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_1.title
     *
     * @return the value of question_1.title
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_1.title
     *
     * @param title the value for question_1.title
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_1.gmt_create
     *
     * @return the value of question_1.gmt_create
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public Long getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_1.gmt_create
     *
     * @param gmtCreate the value for question_1.gmt_create
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public void setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_1.gmt_modified
     *
     * @return the value of question_1.gmt_modified
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public Long getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_1.gmt_modified
     *
     * @param gmtModified the value for question_1.gmt_modified
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public void setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_1.creator
     *
     * @return the value of question_1.creator
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public Long getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_1.creator
     *
     * @param creator the value for question_1.creator
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_1.comment_count
     *
     * @return the value of question_1.comment_count
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public Integer getCommentCount() {
        return commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_1.comment_count
     *
     * @param commentCount the value for question_1.comment_count
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_1.view_count
     *
     * @return the value of question_1.view_count
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public Integer getViewCount() {
        return viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_1.view_count
     *
     * @param viewCount the value for question_1.view_count
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_1.like_count
     *
     * @return the value of question_1.like_count
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public Integer getLikeCount() {
        return likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_1.like_count
     *
     * @param likeCount the value for question_1.like_count
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_1.tag
     *
     * @return the value of question_1.tag
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public String getTag() {
        return tag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_1.tag
     *
     * @param tag the value for question_1.tag
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public void setTag(String tag) {
        this.tag = tag == null ? null : tag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column question_1.description
     *
     * @return the value of question_1.description
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column question_1.description
     *
     * @param description the value for question_1.description
     *
     * @mbg.generated Wed Feb 26 20:27:49 GMT+08:00 2020
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}