package com.goglides

import grails.rest.Resource

@Resource(uri='/users')


class Users {
    String referenceId

    static constraints = {

        referenceId blank:false,nullable: false
    }


    static mapping = {
        table 'users'
        reference column: "reference_id", length: 255
    }
}
