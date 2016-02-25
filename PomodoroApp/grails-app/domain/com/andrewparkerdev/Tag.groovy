package com.andrewparkerdev

class Tag {
	String name

	static hasMany = [tasks: Task]
	static belongsTo = com.andrewparkerdev.Task

    static constraints = {
    	name blank: false, unique: true

    }
}
