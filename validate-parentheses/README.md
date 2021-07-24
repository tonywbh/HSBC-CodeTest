### The program can be buildable using the following command
lein do test
lein uberjar
lein pom

**The program can be runnable using the following command**
java -jar .\target\uberjar\validate-parentheses-0.1.0-SNAPSHOT-standalone.jar


### Problem – Validate Parentheses
Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', here you’ll need to try to determine if the input string is valid.
An input string is considered valid if:
1.	Open brackets must be closed by the same type of brackets.
2.	Open brackets must be closed in the correct order.
Samples as:

| Item      |    Value | Qty  |
| :-------- | --------:| :--: |
| Computer  | 1600 USD |  5   |
| Phone     |   12 USD |  12  |
| Pipe      |    1 USD | 234  |
