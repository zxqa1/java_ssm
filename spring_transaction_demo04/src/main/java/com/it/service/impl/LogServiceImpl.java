package com.it.service.impl;

import com.it.dao.LogDao;
import com.it.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {
    @Autowired
    private LogDao logDao;

    public void insertLog(String out, String in, Double money, boolean flag) {
        String insertInfo = "转账操作: " + out + "向" + in +"转账" + money + "元";
        String state = "失败";
        if (flag){
            state = "成功";
        }
        logDao.insertLog(insertInfo,state);
    }
}
