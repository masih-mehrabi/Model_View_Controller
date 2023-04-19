package model_view_controller.controller;

import model_view_controller.model.Course;
import model_view_controller.view.CourseDetailView;
import model_view_controller.view.CourseListView;

public class Controller {

	private CourseListView courseListView;
	
	//TODO: Implement saveCourse(...). This method should add the course to the list view and notify the observers

	//TODO: Implement selectCourse(...)
	
	
	public void saveCourse(Course course) {
		courseListView.addCourse(course);
		course.notifyObservers();
	}
	
	public void selectCourse(Course course) {
		//TODO instantiate and use this CourseDetailView in selectCourse do NOT make this a local variable
		CourseDetailView courseDetailView = new CourseDetailView(this, course);
	courseDetailView.show();
	}
	public void setCourseListView(CourseListView courseListView) {
		this.courseListView = courseListView;
	}

}
