package kg.geektech.game.players;

public class Magic extends Hero {
    private int boostedDamage;

    public Magic(int health, int damage) { super(health, damage, SuperAbility.BOOST);
    }

    
    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        int damageBoostedTimes = 0;
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0 && this != heroes[i]) ;{
                if (damageBoostedTimes == 2) {
                    heroes[i].setDamage(heroes[i].getDamage() + this.boostedDamage);
                    damageBoostedTimes++;
                } else {
                    heroes[i].setDamage(heroes[i].getDamage());

                }
            }

        }


    }
}
