package com.towerdefense.model.game.elements;

public class Grass extends Element {
    String[] grassArt;
    public Grass(int x, int y) {
        super(x, y);
        this.grassArt = new String[] {
                "                T~~",
                "               |",
                "              /\"\\",
                "      T~~     |'| T~~",
                "  T~~ |    T~ WWWW|",
                "  |  /\"\\   |  |  |/\\T~~",
                " /\"\\ WWW  /\"\\ |' |WW|",
                "WWWWW/\\| /   \\|'/\\|/\"\\",
                "|   /__\\/]WWW[\\/__\\WWWW",
                "|\"  WWWW'|I_I|'WWWW'  |",
                "|   |' |/  -  \\|' |'  |",
                "|'  |  |LI=H=LI|' |   |",
                "|   |' | |[_]| |  |'  |",
                "|   |  |_|###|_|  |   |",
                "'---'--'-/___\\-'--'---'"
        };
    }

    public String[] getGrassArt() {
        return grassArt;
    }
}
