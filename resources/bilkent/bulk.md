Here is the comprehensive analysis and transcription of the provided examination papers and lecture notes, structured by topic and exam session.

---

# Part 1: Dynamic Programming (Grid & Path Problems)

## Document: MWE 4, Session 2 (April 27, 2020)
**Context:** Bilkent University CS 473/573 Midweek Exam.

### Question 2: The Climber Problem
**Problem Description:**
A climber wants to climb a wall made of an $m \times n$ grid of blocks $D = (d_{ij})$. Each block has a danger cost $d_{ij}$.
*   **Start:** Any block in the first row (bottom, index 1).
*   **Goal:** Reach the top row (index $m$) with the minimum total danger cost.
*   **Moves:** From block $(i, j)$, the climber can move to:
    1.  $(i+1, j-1)$ (Upper-Left, if $j > 1$)
    2.  $(i+1, j)$ (Directly Above)
    3.  $(i+1, j+1)$ (Upper-Right, if $j < n$)

**Visual Analysis (Grid Example):**
The document provides a sample $4 \times 5$ grid ($m=4, n=5$).
*   **Row 4 (Top):** `[2, 8, 9, 5, 8]` (The 4th value, **5**, is bold/highlighted).
*   **Row 3:** `[4, 4, 6, 2, 3]` (The 4th value, **2**, is bold/highlighted).
*   **Row 2:** `[5, 7, 5, 6, 1]` (The 5th value, **1**, is bold/highlighted).
*   **Row 1 (Bottom):** `[3, 2, 5, 4, 8]` (The 4th value, **4**, is bold/highlighted).

**Trace of the Least Dangerous Path:**
Start at Row 1, Col 4 (Cost 4) $\rightarrow$ Move Upper-Right to Row 2, Col 5 (Cost 1) $\rightarrow$ Move Upper-Left to Row 3, Col 4 (Cost 2) $\rightarrow$ Move Directly Up to Row 4, Col 4 (Cost 5).
**Total Cost:** $4 + 1 + 2 + 5 = 12$.

**Requirements:**
a. **Recursive Definition:** Define the value of an optimal solution.
b. **Pseudo-code:** Write a bottom-up algorithm (Step 3 of DP) to compute the cost.

---

## Document: Midweek Exam III (Dec 6, 2020)
**Context:** CS 473/573 Midweek Exam.

### Q2: Bus Routes Counting (Basic)
**Problem Description:**
A city has $n \times n$ districts. From a district, there are at most 5 outgoing bus routes. Routes only go rightwards or downwards.
*   **Goal:** Compute the number of possible ways ($m_{i,j}$) to reach the bottom-right district $D[n][n]$ from top-left $D[1][1]$.
*   **Complexity:** $O(n^2)$.

**Visual Analysis (Bus Route Diagrams):**
The image displays a $4 \times 4$ grid to illustrate specific moves from a source 'S' to a target 'T'.
*   **Route 1:** From $S$ moves Right, then Down to $T$. (Diagonal equivalent).
*   **Route 2:** From $S$ moves immediately Right to $T$.
*   **Route 3:** From $S$ moves immediately Down to $T$.
*   **Route 4:** From $S$ moves Down, then Right to $T$.
*   **Route 5:** From $S$ moves Down, Down (crossing a cell), then Right? (The arrow implies a specific L-shaped jump).

**Requirements:**
*   Recursive definition for $m_{i,j}$.
*   Pseudocode for bottom-up calculation.

### Q3: Bus Routes with Constraints
**Problem Description:**
Same setup as Q2, but with a constraint: **The same route type cannot be taken in two successive selections.**
*   *Example:* If you took Route $i$ to get to current district, you cannot choose Route $i$ to leave it.
**Requirements:**
*   Define the table(s) needed for DP.
*   Provide the recursive formulation.

---

# Part 2: Dynamic Programming (Optimization & Strings)

## Document: Final Exam, Session 4 (June 12, 2020)
### Q4: Canoe Trip
**Problem Description:**
Plan a canoe trip from post 1 to post $n$.
*   Rent at post $i$, drop off at post $j$ ($i < j$).
*   Cost is given by $R[i, j]$.
*   **Goal:** Minimize total cost from 1 to $n$.

**Visual Analysis (Cost Table Example):**
A matrix $R[i, j]$ is shown for 4 posts:
| i \ j | 1 | 2 | 3 | 4 |
| :--- | :--- | :--- | :--- | :--- |
| **1** | - | 10 | 15 | 50 |
| **2** | - | - | 40 | 20 |
| **3** | - | - | - | 35 |
| **4** | - | - | - | - |

**Optimal Path Example:**
Rent $1 \to 2$ (Cost 10) + Rent $2 \to 4$ (Cost 20) = **Total 30**.
(Direct $1 \to 4$ is 50. Path $1 \to 3 \to 4$ is $15 + 35 = 50$).

---

