package week3.day1;

public class Students {
	// creating method with name studentInfo
		public void studentInfo(int id) {

			System.out.println("The id is " + id);
		}

		// overloading method
		public void studentinfo(int id, String name) {

			System.out.println("Id :  " + id + " and Name : " + name);

		}

		// overloading method 
		public void studentInfo(String emailid, long phoneNumber) {
			System.out.println("Emailid : " + emailid + " and Phone : " + phoneNumber);
		}
		
		public static void main(String[] args) {

			// Object declaration for class
			Students students = new Students();

			students.studentInfo(107);
			students.studentinfo(107, "Rebecca");
			students.studentInfo("testemail@gmail.com", 991110008);

		}
}
