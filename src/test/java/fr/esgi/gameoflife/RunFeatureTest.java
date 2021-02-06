package fr.esgi.gameoflife;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/fr/esgi/gameoflife/features"},
        glue = {"fr.esgi.gameoflife.features"},
        tags = "not @wip"
)
public class RunFeatureTest {
}
