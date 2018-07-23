package com.epam.mapreduce;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
public class WordCount {

    private static final Log log = LogFactory.getLog(WordCount.class);

    public static void main(String[] args) throws Exception {
        log.info("Starting word count...");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext(
            "/META-INF/spring/application-context.xml", WordCount.class);
        log.info("Wordcount with HDFS copy Application Running");
        context.registerShutdownHook();
    }
}