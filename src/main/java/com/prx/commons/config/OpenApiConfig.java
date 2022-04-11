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

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

/**
 * Clase para la configuraci&oacute;n de Swagger2
 *
 * @author <a href="mailto:luis.antonio.mata@gmail.com">Luis Antonio Mata</a>
 * @since 2019-08-18
 */
@SuppressWarnings({"rawtypes", "unchecked"})
@OpenAPIDefinition(info = @Info(
        title = "${api-info.title}",
        version = "${api-info.version}",
        description = "${api-info.description}",
        contact = @Contact(
                name = "${api-info.contact.name}",
                email = "${api-info.contact.email}",
                url = "${api-info.contact.url}"
        )
))
@Slf4j
@Configuration
@RequiredArgsConstructor
public class OpenApiConfig {}
