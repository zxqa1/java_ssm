package com.it.service;

import org.springframework.transaction.annotation.Transactional;

public interface AccountService {

    @Transactional
    void transMoney(String out, String in, Double money);
}
