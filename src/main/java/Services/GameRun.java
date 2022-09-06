package Services;

import DAO.EnemyRepository;
import Model.Enemy;
import Model.Item;
import Model.Player;
import UTIL.EnterToContinue;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GameRun {
    Scanner recieve = new Scanner(System.in);
    Random roll = new Random();
    SelectionService choice = new SelectionService();
    EnterToContinue eContinue = new EnterToContinue();
    WelcomeService welcome = new WelcomeService();
    List<Enemy> enemy = new ArrayList<>();
    List<Item> item = new ArrayList<>();
public void GameRun(){
    EnemyService er = new EnemyService();
    EnemyRepository badGuy = new EnemyRepository();
    Player you = new Player();
    List<Enemy> bdguy = new ArrayList<>();
    bdguy.add(new Enemy("rabbit", 10, 1, 10, 5, 75));
    bdguy.add(new Enemy("snake", 15, 1, 15, 15, 20));
    bdguy.add(new Enemy("opossum", 30, 2, 20, 20, 50));
    bdguy.add(new Enemy("fox", 80, 2, 25, 30, 50));


    boolean running = true;
    welcome.WelcomeService();

   GAME:
   while(running){
    int nmbr = roll.nextInt(bdguy.size());
    String enemy = bdguy.get(nmbr).name;
    int eHP = bdguy.get(nmbr).id;
    int eDamage = bdguy.get(nmbr).dealDamage;
    System.out.println("!! > A "+enemy+", foaming at the mouth charges");
    //If the enemy is still alive we need to loop till enemy dies
       while(eHP > 0){
           System.out.println("\t>Your Hp = "+you.);
       }
   }










    }

}

