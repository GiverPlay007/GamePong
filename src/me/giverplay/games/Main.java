package me.giverplay.games;

import me.giverplay.games.menu.GameMenu;

public class Main
{
  private static GameMenu game;

  public static void main(String[] args)
  {
    game = new GameMenu();
  }

  public static GameMenu getMenu()
  {
    return game;
  }
}
