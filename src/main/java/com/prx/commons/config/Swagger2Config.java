/*
 *  @(#)Swagger2Config.java
 *
 *  Copyright (c) Luis Antonio Mata Mata. All rights reserved.
 *
 *  All rights to this product are owned by Luis Antonio Mata Mata and may only
 *  be used under the terms of its associated license document. You may NOT
 *  copy, modify, sublicense, or distribute this source file or portions of
 *  it unless previously authorized in writing by Luis Antonio Mata Mata.
 *  In any event, this notice and the above copyright must always be included
 *  verbatim with this file.
 */
package com.prx.commons.config;

import com.fasterxml.classmate.TypeResolver;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.RequestParameterBuilder;
import springfox.documentation.builders.ResponseBuilder;
import springfox.documentation.schema.ScalarType;
import springfox.documentation.service.ParameterType;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.web.*;

import java.lang.reflect.WildcardType;
import java.time.LocalDate;

import static java.util.Collections.singletonList;
import static springfox.documentation.schema.AlternateTypeRules.newRule;

/**
 * Clase para la configuraci&oacute;n de Swagger2
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 * @since 2019-08-18
 */
@SuppressWarnings({"rawtypes", "unchecked"})
@OpenAPIDefinition(info = @Info(
        title = "${swagger.api-info.title}",
        version = "${app.version}",
        description = "${swagger.api-info.description}"))
@Slf4j
@Configuration
@RequiredArgsConstructor
public class Swagger2Config {

    private final TypeResolver typeResolver;
    @Value("${app.version}")
    private String appVersion;
    @Value("${swagger.base-package}")
    private String basePackage;
    @Value("${swagger.api-info.title}")
    private String title;
    @Value("${swagger.api-info.description}")
    private String description;
    @Value("${swagger.api-info.contact.name}")
    private String contactName;
    @Value("${swagger.api-info.contact.url}")
    private String contactUrl;
    @Value("${swagger.api-info.contact.email}")
    private String contactEmail;

    public Docket prxApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .pathMapping("/")
                .directModelSubstitute(LocalDate.class, String.class)
                .genericModelSubstitutes(ResponseEntity.class)
                .alternateTypeRules(
                        newRule(typeResolver.resolve(DeferredResult.class,
                                typeResolver.resolve(ResponseEntity.class, WildcardType.class)),
                                typeResolver.resolve(WildcardType.class)))
                .useDefaultResponseMessages(false)
                .globalResponses(HttpMethod.GET,
                        singletonList(new ResponseBuilder()
                                .code("500")
                                .description("500 message")
                                .representation(MediaType.TEXT_XML)
                                .apply(r ->
                                        r.model(m ->
                                                m.referenceModel(ref ->
                                                        ref.key(k ->
                                                                k.qualifiedModelName(q ->
                                                                        q.namespace("com.prx")
                                                                                .name("ERROR"))))))
                                .build()))
//                .securitySchemes(singletonList(apiKey()))
//                .securityContexts(singletonList(securityContext()))
                .enableUrlTemplating(true)
                .globalRequestParameters(
                        singletonList(new RequestParameterBuilder()
                                .name("someGlobalParameter")
                                .description("Description of someGlobalParameter")
                                .in(ParameterType.QUERY)
                                .required(true)
                                .query(q -> q.model(m -> m.scalarModel(ScalarType.STRING)))
                                .build()))
                .tags(new Tag(title, description));
    }



//    private ApiKey apiKey() {
//        return new ApiKey("mykey", "api_key", "header");
//    }

//    private SecurityContext securityContext() {
//        return SecurityContext.builder()
//                .securityReferences(defaultAuth())
//                .forPaths(PathSelectors.regex("/anyPath.*"))
//                .build();
//    }
//
//    List<SecurityReference> defaultAuth() {
//        AuthorizationScope authorizationScope
//                = new AuthorizationScope("global", "accessEverything");
//        AuthorizationScope[] authorizationScopes = new AuthorizationScope[1];
//        authorizationScopes[0] = authorizationScope;
//        return singletonList(
//                new SecurityReference("mykey", authorizationScopes));
//    }

//    @Bean
//    SecurityConfiguration security() {
//        return SecurityConfigurationBuilder.builder()
//                .clientId(clientId)
//                .clientSecret(clientSecret)
//                .realm(realm)
//                .appName(title)
//                .scopeSeparator(",")
//                .additionalQueryStringParams(null)
//                .useBasicAuthenticationWithAccessCodeGrant(false)
//                .enableCsrfSupport(true)
//                .build();
//    }

    @Bean
    UiConfiguration uiConfig() {
        return UiConfigurationBuilder.builder()
                .deepLinking(true)
                .displayOperationId(false)
                .defaultModelsExpandDepth(1)
                .defaultModelExpandDepth(1)
                .defaultModelRendering(ModelRendering.EXAMPLE)
                .displayRequestDuration(false)
                .docExpansion(DocExpansion.NONE)
                .filter(false)
                .maxDisplayedTags(null)
                .operationsSorter(OperationsSorter.ALPHA)
                .showExtensions(false)
                .showCommonExtensions(false)
                .tagsSorter(TagsSorter.ALPHA)
                .supportedSubmitMethods(UiConfiguration.Constants.DEFAULT_SUBMIT_METHODS)
                .validatorUrl(null)
                .build();
    }

//    private ApiInfo apiInfo() {
//        Collection<VendorExtension> vendorExtensionList = new ArrayList();
//        final var vendorExtension = new VendorExtensionImpl();
//
//        vendorExtension.setName("Nombre");
//        vendorExtension.setValue("Valor");
//        vendorExtensionList.add(vendorExtension);
//
//        log.info("Swagger procesa contenido de autor");
//        return new ApiInfo(title, description, appVersion, "urn:tos",
//                new Contact(contactName, contactUrl, contactEmail), "API License", "http://www.api-license-url.com",
//                vendorExtensionList);
//    }
}
