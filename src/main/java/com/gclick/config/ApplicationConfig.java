package com.gclick.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.gclick.repository.AccountRepository;

@Configuration
@EnableJpaRepositories(basePackageClasses = {AccountRepository.class})
@EnableTransactionManagement
public class ApplicationConfig {

}
