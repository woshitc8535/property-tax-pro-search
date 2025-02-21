package com.xuanxuan.propertytaxpro.config

import org.elasticsearch.client.RestClient
import org.elasticsearch.client.RestHighLevelClient
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration
class ElasticsearchConfig {

    @Bean
    fun restHighLevelClient(): RestHighLevelClient {
        return RestHighLevelClient(
            RestClient.builder(org.apache.http.HttpHost("localhost", 9200, "http"))
        )
    }

}