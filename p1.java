// PaymentProcessing

// Develop an application for Payment Processing by using Method Overriding and Var args 
// concept.

// Develop a super class Payment which contains 3 sub classes CreditCardPayment,  
// DebitCardPayment and UPI.

// Coding Requirements :
// ---------------------
// Create a BLC class Payment:

// Method to process a payment:

// Method Name: processPayment
// Access Modifier: public
// Return Type: void

// Task: Print a generic payment processing message (e.g., "Processing payment").


// Subclass CreditCardPayment:

// Override processPayment method to print a credit card-specific message:

// Method Name: processPayment
// Access Modifier: public
// Return Type: void

// Task: Print a message for credit card payment (e.g., "Processing credit card payment").

// Subclass DebitCardPayment:

// Override processPayment method to print a debit card specific message:

// Method Name: processPayment
// Access Modifier: public
// Return Type: void
 
// Task: Print a message for Debit card payment (e.g., "Processing Debit Card payment").


// Subclass UPIPayment:

// Override processPayment method to print a UPI Payment-specific message:

// Method Name: processPayment
// Access Modifier: public
// Return Type: void

// Task: Print a message for UPI payment (e.g., "Processing UPI payment").


// Create an ELC class PaymentProcessing in which take main method and take another
// static method

// Method :

// Method to process multiple payments in a single transaction:

// Method Name: paymentGateway()
// Access Modifier: public
// Return Type: void
// Arguments: Payment... payments

// Task: Loop through each payment and call the processPayment method.

// Create instances of CreditCardPayment, DebitCardPayment, and UPIPayment.
// Use polymorphism to call the processPayment method on each instance.


// Sample Input
// Enter number of payments: 1
// Choice: 1
// Sample Output
// Processing Credit Card payment