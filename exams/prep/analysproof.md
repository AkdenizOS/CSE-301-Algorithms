Here is the complete, detailed analysis and transcription of the provided PDF documents in Markdown format.

---

# Document 1: ALGORITHMS FINAL

## **Question 1 (60 pts.)**
**Scenario:** Imagine a thief entering a house. In the house, there are infinitely many items that can have only one of three different weights: **1 kg, 3 kgs, and 5 kgs**. All of the items are discrete. The thief has a bag capacity of **$n$ kgs** and strangely, he wants to steal the **"smallest number of items"**.

*   **(a) (10 pts.)** Give a mathematical recursive formulation for $C(n)$ where $C(n)$ denotes the smallest number of items the thief can steal using a bag capacity of $n$.
*   **(b) (5 pts.)** Show that this problem has the overlapping subproblems property.
*   **(c) (15 pts.)** Write a recursive algorithm (as a pseudocode) that returns the smallest number of items the thief can steal using a bag capacity of $n$.
*   **(d) (5 pts.)** Show that the greedy choice of taking the largest weight items into the bag first fails to lead to an optimal solution.
*   **(e) (15 pts.)** Write a dynamic programming algorithm (as a pseudocode) for finding the smallest number of items the thief can steal using a bag capacity of $n$.
*   **(f) (10 pts.)** Provide the running time of your dynamic programming algorithm. Explain.

## **Question 2 (20 pts.)**
**Scenario:** Assume that you are creating an array data structure that has a fixed size of $n$. You want to backup and empty this array after every $n$ insertion operations. Unfortunately, the backup operation is quite expensive, it takes $n$ time to do the backup. Insertions without a backup just take 1 time unit. Show that you can do backups in $O(1)$ amortized time.

*   **(a) (10 pts.)** Use the **accounting method** for your proof. Explain in sufficient detail.
*   **(b) (10 pts.)** Use the **potential method** for your proof. Explain in sufficient detail.

## **Question 3 (20 pts.)**
**Scenario:** A university has two student clubs. The number of students registered to the first club is $m$ and their IDs are stored in an array $A$ (with $m$ elements) whereas the number of students registered to the second club is $n$ and their IDs are stored in an array $B$ (with $n$ elements), where $m \leq n$. A student might be registered to either one of these clubs or both. We want to decide how many students are registered to both clubs.

**Task:** Given two arrays $A$ and $B$ along with their lengths $m$ and $n$, write a **$O(m \log n)$ algorithm** (as a pseudocode) to find the number of elements that are registered to both clubs.

**Example:**
*   When $A$ is `[2, 6, 3, 9, 11, 8]`
*   And $B$ is `[3, 11, 7, 4, 2, 5, 1]`
*   The algorithm must return **3** (corresponding to IDs 2, 3, and 11).

**Instructions:** Inside your pseudocode, you are allowed to use functions that are already defined in class videos, slides, and book. Also, explain why your running time is $O(m \log n)$ in sufficient detail.

---

# Document 2: ALGORITHMS MAKE-UP EXAM

## **Question 1**
**Scenario:** A traveler wants to walk a road of a given distance $n$. There is a cafe on his/her road placed in **every discrete location $i \in \{1, 2, \dots, n\}$**. The traveler has to rest and have a coffee at some of these cafe locations, all of them having changing coffee prices depending on the **distance he has walked since the last location he rested**.

The prices for all possible distances are stored in a `price` array.
*   `price[1]` denotes the price to pay if s/he walked a distance of 1 since the last rest.
*   `price[2]` denotes the price to pay if s/he walked a distance of 2 since the last rest.
*   And so on.

**Example Logic:**
When $n = 9$:
*   If s/he firstly rests at location 3, price is `price[3]`.
*   Then, if s/he rests at location 5, distance traveled is $5-3=2$, so price is `price[2]`.
*   Then, if s/he rests at location 9, distance traveled is $9-5=4$, so price is `price[4]`.
*   Total price: `price[3] + price[2] + price[4]`.

**Goal:** Minimize the total price s/he has to pay.

### **Visual Description: Optimization Table**
The document provides a table demonstrating the calculation for $n = 4$ with a price array `price = [3, 2, 5, 9]`.

