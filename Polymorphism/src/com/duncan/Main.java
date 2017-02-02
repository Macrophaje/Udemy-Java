package com.duncan;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A Shark eats lots of people";
    }
}

class IndepndaceDay extends Movie {
    public IndepndaceDay() {
        super("Independance Day");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over Earth";
    }
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and excape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe";
    }
}

class ForgetableMovie extends Movie {
    public ForgetableMovie() {
        super("Forgetable");
    }

    //no plot method
}

public class Main {

    public static void main(String[] args) {
        for (int i=1; i<11; i++){
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" + "Plot: " + movie.plot() + "\n");
        }
    }

    private static Movie randomMovie(){
        int randomNumber = (int) (Math.random() * 5) +1;
        System.out.println("Random number enreated was " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();

            case 2:
                return new IndepndaceDay();

            case 3:
                return new MazeRunner();

            case 4:
                return new StarWars();

            case 5:
                return new ForgetableMovie();
        }

        return null;


    }
}

















