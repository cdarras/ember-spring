package xyz.capybara.domain.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "xyz.capybara.domain")
@Configuration
public class DomainConfig {
}