| Stop locations | Calculation Logic | Total price |
| :--- | :--- | :--- |
| **4** | Direct walk to 4 (distance 4). Uses `price[4]=9`. | **9** |
| **3, 4** | Stop at 3 (dist 3, cost 5) + Stop at 4 (dist 1, cost 3). | $5+3=$ **8** |
| **2, 4** | Stop at 2 (dist 2, cost 2) + Stop at 4 (dist 2, cost 2). | $2+2=$ **4** |
| **1, 4** | Stop at 1 (dist 1, cost 3) + Stop at 4 (dist 3, cost 5). | $3+5=$ **8** |
| **2, 3, 4** | Stop at 2 (cost 2) + Stop at 3 (dist 1, cost 3) + Stop at 4 (dist 1, cost 3). | $2+3+3=$ **8** |
| **1, 3, 4** | Stop at 1 (cost 3) + Stop at 3 (dist 2, cost 2) + Stop at 4 (cost 3). | $3+2+3=$ **8** |
| **1, 2, 4** | Stop at 1 (cost 3) + Stop at 2 (cost 3) + Stop at 4 (dist 2, cost 2). | $3+3+2=$ **8** |
| **1, 2, 3, 4** | Stop at every point (dist 1 each time). | $3+3+3+3=$ **12** |

*Note: The optimum locations to rest are 2 and 4, resulting in a minimum cost of 4.*

### **Questions:**
*   **a. (20 pts.)** Give a mathematical recursive formulation for $P(n)$ where $P(n)$ denotes the minimum price the traveler has to pay when he wants to walk a distance of $n$.
*   **b. (20 pts.)** Write a recursive algorithm (i.e., a pseudocode) that returns the minimum price the traveler has to pay when he wants to walk a distance of $n$.
*   **c. (20 pts.)** Give an example distance $n$ and a `price` array to show that the greedy choice of every time choosing to walk the distance, which does not exceed the total distance $n$ and would cost the minimum price at the next stop location, does not always lead to an optimum solution.
*   **d. (30 pts.)** Write a dynamic programming algorithm (i.e., a pseudocode) for finding the minimum price the traveler has to pay to walk a distance of $n$.
*   **e. (10 pts.)** Provide the running time of your dynamic programming algorithm. Explain.

**P.S.** It is extremely necessary to understand the question (e.g. what the `price` array holds).

---

# Document 3: ALGORITHMS TEKDERS SINAVI

## **Question 1**
**Scenario:** We are given a **complete binary tree** where nodes and edges have **positive weights**.
*   Node weights are stored in a 1-dimensional array **WN**.
*   Edge weights are stored in a 2-dimensional array **WE** where 0 denotes no edge.

**Goal:** Starting at the root of the tree and moving to either one of the children from the current node, find the **minimum total weight** (sum of node and edge weights) path from the root to any one of the leaves.

### **Visual Description: Tree Structure**
The document shows a diagram of a binary tree:
1.  **Level 1:** Root Node (Top).
2.  **Level 2:** Two children connected to the root.
3.  **Level 3:** Four children (two connected to the left child of the root, two connected to the right child of the root).
*   The structure implies 7 nodes total in this specific visual (Indices 1 through 7).

### **Data Example**
*   **Node weights array:** `WN = [ 3 4 2 6 1 9 8 8 5 ]`
*   **Edge weights array (Adjacency Matrix):**
    `WE = [`
    `[ 0 1 5 0 0 0 0 0 0 ]`
    `[ 0 0 0 6 2 0 0 0 0 ]`
    `[ 0 0 0 0 0 9 3 0 0 ]`
    `[ 0 0 0 0 0 0 0 6 4 ]`
    `... (remaining rows are all 0s)`
    `]`
