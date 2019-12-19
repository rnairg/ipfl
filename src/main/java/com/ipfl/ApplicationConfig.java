package com.ipfl;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.neo4j.ogm.config.ClasspathConfigurationSource;
import org.neo4j.ogm.config.ConfigurationSource;


@Configuration
@ComponentScan(basePackages = "com.ipfl")
@EnableNeo4jRepositories(basePackages = "com.ipfl.data.repositories")
@EnableTransactionManagement
public class ApplicationConfig{
	
	@Bean
    public org.neo4j.ogm.config.Configuration configuration() {
        ConfigurationSource properties = new ClasspathConfigurationSource("application.properties");
        org.neo4j.ogm.config.Configuration configuration = new org.neo4j.ogm.config.Configuration.Builder(properties).build();
        return configuration;
    }
	
	@Bean
    public SessionFactory sessionFactory() {

        return new SessionFactory(configuration(),"com.ipfl.data.domains");
    }
	
	 @Bean
	    public Neo4jTransactionManager transactionManager() {
	        return new Neo4jTransactionManager(sessionFactory());
	    }
}
