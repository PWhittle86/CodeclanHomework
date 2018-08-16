package db;

import models.Console;
import models.Game;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class DBConsole {

    private static Transaction transaction;
    private static Session session;

    public static void addGameToAvailableGames(Game game, Console console){
        console.addGameToAvailableList(game);
        game.addConsoleToAvailableList(console);
        DBHelper.update(console);
    }

    public static List<Game> getAvailableGames(Console console){
        session = HibernateUtil.getSessionFactory().openSession();
        List<Game> results = null;

        try{
            Criteria cr = session.createCriteria(Game.class);
            cr.createAlias("availableConsoles", "console");
            cr.add(Restrictions.eq("console.id", console.getId()));
            results = cr.list();
        }catch(HibernateException e){
            e.printStackTrace();
        }finally{
            session.close();
        }
        return results;
    }


}