*   **Example Output:** Min total weight path includes nodes **1-2-5** with total weight **9**.
    *   *Analysis of example:* Node 1 (3) -> Edge(1,2) cost 1 -> Node 2 (4) -> Edge(2,5) cost 2 -> Node 5 (1). Total: $3+1+4+2+1 = 11$?
    *   *Correction based on text:* The text says total weight 9. Let's re-read the node array indices. If 1-indexed: Node 1 is 3. Edge 1-2 is 1. Node 2 is 4. Edge 2-5 is 2. Node 5 is 1. Sum: 11.
    *   *Wait, check indices again:* The matrix row 1 (index 0?) has 1 and 5. If WN is 0-indexed: Node 0 (3) -> Edge 0-1 (1) -> Node 1 (4) -> Edge 1-4 (2) -> Node 4 (1). Sum = 3+1+4+2+1 = 11.
    *   *Hypothesis:* The example output text might be slightly disconnected from the exact array values or I am misinterpreting the specific "path includes nodes 1-2-5" indices vs values.
    *   *Wait, looking at the matrix:* Row 1 (index 0 in code usually, but let's assume 1-based for math context) has connection to col 2 (weight 1) and col 3 (weight 5). Row 2 connects to 4 (weight 6) and 5 (weight 2).
    *   Path 1->2->5:
        *   Node 1 (3).
        *   Edge 1->2 (1).
        *   Node 2 (4).
        *   Edge 2->5 (2).
        *   Node 5 (1).
        *   Sum: 3 + 1 + 4 + 2 + 1 = 11.
    *   *Alternative interpretation:* Maybe path weight only counts edges? 1+2 = 3. No, "sum of node and edge weights".
    *   *Let's check the text verbatim:* "Output: Min total weight path includes nodes 1-2-5 with total weight 9." (This implies there might be a typo in the provided numbers vs the solution, or the 'nodes' in the path list refer to indices and the values are different, but the transcription is faithful to the provided text).

**Sub-questions:**
1.  Implement the **greedy algorithm** (write a function) of choosing the child with smallest sum of edge and node weights each time.
2.  Implement a **recursive algorithm** (write a function) to find the minimum total weight. Determine input parameters. Give time complexity. Show work.
3.  Implement a **dynamic programming algorithm**. Determine input parameters. Give time complexity. Show work.
4.  In your **main function**:
    *   (a) Show that the greedy algorithm does not solve this problem optimally.
    *   (b) Run each of the recursive and dynamic functions with three different input sizes and compute the actual running times. Provide a 2x3 table involving the actual running times.

## **Question 2**
You are given a **sorted array A of $n$ distinct integers**, drawn from 1 to $m$ where $n < m$. That is, $A$ is a subset of $[1, 2, \dots, m]$.
**Task:** Implement an **$O(\log n)$ time algorithm** (write a function) to find the **smallest non-negative integer that is missing** in $A$ given as a parameter.
**Example:** When $A$ is `[1, 2, 3, 5, 7, 8, 10]`, the function must return **4**.

## **Question 3**
**Task:** Implement an **$O(n)$ algorithm** that, given a set $S$ of $n$ distinct numbers and a positive integer $k \leq n$, determines the **$k$ numbers in $S$ that have the closest value to the median of $S$**.

---

## **Question 4 (From Document 3, Page 2)**
**Scenario:** Given an unsorted array, the array has this property that every element in the array is at most **$k$ distance from its position in sorted array** where $k$ is a positive integer smaller than the size of the array.
**Example:** Consider $k=2$. An element at index 7 in the sorted array can be at indexes 5, 6, 7, 8, 9 in the given array.
We can sort such arrays more efficiently with the help of **Heap data structure**.

**Task:** Implement the following algorithm that uses a Heap:
1.  Create a **Min Heap of size $k+1$** with first $k+1$ elements.
2.  One by one **remove min element from heap**, put it in result array, and **add a new element to heap** from remaining elements.

**Bonus:** If you implement your own heap data structure rather than using available libraries, you will gain 10 bonus pts.

---

# Document 4: Handwritten Notes

## **Page 1**
**Question 1:**
Given a rod of length $n$ inches and an array $A[1\dots n]$ of prices that includes prices of all pieces of discrete sizes smaller than or equal to $n$. Determine the **maximum value obtainable** by cutting up the rod and selling the pieces.
*Example:* If length is 8 and values of different pieces are given, max obtainable value is 22.

*   **(a)** Give a mathematical recursive formulation for $R(n)$ which denotes the maximum possible prices value you can get for a rod of length $n$.
*   **(b)** Overlapping [subproblems].
*   **(c)** Dynamic program find max.
*   **(d)** Provide the running time of your dynamic algorithm program.

**Question 2:**
You are given an array of jobs where every job takes a single unit. Also every job has a deadline.

| Job | Deadline | Profits |
| :--- | :--- | :--- |
| a | 2 | 100 |
| b | 1 | 19 |
| c | 2 | 27 |
| d | 1 | 25 |
| e | 3 | 15 |

*   The max profit sequence of jobs is **a, c, e**.
*   Thus, the min possible deadline for any job is 1. If only one job can be scheduled at a time, the job sequencing problem is to maximize total profit.
*   $\rightarrow$ Greedy alg. $\rightarrow$ for job sequencing.
*   $\rightarrow$ Choice is optimal proof.

## **Page 2**

**Question 3 (Matches Document 1, Q2):**
Assume you are creating an array data structure that has a fixed size of $n$. You want to backup this array after every $n$ insertion operations. Unfortunately, the backup operation is quite expensive, it takes $n$ time to do the backup. Insertions without a backup just take 1 time unit. Show that you can do backups in $O(1)$ amortized time. **Use potential method.**

**Question 4 (Matches Document 3, Q4):**
Given an unsorted array, the array has this property that every element in array is at most $k$ distance from its position in sorted array where $k$ is a variable smaller than size of array. For example, let us consider $k$ is 2, an element at index 7 in sorted array, can be at indexes 5, 6, 7, 8, 9 in the given array. We can sort such arrays more efficiently with the help of Heap data structure.

**Following is the sorting algorithm that uses Min-Heap:**
*   Create min-heap of size $k+1$ with first $k+1$ elements.
*   One by one remove min element from heap, put it in result array, and add a new element to heap from remaining elements.

**Task:** Provide a **tight asymptotic upper bound** for this algorithm. Explain briefly.
