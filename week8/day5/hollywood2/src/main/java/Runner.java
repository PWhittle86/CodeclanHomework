import db.DBActor;
import db.DBFilm;
import db.DBHelper;
import models.*;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Director cameron = new Director("James Cameron");
        DBHelper.save(cameron);

        Director carpenter = new Director("John Carpenter");
        DBHelper.save(carpenter);


        Studio fox = new Studio("20th Century Fox", 2000000.00);
        DBHelper.save(fox);

        Studio paramount = new Studio("Paramount", 1000000.00);
        DBHelper.save(paramount);


        Film predator = new Film("The Terminator", Genre.ACTION, cameron, fox);
        DBHelper.save(predator);

        Film trueLies = new Film("True Lies", Genre.ACTION, cameron, fox);
        DBHelper.save(trueLies);

        Film theThing = new Film("The Thing", Genre.HORROR, carpenter, fox);
        DBHelper.save(theThing);

        Film bigTroubleLittleChina = new Film("Big Trouble In Little China", Genre.ACTION, carpenter, paramount);
        DBHelper.save(bigTroubleLittleChina);


        Actor arnie = new Actor("Arnold Schwarzenegger", 50000.00);
        DBHelper.save(arnie);

        Actor kurt = new Actor("Kurt Russell", 60000.00);
        DBHelper.save(kurt);

        DBActor.addActorToFilm(arnie, predator);
        DBActor.addActorToFilm(arnie, trueLies);
        DBActor.addActorToFilm(kurt, theThing);
        DBActor.addActorToFilm(kurt, bigTroubleLittleChina);

        List<Actor> predatorStars = DBActor.getActorsFromFilm(predator);
        List<Director> cameronFilms = DBFilm.listDirectorsFilms(cameron);
        List<Studio> foxFilms = DBFilm.listStudiosFilms(fox);

        DBFilm.payActor(predator, fox, arnie, 10000.00);
        List<Film> kurtsHorrorFilms = DBActor.getActorFilmsByGenre(kurt, Genre.HORROR);


    }
}
