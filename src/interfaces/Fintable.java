package interfaces;

import classes.Movie;

import java.util.List;

public interface Fintable {
    List<Movie>getAllMovies(List<Movie>movies);
    void MovieName(List<Movie> movies);
    void MovieActor(List<Movie>movies);
    void MovieYear(List<Movie>movies);
    void MovieDirector(List<Movie>movies);
    void MovieDescription(List<Movie>movies);
    void MovieRole(List<Movie>movies);
}
