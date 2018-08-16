package models;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "films")
public class Film {

    private int id;
    private String title;
    private Genre genre;
    private Director director;
    private Studio studio;
    private List<Actor> actors;


    public Film() {
    }

    public Film(String title, Genre genre, Director director, Studio studio) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.studio = studio;
        this.actors = new ArrayList<Actor>();
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    @Enumerated(value = EnumType.STRING)
    public Genre getGenre() {
        return genre;
    }
    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @ManyToOne
    @JoinColumn(name = "studio_id", nullable = false)
    public Studio getStudio() {
        return studio;
    }
    public void setStudio(Studio studio) {
        this.studio = studio;
    }

    @ManyToOne
    @JoinColumn(name = "director_id", nullable = false)
    public Director getDirector() {
        return director;
    }
    public void setDirector(Director director) {
        this.director = director;
    }

    @Cascade(org.hibernate.annotations.CascadeType.SAVE_UPDATE)
    @ManyToMany
    @JoinTable(name = "film_actor",
    joinColumns = {@JoinColumn(name = "film_id", nullable = false, updatable = false)},
    inverseJoinColumns = {@JoinColumn(name="actor_id", nullable = false, updatable = false)})
    public List<Actor> getActors() {return actors;}
    public void setActors(List<Actor> actors) {this.actors = actors;}

    public void addActor(Actor actor){
        this.actors.add(actor);
    }

    public void payActor(Studio studio, Actor actor, Double cash){
        studio.setBudget((studio.getBudget() - cash));
        actor.setWallet((actor.getWallet() + cash));
    }

}
