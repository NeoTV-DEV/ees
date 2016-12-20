package cn.dianjingquan.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
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
 * cn.dianjingquan.user.
 */
@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .host("www.dianjingquan.cn")
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
                .version("1.0")
                .build();
    }
}
