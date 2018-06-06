package com.goglides

import java.sql.Date

class BusinessCertificate {
    String referenceId
    Long parentId
    Long businessDirectoryId
    String fileType
    String fileUrl
    boolean isApproved
    int status
    Date createdAt
    Date updatedAt
    Date modifiedAt


    static constraints = {
        referenceId blank: false, nullable: false
        parentId blank: false, nullable: false
        businessDirectoryId blank: false, nullable: false
        fileType blank: false, nullable: true
        fileUrl blank: false, nullable: true
        isApproved blank: false, nullable: false
        status blank: false, nullable: false
        createdAt blank: false, nullable: true

    }
    static mapping = {
        table 'business_certificate'
        referenceId column: "reference_id", length: 255
        parentId column: "parent_id", length: 20
        businessDirectoryId column: "business_directory_id", length: 20
        fileType column: "file_type",  length: 60
        fileUrl column: "file_url",  length: 60
        createdAt column: "created_at", sqlType: "timestamp"
        updatedAt column: "updated_at", sqlType: "timestamp"
        modifiedAt column: "modified_at", sqlType: "timestamp"
    }
}