package ch05;


public class Operation5_1 {
    public static void main(String[] args) {
        // 게임 캐릭터 상태 설정.
        int playerHp = 50; // 체력
        int playerLv = 10; // 레벨
        int enemyHp = 30; // 적 체력
        int enemyLv = 15; // 적 레벨

        // 1. 플레이어의 체력이 적 체력보다 높은지 확인하고 출력.
        System.out.println(playerHp > enemyHp);

        // 2. 플레이어 체력이 위험수준인 20이하인지 확인하고 출력.
        System.out.println(playerHp <= 20);

        // 3. 플레이어와 적의 체력이 같은지 확인하고 출력.
        System.out.println(playerHp == enemyHp);

        // 4. 플레이어의 특정 레벨이 30이상인지 확인하고 출력.
        System.out.println(playerLv >= 30);

        // 5. 플레이어의 체력이 30미만인지 확인하고 출력.
        System.out.println(playerHp < 30);

        // 6. 플레이어의 체력이 50초과하는지 확인하고 출력.
        System.out.println(playerHp > 50);

    } // end of main
} // end of class
