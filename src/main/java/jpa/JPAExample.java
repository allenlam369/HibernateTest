package jpa;

import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import model.Student;

public class JPAExample {
	static private EntityManager em = EntityManagerUtil.getEntityManager();

	public static void main(String[] args) {
		JPAExample example = new JPAExample();
		Student student1 = example.saveStudent("Sumith");
//		Student student2 = example.saveStudent("Anoop");
		example.listStudent();

		em.persist(student1);

//		em.flush();

		System.out.println("After Sucessfully insertion ");

	}

	private void deleteStudent(long studentId) {
		try {
			em.getTransaction().begin();
			Student student = (Student) em.find(Student.class, studentId);
			em.remove(student);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
	}

	private void updateStudent(long studentId, String studentName) {
		try {
			em.getTransaction().begin();
			Student student = (Student) em.find(Student.class, studentId);
			student.setStudentName(studentName);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}

	}

	private void listStudent() {
		try {
			em.getTransaction().begin();
			@SuppressWarnings("unchecked")
			List<Student> Students = em.createQuery("from Student").getResultList();
			for (Iterator<Student> iterator = Students.iterator(); iterator.hasNext();) {
				Student student = (Student) iterator.next();
				System.out.println(student.toString());
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}

	}
	
	@Transactional
	private Student saveStudent(String studentName) {
		Student student = new Student();
		try {
			em.getTransaction().begin();
			student.setStudentName(studentName);
			student = em.merge(student);
			em.getTransaction().commit();
		} catch (Exception e) {
			em.getTransaction().rollback();
		}
		return student;
	}

}
