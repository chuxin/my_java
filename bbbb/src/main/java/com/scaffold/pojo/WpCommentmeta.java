package com.scaffold.pojo;

public class WpCommentmeta {
    private Integer metaId;

    private Long commentId;

    private String metaKey;

    private String metaValue;

    public WpCommentmeta(Integer metaId, Long commentId, String metaKey, String metaValue) {
        this.metaId = metaId;
        this.commentId = commentId;
        this.metaKey = metaKey;
        this.metaValue = metaValue;
    }

    public WpCommentmeta() {
        super();
    }

    public Integer getMetaId() {
        return metaId;
    }

    public void setMetaId(Integer metaId) {
        this.metaId = metaId;
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public String getMetaKey() {
        return metaKey;
    }

    public void setMetaKey(String metaKey) {
        this.metaKey = metaKey == null ? null : metaKey.trim();
    }

    public String getMetaValue() {
        return metaValue;
    }

    public void setMetaValue(String metaValue) {
        this.metaValue = metaValue == null ? null : metaValue.trim();
    }
}