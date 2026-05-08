package demo;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("student-unit");
        EntityManager em = emf.createEntityManager();

      

        em.getTransaction().begin();

        em.createQuery("DELETE FROM Student").executeUpdate();

        Student student = new Student("Amina", "BCT", 3);
        em.persist(student);
        em.getTransaction().commit();

        List<Student> students = em.createQuery(
                "SELECT s FROM Student s", Student.class
        ).getResultList();

        for (Student s : students) {
            System.out.println("Retrieved object: " + s);
        }

        em.close();
        emf.close();
    }
}
