Here is the detailed transcription and explanation of the slides in Markdown format.

# CS473 - Algorithms I: Other Dynamic Programming Problems
**Instructors:** Cevdet Aykanat and Mustafa Ozdal
**Department:** Computer Engineering Department, Bilkent University

---

## Part 1: Problem 1 - Subset Sum

### Slide 3: Subset-Sum Problem Definition

**Given:**
*   A set of integers $X = \{x_1, x_2, \dots, x_n\}$
*   An integer $B$

**Find:**
*   A subset of $X$ that has the **maximum sum not exceeding** $B$.

**Notation:**
*   $S_{n,B} = \{x_1, x_2, \dots, x_n : B\}$ represents the subset-sum problem where:
    *   The integers to choose from are $x_1, x_2, \dots, x_n$.
    *   The desired target sum limit is $B$.

---

### Slide 4: Subset-Sum Example

**Dataset:**
We are given a set $X$ with 12 integers and a target limit $B = 99$.
$S_{12, 99}: \{20, 30, 14, 70, 40, 50, 15, 25, 80, 60, 10, 95 : 99\}$

**Goal:**
Find a subset of $X$ with the maximum sum $\le 99$.

**An Optimal Solution ($N_{opt}$):**
The slide identifies the optimal subset containing indices 1, 3, 5, and 8.
*   **Selected Values:** $\{20, 14, 40, 25\}$
*   **Sum:** $20 + 14 + 40 + 25 = 99$

---

### Slide 5: Optimal Substructure Property

**Concept:**
Consider the solution as a sequence of $n$ decisions. The $i^{th}$ decision is simply: *do we pick number $x_i$ or not?*

**Definitions:**
*   Let $N_{opt}$ be an optimal solution for the problem $S_{n,B}$.
*   Let $x_k$ be the **highest-indexed number** actually chosen in $N_{opt}$.

**Visual Description:**
The slide displays a horizontal block diagram representing the set $N_{opt}$.
*   The entire block represents the optimal set $N_{opt}$ for the problem $S_{n,B}$.
*   The last block on the right is highlighted as $x_k$ (the item with the highest index).
*   The remaining portion of the block (to the left of $x_k$) is labeled $N'_{opt}$.
*   Equation: $N'_{opt} = N_{opt} - \{x_k\}$.

---

### Slide 6: Optimal Substructure Property (Lemma)

**Lemma:**
$N'_{opt} = N_{opt} - \{x_k\}$ is an optimal solution for the subproblem $S_{k-1, B-x_k} = \{x_1, x_2, \dots, x_{k-1} : B-x_k\}$.

