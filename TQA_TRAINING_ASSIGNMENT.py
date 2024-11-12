# Question 1
List_one = ["Orange" , "Goat" ,"Cow", "Man" , "Woman" ,"Yam" , "Bobrisky" , "Zazzu", "Amos" , "Money"]
print(List_one)
print(type(List_one))

#queston 2
List_one.insert(3 , "Python")
print(List_one)

#Write a for loop to iterate over List_One and Print to the console
List_one = ["Orange" , "Goat" ,"Cow", "Man" , "Woman" ,"Yam" , "Bobrisky" , "Zazzu", "Amos" , "Money"]
for x in List_one:
    if x == "banana":
        continue
    print(x)

    #4 - Create another list with 5 elements named List_Two
List_One = [10, 20, 30, 40, 5]
List_Two = [15, 25, 35, 40, 55]

# Check the 4th index of both List_One and List_Two
comparison_result = List_One[3] == List_Two[3]
print(comparison_result)


# Do a boolean check of the list above and print the result to the console by writing it in code  to check;
Comparison_List = [10,20,30,40,5,235,64]
 #if 10 is greater than 30
Check1 = 10 > 20
Check2 = 20 == 5
Check3 =  64<= 40
Check4 =  365 <= 30
print(Check1)
print(Check2)
print(Check3)
print(Check4)

#Question7
x = 9
y = 10
z = 11

result_one = (x<y) and (y<z)
result_two = (z<=x) or (x<y) or (z>x)
print("Result_one" , result_one)
print("Result_two" , result_two)

