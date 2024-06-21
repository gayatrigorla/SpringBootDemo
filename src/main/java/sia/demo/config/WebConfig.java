package sia.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{
    @Override
    public void addViewControllers(ViewControllerRegistry controllerRegistry) {
        controllerRegistry.addViewController("/").setViewName("home");
        controllerRegistry.addViewController("/login");
    }
}
