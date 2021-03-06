package com.miaoshaProject;


import com.miaoshaProject.dao.UserDOMapper;
import com.miaoshaProject.dataobject.UserDO;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello world!
 *
 */
//@EnableAutoConfiguration//自动化基于springboot自动化的配置，自动化成为bean，自动加载
@SpringBootApplication(scanBasePackages = {"com.miaoshaProject"})
@RestController//相当于spring的controller
@MapperScan("com.miaoshaProject.dao")
public class App
{
    @Autowired
    private UserDOMapper userDOMapper;

    @RequestMapping("/")
    public String home()
    {
        UserDO userDo = userDOMapper.selectByPrimaryKey(1);
        if(userDo == null)
        {
            return "用户对象不存在";
        }
        else
            return userDo.getName();
    }

    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        //启动springboot
        SpringApplication.run(App.class);
    }

//    @Bean
//    public FilterRegistrationBean registerFilter() {
//        FilterRegistrationBean bean = new FilterRegistrationBean();
//        bean.addUrlPatterns("/*");//所有请求都经过这个Filter
//        bean.setFilter(new CrosFilter());//设置过滤器
//        return bean;
//    }
}
