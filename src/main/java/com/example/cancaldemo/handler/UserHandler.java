package com.example.cancaldemo.handler;

import com.example.cancaldemo.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import top.javatool.canal.client.annotation.CanalTable;
import top.javatool.canal.client.handler.EntryHandler;

@Component
@CanalTable(value = "user")
public class UserHandler implements EntryHandler<User> {


    private Logger logger = LoggerFactory.getLogger(UserHandler.class);


    @Override
    public void insert(User user) {
        logger.info("insert message  {}", user);
    }

    @Override
    public void update(User before, User after) {
        logger.info("update before {} ", before);
        logger.info("update after {}", after);
    }

    @Override
    public void delete(User user) {
        logger.info("delete  {}", user);
    }
}
