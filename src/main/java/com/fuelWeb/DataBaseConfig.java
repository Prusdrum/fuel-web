package com.fuelWeb;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DataBaseConfig {

	@Bean
	public DataSource dataSource(final Environment env) {
		final HikariDataSource ds = new HikariDataSource();
		ds.setJdbcUrl(env.getRequiredProperty("psql.jdbcurl"));
		ds.setUsername(env.getRequiredProperty("psql.username"));
		ds.setPassword(env.getRequiredProperty("psql.password"));
		return ds;
	}
}
