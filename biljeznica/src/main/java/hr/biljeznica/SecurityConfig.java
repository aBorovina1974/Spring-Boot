package hr.biljeznica;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	@Autowired
	DataSource dataSource;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
	http.formLogin().loginPage("/login").defaultSuccessUrl("/novaBiljeska")
	.failureUrl("/login?error=true").and()
	.logout().logoutSuccessUrl("/login?logout=true").and()
	.authorizeRequests()
	.antMatchers("/css/**").permitAll()
	.antMatchers("/login").anonymous().antMatchers("/**").authenticated().anyRequest
	().permitAll().and().csrf().disable();
	}
	
	@Autowired
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	auth.jdbcAuthentication().dataSource(dataSource)
	.usersByUsernameQuery("select username,password, enabled from user where username=?")
	.authoritiesByUsernameQuery("select username, role from user_role where username =?");
	}
}
