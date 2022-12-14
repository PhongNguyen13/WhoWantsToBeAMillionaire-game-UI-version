package Model;

import java.util.Random;

public class CallAFriend extends Lifeline {
    
    private String saying;
    
    public CallAFriend(String lifeline) {
        super(lifeline);
        saying = null;
    }

    public String getSaying() {
        return saying;
    }

    /**
     * Call a friend to ask the answer for the question
     * 
     * @param q 
     */
    @Override
    public void generateLifeline(Questions q) {
        String cAns = q.getCorrectAns();
        Random rand = new Random();
        
        System.out.print("Your friend says: ");

        int friend = rand.nextInt(3) + 1;

        switch (friend) {
            case 1:
                saying = "The correct answer is " + cAns + ".";
                System.out.println(saying);
                break;
            case 2:
                saying = "I am not sure... but i think the answer is " + cAns + ".";
                System.out.println(saying);
                break;
            case 3:
                saying = "Sorry, I don't know the answer about this question.";
                System.out.println(saying);
                break;
        }
    }
}