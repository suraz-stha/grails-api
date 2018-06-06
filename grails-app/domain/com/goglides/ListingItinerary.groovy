package com.goglides

import java.sql.Date

class ListingItinerary {
    String referenceId
    Long parentId
    Long userId
    Long businessDirectoryId
    Long listingId
    String title
    String description
    String status
    Date createdAt
    Date updatedAt
    Date modifiedAt


    static constraints = {
        referenceId blank:false,nullable: false
        parentId blank:false,nullable: false
        userId blank:false,nullable: false
        businessDirectoryId blank:false,nullable: false
        description blank:false,nullable: false
        listingId blank:false,nullable: false
        status blank:false,nullable: false
        createdAt blank:false,nullable: true
        updatedAt blank:true,nullable: true
        modifiedAt blank:true,nullable: true
    }
    static mapping = {
        table 'listing_itinerary'
        referenceId column: "reference_id", length: 255
        parentId column: "parent_id", length: 255
        userId column: "user_id", length: 20
        businessDirectoryId column: "business_directory_id", length: 20
        listingId column: "listing_id", length: 20
        description column: "description",sqlType: "text"
        status column: "status",sqlType: "tinyInt", length: 6, defaultValue: 0
        createdAt column: "created_at",sqlType: "timestamp"
        updatedAt column: "updated_at",sqlType: "timestamp"
        modifiedAt column: "modified_at",sqlType: "timestamp"



    }
}
