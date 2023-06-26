#include <iostream>
#include <string>

using namespace std;

// Enum to store the possible answers to questions asked
enum Answers {YES, NO, MAYBE, UNKNOWN};

// Function to print the answer 
void printAnswer(Answers answer) {
	switch (answer) {
		case YES:
			cout << "Yes" << endl;
			break;
		case NO:
			cout << "No" << endl;
			break;
		case MAYBE:
			cout << "Maybe" << endl;
			break;
		case UNKNOWN:
		default:
			cout << "Unknown" << endl;
			break;
	}
}

// Class to represent a question that can be asked to the think tank
class Question {
private:
	string question;
public:
	Question(string q) {
		question = q;
	}
	
	string getQuestion() {
		return question;
	}
	
	// Function to ask the question and get the answer
	Answers askQuestion() {
		cout << question << endl;
		// Implement your logic to get the answer here
		return Answers::UNKNOWN;
	}
};

// Class to represent the think tank
class ThinkTank {
private:
	// List of questions asked to the think tank
	Question* questions[2000];
	int numQuestions;
public:
	ThinkTank() {
		numQuestions = 0;
	}
	
	// Function to add a new question to the think tank
	void addQuestion(Question* q) {
		questions[numQuestions] = q;
		numQuestions++;
	}
	
	// Function to ask all the questions and get the answers
	void askQuestions() {
		for (int i=0; i<numQuestions; i++) {
			Answers answer = questions[i]->askQuestion();
			printAnswer(answer);
		}
	}
};

int main() {
	ThinkTank tank;
	
	// Adding 2000 questions to the think tank
	for (int i=0; i<2000; i++) {
		string q = "Question " + to_string(i+1);
		Question* question = new Question(q);
		tank.addQuestion(question);
	}
	
	// Asking all the questions
	tank.askQuestions();
	
	return 0;
}