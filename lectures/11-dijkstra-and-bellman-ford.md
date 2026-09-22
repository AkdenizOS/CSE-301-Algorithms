# Lecture 11 — Dijkstra and Bellman-Ford

> Stanford CS161 Winter 2026, lecture 11: *Dijkstra and Bellman-Ford* · [lecture page](https://stanford-cs161.github.io/winter2026/lectures/#lecture-11-dijkstra-and-bellman-ford)

**Previous:** [Lecture 10](10-strongly-connected-components.md) · **Next:** [Lecture 12](12-dp-bellman-ford-and-floyd-warshall.md)

## Goals
- Run the standard weighted-graph algorithms and state their complexities.

## Key concepts
- **Dijkstra** `O((V+E) lg V)` — nonnegative weights only, greedy.
- **Bellman-Ford** `O(VE)` — handles negative edges, detects negative cycles.
- Relaxation as the common primitive of every shortest-path algorithm.

## Reading

- [CLRS — Ch. 24.1 (Bellman-Ford)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=672)
- [CLRS — Ch. 24.3 (Dijkstra)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=679)
- *Algorithms Illuminated* Part II — 9; Part III — 18.1, 18.2

## CS161 resources

- Pre-lecture exercise: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture11-pre.pdf)
- Lecture notes: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture11-notes.pdf)
- Slides: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture11-slides.pdf)
- Python notebook: [Colab](http://colab.research.google.com/github/stanford-cs161/winter2025-extra/blob/colab/lecture11_dijkstra.ipynb) [Zip](https://stanford-cs161.github.io/winter2025-extra/lecture11_dijkstra.zip)
- Concept check questions: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/dijkstra.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/dijkstra.pdf)

## Practice
- [ ] Find a graph where Dijkstra fails with negative edges
- [ ] CLRS 24.1, 24.3 exercises

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
- [MIT 6.046 practice quiz 2](../exams/practice/quiz2_practice.pdf) — modified Bellman-Ford
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
