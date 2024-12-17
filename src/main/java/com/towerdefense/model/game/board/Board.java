package com.towerdefense.model.game.board;

import com.towerdefense.model.Position;
import com.towerdefense.model.game.elements.*;
import com.towerdefense.model.game.elements.enemies.Enemy;
import com.towerdefense.model.game.elements.towers.Tower;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private final int width;
    private final int height;
    private Castle castle;
    private TowerShop towerShop;
    private List<Tower> towers;
    private List<Path> paths;    private
    List<Enemy> enemies;
    private List<Grass> grasses;
    private Cursor cursor;
    private List<Sea> seas;
    private Warning warning;

    public Board(int width, int height) {
        this.width = width;
        this.height = height;
        this.castle = new Castle(90,18);
        this.towerShop = new TowerShop(114, 0);
        this.towers = new ArrayList<>();
        this.cursor = new Cursor(36, 5);
        this.warning = new Warning(118,6, " ",0);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }


    public void setTowers(List<Tower> towers) { this.towers = towers; }

    public List<Tower> getTowers() {
        return towers;
    }

    public List<Enemy> getEnemies() {
        return enemies;
    }

    public boolean isEnemy (Position position) {
        for (Enemy enemy : enemies)
            if (enemy.getPosition().equals(position))
                return true;
        return false;
    }

    public Castle getCastle() {
        return castle;
    }

    public List<Path> getPath() {
        return paths;
    }

    public void setPath (List<Path> paths) {
        this.paths = paths;
    }

    public List<Grass> getGrass() {
        return grasses;
    }

    public void setGrass (List<Grass> grasses) {
        this.grasses = grasses;
    }

    public List<Sea> getSea() {
        return seas;
    }

    public void setSea (List<Sea> seas) {
        this.seas = seas;
    }

    public void setWarning (Warning warning) { this.warning = warning; }

    public TowerShop getTowerShop() {
        return towerShop;
    }

    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }

    public Cursor getCursor() {
        return cursor;
    }

    public Warning getWarning() {
        return warning;
    }
}
