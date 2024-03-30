package com.nt.newforyou.service;

import lombok.extern.java.Log;
import com.nt.newforyou.model.rss.FeedEntry;
import com.nt.newforyou.repository.FeedEntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Log
@Service
public class FeedEntryService {

    @Autowired
    private FeedEntryRepository feedEntryRepository;

    public FeedEntry save(FeedEntry feedEntry) {
        return feedEntryRepository.save(feedEntry);
    }

    public List<FeedEntry> findAll() {
        return feedEntryRepository.findAll();
    }

    public List<FeedEntry> findAllByTargetWebsiteId(Long targetWebsiteId) {
        return feedEntryRepository.findAllByTargetWebsiteId(targetWebsiteId);
    }

    public void deleteAll() {
        feedEntryRepository.deleteAll();
    }
}
