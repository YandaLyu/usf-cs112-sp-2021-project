package SchoolDemo1;


import SchoolDemo.FirePokemon;
import SchoolDemo.WaterPokmon;

public class TestPokemon {
    public static void main(String[] args) {
        FirePokemon f = new FirePokemon();
        f. makeFire();
        f.jump();

        WaterPokmon w = new WaterPokmon();
        w.makeWater();
        w.swim();

        if (f instanceof FirePokemon) {
            FirePokemon firePokemon = (FirePokemon) f;
            firePokemon.makeFire();
        }

    }

}
