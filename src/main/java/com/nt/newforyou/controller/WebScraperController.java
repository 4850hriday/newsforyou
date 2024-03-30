package com.nt.newforyou.controller;

import com.nt.newforyou.service.WebScraperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/website")
public class WebScraperController {

    @Autowired
    private WebScraperService webScraperService;

    @GetMapping("/scrap")
    @ResponseBody
    public void scrap() {
        webScraperService.scrapAndSave();
    }
}
