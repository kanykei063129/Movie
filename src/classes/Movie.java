package classes;

import interfaces.Fintable;
import interfaces.Sortable;

import java.util.*;

public class Movie implements Fintable, Sortable, Comparable<Movie> {
    private String name;
    private int year;
    private String description;
    private Director director;
    private List<Cast> castList;

    public Movie() {
    }

    public Movie(String name, int year, String description, Director director, List<Cast> castList) {
        this.name = name;
        this.year = year;
        this.description = description;
        this.director = director;
        this.castList = castList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public List<Cast> getCastList() {
        return castList;
    }

    public void setCastList(List<Cast> castList) {
        this.castList = castList;
    }

    @Override
    public String toString() {
        return "\nname = " + name +
                "\nyear = " + year +
                "\ndescription = " + description +
                "\ndirector = " + director +
                "\ncast = " + castList;
    }

    @Override
    public List<Movie> getAllMovies(List<Movie> movies) {
        return movies;
    }

    @Override
    public void MovieName(List<Movie> movies) {
        String name = new Scanner(System.in).next();
        LinkedList<Movie> movies1 = new LinkedList<>();
        for (Movie movie : movies) {
            if (movie.name.toUpperCase().contains(name.toUpperCase())) {
                movies1.add(movie);
            }
        }
        for (Movie movie : movies1) {
            System.out.println(
                    "\nname = " + movie.name +
                            "\ndirector = " + movie.director +
                            "\nyear = " + movie.year +
                            "\ndescription = " + movie.description +
                            "\ncast = " + movie.getCastList()
            );
        }
    }

    @Override
    public void MovieActor(List<Movie> movies) {
        String name = new Scanner(System.in).next();
        LinkedList<Movie> movies1 = new LinkedList<>();
        for (Movie movie : movies) {
            for (Cast cast : movie.castList) {
                if (cast.getActorFullName().toUpperCase().contains(name.toUpperCase())) {
                    movies1.add(movie);
                }
            }
        }
        for (Movie movie : movies1) {
            System.out.println(movie);
        }
    }

    @Override
    public void MovieYear(List<Movie> movies) {
        int year = new Scanner(System.in).nextInt();
        for (Movie movie : movies) {
            if (year == movie.year) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void MovieDirector(List<Movie> movies) {
        String name = new Scanner(System.in).next();
        for (Movie movie : movies) {
            if (movie.director.getName().toUpperCase().contains(name.toUpperCase()) || movie.director.getLastName().toUpperCase().equals(name.toUpperCase())) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void MovieDescription(List<Movie> movies) {
        String description = new Scanner(System.in).next();
        for (Movie movie : movies) {
            if (movie.description.toUpperCase().contains(description.toUpperCase())) {
                System.out.println(movie);
            }
        }
    }

    @Override
    public void MovieRole(List<Movie> movies) {
        String role = new Scanner(System.in).next();
        for (Movie movie : movies) {
            for (Cast cast : movie.castList) {
                if (cast.getRole().toUpperCase().contains(role.toUpperCase())) {
                    System.out.println(movie);
                }
            }
        }
    }

    @Override
    public void sortMovieName(List<Movie> movies) {
        Collections.sort(movies);
        for (Movie movie : movies) {
            System.out.println(
                    "\nname = " + movie.name +
                            "\ndirector = " + movie.director +
                            "\nyear = " + movie.year +
                            "\ndescription = " + movie.description +
                            "\ncast = " + movie.getCastList()
            );
        }
    }

    @Override
    public void sortByMovieName(List<Movie> movies) {
        movies.sort(sortMovieByNameZToA);
        for (Movie movie : movies) {
            System.out.println(
                    "\nname = " + movie.name +
                            "\ndirector = " + movie.director +
                            "\nyear = " + movie.year +
                            "\ndescription = " + movie.description +
                            "\ncast = " + movie.getCastList()
            );
        }
    }

    @Override
    public void sortYearAscending(List<Movie> movies) {
        movies.sort(sortMovieByYearAscending);
        for (Movie movie : movies) {
            System.out.println(
                    "\nyear = " + movie.year +
                            "\nname = " + movie.name +
                            "\ndirector = " + movie.director +
                            "\ndescription = " + movie.description +
                            "\ncast = " + movie.getCastList()
            );
        }
    }

    @Override
    public void sortYearDescending(List<Movie> movies) {
        movies.sort(sortMovieByYearDescending);
        for (Movie movie : movies) {
            System.out.println(
                    "\nyear = " + movie.year +
                            "\nname = " + movie.name +
                            "\ndirector = " + movie.director +
                            "\ndescription = " + movie.description +
                            "\ncast = " + movie.getCastList()
            );
        }
    }

    @Override
    public void sortDirector(List<Movie> movies) {
        movies.sort(sortByDirectorName);
        for (Movie movie : movies) {
            System.out.println(
                    "\ndirector = " + movie.director +
                            "\nname = " + movie.name +
                            "\nyear = " + movie.year +
                            "\ndescription = " + movie.description +
                            "\ncast = " + movie.getCastList()
            );
        }
    }

    public static Comparator<Movie> sortMovieByNameZToA = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.name.compareTo(o1.name);
        }
    };

    public static Comparator<Movie> sortByDirectorName = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.director.getName().compareTo(o2.director.getName());
        }
    };

    public static Comparator<Movie> sortMovieByYearAscending = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o1.year - o2.year;
        }
    };
    public static Comparator<Movie> sortMovieByYearDescending = new Comparator<Movie>() {
        @Override
        public int compare(Movie o1, Movie o2) {
            return o2.year - o1.year;
        }
    };

    @Override
    public int compareTo(Movie o) {
        return name.compareTo(o.name);
    }
}
