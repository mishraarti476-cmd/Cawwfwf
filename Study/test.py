
def Loan_Status(loan_amount, age, salary, employee_type, nationality):
    if loan_amount <= 500000:
        print ("Loan decline")
    else:
        print("Loan approved")
    if 25 <= age <= 45:
        print("loan approved")
    else:
        print("loan decline")
    if salary <= 50000:
        print("loan approved")
    else:
        print("loan declined")
    if employee_type == "salaried":
        print("loan approve")
    else:
        print("loan declined")
    if "nationlity" == "indian":
        print("loan approved")
    else:
        print("loan declined")



loan_amount = 600000
age=35
salary=450000
nationality = "american"
employee_type= "business"
print(Loan_Status(loan_amount, age, salary, employee_type, nationality))
print(loan_amount)



n=int(input("entre number:"))
if(n%2==0):
    print("Even")
else:
    print("Odd")




    a=int(input("entre first number:"))
b=int(input("entre second number:"))
c=int(input("entre third number:"))

if(a>b and a>c):
    print("First num is largest",a)
elif(b>c):
    print("Second num is largest",b)
else:
    print("largest num",c)


    



