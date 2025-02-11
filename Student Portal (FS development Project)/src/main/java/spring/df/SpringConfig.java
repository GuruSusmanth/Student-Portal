package spring.df;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
@Bean
Fresher fresh() {
	return new Fresher();
}
}