**Cost Relationship:**
$c(N_{opt}) = x_k + c(N'_{opt})$
*(Where $c(N)$ denotes the sum of all numbers in subset $N$)*.

**Visual Description:**
The visual from the previous slide is expanded:
*   **Top Bar:** Represents $N_{opt}$, labeled as "optimal for $S_{n,B}$".
*   **Bottom Bar:** Represents the decomposition.
    *   The rightmost segment is $x_k$.
    *   The larger left segment is $N'_{opt}$. It is explicitly labeled as **"optimal for $S_{k-1, B-x_k}$"**.

---

### Slide 7: Optimal Substructure Property - Proof

**Proof by Contradiction:**
1.  Assume there exists another solution $A'$ for the subproblem $S_{k-1, B-x_k}$ that is better than $N'_{opt}$.
    *   This implies: $c(A') > c(N'_{opt})$ and $c(A') \le B - x_k$.
2.  We can construct a new solution $A$ for the original problem by adding $x_k$ to $A'$.
    *   $A = A' \cup \{x_k\}$.
3.  Calculate the cost of $A$:
    *   $c(A) = c(A') + x_k$
    *   Since $c(A') > c(N'_{opt})$, it follows that $c(A') + x_k > c(N'_{opt}) + x_k$.
    *   Therefore, $c(A) > c(N_{opt})$.
4.  **Contradiction!** $N_{opt}$ was assumed to be the optimal solution for $S_{n,B}$. Therefore, a better solution $A'$ cannot exist.

---

### Slide 8: Optimal Substructure Property - Example

**Applying the Lemma to the Example from Slide 4:**

**Original Problem:**
$S_{12, 99}$ with set $\{20, 30, 14, 70, 40, 50, 15, 25, 80, 60, 10, 95\}$.
Optimal Solution $N_{opt} = \{20, 14, 40, 25\}$.
The highest indexed number in the solution is $x_8 = 25$.

**Decomposition:**
Remove $x_8$ (25) from the solution.
*   **Remaining Subset ($N'_{opt}$):** $\{20, 14, 40\}$
*   **New Subproblem:** $S_{7, 74}$ (Indices 1 through 7, Target $99 - 25 = 74$).
    *   The set is $\{20, 30, 14, 70, 40, 50, 15\}$.
*   $N'_{opt}$ is the optimal solution for this subproblem.
*   **Check:** $c(N_{opt}) = 25 + c(N'_{opt}) \rightarrow 99 = 25 + 74$.

---

### Slide 9: Recursive Definition of an Optimal Solution

Let $c[i, b]$ be the value (sum) of an optimal solution for the subproblem $S_{i,b} = \{x_1, \dots, x_i : b\}$.

**Recurrence Relation:**
$$
c[i, b] = \begin{cases} 
      0 & \text{if } i = 0 \text{ or } b = 0 \\
      c[i-1, b] & \text{if } x_i > b \\
      \max \{ x_i + c[i-1, b-x_i], \quad c[i-1, b] \} & \text{if } i > 0 \text{ and } b \ge x_i 
\end{cases}
$$

**Interpretation:**
An optimal solution $N_{i,b}$ for $S_{i,b}$:
1.  **Either contains $x_i$:** Value is $x_i + c(N_{i-1, b-x_i})$.
2.  **Or does not contain $x_i$:** Value is $c(N_{i-1, b})$.

---

### Slides 10-11: DP Table Computation and Visualization

**Visual Description:**
A 2D coordinate system (grid) is shown to visualize the Dynamic Programming table `c[i, b]`.
*   **Vertical Axis:** Represents $i$ (items available from $1$ to $n$). Starts at 1 at the top, $n$ at the bottom (conceptually, though standard matrices grow index downwards). The slide visual shows $i$ increasing downwards.
*   **Horizontal Axis:** Represents $b$ (current capacity limit from $1$ to $B$).
*   **Computing a Cell:**
    *   To compute the value at the dark dot $c[i, b]$:
    *   We look at the row above ($i-1$).
    *   We need two values from that previous row:
        1.  $c[i-1, b]$ (Directly above - represented by a yellow dot).
        2.  $c[i-1, b-x_i]$ (To the left in the row above - represented by a yellow dot at horizontal position $b-x_i$).

**Computation Order (Slide 11):**
*   **Visual:** Orange arrows stretch horizontally from left to right, moving down row by row.
*   **Algorithm Logic:**
    *   Iterate $i$ from $1$ to $n$.
    *   Iterate $b$ from $1$ to $B$.
    *   This ensures that when we are at row $i$, all values in row $i-1$ are already computed.

---

### Slide 12: Computing the Optimal Subset-Sum Value (Pseudocode)

**Algorithm:** `SUBSET-SUM(x, n, B)`

1.  **Initialize Boundary:**
    *   `for b ← 0 to B do c[0, b] ← 0`
    *   `for i ← 1 to n do c[i, 0] ← 0`
2.  **Fill Table:**
    *   `for i ← 1 to n do`
        *   `for b ← 1 to B do`
            *   `if x_i ≤ b then`
                *   `c[i, b] ← Max{ x_i + c[i-1, b-x_i], c[i-1, b] }`
            *   `else`
                *   `c[i, b] ← c[i-1, b]`
3.  **Result:**
    *   `return c[n, B]`

---

### Slide 13: Finding an Optimal Subset (Reconstruction)

**Algorithm:** `SOLUTION-SUBSET-SUM(x, b, B, c)`

This algorithm backtracks from the filled table to find which elements were selected.

1.  **Initialize:** `i ← n`, `b ← B`, `N ← ∅` (Empty set).
2.  **Loop:** `while i > 0 do`
    *   **Check:** `if c[i, b] == c[i-1, b] then`
        *   We did **not** pick $x_i$. Move to the row above.
        *   `i ← i - 1`
    *   **Else:**
        *   We **did** pick $x_i$. Add to set.
        *   `N ← N ∪ {x_i}`
        *   Move to the row above and reduce remaining capacity.
        *   `i ← i - 1`
        *   `b ← b - x_i`
3.  **Return:** `N`

---

## Part 2: Problem 2 - Optimal Binary Search Tree (OBST)

### Slide 15: Reminder: Binary Search Tree (BST)

**Visual Description:**
A standard tree diagram is shown with circles (nodes) containing numbers.
*   **Root:** 8
*   **Left Subtree:** Rooted at 3. Contains nodes {1, 3, 4, 6, 7}. All these values are $< 8$.
*   **Right Subtree:** Rooted at 10. Contains nodes {10, 13, 14}. All these values are $> 8$.
*   Dotted blue lines encircle the left and right subtrees to emphasize the BST property: **All keys in left subtree < Node Key < All keys in right subtree.**

---

### Slide 16: Binary Search Tree Example (Translation)

**Scenario:** English-to-French translation using a BST.
*   **Keyword (Key):** English word.
*   **Satellite Data:** French word.

**Visual Tree Structure:**
*   Root: "end"
*   Left Child: "do"
    *   Left Child of "do": "begin"
    *   Right Child of "do": "else"
*   Right Child: "then"
    *   Left Child of "then": "if"
    *   Right Child of "then": "while"

This structure allows efficient searching for an English word to retrieve the French translation.

---

### Slide 17-18: Cost of a Binary Search Tree

**Scenario:** We know the frequency of occurrence for each keyword.

**Frequencies:**
*   begin: 5%
*   do: 40%
*   else: 8%
*   end: 4%
*   if: 10%
*   then: 10%
*   while: 23%

**Visual:** The tree from Slide 16 is annotated with these percentages next to the corresponding nodes.

**Cost Calculation:**
The cost is based on the number of nodes accessed (depth + 1) multiplied by the frequency.
*   **Formula:** $\text{Total cost} = \sum_i (\text{depth}(i) + 1) \times \text{freq}(i)$
*   **Calculation for this specific tree:**
    *   Depth 0 (Root "end"): $1 \times 0.04$
    *   Depth 1 ("do", "then"): $2 \times 0.40 + 2 \times 0.10$
    *   Depth 2 ("begin", "else", "if", "while"): $3 \times 0.05 + 3 \times 0.08 + 3 \times 0.10 + 3 \times 0.23$
    *   **Total:** $2.42$

---

### Slide 19: Comparing Costs

**Visual Description:**
A different BST organization for the same set of words is displayed.
*   **Root:** "do" (40%)
*   **Left Child:** "begin" (5%)
*   **Right Child:** "while" (23%)
    *   Left Child of "while": "if" (10%)
        *   Left Child of "if": "else" (8%)
            *   Right Child of "else": "end" (4%)
        *   Right Child of "if": "then" (10%)

**Cost Analysis:**
Using the same formula:
$1(0.4) + 2(0.05) + 2(0.23) + 3(0.1) + 4(0.08) + 4(0.1) + 5(0.04) = 2.18$

**Conclusion:**
2.18 < 2.42. The tree on this slide is more efficient. In fact, this is the **Optimal BST**.

---

### Slide 20: Optimal Binary Search Tree Problem Definition

**Given:**
*   A collection of $n$ keys sorted: $K_1 < K_2 < \dots < K_n$.
*   Probabilities $p_i$ for each key $K_i$ (probability of searching for that key).

**Find:**
*   An optimal BST (static) that minimizes the total cost.
*   **Cost Formula:** $\sum_i (\text{depth}(i) + 1) \times \text{freq}(i)$

---

### Slide 21: Cost of a BST - Lemma 1

**Lemma 1:**
Let $T_{ij}$ be a BST containing keys $K_i < \dots < K_j$.
Let $T_L$ be the left subtree and $T_R$ be the right subtree.

**Formula:**
$$ \text{cost}(T_{ij}) = \text{cost}(T_L) + \text{cost}(T_R) + \sum_{h=i}^{j} p_h $$

**Visual Intuition:**
A triangle diagram shows a root connected to two sub-triangles ($T_L$ and $T_R$).
*   When a root node is added, the depth of every node in $T_L$ and $T_R$ increases by 1.
*   Consequently, the cost contribution of every node $h$ increases by $1 \times p_h$.
*   The sum of these increases is $\sum p_h$.
*   Plus, we add the cost of the root node itself (depth 1 * its probability), which is included in the sum term.

---

### Slide 22: Optimal Substructure Property - Lemma 2

**Lemma 2:**
Consider an optimal BST $T_{ij}$ for keys $K_i \dots K_j$. Let $K_m$ be the root of this tree.
*   The left child is the root of an optimal BST ($T_{i, m-1}$) for keys $K_i \dots K_{m-1}$.
*   The right child is the root of an optimal BST ($T_{m+1, j}$) for keys $K_{m+1} \dots K_j$.

**Visual:**
A tree rooted at $K_m$. The left triangle is labeled $T_{i, m-1}$ and the right triangle is labeled $T_{m+1, j}$.

**Combined Cost Formula:**
$$ \text{cost}(T_{ij}) = \text{cost}(T_{i, m-1}) + \text{cost}(T_{m+1, j}) + \sum_{h=i}^{j} p_h $$

---

### Slide 23: Recursive Formulation

We don't know which key $K_m$ is the best root. We must try all possible roots $r$ (where $i \le r \le j$) and pick the minimum.

**Definition:**
$c[i, j]$: Cost of an optimal BST for keys $K_i \dots K_j$.
Let $P_{ij} = \sum_{h=i}^{j} p_h$ (Sum of probabilities for the range).

**Recurrence:**
$$
c[i, j] = \begin{cases} 
      0 & \text{if } i > j \text{ (Empty tree)} \\
      \min_{i \le r \le j} \{ c[i, r-1] + c[r+1, j] + P_{ij} \} & \text{otherwise} 
\end{cases}
$$

---

### Slides 24-26: Bottom-Up Computation & Visualization

**Dependency:**
To compute $c[i, j]$, we need the values of $c[i, r-1]$ and $c[r+1, j]$.
*   These required values correspond to subproblems with fewer keys (smaller ranges).

**DP Table Visuals:**
*   **Slide 25:** Shows a square grid ($n \times n$).
    *   The relevant area is the upper-right triangle (since $i \le j$).
    *   To solve for cell $(i, j)$ (purple dot), we need a value to its left in the same row ($i, r-1$) and a value below it in the same column ($r+1, j$).
*   **Slide 26:** Shows the processing order with diagonal orange arrows.
    *   **Order:** We process based on the **length** of the range ($d = j - i$).
    *   First, compute main diagonal ($d=0$, where $i=j$).
    *   Then, compute the next diagonal ($d=1$, where $j=i+1$).
    *   Continue moving diagonally outward towards the top-right corner ($1, n$).

---

### Slide 27: Computing Optimal BST Cost (Pseudocode)

**Algorithm:** `COMPUTE-OPTIMAL-BST-COST(p, n)`

1.  **Initialize:**
    *   `for i ← 1 to n+1 do c[i, i-1] ← 0` (Base case for empty trees).
    *   Compute Prefix Sums `PS` to calculate $P_{ij}$ quickly.
        *   `PS[1] ← p[1]`
        *   `for i ← 2 to n do PS[i] ← p[i] + PS[i-1]`
2.  **Main Loop (by length $d$):**
    *   `for d ← 0 to n-1 do` (length of range)
        *   `for i ← 1 to n-d do` (start index)
            *   `j ← i + d` (end index)
            *   `c[i, j] ← ∞`
            *   **Find Best Root $r$:**
                *   `for r ← i to j do`
                    *   `val ← c[i, r-1] + c[r+1, j] + (PS[j] - PS[i-1])`
                    *   `c[i, j] ← min{ c[i, j], val }`
3.  **Return:** `c[1, n]`

---

### Slide 28-29: Note on Prefix Sum

**Efficiency Issue:**
We need the sum $P_{ij} = \sum_{h=i}^{j} p_h$ frequently.
*   Computing this directly inside the loops would take $O(n)$ per cell, making the total algorithm $O(n^4)$.
*   Using a Prefix Sum array allows us to compute $P_{ij}$ in $O(1)$ time. This reduces total runtime to $O(n^3)$.

**Prefix Sum Calculation:**
*   Preprocessing: `PS[i]` = sum of all `p` values from 1 to `i`.
*   Query: $P_{ij}$ (sum from $i$ to $j$) = `PS[j] - PS[i-1]`.

**Example:**
Given $p$ values: `0.05, 0.02, 0.06, 0.07, ...`
*   $P_{2,7}$ (sum from index 2 to 7) = $PS[7] - PS[1]$.
*   Calculation: $0.53 - 0.05 = 0.48$.
