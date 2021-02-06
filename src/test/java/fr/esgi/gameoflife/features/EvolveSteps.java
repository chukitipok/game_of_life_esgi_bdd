package fr.esgi.gameoflife.features;

import fr.esgi.gameoflife.model.Grid;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.assertj.core.api.Assertions;

public class EvolveSteps {

    private Grid grid;

    public EvolveSteps() {}

    @Given("The following population")
    public void theFollowingPopulation(DataTable table) {
        this.grid = new Grid(table.asLists());
    }

    @When("Evolving to the next generation")
    public void evolvingToTheNextGeneration() {
        this.grid.evolve();
    }

    @Then("The new population should be")
    public void theNewPopulationShouldBe(DataTable table) {
        final var expectedGrid = new Grid(table.asLists());

        for (int i = 0; i < expectedGrid.getRows(); i++) {
            for (int j = 0; j < expectedGrid.getColumns(); j++) {
                Assertions.assertThat(expectedGrid.cells.get(i).get(j).isAlive == this.grid.cells.get(i).get(j).isAlive);
            }
        }
    }
}
