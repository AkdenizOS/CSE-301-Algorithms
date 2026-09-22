# Lecture 5 — Randomized Algorithms and QuickSort

> Stanford CS161 Winter 2026, lecture 5: *Randomized Algorithms and QuickSort* · [lecture page](https://stanford-cs161.github.io/winter2026/lectures/#lecture-5-randomized-algorithms-and-quicksort)

**Previous:** [Lecture 4](04-median-and-selection.md) · **Next:** [Lecture 6](06-bucketsort-and-sorting-lower-bounds.md)

## Goals
- Implement Lomuto and Hoare partitioning correctly.
- State quicksort's best, worst and average case.
- Derive the expected running time of randomized quicksort.
- Use indicator random variables in an analysis.

## Key concepts
- Partition is the whole algorithm; the sort is just recursion around it.
- **Lomuto**: pivot at the end, one index scan. Simpler, more swaps.
- **Hoare**: two pointers moving inward. Fewer swaps, trickier boundary conditions.
- Worst case `Θ(n²)` on already-sorted input with a fixed pivot; best/average `Θ(n lg n)`.
- **Randomized quicksort**: random pivot makes the worst case depend on the coin, not the input.
- In-place, not stable.
- **Indicator random variable** `X_ij = 1` if `z_i` and `z_j` are ever compared.
- `Pr{z_i compared to z_j} = 2/(j − i + 1)` — the key step.
- Expected comparisons `= Σ Σ 2/(j−i+1) = O(n lg n)`, via the harmonic series.
- Linearity of expectation removes the need for independence.
- Worst-case analysis via the recurrence `T(n) = max_q (T(q) + T(n−q−1)) + Θ(n)`.

## Reading

- [CLRS — Ch. 5.1-5.3 (probabilistic analysis, indicator variables)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=135)
- [CLRS — Ch. 7 (quicksort, incl. 7.4 analysis)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=191)
- *Algorithms Illuminated* Part I — 5

## CS161 resources

- Pre-lecture exercise: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture5-pre.pdf)
- Lecture notes: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture5-notes.pdf)
- Slides: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture5-slides.pdf) [PowerPoint](https://stanford-cs161.github.io/winter2026/assets/files/lecture5-slides.pptx)
- Python notebook: [Colab](http://colab.research.google.com/github/stanford-cs161/winter2025-extra/blob/colab/lecture5_quicksort.ipynb) [Zip](https://stanford-cs161.github.io/winter2025-extra/lecture5_quicksort.zip)
- Concept check questions: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/random.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/random.pdf)

## Practice
- [ ] Implement both partition schemes; find an input that makes each degenerate
- [ ] Trace a partition by hand on 8 elements
- [ ] CLRS 7.1, 7.2 exercises
- [ ] Reproduce the `2/(j−i+1)` argument from memory
- [ ] CLRS 5.2, 7.4 exercises

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
- [lecture05.pdf](../resources/2025-2026-fall/slides/lecture05.pdf) — quicksort

**Past exam questions**
- [Undated final, Q1(a)](../exams/undated/final-transcribed.md) — insertion, merge and Hoare quicksort when all elements are equal

**Exercises and code**
- [Hungarian Folk Dance](../exercises/algorithm-analysis/version-1/HungarianFolkDance/) — the quicksort danced in the video ([version 2](../exercises/algorithm-analysis/version-2/HungarianFolkDance/), [take-home 2](../exercises/practice/take-home-exam/2/Hungarian.java), [coursework](../code/java/coursework/hungarian-quicksort/))
- [Java quicksort (Hoare, Lomuto)](../code/java/lecture-examples/algorithm-analysis/QuickSort/) · [Python quicksort](../code/python/reference/sorting/quick/)

**Slides (2025-2026 Fall)**
- [lecture06a.pdf](../resources/2025-2026-fall/slides/lecture06a.pdf) — analysis of quicksort
- [lecture06b.pdf](../resources/2025-2026-fall/slides/lecture06b.pdf) — randomized quicksort

**Past exam questions**
- [Undated final, Q1(b)](../exams/undated/final-transcribed.md) — best, worst and average case of a randomized SlowSort
- [2019-2020 Q3](../exams/2019-2020/questions-Q3.txt) — worst-case `O(n lg n)` quicksort with a median pivot

**Code**
- [RandomizedHoareQuickSort.java](../code/java/lecture-examples/algorithm-analysis/QuickSort/RandomizedHoareQuickSort.java) · [RandomizedLomutoQuickSort.java](../code/java/lecture-examples/algorithm-analysis/QuickSort/RandomizedLomutoQuickSort.java)

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
