package com.publiccms.entities.home;
// Generated 2016-11-12 18:33:49 by Hibernate Tools 4.3.1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.publiccms.common.generator.annotation.GeneratorColumn;

/**
 * HomeFriendApplyId generated by hbm2java
 */
@Embeddable
public class HomeFriendApplyId implements java.io.Serializable {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @GeneratorColumn(title = "用户ID")
    private long userId;
    @GeneratorColumn(title = "好友ID")
    private long friendId;

    public HomeFriendApplyId() {
    }

    public HomeFriendApplyId(long userId, long friendId) {
        this.userId = userId;
        this.friendId = friendId;
    }

    @Column(name = "user_id", nullable = false)
    public long getUserId() {
        return this.userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "friend_id", nullable = false)
    public long getFriendId() {
        return this.friendId;
    }

    public void setFriendId(long friendId) {
        this.friendId = friendId;
    }

    public boolean equals(Object other) {
        if ((this == other))
            return true;
        if ((other == null))
            return false;
        if (!(other instanceof HomeFriendApplyId))
            return false;
        HomeFriendApplyId castOther = (HomeFriendApplyId) other;

        return (this.getUserId() == castOther.getUserId()) && (this.getFriendId() == castOther.getFriendId());
    }

    public int hashCode() {
        int result = 17;

        result = 37 * result + (int) this.getUserId();
        result = 37 * result + (int) this.getFriendId();
        return result;
    }

}
