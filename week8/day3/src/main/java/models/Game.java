package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="games")
public class Game {

    private int id;
    private String title;
    private Genre Genre;
    private List<Console> availableConsoles;

    public Game(){
    }

    public Game(String title, Genre Genre) {
        this.title = title;
        this.Genre = Genre;
        this.availableConsoles = new ArrayList<Console>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name ="id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name ="title")
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name ="genre")
    public Genre getGenre() {
        return Genre;
    }
    public void setGenre(Genre Genre) {
        this.Genre = Genre;
    }

    @ManyToMany
    @JoinTable(name = "console_game",
    joinColumns = {@JoinColumn(name="game_id", nullable = false, updatable = false)}, //this looks wrong... doesn't match pirate example?
    inverseJoinColumns = {@JoinColumn(name="console_id", nullable = false, updatable = false)}) //this looks wrong... doesn't match pirate example?
    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    public List<Console> getAvailableConsoles() {
        return availableConsoles;
    }
    public void setAvailableConsoles(List<Console> availableConsoles) {
        this.availableConsoles = availableConsoles;
    }

    public void addConsoleToAvailableList(Console console){
        this.availableConsoles.add(console);
    }

}
