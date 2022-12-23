package org.example;

import org.example.model.Pupil;
import org.example.model.School;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class App {
    public static void main( String[] args ) {
        Configuration configuration = new Configuration()
                .addAnnotatedClass(Pupil.class)
                .addAnnotatedClass(School.class);
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

//        //Получаем студента из конкретной школы
//        School school = session.get(School.class,1);
//        List<Pupil> pupilList = school.getPupilList();
//        pupilList.forEach(p -> System.out.println(p.getFio()));
//
//        //Добавляем студента школе
//        School school2 = session.get(School.class,1);
//        Pupil pupil2 = new Pupil("Krasivaya Yana Palovna", "2022-01-01", "9087643",school2);
//        school2.getPupilList().add(pupil2);
//
//         //Создаем новую школу и добавляем студента
//        School school3 = new School("Best", "Samara");
//        Pupil pupil3 = new Pupil("tarakanova katerina borisovna", "2001-08-09", "5678907",school3);
//        school3.setPupilList(new ArrayList<>(Collections.singletonList(pupil3)));
//        session.save(school3);
//        session.save(pupil3);

        //Удаляем всех студентов из школы, школа остается
//        School school4 = session.get(School.class,5);
//        school4.getPupilList()
//                        .forEach(session::remove);
//        school4.getPupilList().clear();

        session.getTransaction().commit();
        sessionFactory.close();




    }



}
