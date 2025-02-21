package com.xuanxuan.propertytaxpro.dal

import com.xuanxuan.propertytaxpro.model.TestUser
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: ElasticsearchRepository<TestUser, String>{
    fun save(testUser: TestUser): TestUser

    fun findByUsername(username: String): TestUser?
}