package com.mbuke;


class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    public String plot(){
        return "No plot here";
    }
    public String getName() {
        return name;
    }
}

class SocialNetwork extends  Movie{
    public SocialNetwork() {
        super("The social network");
    }

    @Override
    public String plot() {
        return "computer geek starts new social networking site";
    }
}

class WarDogs extends  Movie{
    public WarDogs() {
        super("The war dogs");
    }

    @Override
    public String plot() {
        return "Two twenty year old men make money from gun running";
    }
}

class Luka extends  Movie{
    public Luka() {
        super("luka");
    }
    
}

public class Main {

    public static void main(String[] args) {
	for (int i = 0; i < 10; i++ ){
	    Movie movie = randomMovie();
        System.out.println(
                "movie #" + 1 + movie.getName() + "\n" +
                "plot : " + movie.plot() + "\n"
        );
    }
    }

    public static Movie randomMovie(){
        int randomNumber = (int)(Math.random() * 3) + 1;

        System.out.println("Number generated: " + randomNumber);

        switch (randomNumber){
            case 1:
                return new Luka();
            case 2:
                return new SocialNetwork();
            case 3:
                return new WarDogs();
        }
        return null;
    }
}
