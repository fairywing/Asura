package com.chao.fairy.controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

@Controller
public class LogonController {
    private static final Logger logger = LoggerFactory.getLogger(LogonController.class);

    public LogonController() {
        logger.info("xzc");
    }
}
