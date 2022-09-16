abstract class Fighter {

    boolean isVulnerable() {
        return false;
    }

    abstract int damagePoints(Fighter fighter);

}

class Warrior extends Fighter {
    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }

    @Override
    int damagePoints(Fighter wizard) {
        return wizard.isVulnerable() ? 10: 6;
    }
}

class Wizard extends Fighter {
    private boolean spellPrepared;

    public Wizard(){
        this.spellPrepared = false;
    }

    @Override
    boolean isVulnerable() {
        return !this.spellPrepared;
    }

    @Override
    int damagePoints(Fighter warrior) {
        return this.spellPrepared ? 12 : 3;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }

    void prepareSpell() {
        this.spellPrepared = true;
    }

}
