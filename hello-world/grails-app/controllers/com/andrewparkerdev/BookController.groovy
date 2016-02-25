package com.andrewparkerdev 
/**	Controllers are central to generating your user interface or
providing a programmatic REST interface. They typically handle the web requests
that come from a browser or some other client and you'll find that each URL of
your application is usually handled by one controller.

Grails provides a feature called scaffolding that automatically creates a user
interface for a domain class that allows you create new instances, modify them,
and delete them. Enabling scaffolding is very straightforward.*/

// A Controller for the Domain Class  
class BookController { 
     def scaffold = Book
}
