spring 事务管理
1. 在业务层添加事务(当然也可以在数据层添加)
    1. 在对应方法或类添加注解 @Transactional
    2. 在jdbc配置中添加事务管理类, 将事务管理类注入 spring bean 容器
    3. 在 SpringConfig 开启事务管理 @EnableTransactionManagement
2. 事务角色
    1. 事务管理员 业务层
    2. 事务协调员 数据层

3. 事务传播
    # 事务协调员可以对事务管理员所携带事务做出反应