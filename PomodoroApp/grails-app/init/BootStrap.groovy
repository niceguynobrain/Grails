import com.andrewparkerdev.Tag
import com.andrewparkerdev.Task

class BootStrap {

    def init = { servletContext ->
    	def workTag = new Tag(name: "Work").save(failOnError: true)
    	// failOnError throws an exception if the domain instance doesnt 
    	// validate. 
    	def homeTag = new Tag(name: "Home").save(failOnError: true) 

    	def task = new Task(
    		summary: "Finish Lession One",
    		details: "Get the the end of lesson one and everything will be all right!")
    	task.addToTags(workTag)
    	task.addToTags(homeTag)
    	task.save(failOnError: true) 
    }
    def destroy = {
    }
}
