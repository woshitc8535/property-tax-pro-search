package com.xuanxuan.propertytaxpro.model

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document


@Document(indexName = "user")
data class TestUser(
    @Id
    val username: String,
    val name: String,
    val email: String
)
