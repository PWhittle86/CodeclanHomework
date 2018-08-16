package db;

import models.Console;
import models.Game;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBGame {

    private static Transaction transaction;
    private static Session session;

    public static void addConsoleToAvailableList(Console console, Game game){

        game.addConsoleToAvailableList(console);
        console.addGameToAvailableList(game);
        DBHelper.update(game);
    }

    public static List<Console> getAvailableConsoles(Game game){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Console> results = null;

        try{
            Criteria cr = session.createCriteria(Console.class);
            cr.createAlias("availableGames", "game");
            cr.add(Restrictions.eq("game.id", game.getId()));
            results = cr.list();
        }catch(HibernateException e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return results;
    }


}
