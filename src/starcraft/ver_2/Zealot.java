package starcraft.ver_2;

public class Zealot {
    private String name;
    private int power;
    private int hp;

    public Zealot(String name) {
        this.name = name;
        this.power = 10;
        this.hp = 80;
    }

    public String getName() {return name;}
    public int getPower() {return power;}
    public int getHp() {return hp;}

    // 1. 질럿이 저글링을 공격.
    public void attack(Zergling zergling) {
        if (zergling.getHp() <= 0) {
            System.out.println(zergling.getName() + "이(가) 이미 사망하였습니다.");
            return;
        }
        if(this.hp <= 0) {
            System.out.println("이미 사망해서 공격할 수 없습니다.");
            return;
        }
        System.out.println(this.name + "이(가) " + zergling.getName() + "을 공격하였습니다.");
        zergling.beAttacked(this.power);
    }

    // 2. 질럿이 마린을 공격.
    public void attack(Marine marine) {
        if (marine.getHp() <= 0) {
            System.out.println(marine.getName() + "이(가) 이미 사망하였습니다.");
            return;
        }
        if(this.hp <= 0) {
            System.out.println("이미 사망해서 공격할 수 없습니다.");
            return;
        }
        System.out.println(this.name + "이(가) " + marine.getName() + "을 공격하였습니다.");
        marine.beAttacked(this.power);
    }

    // 3. 질럿이 공격을 당함.
    public void beAttacked(int power) {
        this.hp -= power;
        if(20 < this.hp) System.out.println(this.name + "이 공격을 받았습니다.");
        else if(0 < this.hp && this.hp <= 20) System.out.println("◆◆◆◆◆위험!!!◆◆◆◆◆◆" + this.name + "이(가) 체력이 낮습니다!");
        else System.out.println(this.name + "이(가) 사망하였습니다.");
    }

    // 4. 현재 내 상태 출력.
    public void showInfo() {
        System.out.println("=============상태창=============");
        System.out.println("이름 : " + name);
        System.out.println("현재 공격력 : " + power);
        System.out.println("현재 Hp : " + hp);
        System.out.println("================================");
    }

}
