Here is the detailed analysis and transcription of the "Algorithms Make-Up Exam" PDF page provided.

# ALGORITHMS MAKE-UP EXAM

## Question 1: Problem Description

**Scenario:**
A traveler intends to walk a road of a specific length, denoted as **$n$**. Along this road, there are cafes located at every discrete integer unit $i$ where $i \in \{1, 2, ..., n\}$.

**Rules of Travel:**
1.  The traveler is required to rest and have a coffee at specific cafe locations along the path.
2.  Coffee prices are not fixed per location; rather, they are dynamic based on **the distance walked since the last resting spot**.

**The Price Array:**
The costs are stored in an array named `price`. The index of the array corresponds to the distance traveled in one segment.
*   `price[1]`: The cost to pay if the traveler walked a distance of **1** since the last stop.
*   `price[2]`: The cost to pay if the traveler walked a distance of **2** since the last stop.
*   `price[i]`: The cost to pay if the traveler walked a distance of **$i$** since the last stop.

**Example Logic:**
If the total distance is $n = 9$:
*   If the traveler rests at location **3**, they pay `price[3]` (distance $3-0$).
*   If they then rest at location **5**, they pay `price[2]` (distance $5-3$).
*   If they finally rest at location **9**, they pay `price[4]` (distance $9-5$).
*   **Total Cost:** `price[3] + price[2] + price[4]`.

**Goal:**
The objective is to find a sequence of stops that **minimizes the total price** paid to reach distance $n$.

***

## Visual Analysis: Example Table

The document provides a concrete example to illustrate the mechanics of the problem.
*   **Total Distance ($n$):** 4
*   **Price Array:** $[3, 2, 5, 9]$
    *   Walking 1 unit costs 3.
    *   Walking 2 units costs 2.
    *   Walking 3 units costs 5.
    *   Walking 4 units costs 9.

The table lists every possible combination of stops ending at $n=4$ and calculates the cost.

| Stop Locations | Calculation Breakdown | Total Price | Analysis |
| :--- | :--- | :--- | :--- |
| **4** | The traveler walks directly from 0 to 4. Uses `price[4]`. | **9** | This is the most expensive single-leg journey. |
| **3, 4** | **Leg 1:** 0 to 3 (dist 3) $\rightarrow$ `price[3]` = 5.<br>**Leg 2:** 3 to 4 (dist 1) $\rightarrow$ `price[1]` = 3. | **5 + 3 = 8** | |
| **2, 4** | **Leg 1:** 0 to 2 (dist 2) $\rightarrow$ `price[2]` = 2.<br>**Leg 2:** 2 to 4 (dist 2) $\rightarrow$ `price[2]` = 2. | **2 + 2 = 4** | **OPTIMUM SOLUTION.** This route offers the lowest possible cost. |
| **1, 4** | **Leg 1:** 0 to 1 (dist 1) $\rightarrow$ `price[1]` = 3.<br>**Leg 2:** 1 to 4 (dist 3) $\rightarrow$ `price[3]` = 5. | **3 + 5 = 8** | |
| **2, 3, 4** | **Leg 1:** 0 to 2 (dist 2) $\rightarrow$ `price[2]` = 2.<br>**Leg 2:** 2 to 3 (dist 1) $\rightarrow$ `price[1]` = 3.<br>**Leg 3:** 3 to 4 (dist 1) $\rightarrow$ `price[1]` = 3. | **2 + 3 + 3 = 8** | |
| **1, 3, 4** | **Leg 1:** 0 to 1 (dist 1) $\rightarrow$ `price[1]` = 3.<br>**Leg 2:** 1 to 3 (dist 2) $\rightarrow$ `price[2]` = 2.<br>**Leg 3:** 3 to 4 (dist 1) $\rightarrow$ `price[1]` = 3. | **3 + 2 + 3 = 8** | |
| **1, 2, 4** | **Leg 1:** 0 to 1 (dist 1) $\rightarrow$ `price[1]` = 3.<br>**Leg 2:** 1 to 2 (dist 1) $\rightarrow$ `price[1]` = 3.<br>**Leg 3:** 2 to 4 (dist 2) $\rightarrow$ `price[2]` = 2. | **3 + 3 + 2 = 8** | |
| **1, 2, 3, 4** | **Leg 1:** 0 to 1 (dist 1) $\rightarrow$ `price[1]` = 3.<br>**Leg 2:** 1 to 2 (dist 1) $\rightarrow$ `price[1]` = 3.<br>**Leg 3:** 2 to 3 (dist 1) $\rightarrow$ `price[1]` = 3.<br>**Leg 4:** 3 to 4 (dist 1) $\rightarrow$ `price[1]` = 3. | **3+3+3+3 = 12** | Stopping at every location is the most expensive strategy in this specific case. |

***

## Exam Questions

The student is asked to solve the following five parts based on the problem description above.

### a. Mathematical Recursive Formulation (20 pts)
Give a mathematical recursive formulation for $P(n)$, where $P(n)$ denotes the minimum price the traveler has to pay when he wants to walk a distance of $n$.

### b. Recursive Algorithm (20 pts)
Write a recursive algorithm (i.e., a pseudocode) that returns the minimum price the traveler has to pay when he wants to walk a distance of $n$.

### c. Greedy Strategy Counter-Example (20 pts)
Give an example distance $n$ and a `price` array to show that the greedy choice does not always lead to an optimum solution.
*   **The specific greedy choice defined:** Every time choosing to walk the distance which does not exceed the total distance $n$ and would cost the minimum price at the next stop location.

### d. Dynamic Programming Algorithm (30 pts)
Write a dynamic programming algorithm (i.e., a pseudocode) for finding the minimum price the traveler has to pay to walk a distance of $n$.

### e. Running Time Analysis (10 pts)
Provide the running time of your dynamic programming algorithm. Explain.

***

**P.S.**
The note at the bottom emphasizes: "It is extremely necessary to understand the question (e.g. what the price array holds)." This implies that confusing `price[i]` (cost of a segment of length $i$) with the cost of arriving at location $i$ is a common pitfall to avoid.
