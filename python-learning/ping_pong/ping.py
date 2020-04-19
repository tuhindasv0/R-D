import turtle

win=turtle.Screen()
win.title("Pong by Tuhin Das")
win.bgcolor("yellow")
win.setup(width=800,height=600)
win.tracer(0)

paddleLeft=turtle.Turtle()
paddleLeft.speed(0)
paddleLeft.shape("square")
paddleLeft.color("blue")
paddleLeft.shapesize(stretch_wid=5,stretch_len=1)
paddleLeft.penup()
paddleLeft.goto(-350,0)


paddleRight=turtle.Turtle()
paddleRight.speed(0)
paddleRight.shape("square")
paddleRight.color("blue")
paddleRight.shapesize(stretch_wid=5,stretch_len=1)
paddleRight.penup()
paddleRight.goto(350,0)

ball=turtle.Turtle()
ball.speed(0)
ball.shape("circle")
ball.color("blue")
ball.penup()
ball.goto(0,0)
ball.dx=0.5
ball.dy=0.5

pen=turtle.Turtle()
pen.color("blue")
pen.penup()
pen.speed(0)
pen.hideturtle()
pen.goto(0,280)
pen.write("Player A : 0 | Player B : 0 ",align="center", font={"Courier",24,"normal"})

score_a=0
score_b=0

def paddleLeft_up():
    y=paddleLeft.ycor()
    if(y<300):
        y+=20
        print("++++",y)
        paddleLeft.sety(y)

def paddleLeft_down():
    y=paddleLeft.ycor()
    if(y>-300):
        y-=20
        print("----",y)
        paddleLeft.sety(y)

def paddleRight_up():
    y=paddleRight.ycor()
    if(y<300):
        y+=20
        print("++++",y)
        paddleRight.sety(y)

def paddleRight_down():
    y=paddleRight.ycor()
    if(y>-300):
        y-=20
        print("----",y)
        paddleRight.sety(y)

win.listen()
win.onkeypress(paddleLeft_up,"w")
win.onkeypress(paddleLeft_down,"s")
win.onkeypress(paddleRight_up,"Up")
win.onkeypress(paddleRight_down,"Down")

while True:
    win.update()

    ball.setx(ball.xcor()+ball.dx)
    ball.sety(ball.ycor()+ball.dy)

    if ball.ycor()>290:
        ball.sety(290)
        ball.dy *= -1
    
    if ball.ycor()< -290:
        ball.sety(-290)
        ball.dy *= -1
    
    if ball.xcor()>390:
        ball.goto(0,0)
        ball.dx *= -1
        score_a +=1
        pen.clear()
        pen.write("Player A : {} | Player B : {} ".format(score_a,score_b), align="center", font={"Courier",24,"normal"})
    
    if ball.xcor()<-390:
        ball.goto(0,0)
        ball.dx *= -1
        score_b +=1
        pen.clear()
        pen.write("Player A : {} | Player B : {} ".format(score_a,score_b), align="center", font={"Courier",24,"normal"})
    
    
    if(ball.xcor()>340 and ball.xcor()<350) and (ball.ycor()<paddleRight.ycor()+50 and ball.ycor() > paddleRight.ycor()-50):
        ball.setx(340)
        ball.dx *= -1
    
    if(ball.xcor()<-340 and ball.xcor()>-350) and (ball.ycor()<paddleLeft.ycor()+50 and ball.ycor() > paddleLeft.ycor()-50):
        ball.setx(-340)
        ball.dx *= -1
