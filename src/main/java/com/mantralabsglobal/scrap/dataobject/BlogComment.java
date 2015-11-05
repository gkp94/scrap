package com.mantralabsglobal.scrap.dataobject;

import java.util.Date;
import java.util.List;

public class BlogComment {
	
	private Date commentDate;
	private String user;
	private String avatarUrl;
	private String profileUrl;
	private String comment;
	
	private List<BlogComment> replies;

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<BlogComment> getReplies() {
		return replies;
	}

	public void setReplies(List<BlogComment> replies) {
		this.replies = replies;
	}

	public String getAvatarUrl() {
		return avatarUrl;
	}

	public void setAvatarUrl(String avatarUrl) {
		this.avatarUrl = avatarUrl;
	}

	public String getProfileUrl() {
		return profileUrl;
	}

	public void setProfileUrl(String profileUrl) {
		this.profileUrl = profileUrl;
	}

}
