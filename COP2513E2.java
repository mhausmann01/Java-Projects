import java.util.ArrayList;

public class COP2513E2{
public static void main(String[]args){

Player p = new Player();
Novice n = new Novice();
Expert e = new Expert();

ArrayList<Player> players = new ArrayList<>();

players.add(p);
players.add(n);
players.add(e);

for(int i = 0; i < players.size(); i++){
System.out.println(n.playAgainst(players.get(i)));
}

for(int i = 0; i < players.size(); i++){
System.out.println(e.playAgainst(players.get(i)));
}

}
}

class Player{
private int speed;
private int skill;
private String name;

public void setAttributes(int speed, int skill){
this.speed = speed;
this.skill = skill;
}

public int getSpeed(){
return this.speed;
}

public int getSkill(){
return this.skill;
}

public String toString(){
return "Player " + name + ", Speed " + speed + ", skill" + skill;
}

public boolean playAgainst(Player player){
if(player.speed > this.speed && player.skill > this.skill){
return true;
}

return false;
}

public Player(){
this.speed = 0;
this.skill = 0;
this.name = name;
}

public Player(String name){
this.name = "Anonymous";
}

public Player(String name, int speed, int skill){
this.name = "Anonymous";
this.speed = speed;
this.skill = skill;
}
}

class Novice extends Player{
private int speed;
private int skill;
private String name;

public Novice(){
this.speed = 0;
this.skill = 0;
}

public Novice(String name){
this.name = "Anonymous";
}


public Novice(String name, int speed, int skill){
super(name, speed, skill);
}

public String toString(){
return super.toString() + "(novice)";
}

public boolean playAgainst(Player player){
return false;
}

}

class Expert extends Player{
private int speed;
private int skill;
private String name;

public Expert(){
this.speed = 0;
this.skill = 0;
}

public Expert(String name){
this.name = "Anonymous";
}


public Expert(String name, int speed, int skill){
super(name, speed, skill);
}

public String toString(){
return super.toString() + "(expert)";
}

public boolean playAgainst(Player player){
return true;
}

}