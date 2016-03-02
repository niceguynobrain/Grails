package com.andrewparkerdev

class Tag {
	String name

	static hasMany = [tasks: Task]
	static belongsTo = com.andrewparkerdev.Task

    static constraints = {
    	name blank: false, unique: true

    }

    // override the toString method
    // this returns the name of the tag instead of the full path
    String toString() { return name }

}

