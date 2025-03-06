# Analysis of Algorithms


> Defend all answers based on specific references to the code. Do not count return statements or initialization of method arguments. You are strongly encouraged to walk through algorithms in the debugger and to add statement-counting code to given methods to test and refine your analysis.

## Algorithm: find()

### Minimum Statements:

- How many statements would be executed in a call to find() when the array size is zero (n == 0)?
  - > If `find()` was called with an array size of zero the method would initialize i and then find that i is not less than the array size which would cause it to skip the body of the for loop and return -1. The initialization, check, and return constitutes 3 statements.

### Best Case Scenario:

- Under what conditions would the minimum number of statements be executed for an array where n is large?
  - > Since the method returns the index where `array[i] == value`, and the iterator starts at 0, the best case scenario would be for `array[0] == value`. This would run the same amount of statements regardless of the size of n.
- Where would the target element be located in the array?
  - > As stated above, the target would be located in the 0 index of the array for the best case, for a generally good case the target should be located early in the array.
- What is the growth function under these conditions?
  - > As the variables don't matter and the code doesn't loop the growth function would be $O(4)$

### Worst Case Scenario:

- Under what conditions would the maximum number of statements be executed for an array where n is large?
  - > Since the method returns the index where `array[i] == value`, and the iterator starts at 0, the worst case scenario would be `array[n] == value`. This would necessitate the maximum amount of loops to match the value.
- Where would the target element be located?
  - > As above, the target would be located at the `n` index of the array.
- What is the growth function under these conditions?
  - > As this would have to loop `n` times we would be looking at $O(4n)$.

### Expected Average Case Scenario:

- Assuming a random array of unique elements and the target element is in the array, where would a target element be located on average?
  - > With those assumptions we can say that the average position for the target element is `array[n/2]`.
- What is the expected average number of statements (the expected growth function) for a call to find()?
  - > Since we determined that the growth on the maximum is $O(4n)$ we can use that in conjunction with the average position. $O(4n/2) = O(2n)$
- What is the runtime order (big-O) of find() based on the above growth functions?
  - > $O(2n)$

## Algorithm: replaceAll()

### Minimum Statements:

- How many statements would be executed in a call to replaceAll() when the array size is zero (n == 0)?
  - > `replaceAll()` starts by instantiating index to equal `find(array, oldvalue)`Since we determined that find has 3 statements when the array size is 0 this adds 3 statements. In this case `index = -1`. This is checked to see if it is greater than -1, as it is not we then skip looping the while loop. I believe this would be 5 statements in this case.

### Best Case Scenario:

- Under what conditions would the minimum number of statements be executed for an array where n is large?
  - > The best case scenario would be for there to be no instances of `oldValue` in the array at all. This would allow us to skip the scary while loop that contains a nested loop inside the the `find()` call it contains.
- How many occurrences of the `oldValue` element would be in the array?
  - > As above there would not be any `oldValue` instances within the array.
- Where would it/they be located in the array?
  - > `oldValue` would not be contained in the array as it would avoid any loop outside of looping all the way through the array with `find()` once. Since find only returns -1 if the target value is not found, and the replace all loop only ends when -1 is returned, we want to do this as soon as possible because an entire run through `find()` is necessary to end the loop even if there was instances of `oldValue` in the array.
- What is the growth function under these conditions?
  - > This situation actually requires `find()` to be ran as it's worse case so we would get $O(4n)$.

### Worst Case Scenario:

- Assuming newValue and oldValue are not equal, under what conditions would the maximum number of statements be executed for an array where n is large?
  - >
- How many occurrences of oldValue are in the array?
  - >
- Where would it/they be located?
  - >
- What is the growth function under these conditions?
  - >

### Expected Average Case Scenario:

- Assuming a random array of unique elements and oldValue is a value in the array, what is the average number of statements (the expected growth function) for a call to replaceAll()?
  - >
- What is the runtime order (big-O) of replaceAll() based on the above growth functions?
  - >

## Algorithm: sortIt()

### Minimum Statements:

- How many statements would be executed in a call to sortIt() when the array size is zero (n == 0) or one (n == 1)?
  - >

### Best Case Scenario:

- Under what conditions would the minimum number of statements be executed for an array where n is large?
  - >
- Would the algorithm execute a different number of statements if the elements in the array were already in sorted order? Reverse order? Random order? All the same value?
  - >
- What is the growth function under the best case conditions?
  - >

### Worst Case Scenario:

- Under what conditions would the maximum number of statements be executed for an array where n is large? (Already in some kind of sorted order? Duplicates?)
  - >
- What is the growth function under the worst case conditions?
  - >

### Expected Average Case Scenario:

- Assuming a random array of unique elements, what is the expected average number of statements (the expected growth function) for a call to sortIt()?
  - >
- What is the runtime order (big-O) of sortIt() based on the above growth functions?
  - >
