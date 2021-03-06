package com.froy.magicalitem.dao;

// THIS CODE IS GENERATED BY greenDAO, EDIT ONLY INSIDE THE "KEEP"-SECTIONS

// KEEP INCLUDES - put your custom includes here
// KEEP INCLUDES END
/**
 * Entity mapped to table CATEGORIES.
 */
public class Categories {

    private Long id;
    /** Not-null value. */
    private String categoryName;

    // KEEP FIELDS - put your custom fields here
    // KEEP FIELDS END

    public Categories() {
    }

    public Categories(Long id) {
        this.id = id;
    }

    public Categories(Long id, String categoryName) {
        this.id = id;
        this.categoryName = categoryName;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /** Not-null value. */
    public String getCategoryName() {
        return categoryName;
    }

    /** Not-null value; ensure this value is available before it is saved to the database. */
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    // KEEP METHODS - put your custom methods here
    // KEEP METHODS END

}