## Document: Lecture Slides & Sample Solutions
### Longest Palindromic Subsequence (LPS)
**Problem:** Find the longest subsequence of $X$ that reads the same backward and forward.
*   **Input:** $X = \langle x_1, \dots, x_n \rangle$.
*   **Recursive Logic:**
    *   If $x_i == x_j$: $2 + LPS(i+1, j-1)$
    *   If $x_i \neq x_j$: $\max(LPS(i+1, j), LPS(i, j-1))$
*   **Visual Analysis (Recursion Tree):** A tree showing overlapping subproblems for a sequence of length 5 (e.g., $X_{1,5}$ branches to $X_{2,4}$, $X_{2,5}$, $X_{1,4}$ etc.), demonstrating the need for DP over Divide-and-Conquer.

### Subset Sum Problem
**Problem:** Given set $X$ and integer $B$, find a subset with sum $\le B$ that maximizes the sum.
**DP State:** $c[i, b]$ = optimal solution using first $i$ items with limit $b$.
**Recurrence:** $c[i, b] = \max(x_i + c[i-1, b-x_i], c[i-1, b])$ if $x_i \le b$, else $c[i-1, b]$.

### Coin Change Problem
**Problem:** Make amount $n$ using minimum number of coins from denominations $d_1 \dots d_k$.
**DP State:** $m[i]$ = min coins for amount $i$.
**Recurrence:** $m[i] = \min_{1 \le j \le k} (m[i - d_j] + 1)$.
**Visual Analysis (Greedy Failure):**
*   Coins: 1¢, 3¢, 4¢. Target: 6¢.
*   Greedy (largest first): $4 + 1 + 1$ (3 coins).
*   Optimal: $3 + 3$ (2 coins).
*   The DP table visualization shows arrows pointing back to $i - 1, i - 3, i - 4$.

### Sequence Alignment (Midweek Exam 5 Solution)
**Problem:** Align strings $X$ and $Y$ with minimum penalty.
*   $p_{xy}$: Mismatch penalty.
*   $p_{gap}$: Gap penalty.
**Recurrence:**
$DP[i][j] = \min \begin{cases} DP[i-1][j-1] & \text{if } x_i = y_j \\ DP[i-1][j-1] + p_{xy} & \text{mismatch} \\ DP[i-1][j] + p_{gap} & \text{gap in Y} \\ DP[i][j-1] + p_{gap} & \text{gap in X} \end{cases}$

### Fantasy Basketball (2019-2020 Exam)
**Problem:** Select 5 players with 100 credits to maximize score.
**Input:** List of players (Name, Price, Score).
**Questions:**
1.  Max score with *unlimited* players but 100 credits (Unbounded Knapsack).
2.  Max score with exactly 5 players and 100 credits (Constrained Knapsack).

---

# Part 3: Asymptotic Analysis & Recurrences

## Document: Final Exam, Session 1 (June 12, 2020)
### Q1: Asymptotic Comparisons
The user must determine if $f(n) = \omega, \Omega, \Theta, O, o$ of $g(n)$.
1.  $f(n) = (n+1)\lg n^2$, $g(n) = n\sqrt{n} / 2$.
    *   $f(n) \approx 2n \lg n$. $g(n) \approx n^{1.5}$. $g$ grows faster.
2.  $f(n) = 2 \lg n + n^{0.1}$, $g(n) = (\lg n)^{1.5}$.
    *   Polynomial $n^{0.1}$ dominates polylog. $f$ grows faster.
3.  $f(n) = 3(\lg n)^{2 \lg n}$, $g(n) = (\lg n)^3 + (\lg n)^2$.
    *   Note: $(\lg n)^{2 \lg n} = n^{2 \lg \lg n}$ (super-polynomial). $f$ grows much faster.
4.  Rational functions and exponentials ($8^n$ vs $3^{2n+8}$).

### Recurrences (Master & Substitution)
*   $T(n) = 8T(n/2) + n^2$. (Master Theorem Case 1, $\log_2 8 = 3$, $n^2 = O(n^{3-\epsilon})$. $T(n) = \Theta(n^3)$).

## Document: Makeup MWE (May 21, 2020)
### Q1: Bounds
*   **Recurrences:**
    1.  $T(n) = 64T(n/4) + 8^{\lg n}$. Note: $8^{\lg n} = n^{\lg 8} = n^3$. $a=64, b=4, \log_4 64 = 3$. Case 2: $T(n) = \Theta(n^3 \log n)$.
    2.  $T(n) = 5T(n/2) + 10\sqrt{n}$.
    3.  $T(n) = T(n/2) + 2\log^2 n$.

---

# Part 4: Algorithms & Data Structures

## Document: Final Exam, Session 3 (June 12, 2020)
### Q3: k Closest Numbers
**Problem:** Given array $A[1..n]$ and integer $k$, find $k$ numbers in $A$ closest to the $k^{th}$ smallest number in $A$.
**Constraint:** Worst-case linear time $O(n)$.
**Algorithm Idea:**
1.  Find the $k^{th}$ smallest number (median of medians / Random Select). Let's call it $x$.
2.  Calculate distances $|A[i] - x|$ for all $i$.
3.  Find the $k^{th}$ smallest *distance* using Select algorithm.
4.  Filter items with distance $\le$ that threshold.

