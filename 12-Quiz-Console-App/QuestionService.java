import java.util.Scanner;

public class QuestionService {
    Question questions [] = new Question[5];
    String [] selection = new String[5];

    QuestionService() {
        questions[0] = new Question(1, "What is the capital of India?", "Mumbai", "Delhi", "Kolkata", "Chennai", "Delhi");
        questions[1] = new Question(2, "What is the capital of Australia?", "Sydney", "Melbourne", "Canberra", "Perth", "Canberra");
        questions[2] = new Question(3, "What is the capital of USA?", "New York", "Washington D.C.", "Los Angeles", "Chicago", "Washington D.C.");
        questions[3] = new Question(4, "What is the capital of Japan?", "Tokyo", "Osaka", "Kyoto", "Hiroshima", "Tokyo");
        questions[4] = new Question(5, "What is the capital of France?", "Paris", "Lyon", "Marseille", "Nice", "Paris");
    }

    public void display(boolean displayAnswer) {
        System.out.println("============== Displaying Questions ==============");

        for (Question question : questions) {
            System.out.println("Question: " + question.getQuestion());
            System.out.println("a.) " + question.getOption1() + "\t\t\t" + "b.) " + question.getOption2());
            System.out.println("c.) " + question.getOption3() + "\t\t\t" + "d.) " + question.getOption3());

            if (displayAnswer) 
                System.out.println("\nAnswer: " + question.getAnswer() + "\n");
        }
    }

    public void display() {
        System.out.println("============== Displaying Questions ==============");

        for (Question question : questions) {
            System.out.println("Question: " + question.getQuestion());
            System.out.println("a.) " + question.getOption1() + "\t\t\t" + "b.) " + question.getOption2());
            System.out.println("c.) " + question.getOption3() + "\t\t\t" + "d.) " + question.getOption3());
        }
    }

    public void playQuiz() {

        int questionCounter = 0;
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            
            System.out.println("Question: " + question.getQuestion());
            System.out.println("a.) " + question.getOption1() + "\t\t\t" + "b.) " + question.getOption2());
            System.out.println("c.) " + question.getOption3() + "\t\t\t" + "d.) " + question.getOption3());

            System.out.print("Enter your answer: ");
            
            String answer = scanner.nextLine();
            selection[questionCounter] = answer;
            questionCounter++;
        }

        scanner.close();
    }

    public void printScore() {
        int score = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question: " + questions[i].getQuestion() +  "\t\t" + "Your Answer: " + selection[i] );
            System.out.println("Correct Answer: " + questions[i].getAnswer());
            if (questions[i].getAnswer().equals(selection[i])) {
                score++;
            }
        }

        System.out.println("Your score is: " + score);
    }
}
