MyBatis Plus

    1. 标准层数据开发
        + 分页功能
            + 开启 mybatis plus 分页拦截器插件
        + Lombok 注解开发实体类
    2. 开启日志
    3. 条件查询
        + Wrapper -> QueryWrapper -> LambdaQueryWrapper
        + null 值处理
            + 条件书写格式
                // null 值处理 -- 这里直接使用子类 QueryBook
                	    QueryBook queryBook = new QueryBook();
                		queryBook.setAge(10);
                		queryBook.setAge2(30);
                		lqw.ge(null != queryBook.getAge(), Book::getAge, queryBook.getAge());
                		lqw.le(null != queryBook.getAge2(), Book::getAge, queryBook.getAge2());
    4. 查询投影
        + 去看笔记吧
    5. 表名字段与类名属性映射
        01 问题一 表字段与编码属性设计不同步
        02 问题二 编码中添加了数据库中未定义的属性 online
        03 问题三 默认查询开放了过多字段的查询权限
        04 问题四 表明与编码类名不一致
        05 注解 @TableField
        06 注解 @TableName