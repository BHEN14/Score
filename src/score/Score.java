package score;

import java.util.Arrays;
import java.util.Collections;
import javax.swing.*;

public class Score {

    public static double NUMBER_OF_SCORES = 5;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double score1 = 0.0,
                score2 = 0.0,
                score3 = 0.0,
                score4 = 0.0,
                score5 = 0.0;
        score1 = getScore("1");
        score2 = getScore("2");
        score3 = getScore("3");
        score4 = getScore("4");
        score5 = getScore("5");
        System.out.println();
        System.out.println("Score 1: " + score1);
        System.out.println("Score 2: " + score2);
        System.out.println("Score 3: " + score3);
        System.out.println("Score 4: " + score4);
        System.out.println("Score 5: " + score5);

        calcScore(score1, score2, score3, score4, score5);

    }

    private static double getScore(String score_name) {

        System.out.println("Judge " + score_name + "’s score: ");

        double score = Double.parseDouble(JOptionPane.showInputDialog(null, " Judge " + score_name + "’s score: "));
        while (score < 0 || score > 10) {
            score = Double.parseDouble(JOptionPane.showInputDialog(null, "Judge " + score_name + "’s score: "));
            System.out.println("Error. Enter a integer between 0 - 10: ");

        }
        return score;
    }

    private static void calcScore(double score1, double score2, double score3, double score4, double score5) {
        double[] data={score1,score2,score3,score4,score5};
        Arrays.sort(data);
      
                double lowest = getLowest(data),
                highest = getHighest(data),
                average,
                sum =data[1]+data[2]+data[3];
                
        

        average = sum / (NUMBER_OF_SCORES - 2);
        System.out.println("Lowest  = "+lowest);
        System.out.println("Highest  = "+highest);
        System.out.println("Average  = "+average);
        JOptionPane.showMessageDialog(null, average,"Score Of Player", 1);
    }

    private static double getLowest(double[] d) {
       return  d[0];
    }

    

    private static double getHighest(double[] d) {
        return d[d.length-1];
    }

   

}
