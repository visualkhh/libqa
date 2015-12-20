package com.libqa.web.service.feed.actor;

import com.libqa.application.enums.FeedActionType;
import com.libqa.application.enums.FeedThreadType;

public class FeedReplyLike extends FeedActor {
    public FeedReplyLike(int feedReplyId) {
        super(feedReplyId);
    }

    public static FeedReplyLike of(int feedReplyId) {
        return new FeedReplyLike(feedReplyId);
    }

    @Override
    public FeedThreadType getFeedThreadType() {
        return FeedThreadType.FEED_REPLY;
    }

    @Override
    public FeedActionType getFeedActionType() {
        return FeedActionType.FEED_REPLY_LIKE;
    }
}