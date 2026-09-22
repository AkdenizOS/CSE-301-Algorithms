# Lecture 4 — Median and Selection

> Stanford CS161 Winter 2026, lecture 4: *Median and Selection* · [lecture page](https://stanford-cs161.github.io/winter2026/lectures/#lecture-4-median-and-selection)

**Previous:** [Lecture 3](03-recurrences-and-master-theorem.md) · **Next:** [Lecture 5](05-randomized-algorithms-and-quicksort.md)

## Goals
- Find the i-th smallest element in expected linear time.
- Explain the median-of-medians worst-case linear algorithm.

## Key concepts
- Selection problem: i-th order statistic without fully sorting.
- **RANDOMIZED-SELECT**: quicksort's partition, recurse on one side only → expected `Θ(n)`.
- **SELECT (median of medians)**: groups of 5, median of each, recurse → worst-case `Θ(n)`.
- Why 5: it guarantees discarding at least `3n/10 − 6` elements, making `T(n) ≤ T(n/5) + T(7n/10) + O(n)` solvable.
- Minimum and maximum together in `⌈3n/2⌉ − 2` comparisons.

## Reading

- [CLRS — Ch. 9 (medians and order statistics)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=234)
- *Algorithms Illuminated* Part I — 6

## CS161 resources

- Pre-lecture exercise: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture4-pre.pdf)
- Lecture notes: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture4-notes.pdf)
- Slides: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture4-slides.pdf) [PowerPoint](https://stanford-cs161.github.io/winter2026/assets/files/lecture4-slides.pptx)
- Python notebook: [Colab](http://colab.research.google.com/github/stanford-cs161/winter2025-extra/blob/colab/lecture4_select.ipynb) [Zip](https://stanford-cs161.github.io/winter2025-extra/lecture4_select.zip)
- Concept check questions: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/select.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/select.pdf)

## Practice
- [ ] Implement both selection algorithms and compare
- [ ] Show why groups of 3 fail
- [ ] CLRS 9.1, 9.2, 9.3 exercises

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
- [lecture07.pdf](../resources/2025-2026-fall/slides/lecture07.pdf) — medians and order statistics

**Labs (2025-2026 Fall)**
- [Group 2, week 3](../resources/2025-2026-fall/labs/group-2/week-03/) — top-k frequent elements with quickselect

**Past exam questions**
- [2019-2020 Q3](../exams/2019-2020/questions-Q3.txt) — Select as the quicksort pivot · [Q4](../exams/2019-2020/questions-Q4.txt) — the k numbers closest to the median in `O(n)`
- [CPS 130 homework 8 solutions](../exercises/problem-statements/H8-solution.pdf) — CLRS 9.3 exercises
- [Bilkent CS473 — selection algorithms](../resources/bilkent/Selection%20Algorithms_cs473.final_4.pdf) · [sorting, selection and decision trees](../resources/bilkent/Sorting%20&%20Selection_decisiontreesMidterm_Derleme.pdf.pdf)

**Code**
- [SelectionLinearTime.java](../code/java/lecture-examples/algorithm-analysis/Selection/SelectionLinearTime.java) · [select_small.py](../code/python/reference/divide-and-conquer/select_small.py)

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
