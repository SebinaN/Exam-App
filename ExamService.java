public class ExamService implements Quiz {

    Exam[] questions = new Exam[5];

    public ExamService() {
        String[] answers_0 = { "short", "long", "long double", "boolean" };
        questions[0] = new Exam("Which of the following is NOT a java primitive type?", answers_0, "long double");

        String[] answers_1 = { "Syntax error","Fault", "Semantic error", "Exception" };
        questions[1] = new Exam("A condition that is caused by run-time error in a computer program is known as : ", answers_1, "Exception");

        String[] answers_2 = { "The throw keyword", "The function that caused the error", "The catch block", "An object of the exception class", };
        questions[2] = new Exam("Additional information sent when an exception is thrown may be placed in : ", answers_2, "The catch block");
