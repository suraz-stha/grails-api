package com.goglides
import grails.rest.Resource

@Resource(uri='/category')
class Test {
    String testName
    String checkVersion

    static constraints = {
        testName blank:false
    }
}
