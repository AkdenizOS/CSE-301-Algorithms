# Lecture 15 — Minimum Spanning Trees

> Stanford CS161 Winter 2026, lecture 15: *Minimum Spanning Trees* · [lecture page](https://stanford-cs161.github.io/winter2026/lectures/#lecture-15-minimum-spanning-trees)

**Previous:** [Lecture 14](14-greedy-algorithms.md) · **Next:** [Lecture 16](16-max-flow-and-ford-fulkerson.md)

## Goals
- Build a minimum spanning tree with Prim and Kruskal and prove them correct with the cut property.

## Key concepts
- **MST**: Kruskal (sort edges + union-find, `O(E lg V)`) and Prim (priority queue, `O(E lg V)` binary heap).
- Cut property and cycle property — why both MST algorithms are correct.

## Reading

- [CLRS — Ch. 23 (minimum spanning trees)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=645)
- *Algorithms Illuminated* Part III — 15

## CS161 resources

- Pre-lecture exercise: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture15-pre.pdf)
- Lecture notes: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture15-notes.pdf)
- Slides: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture15-slides.pdf) [PowerPoint](https://stanford-cs161.github.io/winter2026/assets/files/lecture15-slides.pptx)
- Python notebook: [Colab](http://colab.research.google.com/github/stanford-cs161/winter2025-extra/blob/colab/lecture15_mst.ipynb) [Zip](https://stanford-cs161.github.io/winter2025-extra/lecture15_mst.zip)
- Concept check questions: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/mst.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/mst.pdf)

## Practice
- [ ] Implement Kruskal with union-find and Prim with a heap
- [ ] CLRS 23.1, 23.2 exercises

## Checklist
- [ ] Pre-lecture exercise done
- [ ] Lecture attended
- [ ] Textbook section read
- [ ] Notebook done
- [ ] Concept check done
- [ ] Lab done
- [ ] Exercises done

## From past terms

**Past exam questions**
- [Practice final solutions](../exams/practice/final_sol.pdf) — Prim, Bellman-Ford, reweighting true/false

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
