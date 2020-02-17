package com.capg.practice;

public class Details {

	public static void main(String[] args) {

		Student obj = new Student();
		obj.setSid(121);
		obj.setMarks(60);
		obj.setSname("akhil");
		/*
		 * if(obj.getMarks()<70) { try { throw new StudentFailException("Student fail");
		 * } catch(StudentFailException e) { System.err.println(e); } } else {
		 * System.out.println("Student passed"); }
		 */
		String name = obj.getSname();
		int length = name.length();
		if (name.matches("[a-z]+") && length <= 5) {
			try {
				throw new StudentFailException("Student fail");
			} catch (StudentFailException e) {
				System.err.println(e);
			}
		} else {
			System.out.println("passed");
		}
	}

}
