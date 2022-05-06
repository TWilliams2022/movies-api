# 1. go get the json file from glitch
# 2. copy paste into a new json file under /resources
-- ##################################################################


# 3. create the movies_db
create database if not exists movies_db;

use movies_db;

drop table if exists movie_genre;
drop table if exists movie_actor;
drop table if exists actors;
drop table if exists genres;
drop table if exists movies; #drop the table(s) to which no other tables are dependent
drop table if exists directors;

# 4. map the json movie properties to movies table columns
# --> start with just a movies table with all the columns found in the movie json properties

-- ##################################################################

create table if not exists directors
(
    id   int unsigned not null auto_increment primary key,
    name varchar(120)
);

describe directors;

-- ##################################################################

create table if not exists movies
(
    id       int unsigned not null auto_increment primary key,
    title    varchar(255),
    year     char(4),
    plot     text,
    poster   text,
    rating   char(1),
    director_id int unsigned not null,
    foreign key (director_id) references directors(id)
);

describe movies;

-- ##################################################################
create table if not exists genres
(
    id   int unsigned not null auto_increment primary key,
    name varchar(120)
);

describe genres;

-- ##################################################################
create table if not exists movie_genre
(
    movie_id int unsigned not null,
    genre_id int unsigned not null,
    foreign key (movie_id) references movies(id),
    foreign key (genre_id) references genres(id)

);

describe movie_genre;
-- ##################################################################
create table if not exists actors
(
    id int unsigned not null auto_increment primary key,
    name varchar(255)
);

describe actors;
-- ##################################################################

create table if not exists movie_actor
(
    movie_id int unsigned not null,
    actor_id int unsigned not null,
    foreign key (movie_id) references movies (id),
    foreign key (actor_id) references actors (id)
);

describe movie_actor;

-- ##################################################################


# create a genres table with two columns: id and name
CREATE TABLE IF NOT EXISTS genres
(
    id   INT UNSIGNED NOT NULL AUTO_INCREMENT,
    name VARCHAR(32),
    PRIMARY KEY (id)
);

-- ##################################################################

# create a many-to-many relationship b/t movies and genres
# by creating a movie_genre table.
CREATE TABLE IF NOT EXISTS movie_genres
(
    #dependencies on those 2 tables
    movie_id INT UNSIGNED NOT NULL,
    genre_id INT UNSIGNED NOT NULL,
#2 foreign keys
# --> It needs to only contain a movie_id and genre_id
# (be sure to foreign key those to their respective tables)
    FOREIGN KEY (movie_id) REFERENCES movies (id),
    FOREIGN KEY (genre_id) REFERENCES genres (id)

);

-- ##################################################################

# create create an actors table with two columns: id and name
CREATE TABLE IF NOT EXISTS actors
(
    #dependencies on those 2 tables
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
name VARCHAR(250),
PRIMARY KEY (id)
);

-- ##################################################################

# create a many-to-many relationship b/t movies and actors
# by creating movie_actor table.
CREATE TABLE IF NOT EXISTS movie_actor
(
    #dependencies on those 2 tables
    movie_id INT UNSIGNED NOT NULL,
    actor_id INT UNSIGNED NOT NULL,
    # --> It needs to only contain a movie_id and actor_id
    # (be sure to foreign key those to their respective tables)

    FOREIGN KEY (movie_id) REFERENCES movies (id),
    FOREIGN KEY (actor_id) REFERENCES actors (id)
);

# 8. Go add DROP IF EXIST statements for movies and directors
# 9. RUN IT!







