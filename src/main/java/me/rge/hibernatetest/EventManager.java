package me.rge.hibernatetest;

import me.rge.hibernatetest.entity.Event;
import me.rge.hibernatetest.util.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: rge
 * Date: 4/22/12
 * Time: 8:52 PM
 * To change this template use File | Settings | File Templates.
 */


public class EventManager {
    public static void main(String[] args) {
        EventManager mgr = new EventManager();
        if (args[0].equals("store")) {
            mgr.createAndStoreEvent("My Event", new Date());
        } else if (args[0].equals("list")) {
            List events = mgr.listEvents();
            for (int i = 0; i < events.size(); i++) {
                Event theEvent = (Event) events.get(i);
                System.out.println(
                        "Event: " + theEvent.getTitle() + " Time: " + theEvent.getDate()
                );
            }
        }
        HibernateUtil.getSessionFactory().close();
    }


    private List listEvents() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List result = session.createQuery("from Event").list();
        session.getTransaction().commit();
        return result;
    }

    private void createAndStoreEvent(String title, Date theDate) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Event theEvent = new Event();
        theEvent.setTitle(title);
        theEvent.setDate(theDate);
        session.save(theEvent);
        session.getTransaction().commit();
    }

}