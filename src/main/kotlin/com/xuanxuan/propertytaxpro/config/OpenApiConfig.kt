package com.xuanxuan.propertytaxpro.config

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class OpenApiConfig {

    @Bean
    fun springOpenApi(): OpenAPI? {
        return OpenAPI().info(
            Info().title("Property Tax Pro")
                .description("This is a simple OpenAPI description for Property Tax Pro")
                .version("1.0.0")
        )
    }
}