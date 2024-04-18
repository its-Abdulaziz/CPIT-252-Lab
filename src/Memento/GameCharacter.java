package Memento;

public class GameCharacter {
    private int powerLevel = 0;

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
        System.out.println("Character Power Level: " + powerLevel);
    }

    public CharacterMemento save() {
        return new CharacterMemento(powerLevel);
    }

    public void restoreFormMemento(CharacterMemento memento) {
        powerLevel = memento.getPowerLevel();
        System.out.println("Restore Power Level: " + powerLevel);
    }
}
