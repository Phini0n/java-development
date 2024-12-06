package com.pluralsight.NortwindTradersSpringBoot.db;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DatabaseConfiguration {
    private BasicDataSource dataSource;

    @Bean
    public DataSource dataSource() {
        return dataSource;
    }

    public DatabaseConfiguration(@Value("${database.url}")String url,
                                 @Value("${database.url}")String username,
                                 @Value("${database.url}")String password) {
        dataSource = new BasicDataSource();
        dataSource.setUrl(url);
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        System.out.println(url+ " : " + username + " : " + password);
    }
}
