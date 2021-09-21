package com.days.moment.notice.service;

import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TimeService {

    String getNow();

    void addString(String str);
}
