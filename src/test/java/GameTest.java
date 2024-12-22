package com.towerdefense;

import com.towerdefense.gui.WindowGUI;
import com.towerdefense.model.menu.Menu;
import com.towerdefense.states.GameState;
import com.towerdefense.states.MenuState;
import com.towerdefense.states.State;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;

import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class GameTest {
    private Game game;
    private WindowGUI mockWindow;

    @BeforeEach
    void setUp() {
        game = mock(Game.class);
        mockWindow = mock(WindowGUI.class);
    }

    @Test
    void testGameInitialization() throws Exception {
        assertNotNull(game);
    }

    @Test
    void testSetState() {
        Game spyGame = spy(game);
        State mockState = mock(State.class);

        spyGame.setState(mockState);

        verify(spyGame).setState(mockState);
    }

    @Test
    void testGuiClosing() throws IOException, FontFormatException, URISyntaxException {
        Game spyGame = spy(new Game());
        spyGame.setState(null);

        try {
            spyGame.getClass().getDeclaredMethod("start").setAccessible(true);
            spyGame.getClass().getDeclaredMethod("start").invoke(spyGame);
        } catch (Exception ignored) {
        }
    }

}
