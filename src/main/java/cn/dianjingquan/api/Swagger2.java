package cn.dianjingquan.api;

import cn.dianjingquan.api.controller.MatchBuildController;
import cn.dianjingquan.api.dao.model.Referee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by tommy on 2016-10-25.
 * usercenter
 * cn.dianjingquan.api.Swagger2
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket eesApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("ees-full-api")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("cn.dianjingquan.api"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("电竞圈 EES v1.5")
                .description("API 接口文档")
                .termsOfServiceUrl("http://www.dianjingquan.cn/")
                .contact(new Contact("Tommy WU","","wujs@neotv.me"))
                .license("GPL V2")
                .licenseUrl("https://www.gnu.org/licenses/gpl-2.0.html")
                .version("3.0")
                .build();
    }
}
