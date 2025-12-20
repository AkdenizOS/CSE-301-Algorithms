Special Fractal Grid

Story

The Association of Quantum Architects is stabilizing a “Crystal Matrix” that stores immense energy. Stability requires placing energy cells (integers starting at 0) into a square grid that obeys a strict recursive quadrant ordering. The grid is split into four quadrants, and energy must increase counter-clockwise in this order: Top-Right → Bottom-Right → Bottom-Left → Top-Left. Each quadrant must also obey the same rule within itself.



Mission (Problem Definition)

Given a non-negative integer n, construct a 2^n × 2^n grid filled with all integers from 0 to 2^(2n) − 1 so that it becomes a Special Grid.



A grid is special iff:



Every number in the Top-Right quadrant is smaller than every number in the Bottom-Right quadrant.



Every number in the Bottom-Right quadrant is smaller than every number in the Bottom-Left quadrant.



Every number in the Bottom-Left quadrant is smaller than every number in the Top-Left quadrant.



Each quadrant (sub-grid) is itself a special grid (recursively).



Notes:



Any 1 × 1 grid is inherently special.



Expected Output: a 2D array of size 2^n × 2^n filled according to the rules.



Example Scenarios

Scenario 1 — n = 1

Grid size: 2^1 × 2^1 = 2 × 2

Range: {0, 1, 2, 3}



Expected Output:



\[\[3, 0],

&nbsp;\[2, 1]]

Quadrant order (increasing): Top-Right {0} < Bottom-Right {1} < Bottom-Left {2} < Top-Left {3}.



Scenario 2 — n = 2

Grid size: 2^2 × 2^2 = 4 × 4

Range: {0, …, 15}



Expected Output:



\[

&nbsp; \[15, 12,  3, 0],

&nbsp; \[14, 13,  2, 1],

&nbsp; \[11,  8,  7, 4],

&nbsp; \[10,  9,  6, 5]

]

Quadrant ranges:



Top-Right (2×2): {0, 1, 2, 3}



Bottom-Right (2×2): {4, 5, 6, 7}



Bottom-Left (2×2): {8, 9, 10, 11}



Top-Left (2×2): {12, 13, 14, 15}



The maxima/minima satisfy:



max(TR) < min(BR) → 3 < 4



max(BR) < min(BL) → 7 < 8



max(BL) < min(TL) → 11 < 12



This ordering holds recursively within each quadrant as well.

