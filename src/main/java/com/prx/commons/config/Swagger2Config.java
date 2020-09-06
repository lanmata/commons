//package com.prx.commons.config;
//
//import com.fasterxml.classmate.TypeResolver;
//import com.prx.commons.pojo.VendorExtensionImpl;
//import lombok.NoArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.context.request.async.DeferredResult;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.schema.AlternateTypeRules;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.service.VendorExtension;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//import java.lang.reflect.WildcardType;
//import java.util.ArrayList;
//import java.util.Collection;
//
///**
// * Clase para la configuraci&oacute;n de Swagger2
// *
// * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
// * @since 2019-08-18
// */
//@EnableSwagger2
//@Configuration
//@NoArgsConstructor
//public class Swagger2Config {
//    @Autowired
//    private TypeResolver typeResolver;
//    @Value("${app.version}")
//    private String appVersion;
//    @Value("${swagger.base-package}")
//    private String basePackage;
//    @Value("${swagger.api-info.title}")
//    private String title;
//    @Value("${swagger.api-info.description}")
//    private String description;
//    @Value("${swagger.api-info.contact.name}")
//    private String contactName;
//    @Value("${swagger.api-info.contact.url}")
//    private String contactUrl;
//    @Value("${swagger.api-info.contact.email}")
//    private String contactEmail;
//
//    @Bean
//    public Docket swaggerApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .select()
//                .apis(RequestHandlerSelectors
//                        .basePackage(basePackage))
//                .paths(PathSelectors.regex("/.*"))
//                .build()
//                .pathMapping("/")
//                .genericModelSubstitutes(ResponseEntity.class)
//                .alternateTypeRules(
//                        AlternateTypeRules.newRule(typeResolver.resolve(DeferredResult.class,
//                                typeResolver.resolve(ResponseEntity.class, WildcardType.class)),
//                                typeResolver.resolve(WildcardType.class)))
//                .useDefaultResponseMessages(false)
//                .apiInfo(apiInfo());
//    }
//
//    private ApiInfo apiInfo() {
//        Collection<VendorExtension> vendorExtensionList = new ArrayList();
//        VendorExtensionImpl vendorExtension = new VendorExtensionImpl("Nombre", "Valor");
//        vendorExtensionList.add(vendorExtension);
//        return new ApiInfo(title, description, appVersion,"urn:tos",
//                new Contact(contactName, contactUrl, contactEmail),
//                "API License",
//                "http://www.api-license-url.com",
//                vendorExtensionList);
//    }
//}