## Document: Practice Final Exam (Fall 2024)
### Q1: Nesting Boxes
**Problem:** Set of $n$ rectangular boxes (dimensions $h, w, d$). Box A nests in B if sorted dims of A < sorted dims of B. Minimize visible boxes (maximize nesting).
**Solution:** Equivalent to finding Maximum Path Cover in a DAG or Longest Chain if simple nesting.

### Q2: Randomized Mergesort
**Code:** Randomly copies to $L$ or $R$ with $p=1/2$, recurses, then merges.
**Questions:** Probability analysis of depth and comparisons.

### Q4: Random Walk on DAG
**Visual:** A graph with Source $s$, Sink $t$, intermediate $u, v$.
*   Edges: $s \to u (1/3)$, $s \to v (1/3)$, $s \to t (1/3)$.
*   $u \to v (1/2)$, $u \to t (1/2)$.
*   $v \to t (1)$.
**Task:** Compute probability of visiting vertex $v$ and expected number of edges.

## Document: Handwritten Notes
### Q2: Grouping Employees
**Problem:** Sort $n$ employees into $k$ equal-sized groups $G_1 \dots G_k$ such that all in $G_i <$ all in $G_{i+1}$.
**Requirement:** $O(n \lg k)$ time.
**Solution Idea:** This is equivalent to finding quantiles. Use Median-of-Medians to find the $(n/k)$-th element, partition, repeat. Or a modification of QuickSort/MergeSort limited to depth $\lg k$.

### Q3: Largest i Numbers
**Comparing Algorithms:**
1.  Sort and take $i$: $O(n \lg n)$.
2.  Build Max-Heap ($O(n)$) + $i$ Extract-Max ($i \lg n$): Total $O(n + i \lg n)$.
**Improved Algorithm:**
If $i$ is small, Heap is better. If $i \approx n$, Sorting is $\Theta(n \lg n)$.
Linear time selection algorithm can find the $i$-th largest in $O(n)$, then partition.

---

# Part 5: Greedy Algorithms

## Document: CS 473/573 Duration 30 Minutes
### Q2: T-Shirt Distribution
**Problem:** $n$ people (weights $P$), $m$ T-shirts (sizes $S$). Shirt $j$ fits person $i$ if $S[j] - t \le P[i] \le S[j] + t$. Maximize distribution.
**Greedy Strategy:** Sort people and shirts. Try to match the smallest person with the smallest available compatible shirt (or tightest fit).

## Document: Midweek Exam 5 (Q2)
### House Clustering
**Problem:** Houses at positions $A[]$. Cluster into sets of at least 4 consecutive houses with width $\le k$. Maximize clusters.
**Greedy Choice:** Start from left. Try to form the earliest possible valid cluster (4 houses within range $k$). If $A[i+3] - A[i] \le k$, form cluster $\{i, i+1, i+2, i+3\}$ and recurse on remaining.

## Document: Midweek Exam 4 (Q2) - Targets
### Target Shooting
**Problem:** Targets at $(x, y)$. Shoot bullets vertically (fixed $x$, all $y$). Maximize targets per bullet? Or cover all targets with min bullets?
**Visual:** Red horizontal bars representing targets at different $y$ levels spanning $x$ intervals. (Actually, the text says "shoot special bullets that do not stop... moving parallel to y-axis". Input is $x$-intervals $[s_i, e_i]$. This is the Interval Stabbing Problem).
**Greedy:** Sort intervals by end coordinate. Shoot at the end coordinate of the first ending interval. Remove hit targets. Repeat.

## Document: Midweek Exam 5 (Q1)
### T-Distance Subset
**Problem:** Select max subset $S$ from $A$ such that $|x - y| \ge T$ for all $x, y \in S$.
**Greedy:** Sort $A$. Pick minimal element. Pick next element that is $\ge$ previous $+ T$.

## Document: Handwritten Solutions (Art Gallery)
### Q3: Art Gallery Guarding (1D)
**Problem:** Paintings at locations $x_i$. Guard at $g$ covers $[g-1, g+1]$. Guard must be at a painting location. Min guards?
**Greedy:** Place guard at the furthest painting that covers the leftmost uncovered painting.
**Visual:** Paintings at 1.8, 2.2, 3.0, 4.2. Guards at 2.2 (covers 1.2-3.2, protecting 1.8, 2.2, 3.0) and 4.2.

---

# Part 6: Miscellaneous Handwritten Problems

## Floating Point Summation
**Problem:** Minimize rounding error $\sum p_i x_i$ ($p_i$ is depth).
**Solution:** Use Huffman Coding logic (Greedy). Sum the two smallest numbers, put result back, repeat. Order in tree determines summation structure.

## Job Scheduling (Lateness)
**Problem:** Jobs with length $t_i$ and deadline $d_i$. Minimize max lateness $L = \max(0, f_i - d_i)$.
**Greedy:** Earliest Deadline First (EDF). Sort by $d_i$.

## Pills and Bottles
**Problem:** Store pills in bottles. Minimize bottles (Greedy Bin Packing variation or Knapsack).
*   Solution notes discuss sorting by capacity or cost-per-unit.
