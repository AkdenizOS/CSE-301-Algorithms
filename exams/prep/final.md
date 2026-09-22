Here is the detailed analysis of the "ALGORITHMS FINAL" exam paper provided in the image.

# **ALGORITHMS FINAL - Exam Paper Analysis**

## **Document Overview**
**Type:** Academic Final Examination  
**Subject:** Computer Science / Algorithms  
**Structure:** The exam consists of **3 main questions** with multiple sub-parts.
**Visuals:** The document is text-based with standard academic formatting. Key variables ($n$, $m$, $A$, $B$) and list elements are italicized or bracketed for clarity.

---

## **Detailed Content Breakdown**

### **Question 1: The "Thief with a Bag" Problem (60 pts.)**
This question is a variation of the classic **"Coin Change Problem"** (specifically the *Minimum Coin Change* variant), framed as a thief stealing items of specific weights.

*   **Problem Scenario:**
    *   **Goal:** Steal the **smallest number of items**.
    *   **Constraint:** Bag capacity is **$n$ kgs**.
    *   **Available Weights:** Infinite supply of items weighing **1 kg**, **3 kgs**, and **5 kgs**.
    *   **Nature of Items:** Discrete (cannot take partial items).

*   **Sub-questions:**
    *   **(a) (10 pts.) Mathematical Recursive Formulation:**
        *   The student must define $C(n)$ (min items for capacity $n$).
        *   *Conceptual Answer:* $C(n) = 1 + \min(C(n-1), C(n-3), C(n-5))$ with a base case of $C(0)=0$.
    *   **(b) (5 pts.) Overlapping Subproblems Property:**
        *   The student must demonstrate that solving for a large $n$ requires re-calculating the same smaller $n$ values multiple times (e.g., $C(6)$ needs $C(5)$ and $C(3)$; $C(5)$ also needs $C(3)$).
    *   **(c) (15 pts.) Recursive Algorithm (Pseudocode):**
        *   Write the code corresponding to the formula in part (a), likely a direct naive recursion without memoization.
    *   **(d) (5 pts.) Greedy Choice Failure:**
        *   The student must prove that always taking the largest available item (Greedy approach) does not always yield the optimal (smallest number) solution.
        *   *Note:* While $\{1, 3, 5\}$ is often a canonical set where greedy *does* work, the question explicitly asks to show it fails, or perhaps to discuss the general failure of greedy logic in this class of problems (Knapsack/Coin Change).
    *   **(e) (15 pts.) Dynamic Programming Algorithm (Pseudocode):**
        *   The student must provide an optimized solution using **Dynamic Programming** (either Memoization or Tabulation) to solve the problem efficiently, avoiding the recalculation of subproblems.
    *   **(f) (10 pts.) Running Time Analysis:**
        *   Explain the time complexity of the DP solution, which is typically $O(n)$ for this specific setup (since the number of weight types is constant).

---

### **Question 2: Amortized Analysis (20 pts.)**
This question tests the student's understanding of **Amortized Analysis**, specifically regarding array operations and backup costs.

*   **Problem Scenario:**
    *   **Data Structure:** Array of fixed size $n$.
    *   **Operation:** Empty/Backup the array after every $n$ insertion operations.
    *   **Costs:**
        *   Standard Insertion: **1 time unit**.
        *   Backup Operation: **$n$ time units**.
    *   **Goal:** Prove that the amortized time for backups is **$O(1)$**.

*   **Sub-questions:**
    *   **(a) (10 pts.) Accounting Method:**
        *   The student must assign a "charge" (amortized cost) to each insertion that is higher than the actual cost, banking the excess credit to pay for the expensive backup when it occurs. (e.g., Charge 2 units: 1 for insertion, 1 saved for the future backup).
    *   **(b) (10 pts.) Potential Method:**
        *   The student must define a potential function $\Phi$ (Phi) that maps the state of the data structure to a non-negative number (potential energy). This potential should increase with cheap operations and decrease to pay for the expensive operation.

---

### **Question 3: Intersection of Arrays (20 pts.)**
This question focuses on algorithm design involving arrays, sorting, searching, and complexity constraints.

*   **Problem Scenario:**
    *   **Context:** Two student clubs with member IDs.
    *   **Inputs:**
        *   Array $A$ with length $m$.
        *   Array $B$ with length $n$.
        *   Constraint: $m \le n$.
    *   **Goal:** Find the **count** of students registered in **both** clubs (Intersection size).
    *   **Example:**
        *   $A = [2, 6, 3, 9, 11, 8]$
        *   $B = [3, 11, 7, 4, 2, 5, 1]$
        *   Intersection: $\{2, 3, 11\}$ $\rightarrow$ Result: **3**.

*   **Requirements:**
    *   **Complexity:** The algorithm must run in **$O(m \log n)$**.
    *   **Format:** Pseudocode.
    *   **Allowed Tools:** Functions defined in class (likely implying standard Sort or Binary Search functions).
    *   **Explanation:** Detail why the code meets the specific $O(m \log n)$ requirement.

*   **Algorithmic Insight:**
    *   Since $m \le n$ and the target is $O(m \log n)$, a standard $O(n \log n)$ sort of the larger array would be too slow if $n$ is significantly larger than $m$.
    *   The specific complexity suggests iterating through the smaller array $A$ ($m$ times) and performing a binary search on the larger array $B$ (taking $\log n$). However, binary search requires $B$ to be sorted.
    *   *Critical Analysis:* If $B$ is not pre-sorted, sorting it takes $O(n \log n)$. If the question strictly demands $O(m \log n)$, it implies either:
        1.  $B$ is assumed sorted (though the example shows it unsorted).
        2.  The student must sort $A$ ($O(m \log m)$) and perform binary searches, but the complexity implies the logarithm is of $n$.
        3.  The intended solution is to iterate through $A$ and binary search $B$, assuming the sorting cost is separate or the prompt implies a specific technique discussed in class (e.g., if a structure like a Heap was already present).
    *   Given the prompt "A student might be registered to either one...", and the specific complexity target, the expected answer is likely: **Iterate through $A$, and for each element, Binary Search in $B$** (noting that $B$ needs to be treated as a searchable structure).
