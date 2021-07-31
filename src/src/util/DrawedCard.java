package util;

import java.util.ArrayList;

public class DrawedCard {
    private ArrayList<Integer> duplicatedNumber = new ArrayList<>();

    public DrawedCard() {

    }

    public void addDrawedCard(int drawedCard) {
        duplicatedNumber.add(drawedCard);
    }

    public boolean checkDuplicateCard(int drawedCard) {
        return duplicatedNumber.contains(drawedCard);
    }
}
