package com.it.service.impl;


import com.it.dao.AccountDao;
import com.it.dao.LogDao;
import com.it.service.AccountService;
import com.it.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountDao accountDao;

    @Autowired
    private LogService logService;
    /**
     *
     * @param out 转出方
     * @param in 转入方
     * @param money 金额
     */
    public void transMoney(String out, String in, Double money) {
        boolean flag = false;
        /**
         * 记录转账日志, 不管转账是否成功, 都需要记录相应日志
         * try中转出和转入事务加入事务管理员事务
         * 日志记录事务单独开启新的事务
         */
        try {
            accountDao.outMoney(out,money);
            int i = 1/0;
            accountDao.inMoney(in,money);
            flag = true;
        } finally {
            logService.insertLog(out,in,money,flag);
        }
    }
}
