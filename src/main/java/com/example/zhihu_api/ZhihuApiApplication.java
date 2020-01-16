package com.example.zhihu_api;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/**启动主类，mapper的扫描注解
 *
 */
@MapperScan("com.example.zhihu_api.mapper")
public class ZhihuApiApplication {

    public static void main(String[] args)
    {
        SpringApplication.run(ZhihuApiApplication.class, args);
    }
}
