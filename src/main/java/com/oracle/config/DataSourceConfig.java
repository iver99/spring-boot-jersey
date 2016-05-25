package com.oracle.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class DataSourceConfig {

	/*@Value("${jdbc.driverClass}") String driverClass;
	@Value("${jdbc.url}") String url;
	@Value("${jdbc.user}") String user;
	@Value("${jdbc.password}") String password;

	@Bean(autowire=Autowire.BY_TYPE)
	public DataSource dataSource() throws PropertyVetoException {
		ComboPooledDataSource dataSource = new ComboPooledDataSource();
		dataSource.setDriverClass(driverClass);
		dataSource.setJdbcUrl(url);
		dataSource.setUser(user);
		dataSource.setPassword(password);
		return dataSource;
	}*/
}
