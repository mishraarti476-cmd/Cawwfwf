def loan_eligiblity(loan_amount,age,salary,nationality,employee_type):
    if(
        loan_amount >=50000 and
        25 <= age and
        age <=45 and
        salary >= 50000 and
        nationality=="indian" and
        employee_type=="salaried"
    ):
     
        print("Loan approved")

    else:
        print("Loan declined")



loan_amount  = 50000
age = 35
salary = 450000
nationality = "indian"
employee_type= "salaried"
print(loan_eligiblity(loan_amount,age,salary,nationality,employee_type))
print(loan_amount)