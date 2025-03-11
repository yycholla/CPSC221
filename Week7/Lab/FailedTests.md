# Failed Tests

---

## New Empty Set

### emptySet_testIsEmpty

Checked error, this was not returning true for the array being empty, checked `ArraySet.java` and found that `isEmpty()` was returning true on `rear > 0` changed to return true if `rear == 0`

---

## [ ] -> add(A) [A]

### emptySet_addA_A_testIsEmpty

This error appeared after fixing the `isEmpty()` method. Running the debug I found the error was what I assumed. Adding `rear++;` to the add method fixed the issue since it was not incrementing prior.

### emptySet_addA_A_testSize

Fixing `isEmpty()` and `add()` resolved this issue

- this is due to the fact that incrementing rear properly makes the size reflect properly

### emptySet_addA_A_testContainsA

Fixing `isEmpty()` and `add()` resolved this issue

### emptySet_addA_A_testRemoveA

Fixing `isEmpty()` and `add()` resolved this issue

---

## SCENARIO: [A] -> remove(A) -> [ ]

### UNABLE TO RUN/COMPLETE test_A_removeA_emptySet

Fixing `isEmpty()` and `add()` resolved this issue

---

## SCENARIO: [A] -> add(A) -> [A]

### A_addA_A_testSize

Fixing `isEmpty()` and `add()` resolved this issue

### A_addA_A_testContainsA

Fixing `isEmpty()` and `add()` resolved this issue

### A_addA_A_testRemoveA

Fixing `isEmpty()` and `add()` resolved this issue

---

## SCENARIO: [A] -> add(B) -> [A,B]

### A_addB_AB_testSize

Fixing `isEmpty()` and `add()` resolved this issue

### A_addB_AB_testContainsA

Fixing `isEmpty()` and `add()` resolved this issue

### A_addB_AB_testContainsB

Fixing `isEmpty()` and `add()` resolved this issue

### A_addB_AB_testRemoveA

> testRemove caught unexpected java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
> java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
> at ArraySet.remove(ArraySet.java:77)
> at SetTester.testRemove(SetTester.java:602)
> at SetTester.test_A_addB_AB(SetTester.java:263)
> at SetTester.runTests(SetTester.java:73)
> at SetTester.main(SetTester.java:36)

While loop in `remove()` was looping too much considering that it was trying `setArray[i] = setArray[i + 1]` since it is taking `i + 1` we need to make the while loop stop one index before the rear. Changed while from `while (i < rear)` to `while (i < rear - 1)`.

### A_addB_AB_testRemoveB

> testRemove caught unexpected java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
> java.lang.ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 2
> at ArraySet.remove(ArraySet.java:77)
> at SetTester.testRemove(SetTester.java:602)
> at SetTester.test_A_addB_AB(SetTester.java:264)
> at SetTester.runTests(SetTester.java:73)
> at SetTester.main(SetTester.java:36)

While loop in `remove()` was looping too much considering that it was trying `setArray[i] = setArray[i + 1]` since it is taking `i + 1` we need to make the while loop stop one index before the rear. Changed while from `while (i < rear)` to `while (i < rear - 1)`.

---

## SCENARIO: [A,B] -> remove(A) -> [B]

### UNABLE TO RUN/COMPLETE test_AB_removeA_B

Resolved alongside the `remove()` fix above.

---

## SCENARIO: [A,B] -> remove(B) -> [A]

### UNABLE TO RUN/COMPLETE test_AB_removeA_B

Resolved alongside the `remove()` fix above.

---

## SCENARIO: [A,B] -> add(C) -> [A,B,C]

### AB_addC_ABC_testSize

Resolved alongside the `size()` fix above.

### AB_addC_ABC_testContainsA

Contains was not working properly as `rear` was not incrementing. `for (int i = 0; i < rear; i++)` would never run since rear was pinned at 0 instead of reflecting the size of the array.

### AB_addC_ABC_testContainsB

Contains was not working properly as `rear` was not incrementing. `for (int i = 0; i < rear; i++)` would never run since rear was pinned at 0 instead of reflecting the size of the array.

### AB_addC_ABC_testContainsC

Contains was not working properly as `rear` was not incrementing. `for (int i = 0; i < rear; i++)` would never run since rear was pinned at 0 instead of reflecting the size of the array.

### AB_addC_ABC_testRemoveA

Resolved alongside the `remove()` fix above.

### AB_addC_ABC_testRemoveB

Resolved alongside the `remove()` fix above.

### AB_addC_ABC_testRemoveC

Resolved alongside the `remove()` fix above.

---

## SCENARIO: [A,B,C] -> remove(A) -> [B,C]

### UNABLE TO RUN/COMPLETE test_ABC_removeA_BC

Resolved alongside the `remove()` fix above.

---

## SCENARIO: [A,B,C] -> remove(B) -> [A,C]

### UNABLE TO RUN/COMPLETE test_ABC_removeB_AC

Resolved alongside the `remove()` fix above.

---

## SCENARIO: [A,B,C] -> remove(C) -> [A,B]

### UNABLE TO RUN/COMPLETE test_ABC_removeB_AC

Resolved alongside the `remove()` fix above.

---

## SCENARIO: [] -> add 1000 elements
