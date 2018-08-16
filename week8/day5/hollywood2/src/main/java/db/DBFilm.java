package db;

import models.Actor;
import models.Director;
import models.Film;
import models.Studio;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBFilm {

    private static Transaction transaction;
    private static Session session;


    public static List<Director> listDirectorsFilms(Director director){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Director> results = null;

        try{
            Criteria cr = session.createCriteria(Film.class);
            cr.add(Restrictions.eq("director.id", director.getId()));
            results = cr.list();
        }catch(HibernateException e){
            e.printStackTrace();;
        }finally{
            session.close();
        }
        return results;
    }

    public static List<Studio> listStudiosFilms(Studio studio){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Studio> results = null;

        try{
            Criteria cr = session.createCriteria(Film.class);
            cr.add(Restrictions.eq("studio.id", studio.getId()));
            results = cr.list();
        }catch(HibernateException e){
            e.printStackTrace();;
        }finally{
            session.close();
        }
        return results;
    }

    public static void payActor (Film film, Studio studio, Actor actor, Double fee){

        film.payActor(studio, actor, fee);
        DBHelper.update(studio);
        DBHelper.update(actor);

    }




}
