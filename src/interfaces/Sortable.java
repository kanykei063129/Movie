package interfaces;

import classes.Movie;

import java.util.List;

public interface Sortable {
    void sortMovieName(List<Movie> movies);
    void sortByMovieName(List<Movie> movies);
    void sortYearAscending(List<Movie> movies);
    void sortYearDescending(List<Movie> movies);
    void sortDirector(List<Movie> movies);
}
