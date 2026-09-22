# Lecture 14 — Greedy Algorithms

> Stanford CS161 Winter 2026, lecture 14: *Greedy Algorithms* · [lecture page](https://stanford-cs161.github.io/winter2026/lectures/#lecture-14-greedy-algorithms)

**Previous:** [Lecture 13](13-more-dp-lcs-knapsack-independent-set.md) · **Next:** [Lecture 15](15-minimum-spanning-trees.md)

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

- [CLRS — Ch. 16.1-16.3 (activity selection, greedy strategy, Huffman codes)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=436)
- *Algorithms Illuminated* Part III — 13, 14

## CS161 resources

- Pre-lecture exercise: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture14-pre.pdf)
- Lecture notes: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture14-notes.pdf)
- Slides: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/Lecture14.pdf)
- Python notebook: [Colab](http://colab.research.google.com/github/stanford-cs161/winter2025-extra/blob/colab/lecture14_greedy.ipynb) [Zip](https://stanford-cs161.github.io/winter2025-extra/lecture14_greedy.zip)
- Concept check questions: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/greedy.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/greedy.pdf)

## Practice
- [ ] Prove activity selection's greedy choice with an exchange argument
- [ ] Build a Huffman tree by hand and compute the average code length
- [ ] CLRS 16.1, 16.2, 16.3 exercises

## Checklist
- [ ] Pre-lecture exercise done
- [ ] Lecture attended
- [ ] Textbook section read
- [ ] Notebook done
- [ ] Concept check done
- [ ] Lab done
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
