package pokedex;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import java.util.ArrayList;

public class Pokedex {

    private static ArrayList<String> pokemonNames = new ArrayList<>();
    private static ArrayList<String> pokemonTypes = new ArrayList<>();

    private int currentPokemon;

    private StringProperty displayedName = new SimpleStringProperty();
    private StringProperty displayedType = new SimpleStringProperty();

    Pokedex() {
        addPokemon();
        currentPokemon = 0;
        updateProperties();
    }

    public void next() {
        if (currentPokemon < pokemonNames.size() -1) {
            currentPokemon++;
        }
        else {
            currentPokemon = 0;
        }
        updateProperties();
    }

    public void previous() {
        if (currentPokemon > 0) {
            currentPokemon--;
        }
        else {
            currentPokemon = pokemonNames.size() -1;
        }
        updateProperties();
    }

    public StringProperty displayedNameProperty() {
        return displayedName;
    }

    public StringProperty displayedTypeProperty() {
        return displayedType;
    }

    private void updateProperties() {
        displayedName.setValue(pokemonNames.get(currentPokemon));
        displayedType.setValue(pokemonTypes.get(currentPokemon));
    }

    private void addPokemon() {
        pokemonNames.add("#1 Bulbasaur");
        pokemonNames.add("#2 Ivysaur");
        pokemonNames.add("#3 Venusaur");
        pokemonNames.add("#4 Charmander");
        pokemonNames.add("#5 Charmeleon");
        pokemonNames.add("#6 Charizard");
        pokemonNames.add("#7 Squirtle");
        pokemonNames.add("#8 Wartortle");
        pokemonNames.add("#9 Blastoise");
        pokemonTypes.add("Grass/Poison");
        pokemonTypes.add("Grass/Poison");
        pokemonTypes.add("Grass/Poison");
        pokemonTypes.add("Fire");
        pokemonTypes.add("Fire");
        pokemonTypes.add("Fire/Flying");
        pokemonTypes.add("Water");
        pokemonTypes.add("Water");
        pokemonTypes.add("Water");
    }
}
