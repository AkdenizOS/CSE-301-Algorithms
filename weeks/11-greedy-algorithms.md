# Week 11 — Greedy Algorithms

> Topic: *Greedy Algorithms*

**Previous:** [Week 10](10-dynamic-programming-ii.md) · **Next:** [Week 12](12-graphs-i.md)

## Goals
- Prove a greedy choice is safe.
- Build a Huffman code.

## Key concepts
- **Greedy-choice property** + optimal substructure ⇒ greedy is correct. Proving the first is the work.
- Exchange argument: transform any optimal solution into the greedy one without making it worse.
- **Activity selection**: sort by finish time, take the earliest finishing compatible activity.
- **Huffman coding**: repeatedly merge the two lowest-frequency nodes; optimal prefix code.
- **Fractional knapsack** greedy by value/weight ratio; 0-1 knapsack is not.
- Matroids as the general theory of when greedy works.

## Reading

- [CLRS — Ch. 16 (greedy algorithms)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=435)

## Practice
- [ ] Prove activity selection's greedy choice with an exchange argument
- [ ] Build a Huffman tree by hand and compute the average code length
- [ ] CLRS 16.1, 16.2, 16.3 exercises

## Checklist
- [ ] Lecture attended
- [ ] Lab done
- [ ] Textbook section read
- [ ] Exercises done

## From past terms

**Slides (2025-2026 Fall)**
- [lecture11.pdf](../resources/2025-2026-fall/slides/lecture11.pdf) — greedy algorithms (activity selection, knapsack, Huffman)

**Labs and contest (2025-2026 Fall)**
- [Group 2, week 6](../resources/2025-2026-fall/labs/group-2/week-06/) — "The Ascending Signal", increasing triplet, greedy
- [Biweekly contest Q3](../resources/2025-2026-fall/biweekly-contest/q3.md) — maximum score after binary swaps

**Past exam questions**
- [Undated final, Q5](../exams/undated/final-transcribed.md) — job scheduling with deadlines, greedy choice proof
- [2025-2026 final, page 2](../exams/2025-2026/final-answered-page-2.png) — "Company Hiring Split" (DP + greedy)
- [Lectures 10-11 transcribed](../exams/prep/10-11.md) — activity selection, greedy choice property
- [Practice final solutions](../exams/practice/prac_final_sol.pdf) — weighted activity selection counter-example
- [Bilkent CS473 — greedy questions](../resources/bilkent/greedy_questions.pdf.pdf)

**Exercises and code**
- [Job sequencing with deadlines](../assignments/undated-unattributed/analysis-assignment/deadline.pdf) · [JobSequencingQuickSort.java](../code/java/coursework/2024/JobSequencingQuickSort.java)
- [Activity selection (Python)](../exercises/practice/greedy/activity.py)
- [Java greedy](../code/java/lecture-examples/algorithm-analysis/GreedyAlgorithms/) · [with Huffman](../code/java/algorithms/src/Algorithms/GreedyAlgorithms/)

---

This file is the shared plan — improve it if the course changes, but keep it general.
Personal notes go below, one `## Notes — <Name> (<term>)` section per person.

## Notes — Efe (2026-2027 Fall)

### Lecture
<!-- What was actually covered, and what the lecturer emphasised. -->

### Worked out by hand
<!-- Derivations, proofs, traced algorithms. -->

### Questions
<!-- Unclear things. Ask, then answer them here. -->

### Exam-worthy
<!-- Formulas, conditions, algorithm steps, pitfalls. -->
