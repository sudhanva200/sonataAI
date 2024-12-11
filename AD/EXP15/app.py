from flask import Flask, request, render_template

app = Flask(__name__)

def load_questions():
    """Load questions and answers from the text file."""
    questions = {}
    try:
        with open('python_questions.txt', 'r', encoding='utf-8') as file:
            lines = file.readlines()
            for line in lines:
                if '|||' in line:
                    question, answer = line.strip().split('|||')
                    questions[question.strip()] = answer.strip()
    except FileNotFoundError:
        print("Warning: python_questions.txt not found")
        return {}
    except Exception as e:
        print(f"Error loading questions: {e}")
        return {}
    return questions

python_questions = load_questions()

@app.route('/')
def chatbot_page():
    return render_template('chatbot.html')

@app.route('/ask', methods=['POST'])
def answer_question():
    user_question = request.form.get('user_question', '').strip()
    
    # Case-insensitive search
    answer = "Sorry, I don't know the answer to that question."
    for question in python_questions:
        if user_question.lower() == question.lower():
            answer = python_questions[question]
            break
            
    return render_template('chatbot.html', 
                         user_question=user_question, 
                         answer=answer)

if __name__ == '__main__':
    app.run(debug=True)