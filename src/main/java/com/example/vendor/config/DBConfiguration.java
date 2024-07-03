//package com.example.vendor.config;
//
//import javax.sql.DataSource;
//
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//
//public class DBConfiguration {
//	
//	@Bean(name = "sqldata")
//	@ConfigurationProperties(prefix="dsqlata.datasource")
//	public DataSource aquaoldDataSource() {
//	    return DataSourceBuilder.create().build();
//	}
//	
//	@Bean(name = "em.sql")
//	public LocalContainerEntityManagerFactoryBean entityManagerFactory(
//			@Qualifier("schemaname") DataSource secondaryDataSource, EntityManagerFactoryBuilder builder) {
//		return builder.dataSource(secondaryDataSource).packages("com.example.vendor")
//				.persistenceUnit("sql").build();
//	}
//
//	@Bean(name = "tm.aqua")
//	public PlatformTransactionManager transactionManager(EntityManagerFactory entityManagerFactory) {
//		return new JpaTransactionManager(entityManagerFactory); }
//
//	@Bean(name = "aquanew")
//	@Primary
//	@ConfigurationProperties(prefix="aquanew.datasource")
//	public DataSource aquanewDataSource() {
//	    return DataSourceBuilder.create().build();
//	}
//	
//	
//
//}
