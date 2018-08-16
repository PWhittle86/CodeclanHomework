import db.DBConsole;
import db.DBGame;
import db.DBHelper;
import models.Console;
import models.Game;
import models.Genre;

import java.util.List;

public class Runner {

    public static void main(String[] args) {

        Game superMarioWorld = new Game("Super Mario World", Genre.PLATFORMER);
        DBHelper.save(superMarioWorld);

        Game mortalKombat = new Game("Mortal Kombat", Genre.FIGHTING);
        DBHelper.save(mortalKombat);

        Game fifa = new Game("Fifa 95", Genre.SPORTS);
        DBHelper.save(fifa);


        Console snes = new Console("Nintendo", "Super Nintendo", "Japan");
        DBHelper.save(snes);
        DBConsole.addGameToAvailableGames(superMarioWorld, snes);
        DBConsole.addGameToAvailableGames(mortalKombat, snes);
        DBConsole.addGameToAvailableGames(fifa, snes);

        Console megadrive = new Console("Sega", "Megadrive II", "Europe");
        DBHelper.save(megadrive);
        DBConsole.addGameToAvailableGames(mortalKombat, megadrive);
        DBConsole.addGameToAvailableGames(fifa, megadrive);

        Console playstation = new Console("Sony", "Playstation", "North America");
        DBHelper.save(playstation);
        DBConsole.addGameToAvailableGames(fifa, playstation);


        Console foundConsole = DBHelper.find(Console.class, 1);

        List<Console> consoles = DBHelper.getAll(Console.class);

        List<Game> gamesForSnes = DBConsole.getAvailableGames(playstation);

        List<Console> consolesForMK = DBGame.getAvailableConsoles(mortalKombat);
    }

}
