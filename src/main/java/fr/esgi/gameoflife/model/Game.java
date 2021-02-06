package fr.esgi.gameoflife.model;

public class Game {

    private final Grid grid;

    public Game(final Grid grid) {
        this.grid = grid;
    }

    public void play() {
        this.grid.evolve();
    }
}
