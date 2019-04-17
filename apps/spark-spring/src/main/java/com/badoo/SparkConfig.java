package com.badoo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * Created by krash on 17.04.19.
 */
@Configuration
public class SparkConfig {

    @Value("${spark.app.name:''}")
    public String appVersion;

}
