Description
For this assignment, you will implement a single-activity Android application using a handful of basic controls. The goal of the assignment is to become familiar with the use of Android Studio, basic UI elements, and the Android documentation.
View Layout
The view will have the following elements:
Amount Borrowed
This will be a EditText into which the user will enter the amount to be borrowed as a floating-point value (e.g., “1000.00”).
Interest Rate
This will be a SeekBar ranging from 0.0 to 20.0, indicating the annual percentage rate of the interest. This value should start at 10.0.
Loan Term
This will be a RadioGroup with the choices 15, 20, and 30, representing the number of years of the loan.
Taxes and Insurance
This will be a CheckBox that allows the user to select whether taxes and insurance are to be included in the monthly payment.
Calculate
This will be a Button that, when pressed, will calculate the user’s monthly payments based on the values entered.
Monthly Payment
This will be a TextView that displays the monthly payment.
Calculation
For interest rates other than 0%, the monthly payment can be calculated as:
M= P*(J/(1-(1+J)^-N)) +T
where:
P = Principal (the amount borrowed)
J =Monthly interest in decimal form (annual interest rate / 1200) N = Number of months of the loan
T =Monthly taxes and insurance, if selected (0.1% of the amount borrowed) For interest rates of 0%, the monthly payment is simply:
M=(P/N)+T