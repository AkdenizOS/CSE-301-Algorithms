# Lecture 6 — BucketSort and Lower Bounds for Sorting

> Stanford CS161 Winter 2026, lecture 6: *BucketSort and Lower Bounds for Sorting* · [lecture page](https://stanford-cs161.github.io/winter2026/lectures/#lecture-6-bucketsort-and-lower-bounds-for-sorting)

**Previous:** [Lecture 5](05-randomized-algorithms-and-quicksort.md) · **Next:** [Lecture 7](07-binary-search-trees-and-red-black-trees.md)

## Goals
- Prove that every comparison sort needs `Ω(n lg n)` comparisons in the worst case.
- Sort in linear time when the input allows it: counting, radix and bucket sort.

## Key concepts
- **Decision-tree model**: a comparison sort is a binary tree with ≥ `n!` leaves → height `≥ lg(n!) = Ω(n lg n)`.
- Merge sort and heapsort are therefore asymptotically optimal comparison sorts.
- **Counting sort** `Θ(n + k)`, stable; the building block of radix sort.
- **Radix sort** `Θ(d(n + k))`: sort digit by digit, least significant first, with a stable sort.
- **Bucket sort**: expected `Θ(n)` for uniformly distributed input.
- Linear-time sorts beat the bound by not comparing — they look at the values.

## Reading

- [CLRS — Ch. 8.1 (lower bounds for sorting)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=212)
- [CLRS — Ch. 8.2 (counting sort)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=215)
- *Algorithms Illuminated* Part I — 5.6
- [Avrim Blum's notes on sorting lower bounds](http://www.cs.cmu.edu/~avrim/451f11/lectures/lect0913.pdf)

## CS161 resources

- Pre-lecture exercise: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture6-pre.pdf)
- Lecture notes: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture6-notes.pdf)
- Slides: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture6-slides.pdf) [PowerPoint](https://stanford-cs161.github.io/winter2026/assets/files/lecture6-slides.pptx)
- Python notebook: [Colab](http://colab.research.google.com/github/stanford-cs161/winter2025-extra/blob/colab/lecture6_bucketsort.ipynb) [Zip](https://stanford-cs161.github.io/winter2025-extra/lecture6_bucketsort.zip)
- Concept check questions: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/sortingmodels.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/sortingmodels.pdf)

## Practice
- [ ] Draw the decision tree of insertion sort on 3 elements
- [ ] Radix-sort 8 three-digit numbers by hand
- [ ] CLRS 8.1, 8.2 exercises

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
- [lecture08.pdf](../resources/2025-2026-fall/slides/excluded-from-2025-final/lecture08.pdf) (heapsort) and [lecture09.pdf](../resources/2025-2026-fall/slides/excluded-from-2025-final/lecture09.pdf) (sorting in linear time) sit between weeks 6 and 9 in the 2025-2026 numbering; they were excluded from that term's final

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
