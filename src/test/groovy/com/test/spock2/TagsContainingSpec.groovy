package com.test.spock2

import org.junit.jupiter.api.Tag
import org.junit.jupiter.api.Test
import spock.lang.Specification

class TagsContainingSpec extends Specification {

    @Tag('smoke')
    def "should test something 1"() {
        expect:
        1 == 1
    }

    @Test
    @Tag('smoke')
    def "should test something 2"() {
        expect:
        2 == 2
    }
}