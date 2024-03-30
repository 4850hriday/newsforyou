package com.nt.newforyou.controller;

import com.nt.newforyou.service.RssGeneratorService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rss")
@Log4j2
public class RssFeedController {

    @Autowired
    private RssGeneratorService rssGeneratorService;

    @GetMapping("/rss")
    @ResponseBody
    public String/*void*/ generateRssFeed() {
        return rssGeneratorService.generateRssFeed();
    }

    @GetMapping("/rss/{id}")
    @ResponseBody
    public String/*void*/ generateRssFeed(@PathVariable("id") Long websiteId) {
        log.info("inside ----rss" );
        return rssGeneratorService.generateRssFeedForWebsite(websiteId);
    }



}
