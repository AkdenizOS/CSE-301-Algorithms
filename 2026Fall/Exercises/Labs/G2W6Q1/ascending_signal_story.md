The Ascending Signal

Story

In the deep space observatories of the Orion Arm, astronomers are scanning the cosmos for signs of intelligent life. Amidst static and stellar noise, a “Valid Transmission” is marked by the Triple Ascension: a pulse, followed by a stronger pulse, followed later by an even stronger pulse. The magnitudes must strictly increase, and arrival order must be preserved.



Mission (Problem Definition)

You are given an integer array nums representing signal strengths over time. Determine whether there exist indices (i, j, k) such that:



i < j < k



nums\[i] < nums\[j] < nums\[k]



If such a triple exists, return true; otherwise, return false.



Input: integer array nums



Expected Output: boolean (true or false)



Example Scenarios

Scenario 1 — Clear Signal

nums = \[1, 2, 3, 4, 5]

Choose (0, 1, 2) → values 1 < 2 < 3.

Expected Output: true



Scenario 2 — Decay

nums = \[5, 4, 3, 2, 1]

Values are strictly decreasing; no valid triple exists.

Expected Output: false



Scenario 3 — Signal in Noise

nums = \[2, 1, 5, 0, 4, 6]

Pick indices (1, 4, 5) → values 1 < 4 < 6.

Expected Output: true

