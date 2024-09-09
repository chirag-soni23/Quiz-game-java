
import java.util.Scanner;


public class Quiz {

    static class Question {

        String questionText;
        String[] options;
        int correctAnswer;

        public Question(String questionText, String[] options, int correctAnswer) {
            this.questionText = questionText;
            this.options = options;
            this.correctAnswer = correctAnswer;
        }

        // display question
        public void display(){
            System.out.println(questionText);
            for(int i = 0;i<options.length;i++){
                System.out.println((i+1) + ". " + options[i]);
            }
        }

        // is correct
        public boolean isCorrect(int userAnswer){
            return userAnswer == correctAnswer;
        }
    }

    // main method
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int score = 0;

            // Array of questions
            Question[] questions = {
                new Question("What is the capital of France?", new String[] {"Berlin", "Madrid", "Paris", "Rome"}, 3),
                new Question("Who developed Java?", new String[] {"Microsoft", "Sun Microsystems", "Apple", "Google"}, 2),
                new Question("Which planet is known as the Red Planet?", new String[] {"Earth", "Mars", "Jupiter", "Saturn"}, 2)
            };

            for (Question q : questions) {
                q.display();
                System.out.println("Your answer (1-4): ");
                int userAnswer = scanner.nextInt();

                if(q.isCorrect(userAnswer)){
                    System.out.println("Correct!");
                    score++;
                }else{
                    System.out.println("Wrong!");
                }
            }
            System.out.println("Quiz is over! your score is: " + score + "/" + questions.length);
        }

    }

}
