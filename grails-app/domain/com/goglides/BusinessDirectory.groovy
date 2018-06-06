package com.goglides

import java.sql.Date

class BusinessDirectory {
    String referenceId
    Long parentId
    Long userId
    String businessName
    String slug
    String businessType
    String email
    String phone1
    String phone2
    String fax
    String address
    String city
    String country
    double latitude
    double longititude
    String description
    String logoUrl
    String website
    String metaKeyword
    String metaDescription
    boolean isVerified
    boolean isClamaible
    boolean isVisible
    String contactPersonJobTitle
    String contactPersonName
    String contactPersonEmail
    String contactPersonMobile
    String facebookUrl
    String twitterUrl
    String googlePlusUrl
    String linkedInUrl
    int status
    Date createdAt
    Date updatedAt
    Date modifiedAt

    static constraints = {

        referenceId blank:false,nullable: false
        parentId blank:false,nullable: false
        userId blank:false,nullable: false
        businessName blank:false,nullable: false
        slug blank:false,nullable: false
        businessType blank:false,nullable: false
        email blank:false,nullable: false
        phone1 blank:false,nullable: false
        phone2 blank:true,nullable: false
        address blank:false,nullable: false
        city blank:false,nullable: false
        fax blank:true,nullable: true
        country blank:false,nullable: false
        latitude blank:true,nullable: true
        longititude blank:true,nullable: true
        description blank:false,nullable: false
        logoUrl blank:false,nullable: false
        website blank:true,nullable: true
        metaKeyword blank:true,nullable: true
        longititude blank:true,nullable: true
        metaDescription blank:true,nullable: true
        isVerified blank:false,nullable: true
        isClamaible blank:false,nullable: true
        isVisible blank:false,nullable: true
        contactPersonJobTitle blank:true,nullable: true
        contactPersonName blank:true,nullable: true
        contactPersonEmail blank:true,nullable: true
        contactPersonMobile blank:true,nullable: true
        contactPersonMobile blank:true,nullable: true
        facebookUrl blank:true,nullable: true
        twitterUrl blank:true,nullable: true
        googlePlusUrl blank:true,nullable: true
        linkedInUrl blank:true,nullable: true
        status blank:true,nullable: true
        createdAt blank:false,nullable: true
        updatedAt blank:true,nullable: true
        modifiedAt blank:true,nullable: true

    }


    static mapping = {
        table 'business_directory'
        referenceId column: "reference_id", length: 255
        parentId column: "parent_id", length: 255
        userId column: "user_id", length: 20
        longititude column: "longititude",sqlType: "double"
        description column: "description",sqlType: "text"
        latitude column: "latitude",sqlType: "double"
        status column: "status",sqlType: "tinyInt", length: 6, defaultValue: 0
        createdAt column: "created_at",sqlType: "timestamp"
        updatedAt column: "updated_at",sqlType: "timestamp"
        modifiedAt column: "modified_at",sqlType: "timestamp"



    }


}
