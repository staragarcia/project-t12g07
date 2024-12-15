package com.towerdefense.model.menu;

import java.util.Arrays;
import java.util.List;

public class GameOver {
    private final List<String> title;
    private final String entry;

    public GameOver() {
        this.title = Arrays.asList(
                " #####     ##     ##   ##  #######            #####   ##   ##  #######  ######",
                "##  ##    ####    ### ###  ##  ###           ##  ##   ##   ##  ##  ###  ##  ###",
                "##   #   ##  ##   #######  ##   ##           ##  ###   ##  ##  ##   ##  ###  ##",
                "##       #######  ## # ##  ###               ##   ##   ## ##   ###      ######",
                "## ###   ##  ###  ##   ##  ####              ###  ##   ## ##   ####     ## ##",
                "### ##   ### ###  ###  ##  ##   ##            ##  ##   #####   ##   ##  ### ##",
                " #####   ### ###  ###  ##  #######            #####     ###    #######  ###  ##"
        );
        this.entry = "Press Enter to return to Menu";
    }
    public String getTitle(int i){
        return title.get(i);
    }
    public int getTitleSize(){
        return this.title.size();
    }
    public String getEntry() {
        return entry;
    }

}