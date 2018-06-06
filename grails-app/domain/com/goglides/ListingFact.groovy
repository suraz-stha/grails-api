package com.goglides

import java.sql.Date

class ListingFact {
    String referenceId
    Long parentId
    Long userId
    Long businessDirectoryId
    Long listingId
    int tripGrade
    int tripStandard
    String bestSeason
    String startPoint
    String endPoint
    String startElevation
    String lowestElevation
    String highestElevation
    int daysCount
    int nightCount
    int maxCapacity
    int availableCapacity
    int minPax
    int maxPax
    int minWeight
    int maxWeight
    int minAge
    int maxAge
    int status
    Date createdAt
    Date updatedAt
    Date modifiedAt
    static constraints = {
        referenceId blank:false,nullable: false
        parentId blank:false,nullable: false
        userId blank:false,nullable: false
        businessDirectoryId blank:false,nullable: false
        listingId blank:false,nullable: false
        tripGrade blank:false,nullable: false
        tripStandard blank:false,nullable: false
        bestSeason blank:false,nullable: false
        startPoint blank:false,nullable: false
        endPoint blank:false,nullable: false
        startElevation blank:false,nullable: false
        lowestElevation blank:false,nullable: false
        highestElevation blank:false,nullable: false
        daysCount blank:false,nullable: false
        nightCount blank:false,nullable: false
        maxCapacity blank:false,nullable: false
        availableCapacity blank:false,nullable: false
        minPax blank:false,nullable: false
        maxPax blank:false,nullable: false
        minWeight blank:false,nullable: false
        maxWeight blank:false,nullable: false
        minAge blank:false,nullable: false
        maxAge blank:false,nullable: false
        status blank:false,nullable: false
        createdAt blank:false,nullable: true
        updatedAt blank:true,nullable: true
        modifiedAt blank:true,nullable: true

    }
    static mapping = {
        table 'listing_fact'
        referenceId column: "reference_id", length: 255
        parentId column: "parent_id", length: 20
        userId column: "user_id", length: 20
        status column: "status",sqlType: "tinyInt", length: 6, defaultValue: 0
        tripGrade column: "tripGrade",sqlType: "tinyInt", length: 6, defaultValue: 0
        tripStandard column: "tripStandard",sqlType: "tinyInt", length: 6, defaultValue: 0
        daysCount column: "daysCount",sqlType: "tinyInt", length: 6, defaultValue: 0
        nightCount column: "nightCount",sqlType: "tinyInt", length: 6, defaultValue: 0
        maxCapacity column: "maxCapacity",sqlType: "tinyInt", length: 6, defaultValue: 0
        availableCapacity column: "availableCapacity",sqlType: "tinyInt", length: 6, defaultValue: 0
        minPax column: "minPax",sqlType: "tinyInt", length: 6, defaultValue: 0
        maxPax column: "maxPax",sqlType: "tinyInt", length: 6, defaultValue: 0
        minWeight column: "minWeight",sqlType: "tinyInt", length: 6, defaultValue: 0
        maxWeight column: "maxWeight",sqlType: "tinyInt", length: 6, defaultValue: 0
        minAge column: "minAge",sqlType: "tinyInt", length: 6, defaultValue: 0
        maxAge column: "maxAge",sqlType: "tinyInt", length: 6, defaultValue: 0
        createdAt column: "created_at",sqlType: "timestamp"
        updatedAt column: "updated_at",sqlType: "timestamp"
        modifiedAt column: "modified_at",sqlType: "timestamp"



    }
}
