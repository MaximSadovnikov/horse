package ru.maxim.horse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import ru.maxim.horse.servlets.HorseServlet;

import javax.servlet.Servlet;
import javax.servlet.http.HttpServlet;

@SpringBootApplication
public class HorseApplication {

    @Bean
    public ServletRegistrationBean exampleServletBean() {
        ServletRegistrationBean bean = new ServletRegistrationBean(
                httpServlet(), "/horse/servlet/count");
        bean.setLoadOnStartup(1);
        return bean;
    }

    @Bean
    public HttpServlet httpServlet() {
        return new HorseServlet();
    }


    public static void main(String[] args) {
        SpringApplication.run(HorseApplication.class, args);
    }

}
