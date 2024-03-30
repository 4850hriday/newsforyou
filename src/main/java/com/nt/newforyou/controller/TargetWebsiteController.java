package com.nt.newforyou.controller;

import com.nt.newforyou.model.parser.TargetWebsite;
import com.nt.newforyou.service.TargetWebsiteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/website")
@Log4j2
public class TargetWebsiteController {

    @Autowired
    private TargetWebsiteService targetWebsiteService;

    @PostMapping("/save")
    @ResponseBody
    public TargetWebsite saveTargetWebsite(TargetWebsite targetWebsite){
        System.out.println("here we are in target website controller");
        log.info("going to save value {} ",targetWebsite);
        return  targetWebsiteService.save(targetWebsite);
    }

    @GetMapping("/rss/{id}")
    @ResponseBody
    public TargetWebsite generateRssFeed(@PathVariable("id") Long websiteId) {
        return targetWebsiteService.findById(websiteId);
    }





}
