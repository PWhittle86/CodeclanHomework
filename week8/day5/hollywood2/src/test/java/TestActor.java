import models.*;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestActor {

    Film film;
    Actor actor;
    Director director;
    Studio studio;

    @Before
    public void setUp() throws Exception {
        actor = new Actor("Geoff Goldblum", 50000.00);
        director = new Director("Stephen Spielberg");
        studio = new Studio("Amblin Entertainment", 1000000.00);
        film = new Film("Jurassic Park", Genre.ADVENTURE, director, studio);
    }

    @Test
    public void actorHasName(){
        assertEquals("Geoff Goldblum", actor.getName());
    }

//    @Test
//    public void canAddActorToFilm(){
//        actor.addFilm(film);
//
//        assertEquals();
//    }

}
