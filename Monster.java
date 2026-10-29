public class Monster {
    private String name;
    private int hp;

    Monster(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public void monsterInfo() {
        System.out.println(name + " is a monster that is very strong and has this much points: " + hp);
    }

}
