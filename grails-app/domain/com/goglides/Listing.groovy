package com.goglides

import java.sql.Date

class Listing {
    String referenceId
    Long parentId
    Long userId
    Long businessDirectoryId
    Long categoryId

    String title
    String slug
    String code
    String highlight
    String description
    String address
    String city
    String country
    double latitude
    double longititude
    String nearestCity
    String nearestAirport
    boolean isVisible
    int status
    Date createdAt
    Date updatedAt
    Date modifiedAt
    static constraints = {
        referenceId blank:false,nullable: false
        parentId blank:false,nullable: false
        userId blank:false,nullable: false
        businessDirectoryId blank:false,nullable: false
        categoryId blank:false,nullable: false
        title blank:false,nullable: false
        slug blank:false,nullable: false
        code blank:false,nullable: false
        address blank:false,nullable: false
        city blank:false,nullable: false
        country blank:false,nullable: false
        latitude blank:true,nullable: true
        longititude blank:true,nullable: true
        nearestCity blank:true,nullable: true
        nearestAirport blank:true,nullable: true
        description blank:false,nullable: false
        highlight blank:false,nullable: false
        isVisible blank:false,nullable: true
        status blank:true,nullable: true
        createdAt blank:false,nullable: true
        updatedAt blank:true,nullable: true
        modifiedAt blank:true,nullable: true
    }
    static mapping = {
        table 'listing'
        referenceId column: "reference_id", length: 255
        parentId column: "parent_id", length: 20
        userId column: "user_id", length: 20
        longititude column: "longititude",sqlType: "double"
        highlight column: "highlight",sqlType: "text"
        description column: "description",sqlType: "text"
        latitude column: "latitude",sqlType: "double"
        status column: "status",sqlType: "tinyInt", length: 6, defaultValue: 0
        createdAt column: "created_at",sqlType: "timestamp"
        updatedAt column: "updated_at",sqlType: "timestamp"
        modifiedAt column: "modified_at",sqlType: "timestamp"



    }
}
