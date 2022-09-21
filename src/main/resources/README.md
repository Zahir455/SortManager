# SortManager

The sort manager program has three different ways of sorting through an array of random numbers and returning said array 
ordered from smallest to largest number. The user can choose the size of the array, it is then filled randomly, and the 
user can choose which method of sorting to use. the user is also able to choose to compare how long each method takes to 
sort through an array.
## Interface
![img.png](img.png)
This interface serves as the blueprint for all three sorting methods.

## Bubble Sort
![img_12.png](img_12.png)
The bubble sort uses a nested for loop to select each elemnt in an array and then compare that element to all others in the array to sort them in order.
The sorter then uses the Duplicate remover class to remove any duplicate values.

## Merge Sort
![img_13.png](img_13.png)
![img_14.png](img_14.png)
The merge sort class is made of two methods. The first method splits the array into smaller arrays until each array only has one element. It then calls the second method recursively.
![img_3.png](img_3.png)
The second method will then join these array back together, placing smaller ints before larger ones.
![img_15.png](img_15.png)
In case one of the arrays has more elements than the other this section of code will go through the remainder of that array.

## Binary sort
The binary sorting method currently doesn't work.

## Main Test
![img_5.png](img_5.png)
The Bubble sort class has been tested for when there are an odd number of elements in the array and for if the array is empty.
![img_6.png](img_6.png)
The Bubble sort class was also tested with large numbers to see if that would affect it.
The Merge sort, unlike the bubble sort, when passed an empty array will return a null array.
![img_7.png](img_7.png)
When passed an array containing only 2 elements the Merge sort was able to order them.

## Duplicate Remover
![img_18.png](img_18.png)
The duplicate remover class makes a copy of the array passed to it as a linked hash set, since set can not hold duplicates all duplicates are removed.
Then a copy of the set is made in an array and this is returned.

## Factory
![img_16.png](img_16.png)
The factory class has a method for calling each of the different sorting methods
![img_17.png](img_17.png)
The class also has a method for comparing the time it takes for each sorting method to finish.

## View manager
![img_20.png](img_20.png)
The view manager gives the user their options and takes in the user's input, which consists of what type of array to use and the length of the random array that will be passed to it.
![img_21.png](img_21.png)
Using switch cases the method will call whichever sorting method the user specifies.
![img_22.png](img_22.png)
The user is also given the choice to compare the time each sorting method takes. There is a default case for if the user types in an intiger that isn't between 1 and 4.
![img_23.png](img_23.png)
Finally the user is asked if the want to continue or stop.

## Main
![img_19.png](img_19.png)
The main class runs the options method from the view manager class.

## Running
The following is an example of the code running
![img_28.png](img_28.png)

![img_30.png](img_30.png)

![img_31.png](img_31.png)

![img_32.png](img_32.png)

![img_33.png](img_33.png)
