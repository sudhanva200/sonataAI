from flask import Flask, request, render_template
import pickle

app = Flask(__name__)

@app.route('/')
def hello_world():
    return render_template("order.html")

if __name__ == '__main__':  
    app.run()