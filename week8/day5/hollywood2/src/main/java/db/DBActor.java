package db;

import models.Actor;
import models.Film;
import models.Genre;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBActor {

    private static Transaction transaction;
    private static Session session;


    public static void addActorToFilm(Actor actor, Film film){
        actor.addFilm(film);
        film.addActor(actor);
        DBHelper.update(actor);
    }

    public static List<Actor> getActorsFromFilm(Film film){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Actor> results = null;

        try{
            Criteria cr = session.createCriteria(Actor.class);
            cr.createAlias("films", "film");
            cr.add(Restrictions.eq("film.id", film.getId()));
            results = cr.list();
        }catch(HibernateException e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return results;
    }

    public static List<Film> getActorFilmsByGenre(Actor actor, Genre genre){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Film> results = null;

        try{
            Criteria cr = session.createCriteria(Film.class);
            cr.createAlias("actors", "actor");
            cr.add(Restrictions.eq("actor.id", actor.getId()));
            cr.add(Restrictions.eq("genre", genre));
            results = cr.list();
        }catch(HibernateException e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return results;
    }

}
