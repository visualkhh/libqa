package com.libqa.web.repository;

import com.libqa.web.domain.Keyword;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by yong on 15. 2. 8..
 */
public interface KeywordRepository extends JpaRepository<Keyword, Long> {

    List<Keyword> findAllByQaIdAndIsDeleted(Integer qaId, boolean isDeleted);
}