package com.codeup.fortran_movies_api.web;

public class MovieDto {


    private String title;
    private String poster;
    private String plot;
    private String rating;
    private int id;
    private String genre;

    


    public MovieDto(String title, String poster, String plot, String rating, int id, String genre) {
        this.title = title;
        this.poster = poster;
        this.plot = plot;
        this.rating = rating;
        this.id = id;
        this.genre = genre;
    }

    public MovieDto(int id, String title, String rating, String poster, String collect, String name, String plot) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
    
    public String getPlot() {
        return plot;
    }

    public void setPlot(String plot) {
        this.plot = plot;
    }


    @Override
    public String toString() {
        return "MovieDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", rating='" + rating + '\'' +
                ", poster='" + poster + '\'' +
                ", genre='" + genre + '\'' +
                ", plot='" + plot + '\'' +
                '}';
    }
}


/*
* {
      "title": "tenet",
      "rating": "5",
      "poster": "https://m.media-amazon.com/images/M/MV5BYzg0NGM2NjAtNmIxOC00MDJmLTg5ZmYtYzM0MTE4NWE2NzlhXkEyXkFqcGdeQXVyMTA4NjE0NjEy._V1_SX300.jpg",
      "year": "2020",
      "genre": "Action, Sci-Fi",
      "director": "Christopher Nolan",
      "plot": "Armed with only one word, Tenet, and fighting for the survival of the entire world, a Protagonist journeys through a twilight world of international espionage on a mission that will unfold in something beyond real time.",
      "actors": "Elizabeth Debicki, Robert Pattinson, John David Washington, Aaron Taylor-Johnson",
      "id": 3
    }
* */
