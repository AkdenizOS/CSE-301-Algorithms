Here is the comprehensive analysis and transcription of the provided exam papers, formatted in Markdown.

---

# Exam Document Analysis

**Course:** Introduction to Algorithms (Computer Engineering)
**Exam Type:** 2023 Make-up Exam / Final Exam (Note: Page 1 is labeled "Make-up", Page 2 is labeled "Final Exam")
**Date:** 01/02/2024
**Duration:** 60 minutes

---

## Page 1: Dynamic Programming (Knapsack Variation)

### Header Information
*   **Course Title:** Introduction to Algorithms
*   **Assessment:** 2023 Make-up Exam
*   **Date:** 01/02/2024
*   **Duration:** 60 minutes
*   **Department:** Computer Engineering
*   **Fields:** Student Number, Name & Signature.

### Question 1: The Museum Curator Problem
**Context:** The problem frames the student as a museum curator arranging an exhibition in Brussels.
**Goal:** Maximize total "cultural significance" of artifacts transported via two trucks with specific volume capacities.

**Variables Definitions:**
*   $n$: Number of solid artifacts.
*   $v_i$: Volume of the $i$-th artifact.
*   $s_i$: Cultural significance of the $i$-th artifact.
*   $V_1$: Maximum volume capacity of Truck 1.
*   $V_2$: Maximum volume capacity of Truck 2.

**Part (a) [15 points]**
*   **Task:** Write down a **recursive formulation** of the maximum total cultural significance.
*   **Constraint:** The function name must be `maxCS`.
*   **Analysis:** This requires defining the recurrence relation (likely involving the index of the item and the remaining capacity of both trucks) and base cases (when no items are left or capacities are zero).

**Part (b) [25 points]**
*   **Task:** Write a **dynamic programming algorithm** based on the inputs and give its **running time**.
*   **Inputs:**
    *   Array $V$ (lengths of artifacts).
    *   Array $S$ (significances).
    *   Capacities $V_1$ and $V_2$.
*   **Analysis:** This asks for the iterative solution (bottom-up approach) derived from part (a), usually involving a 3-dimensional table ($n \times V_1 \times V_2$) or a space-optimized version. The complexity expected is likely $O(n \cdot V_1 \cdot V_2)$.

---

## Page 2 (Image 2): Dynamic Programming (Edit Distance)

### Question 2: Minimum Edit Distance (MED)
**Context:** Given two strings $a_1a_2...a_n$ and $b_1b_2...b_m$, find the number of mismatches (edits) in an optimal alignment.

**Visual Analysis of Example 1:**
The document provides a visual alignment of the strings "SUNNY" and "SNOWY" to explain an edit distance of 3.
*   **Top Row:** S | U | N | N | _ | Y
*   **Bottom Row:** S | _ | N | O | W | Y
*   **Visual Interpretation:**
    *   Column 1: 'S' aligns with 'S' (Match).
    *   Column 2: 'U' aligns with a gap (Deletion from string 1).
    *   Column 3: 'N' aligns with 'N' (Match).
    *   Column 4: 'N' aligns with 'O' (Substitution).
    *   Column 5: A gap aligns with 'W' (Insertion into string 1).
    *   Column 6: 'Y' aligns with 'Y' (Match).

**Additional Examples:**
*   "INTENTION" vs "EXECUTION" $\rightarrow$ MED is 5.
*   "KITTEN" vs "SITTING" $\rightarrow$ MED is 3.

**Part (a) [15 points]**
*   **Task:** Write down a **recursive formulation** `minDist(k, l)` between substrings $a_1...a_k$ and $b_1...b_l$.
*   **Structure:** The exam provides a skeletal structure for the answer, indicating three specific subcases (corresponding to insertion, deletion, and substitution/match).
    *   Subcase (1): Likely relates to deletion (gap in string b).
    *   Subcase (2): Likely relates to insertion (gap in string a).
    *   Subcase (3): Likely relates to match/mismatch (diagonal movement).

**Part (b) [15 points]**
*   **Task:**
    1.  Fill in a DP table for the strings **"CAR"** and **"CHAIR"**.
    2.  **Mark the table entry** corresponding to the final solution.
*   **Analysis:** The student must draw a grid where one axis is C-A-R (plus an empty string base case) and the other is C-H-A-I-R. They must calculate the values cell by cell and identify the bottom-right cell as the answer.

---

## Page 2 (Image 3 & 4): Greedy Algorithms (Job Sequencing)

*Note: The header here reads "Final Exam - Page 2 of 2".*

### Question 3: Job Sequencing Problem
**Context:** A list of jobs is provided, each with a deadline and a profit.
**Constraints:**
*   Every job takes a **single unit of time**.
*   The minimum deadline is 1.
*   Only one job can be scheduled at a time.
*   **Goal:** Maximize total profit by finishing jobs before their deadlines.

**Input Data Table:**
The exam provides a specific dataset to illustrate the problem:

| JobID | Deadline | Profit |
| :---: | :---: | :---: |
| a | 2 | 100 |
| b | 1 | 19 |
| c | 2 | 27 |
| d | 1 | 25 |
| e | 3 | 15 |

**Example Output:**
*   "Following is maximum profit sequence of jobs: **c, a, e**"
    *   *Analysis of Example:* Job 'c' (profit 27) and Job 'a' (profit 100) are both due by time 2. To get both, one is done at t=1 and the other at t=2. Job 'e' is done at t=3.

**Part (a) [20 points]**
*   **Task:** Describe, in words, a **greedy algorithm** for this problem.
*   **Disclaimer:** "Unclear-uncertain vague-ambiguous answers will not be graded."
*   **Expected Answer Logic:** Sort all jobs in decreasing order of profit. Iterate through the sorted jobs and assign each to the latest possible free time slot available before its deadline.

**Part (b) [10 points]** (Visible in Image 4)
*   **Task:** **Prove** that your greedy choice leads to the optimal solution.
*   **Analysis:** This requires a formal argument, likely using an "exchange argument" (showing that if there is an optimal schedule that differs from the greedy one, the greedy choices can be swapped in without reducing profit) or proof by contradiction.
