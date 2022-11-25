package com.it.service;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public interface LogService {

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    void insertLog(String out, String in, Double money, boolean flag);
}
