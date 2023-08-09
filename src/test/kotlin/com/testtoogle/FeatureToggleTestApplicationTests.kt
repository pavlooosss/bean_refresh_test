package com.testtoogle

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.cloud.context.scope.refresh.RefreshScope

@SpringBootTest
class FeatureToggleTestApplicationTests {

    @Autowired
    lateinit var refresh: RefreshScope

    @Autowired
    lateinit var ps: TestPropertySource

    @Autowired
    @Qualifier("interface")
    lateinit var service: PerfectService

    @Test
    fun contextLoads() {
        assert(service.getStringValue() == "First Implementation")

        ps.value = "SECOND"
        refresh.refreshAll()

        assert(service.getStringValue() == "Second Implementation")
    }

}
