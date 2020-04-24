package com.company;

import ir.huri.jcal.JalaliCalendar;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person person1 = new Person("Melika", "Bagheri");
        Person person2 = new Person("Nima", "Bagheri");
        Person person3 = new Person("Samira", "Mahdavi");
        Person person4 = new Person("Mahan", "Rahimi");
        Person person5 = new Person("Zeynab", "Babaei");
        Person person6 = new Person("Soroush", "Alikhani");
        Person person7 = new Person("Ali", "Bagheri");
        Person person8 = new Person("Qazal", "Dehqani");
        Person person9 = new Person("Arman", "Fallah");
        Person person10 = new Person("Sahar", "Nadafi");

        ArrayList<String> choices1 = new ArrayList<String>();
        choices1.add("Game of thrones");
        choices1.add("Dark");
        choices1.add("Peaky blinders");
        choices1.add("West world");

        ArrayList<String> choices2 = new ArrayList<String>();
        choices2.add("Tom Hardy");
        choices2.add("Kit Harington");
        choices2.add("Ian Somerhalder");
        choices2.add("Nina Dobrev");
        choices2.add("Johnny Depp");
        choices2.add("Annabelle Wallis");


        ArrayList<String> choices3 = new ArrayList<String>();
        choices3.add("Dota 2");
        choices3.add("Warframe");
        choices3.add("Dead Cells");
        choices3.add("Portal 2");
        choices3.add("Resident Evil 2");
        choices3.add("The Witcher 3");
        choices3.add("League of Legends");


        VotingSystem votingSystem = new VotingSystem();
        votingSystem.createVoting("Which one is your favorite TV series?", 0,choices1);
        votingSystem.createVoting("Which one is your favorite actor?", 1,choices2);
        votingSystem.createVoting("Which one is your favorite game?", 1,choices3);
        votingSystem.printVotingQuestion();
        System.out.println();

        ArrayList<String> vote = new ArrayList<String>();
        vote.add("Peaky blinders");
        votingSystem.vote(0,person1,vote);
        vote.remove(0);
        vote.add("Game of thrones");
        votingSystem.vote(0,person2,vote);
        vote.remove(0);
        vote.add("Peaky blinders");
        votingSystem.vote(0,person3,vote);
        vote.remove(0);
        vote.add("Dark");
        votingSystem.vote(0,person4,vote);
        vote.remove(0);
        vote.add("West world");
        votingSystem.vote(0,person5,vote);
        vote.remove(0);
        votingSystem.printVoting(0);
        System.out.println();
        votingSystem.getVotingList().get(0).getVoters();
        System.out.println();
        votingSystem.printResults(0);
        System.out.println();


        vote.add("Tom Hardy");
        vote.add("Annabelle Wallis");
        vote.add("Kit Harington");
        votingSystem.vote(1,person6,vote);
        vote.removeAll(vote);
        vote.add("Tom Hardy");
        vote.add("Nina Dobrev");
        votingSystem.vote(1,person7,vote);
        vote.removeAll(vote);
        vote.add("Johnny Depp");
        vote.add("Ian Somerhalder");
        vote.add("Kit Harington");
        votingSystem.vote(1,person8,vote);
        vote.removeAll(vote);
        vote.add("Johnny Depp");
        votingSystem.vote(1,person9,vote);
        vote.removeAll(vote);
        vote.add("Johnny Depp");
        vote.add("Annabelle Wallis");
        vote.add("Kit Harington");
        vote.add("Nina Dobrev");
        votingSystem.vote(1,person10,vote);
        vote.removeAll(vote);
        votingSystem.printVoting(1);
        System.out.println();
        votingSystem.getVotingList().get(1).getVoters();
        System.out.println();
        votingSystem.printResults(1);
        System.out.println();

        vote.add("Dota 2");
        vote.add("The Witcher 3");
        vote.add("Portal 2");
        votingSystem.vote(2,person3,vote);
        vote.removeAll(vote);
        vote.add("Resident Evil 2");
        vote.add("Portal 2");
        votingSystem.vote(2,person2,vote);
        vote.removeAll(vote);
        vote.add("Dead Cells");
        vote.add("Warframe");
        votingSystem.vote(2,person8,vote);
        vote.removeAll(vote);
        vote.add("League of Legends");
        votingSystem.vote(2,person5,vote);
        vote.removeAll(vote);
        vote.add("Dead Cells");
        vote.add("The Witcher 3");
        vote.add("Dota 2");
        vote.add("Resident Evil 2");
        votingSystem.vote(2,person7,vote);
        vote.removeAll(vote);
        votingSystem.printVoting(2);
        System.out.println();
        votingSystem.getVotingList().get(2).getVoters();
        System.out.println();
        votingSystem.printResults(2);




    }
}
