package com.RESTCB.springbootrestfulwebservicescb.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;


@Configuration
public class CouchBaseConfig extends AbstractCouchbaseConfiguration {
    @Autowired
    private ApplicationContext context;
    @Value("${app.couchbase.connection-string}")
    private String connectionString;
    @Value("${app.couchbase.user-name}")
    private String userName;
    @Value("${app.couchbase.password}")
    private String password;
    @Value("${app.couchbase.bucket-user}")
    private String userBucket;
    @Override
    public String getConnectionString() {
        return connectionString;
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getBucketName() {
        return userBucket;
    }
}
