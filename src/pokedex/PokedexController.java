package pokedex;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.text.Text;

public class PokedexController {

    private Pokedex pokedex = new Pokedex();

    @FXML private Text nameTxt;
    @FXML private Text typeTxt;

    @FXML private void initialize() {
        nameTxt.textProperty().bind(pokedex.displayedNameProperty());
        typeTxt.textProperty().bind(pokedex.displayedTypeProperty());
    }

    @FXML
    private void handleNext(ActionEvent event) {
        pokedex.next();
    }

    @FXML
    private void handlePrevious(ActionEvent event) {
        pokedex.previous();
    }
}
