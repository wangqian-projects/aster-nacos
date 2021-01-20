package com.alibaba.nacos;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author nacos starter
 * <p>
 * nacos console 源码运行，方便开发 生产建议从官网下载最新版配置运行
 */
@EnableScheduling
@ServletComponentScan
@SpringBootApplication(scanBasePackages = "com.alibaba.nacos")
public class NacosApplication {

	public static void main(String[] args) {
		System.setProperty("nacos.standalone", "true");
		System.setProperty("nacos.core.auth.enabled", "false");
		SpringApplication.run(NacosApplication.class, args);
	}

}
