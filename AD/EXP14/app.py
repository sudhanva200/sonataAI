from flask import Flask, request, render_template
import pickle

app = Flask(__name__)

# Database dictionary (In a real application, you should use a proper database)
database = {
    'Vallabh': 'renai',
    'Zhongli': 'Geo'
}

@app.route('/')
def hello_world():
    return render_template("login.html")

@app.route('/form_login', methods=['POST', 'GET'])
def login():
    if request.method == 'POST':
        name1 = request.form['Username']
        pwd = request.form['Password']
        
        if name1 not in database:
            return render_template('login.html', info='Invalid User')
        else:
            if database[name1] != pwd:
                return render_template('login.html', info='Invalid Password')
            else:
                return render_template('home.html', name=name1)
    return render_template('login.html')

if __name__ == '__main__':
    app.run(debug=True)