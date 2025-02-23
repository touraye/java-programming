# Basic Variable Concepts

Prerequisites: Basic programming knowledge is required. 

In a computer we can create container to store some other values and sub-container(they are all values). Folders are the container that we used to store other related values either files and sub-folders. If you create a folder it is stored into your hard-drive. Our program also behave in a similar manner.

We all interact with a program and provide them with some information. But, how those a program store and interact with these information given by a user? A program in it self have created containers to store information of the user and display those information which are stored in the containers. These containers are called a `variables` in a program.

## What is a Variable

**Variable** is store or container that hold a value inside a computer memory, These value can be a a name of a person, age of a person, bank-account balance, a truthy of a falsely value etc. The term `variable` means that the value can varies meaning it can change. But, not all the values of a variable can be change in the scope of the program some do not change their values when created, but in most case they do. For case of simplicity a variable also have some other things attached to it which are a name, and value.

In a strong-type languages like Java every variable most have a `type, name, value`. These is not the case for other programming language like python, JavaScript where a variable only have a name and a value.

In programming a variable have two stages:
Initialization, and Declaration stage

### Initialization  Stage

These stage is when a variable is given an initial value. In a more precise way it means when a container is created and it's content is provided. 

#### Declaration Stage

These stage is when a variable doesn't have an initial value.  A container is created and it's content is not provided. 

#### Assignment

These happens automatically when you initialized a variable with the use of equals `=` sign which is called an assignment operator, and again if you want to assign a value to a declared variable.

#### Reassignment

Reassignment is the exact opposite of assignment. Reassignment happens when you have given variable a value and you then want to remove the old value and put in a new value(think of it as an update to a variable).

 It must have an initial value before you can actually reassignment it with a new value!

## Variable in Strong Type and Lose Type Languages 

Not all programming languages deal with variable the same way. As we know that there are two type of programming languages `strong, loosely or dynamic` types. Do not be taken by the name 'strong and loosely', I am not saying any language been powerful over the other. All languages their strength!

### Strong Type Language

In a strong type language every variable most have a type(data type), name, and a value

### Loosely Type Language

In a loosely type language a variable is not mandatory to have a type, a variable could have a number as it's value and it can change to another type like String.

#### Variable Been Constant

In a program when a variable is said to be a constant that means the variable value cannot be change at any given time in a program. Constant is good for identity number, student number thing that do not change or will not change. A constant variable has a special keyword that let the program knows about it, and these is different with programming languages. 

#### Scope of a Variable

In programming the order of execution starts from top to bottom(synchronously). When your program is load or start executing the process start from line number 1 at any given case. The variables also follow the same pattern as they part of the program. A variable cannot be accessible before it creation. Therefore, a variable most be created before you can access it. 

Scoping is a huge topic i just crash the surface. And, it varies with programming languages 



#### Conclusion

Here we have discuss what a variable is by given an example of folder, sub-folder, and a file in a computer system, two stages of a variable, reassignment concept, constants variables and basic scoping. 

These are just some basic concept I will touch on more using Java later.

Thank for reading these far!

