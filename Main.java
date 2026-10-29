public class Main {
    public static void main(String[] args) {

        Player player1 = new Player("Marta");
        Monster monster = new Monster("Zombie", 30);

        System.out.println("Player name: " + player1.getName());
        monster.monsterInfo();
    }

}
