package BASE_LOGIC;

public class BaseLogic {
    /*
    package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //take in user input by recieve.
        Scanner recieve = new Scanner(System.in);
        //random number through a roll
        Random roll = new Random();

        //Variables to use in our game                                     monty python rabbit, etc,
        String[] monsters = {"Witch", "Zombie", "Vampire", "Warewolf"}; // tiers with famous named animals
        int maxEnemyHealth = 100;
        int maxEnemyAttack = 25;

        //Variables for Player
        int health = 100;
        int maxPlayerAttackDamage = 30;
        int numHealthPots = 3;
        int healFromPot = 35;
        int healthPotDropRate = 30; //percent

        //boolean for game features
        boolean running = true;

        System.out.println("\tWelcome to the dungeon");

        GAME:
        while(running){
            //border to contain messages
            System.out.println("*************************************************");
            int enemyHealth = roll.nextInt(maxEnemyHealth);
            String enemy = monsters[roll.nextInt(monsters.length)];
            System.out.println("\t# " +enemy+ " appeared!! #\n");

            //while the enemy is alive we need to continue to fight
            while(enemyHealth>0){
                System.out.println("\t Your HP: " + health);
                System.out.println("\t "+enemy+"'s HP: "+ enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. attack!!!");
                System.out.println("\t2. Use healing potion to recover "+healFromPot+" health.");
                System.out.println("\t3. Run!!!");
                System.out.println("\t4. Exit game...");

                String input = recieve.nextLine();
                if (input.equals("1")){
                    int damageDelt = roll.nextInt(maxPlayerAttackDamage);
                    int damageTaken = roll.nextInt(maxEnemyAttack);

                    enemyHealth -= damageDelt;
                    health -= damageTaken;

                    System.out.println("\t> You delt "+damageDelt+" damage to "+enemy);
                    System.out.println("\t> "+enemy+" delt "+damageTaken+" to you");

                    if(health<1){
                        System.out.println("\t!!!Sadly you have taken too much damage!!!");
                        break;
                    }

                }else if(input.equals("2")){
                    if(numHealthPots>0){
                        health+=healFromPot;
                        numHealthPots--;
                        System.out.println("\t> You drank a health potion, you heal "+healFromPot+" health." +"\n\t You now have "+health+" HP."+"\n\t You have "+numHealthPots+" Health potions left.");
                    }else{
                        System.out.println("\t>You have "+numHealthPots+" left!! Defeat enemies to get more");
                    }

                }
                else if(input.equals("3")){
                    System.out.println("\t You run away from the "+enemy+"!!");
                    continue GAME;

                }
                else if(input.equals("4")){

                    break GAME;

                }else{
                    System.out.println("\tInvalid Response. Make a different selection.");

                }

            }
            //defeated statement
            if(health<1){
                System.out.println("You fell in battle an begin your journey to Val-hallah.");
                break;
            }
            System.out.println("************************************************************");
            System.out.println(" # "+enemy+" was defeated! # ");
            System.out.println(" # You have "+health+" HP left. # ");
            if(roll.nextInt(100) <= healthPotDropRate){
                numHealthPots++;
                System.out.println(" # The "+enemy+" dropped a health potion!! #");
                System.out.println(" # You now have "+numHealthPots+" health potion(s)... #");
            }
            System.out.println("************************************************************");
            System.out.println("\tWhat would you like to do now? ");
            System.out.println("\t  1. Continue Fighting");
            System.out.println("\t  2. Exit dungeon");

             String input = recieve.nextLine();

             while(!input.equals("1") && !input.equals("2")){
                 System.out.println("\tInvalid Command!");
                 input = recieve.nextLine();
             }
             if(input.equals("1")){
                 System.out.println("\tYour Adventure Continues!! ");
             }else if(input.equals("2")){
                 System.out.println("\tYou retire from adventuring");
                 break;
             }

        }
        System.out.println("**********************************");
        System.out.println("\tThank you for playing");
        System.out.println("**********************************");

      }
    }
     */
}
