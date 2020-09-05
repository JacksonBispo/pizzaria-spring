package br.com.smartpizza.config;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AvailableSettings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


@Configuration
@ComponentScan({ "br.com.smartpizza.*" })
@EnableTransactionManagement
@EnableWebMvc
@PropertySource(value = { "classpath:hibernate.properties" })
public class SpringConfig extends WebMvcConfigurerAdapter {
	
	@Autowired
	private Environment env;

	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory factory) {
		JpaTransactionManager manager = new JpaTransactionManager();
		manager.setEntityManagerFactory(factory);
		manager.setJpaDialect(new HibernateJpaDialect());
		return manager;
	}

	private Properties getHibernateProperties() {
		Properties properties = new Properties();
		
		String dialect = env.getRequiredProperty("hibernate.dialect");
		
		properties.put(AvailableSettings.DIALECT, dialect);
		properties.put(AvailableSettings.SHOW_SQL, env.getRequiredProperty("hibernate.show_sql"));
		properties.put(AvailableSettings.HBM2DDL_AUTO, env.getRequiredProperty("hibernate.hbm2ddl.auto"));

		return properties;
	}
	
	@Bean
	public HibernateJpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		adapter.setShowSql(env.getProperty("hibernate.show_sql", Boolean.class));
		adapter.setGenerateDdl(env.getProperty("hibernate.generate_dll", Boolean.class));
		adapter.setDatabasePlatform(env.getProperty("hibernate.dialect", String.class));
		return adapter;
	}

	@Bean
	public EntityManagerFactory entityManagerFactory() {
		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setJpaVendorAdapter(jpaVendorAdapter());
		factory.setPackagesToScan("br.com.smartpizza.domain");
		factory.setDataSource(getDataSource());
		factory.afterPropertiesSet();
		return factory.getObject();
	}
	
	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sessionFactory) {
		HibernateTransactionManager txManager = new HibernateTransactionManager();
		txManager.setSessionFactory(sessionFactory);
		return txManager;
	}

	@Bean(name = "dataSource")
	public DataSource getDataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUsername(env.getProperty("datasource.username"));
		dataSource.setPassword(env.getProperty("datasource.password"));
		dataSource.setDriverClassName(env.getProperty("datasource.driver"));
		dataSource.setUrl(env.getProperty("datasource.url"));
		return dataSource;
	}
	
	@Bean
	public LocalSessionFactoryBean getSessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(getDataSource());
		sessionFactory.setPackagesToScan(new String[] { "br.com.elaw" });
		sessionFactory.setHibernateProperties(getHibernateProperties());
		return sessionFactory;
	}
	
}
