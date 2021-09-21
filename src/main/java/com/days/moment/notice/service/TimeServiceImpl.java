package com.days.moment.notice.service;

import com.days.moment.notice.mapper.TimeMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;


@Log4j2
@Service
@RequiredArgsConstructor
public class TimeServiceImpl implements TimeService {

    private final TimeMapper timeMapper;

    @Override
    public String getNow() {
      //  log.info("service...getNow()");//요런 로그들을 AOP로 뽑을 예정!
        return timeMapper.getTime2();
    }


    @Override
    public void addString(String str) {
        timeMapper.insertE1(str);
        timeMapper.insertE2(str);
    }
}
