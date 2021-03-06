package com.mall.search;

import com.mall.common.base.config.CORSConfig;
import com.mall.common.exception.GlobalThrowableHandler;
import com.mall.common.swagger2.Swagger2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.FilterType;

/**
 * <p>
 * Search Application
 * </p>
 *
 * @author yanglin
 * @date 2020-10-31 15:53:00
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@ComponentScans(value = {
        @ComponentScan(
                excludeFilters = {
                        @ComponentScan.Filter(
                                type = FilterType.CUSTOM,
                                classes = {TypeExcludeFilter.class}
                        ),
                        @ComponentScan.Filter(
                                type = FilterType.CUSTOM,
                                classes = {AutoConfigurationExcludeFilter.class}
                        )
                }
        ),
        @ComponentScan(
                basePackageClasses = {
                        Swagger2.class,
                        CORSConfig.class,
                        GlobalThrowableHandler.class
                }
        ),
})
@EnableFeignClients(basePackages = "com.mall.goods.feign")
public class SearchApplication {
    /**
     * <p>
     * Main
     * </p>
     *
     * @param args
     * @author yanglin
     * @date 2020-06-24 21:30:11
     */
    public static void main(String[] args) {
        SpringApplication.run(SearchApplication.class, args);
    }
}
