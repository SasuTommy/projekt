package Views;

import Ships.Field;

public class View  implements IView{

    @Override
    public void initMessage() {
        System.out.println("========= gra się zaczyna ! ========");
    }

    @Override
    public void finalScore(int shotsFired) {
        System.out.println("Score final: " + shotsFired + " shots");
    }

    @Override
    public void printField(Field f) {
        System.out.println(f);
    }

    @Override
    public void exitMessage() {
        System.out.println("Zamknij program");
    }

    @Override
    public void playAgain(String y, String n) {
        System.out.print("Powtórna rozgrywka ? '" + y + "' lub '" + n + "': ");
    }
    @Override
    public void invalidOption() {
        System.out.println("Niewłaściwy input. Jeszcze raz .");
    }

    @Override
    public void enterShot() {
        System.out.println("Wpisz numer wiersza i kolumny (5,5) (oddziel przecinkiem) : ");
    }

    @Override
    public String invalidShot() {
        return "Nieprawidłowe współrzędne. Jeszcze raz ";
    }

    @Override
    public String invalidCharacters() {
        return "Nieprawidłowe współrzędne. Jeszcze raz";
    }

    @Override
    public String invalidShotRange(int gridLength) {
        return "Zakres współrzędnych 0-9" + gridLength + " jeszcze raz";
    }

    @Override
    public String userAffirmative() {
        return "y";
    }

    @Override
    public String userNegative() {
        return "n";
    }

    @Override
    public void printErrorMessage(IllegalArgumentException e) {
        System.out.println(e.getMessage());
    }
}
