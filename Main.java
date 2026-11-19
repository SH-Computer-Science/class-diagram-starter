public class Main {
    public static void main(String[] args) {
        Sneaker first = new Sneaker("Nike", 10.0, 120.00);
        Sneaker second = new Sneaker("Adidas", 9.5, 95.00);
        Sneaker third = new Sneaker("Puma", 8.0, 80.00);

        System.out.println(first);
        System.out.println(second);
        System.out.println(third);

        first.discount(20);
        System.out.println("After 20 percent off:");
        System.out.println(first);

        System.out.println("Total pairs: " + Sneaker.getTotalPairs());

        // Day 3: after you write VideoGame, try tests like these.
        // VideoGame game1 = new VideoGame("Tetris", "E", 19.99);
        // VideoGame game2 = new VideoGame("Zelda", "E", 59.99);
        // System.out.println(game1);
        // System.out.println(game2);
        // System.out.println(game1.getTitle());
        // System.out.println("Games made: " + VideoGame.getGamesMade());
    }
}
