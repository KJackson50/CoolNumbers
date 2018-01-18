# CoolNumbers
January - Weekly Project

This is a easy-medium coding exercise

1st part:
Problem: Find and add all cool numbers between 1 and including 1,000,000 (x<=1000000)

What is a cool number?
A number is a cool number if both it's digits square rooted and added together eventually equal 1.
Ex. 23
2 and 3 = 2^2 + 3^2 = 4 + 9 = 13
1 and 3 = 1^2 + 3^2 = 1 + 9 = 10
1 and 0 = 1^2 + 0^2 = 1 + 0 = 1

This means 23 is a cool number

tip: "uncool" numbers will yield 4 at some point, or loop forever

2nd part:

When you find these, make a POST request to the following APIs:
/code1, /code2, /code3, ..., /code100 with the header "X-COOL-SUM" equal to the answer you received from part 1. Most of the routes will return 404, however some will return a letter when provided with the right "cool sum". The code is the letters put together in the order of the requests


Challenge from Programming Prompts at Reddit below:
https://www.reddit.com/r/ProgrammingPrompts/comments/5y43fg/easymedium_frontend_networking_challenge/


start at http://dev.getethos.com/
