package kampOdev2;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course();
		course1.id =1;
		course1.name = "java" ;
		course1.teacherName = "engin demirog";
		course1.lessonTime = 2.5;
		
		
		Course course2 = new Course();
		course2.id =2;
		course2.name = "c#" ;
		course2.teacherName = "metin keskin";
		course2.lessonTime = 4;
		
		Course [] courses = {course1, course2};
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		Category category1 = new Category();
		category1.id =1;
		category1.name ="dersler";
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
	}

}
