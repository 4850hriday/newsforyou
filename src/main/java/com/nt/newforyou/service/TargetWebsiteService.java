package com.nt.newforyou.service;

import com.nt.newforyou.repository.ParseEntryRuleRepository;
import com.nt.newforyou.repository.TargetWebsiteRepository;
import lombok.extern.java.Log;
import com.nt.newforyou.model.parser.ParseEntryRule;
import com.nt.newforyou.model.parser.TargetWebsite;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Log
@Service
public class TargetWebsiteService {

    @Autowired
    private TargetWebsiteRepository targetWebsiteRepository;

    @Autowired
    private ParseEntryRuleRepository parseEntryRuleRepository;

    public List<TargetWebsite> findAll() {
        return targetWebsiteRepository.findAll();
    }

    public TargetWebsite findById(Long id) {
        return targetWebsiteRepository.findById(id).get();
    }

    @Transactional
    public TargetWebsite save(TargetWebsite targetWebsite){
        log.info("save target website :"+targetWebsite);
        ParseEntryRule parseEntryRule = targetWebsite.getParseEntryRule();
        parseEntryRuleRepository.save(parseEntryRule);
       return   targetWebsiteRepository.save(targetWebsite);
    }
}
