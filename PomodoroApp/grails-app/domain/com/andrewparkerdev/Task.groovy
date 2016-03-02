package com.andrewparkerdev
/** Domain class for persistant data.
* Defines information we want to be saved through a session.
* 
*/
class Task {
	String summary
	String details
	Date dateCreated
	Date deadline
	Long timeSpent = 0L

	static hasMany = [tags: Tag]


    static constraints = {
    	summary blank: false, unique: true
    	// maxSize makes the details area a textfield
    	details blank: false, maxSize: 1000 
    	// nullable default is false
    	deadline nullable: true
    	timeSpent min: 0L
    }
}
