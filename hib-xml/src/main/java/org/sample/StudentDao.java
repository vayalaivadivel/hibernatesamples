/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.sample;

import org.hibernate.Session;

/**
 *
 * @author VADIVEL P M
 */
public class StudentDao {

    public void save() {
        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
            session.beginTransaction();
            session.save(new Student("Raja", 10));
            session.save(new Student("Rani", 11));
            session.getTransaction().commit();
            System.out.println("Student Record saved successfully...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
