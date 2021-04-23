package org.log4j.demo.service;

import org.apache.log4j.Logger;

public class Service {

    private static Logger log= Logger.getLogger(Service.class);

    public void service1(String val){
        log.info("Service1 was called with val: "+val);
        log.info("Service1 was done correctly");
    }

    public void service2(String val) {
        log.info("Service2 was called with val: " + val);
        log.info("Service2 was done correctly");
    }
}
