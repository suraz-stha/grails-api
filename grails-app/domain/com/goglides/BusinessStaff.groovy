package com.goglides

import java.sql.Date

class BusinessStaff {
    Long userId
    Long businessDirectoryId
    String role
    boolean isOwner
    int status
    Date createdAt
    Date updatedAt
    Date modifiedAt

    static constraints = {
        userId blank: false, nullable: false
        businessDirectoryId blank: false, nullable: false
        role blank: false, nullable: true
        isOwner blank: false, nullable: true
        status blank: false, nullable: false
        createdAt blank: false, nullable: true
        updatedAt blank:true,nullable: true
        modifiedAt blank:true,nullable: true
    }
    static mapping = {
        table 'business_staff'
        businessDirectoryId column: "businessDirectoryId", length: 60
        role column: "role", length: 255
        businessDirectoryId column: "business_directory_id", length: 20
        status column: "status", sqlType: "tinyint", length: 6
        createdAt column: "created_at", sqlType: "timestamp"
        updatedAt column: "updated_at", sqlType: "timestamp"
        modifiedAt column: "modified_at", sqlType: "timestamp"
    }
}
