package com.andrewparkerdev

/** The core of most Grails applications is the domain model, which represents 
the persistent data of the application. 
Persistence refers to the characteristic of state that outlives the process
that created it. This is achieved in practice by storing the state as data
in computer data storage */
class Book {
// when we save an instance of Book , its title and author are persisted to the
// database, this is automated.
     String title
     String author



// what's the constraints property about? That allows you to specify validation
// requirements for the properties of your domain class.
    static constraints = {         
    // neither title nor author can be blank
	         title(blank: false)
	         author(blank: false)
	 }


}
