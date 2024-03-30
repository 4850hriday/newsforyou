package com.nt.newforyou.repository;

import com.nt.newforyou.model.parser.TargetWebsite;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TargetWebsiteRepository extends CrudRepository<TargetWebsite, Long> {
    List<TargetWebsite> findAll();
}
