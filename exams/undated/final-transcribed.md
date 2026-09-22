# Introduction to Algorithms - Final Exam

---

## Question 1

**(a) (9 points)** Give the asymptotic time-complexities of Insertion-, Merge-, and Quick-sort (i.e., with Hoare) when all the elements are identical.

**(b) (8 points)** Consider the following algorithm to sort a set $S$ of $n$ numbers:

**Algorithm** $SlowSort(S)$
1.  $\triangleright$ sorts set $S$ in increasing order
2.  **if** $|S| \le 1$
3.      **then return** $S$
4.      **else** $MinFound \leftarrow \text{false}$
5.      **while not** $MinFound$
6.          **do** Pick an element $x \in S$ uniformly at random; $minFound \leftarrow \text{true}$
7.          **for all** $y \in S$
8.              **do if** $y < x$ **then** $minFound \leftarrow \text{false}$
9.          $S' \leftarrow SlowSort(S \setminus \{x\})$
10.         **return** the sorted set obtained by concatenating $\{x\}$ and $S'$ (in that order)

Give the best, the worst, and average asymptotic running times of *SlowSort*. You may assume all numbers in $S$ are distinct and a previously unpicked element is picked at every execution of Line 6. Explain briefly.

---

## Question 2

A palindrome is a sequence of characters that reads the same backward as forward (e.g., "racecar"). Given a string $S$ of length $n$, your goal is to find the length of the longest subsequence that is a palindrome. A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements. Your goal is to find the length of the longest palindromic subsequence in a given string $S$ consisting of lowercase English letters.

**Examples:**
* **Input:** $S = [c, a, g, b, d, d, b, a]$ **Output:** 6 **Explanation:** "abddba".
* **Input:** $S = [c, h, a, r, a, c, t, e, r]$ **Output:** 5 **Explanation:** "carac".
* **Input:** $S = [s, o, s]$ **Output:** 3 **Explanation:** "sos".

**(a) (10 points)** Provide a mathematical recursive formulation for the length of the longest palindromic subsequence in an input string. The name of your function must be $longestPS$.

**(b) (10 points)** Write the pseudocode for a corresponding dynamic programming algorithm. Give running time.

**(c) (5 points)** Using $S = [m, e, l, t, e, m]$, fill in a table storing the length of the longest palindromic subsequence for every subproblem.

---

## Question 3

You are a cashier tasked with making change for a customer using the fewest number of coins possible. You are given $n$ coin denominations $\{c_1, c_2, \dots, c_n\}$ and a target value $V$. Your goal is to determine the minimum number of coins needed to make change for $V$ (or report that it is impossible).

**Input:** An array of coin denominations $\{c_1, c_2, \dots, c_n\}$ and an integer $V$ representing the target value.
**Output:** An integer representing the minimum number of coins needed to make the change for $V$, or a message stating that it is impossible.

**Examples:**
* **Input:** $\{1, 5, 10, 25, 50\}$, $V = 63$ **Output:** 5 **Explanation:** $63 = 50 + 10 + 1 + 1 + 1$ (5 coins).
* **Input:** $\{1, 7, 10, 20, 50\}$, $V = 24$ **Output:** 3 **Explanation:** $24 = 10 + 7 + 7$ (3 coins).
* **Input:** $\{1, 3, 4\}$, $V = 6$ **Output:** 2 **Explanation:** $6 = 3 + 3$ (2 coins).

**(a) (15 points)** Write a mathematical recursive formulation for the minimum number of coins needed to make change for $V$. The name of your function must be $minCoins$.

**(b) (10 points)** Using the coin denominations $\{1, 3, 4\}$ and a target value $V = 6$, fill in the table that stores the minimum number of coins required for each value from $0$ to $V$.

---

## Question 4

You are an art collector preparing for a prestigious auction in Paris. You have a collection of $n$ rare paintings, each with a monetary value $v_i$ and a cultural significance $s_i$. You will transport these paintings using two secured containers, with maximum weight capacities of $W_1$ and $W_2$. Your objective is to select a subset of these paintings to include in the auction, maximizing the total cultural significance while staying within the weight constraints.

**Example Input:**
* $W = [5, 2, 9, 4, 3]$ and $S = [8, 3, 10, 8, 4]$ (weights and cultural significances of the paintings)
* $W_1 = 10$ and $W_2 = 7$ (maximum weight capacities of the containers)

**Expected Output:** The maximum cultural significance that can be achieved without exceeding the weight constraints for the two containers.

**(a) (15 points)** Write down a recursive formulation of the maximum total cultural significance the collector can bring to the auction. Your function name must be $maxCS$.

**(b) (10 points)** Given two arrays of $W$ and $S$, both of length $n$, holding the individual paintings' weights and significances, respectively, and the maximum weight capacities $W_1$ and $W_2$ of the two containers, write a dynamic programming algorithm for finding the maximum significance. Give its running time.

---

## Question 5

A manufacturing company has received several job requests, each with a specific deadline and profit associated with completing it. Each job takes exactly one unit of time, and the minimum possible deadline for any job is 1. The company can only complete one job at a time. The goal is to schedule the jobs to maximize the total profit while ensuring no job is completed after its deadline. Below is an example output for the optimal scheduling solution to this problem:

**Input:** Five Jobs with following deadlines and profits

| JobID | Deadline | Profit |
| :---: | :---: | :---: |
| a | 2 | 100 |
| b | 1 | 19 |
| c | 2 | 27 |
| d | 1 | 25 |
| e | 3 | 15 |

**Output:** Following is maximum profit sequence of jobs
$$c, a, e$$

**(a) (10 points)** Clearly describe a greedy algorithm to solve this job scheduling problem. Answers that are unclear, uncertain, vague, or ambiguous will not be graded.

**(b) (10 points)** Prove that the greedy choice made by your algorithm results in the optimal solution.