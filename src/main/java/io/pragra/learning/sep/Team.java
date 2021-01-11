package io.pragra.learning.sep;

public class Team {
  private String teamName;
  private String teamCountry;
  private String teamCoach;
  private int teamSize;
 public Team(){ }
 public Team(String teamName){
     this.teamName = teamName;
 }
 public Team(String teamName,String teamCountry){
     this(teamName);
     this.teamCountry = teamCountry;
 }

    public static void main(String[] args) {
        Team team = new Team("RedSox", "USA");
    }
}
