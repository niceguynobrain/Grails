package com.andrewparkerdev

class Task {
	String summary
	String details
	Date dateCreated
	Date deadline
	Long timeSpent = 0L

	static hasMany = [tags: Tag]

    static constraints = {
    	summary blank: false, unique: true
    	details blank: false
    	deadline nullable: true
    	timeSpent min: 0L
    }
}
