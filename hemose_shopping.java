public class hemose_shopping {
    public static void main(String[] args) {
        int[] prices = {10, 20, 30, 40, 50};
        int budget = 100;
        int totalCost = 0;
        int itemsBought = 0;

        for (int price : prices) {
            if (totalCost + price <= budget) {
                totalCost += price;
                itemsBought++;
            } else {
                break;
            }
        }

        System.out.println("Total cost: " + totalCost);
        System.out.println("Items bought: " + itemsBought);
    }
}
