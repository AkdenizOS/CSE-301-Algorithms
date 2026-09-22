# Lecture 10 — Strongly Connected Components

> Stanford CS161 Winter 2026, lecture 10: *Strongly Connected Components* · [lecture page](https://stanford-cs161.github.io/winter2026/lectures/#lecture-10-strongly-connected-components)

**Previous:** [Lecture 9](09-graphs-bfs-and-dfs.md) · **Next:** [Lecture 11](11-dijkstra-and-bellman-ford.md)

> **Midterm follows this lecture** (CS161 order: lectures 1-10). See [exams/README.md](../exams/README.md#midterm).

## Goals
- Find the strongly connected components of a directed graph with two DFS passes.

## Key concepts
- **Strongly connected components**: DFS, transpose the graph, DFS again in decreasing finish order.
- The component graph is a DAG; the first DFS finishes a source component last.

## Reading

- [CLRS — Ch. 22.5 (strongly connected components)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=636)
- *Algorithms Illuminated* Part II — 8.6

## CS161 resources

- Pre-lecture exercise: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture10-pre.pdf)
- Lecture notes: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture10-notes.pdf)
- Slides: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture10-slides.pdf) [PowerPoint](https://stanford-cs161.github.io/winter2026/assets/files/lecture10-slides.pptx)
- Python notebook: [Colab](http://colab.research.google.com/github/stanford-cs161/winter2025-extra/blob/colab/lecture10_scc.ipynb) [Zip](https://stanford-cs161.github.io/winter2025-extra/lecture10_scc.zip)
- Concept check questions: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/scc.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/scc.pdf)

## Practice
- [ ] Implement Kosaraju's SCC algorithm
- [ ] CLRS 22.5 exercises

## Checklist
- [ ] Pre-lecture exercise done
- [ ] Lecture attended
- [ ] Textbook section read
- [ ] Notebook done
- [ ] Concept check done
- [ ] Lab done
- [ ] Exercises done

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
