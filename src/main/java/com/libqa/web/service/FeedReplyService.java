package com.libqa.web.service;

import com.libqa.application.util.LoggedUser;
import com.libqa.web.domain.FeedReply;
import com.libqa.web.domain.User;
import com.libqa.web.repository.FeedReplyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class FeedReplyService {

    @Autowired
    private LoggedUser loggedUser;
    @Autowired
    private FeedReplyRepository feedReplyRepository;

    public void save(FeedReply feedReply) {
        User user = loggedUser.get();

        feedReply.setInsertDate(new Date());
        feedReply.setUserId(user.getUserId());
        feedReply.setUserNick(user.getUserNick());
        feedReply.setInsertUserId(user.getUserId());
        feedReplyRepository.save(feedReply);
    }

}
