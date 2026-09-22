# Lecture 9 — Graphs, BFS and DFS

> Stanford CS161 Winter 2026, lecture 9: *Graphs and BFS and DFS* · [lecture page](https://stanford-cs161.github.io/winter2026/lectures/#lecture-9-graphs-and-bfs-and-dfs)

**Previous:** [Lecture 8](08-hashing.md) · **Next:** [Lecture 10](10-strongly-connected-components.md)

## Goals
- Represent a graph and choose between adjacency list and matrix.
- Run BFS and derive shortest paths in an unweighted graph.
- Run DFS, classify its edges, and use finish times.
- Produce a topological order.

## Key concepts
- Adjacency list `Θ(V+E)` space vs. adjacency matrix `Θ(V²)` — dense vs. sparse.
- **BFS** in `O(V+E)`: FIFO queue, computes shortest-path distance in edge count, builds the BFS tree.
- Colour scheme white/grey/black; `d[v]` and `π[v]`.
- BFS applications: connected components, bipartiteness testing, shortest path in unweighted graphs.
- **DFS** `O(V+E)`: discovery `d[v]` and finish `f[v]` times; the parenthesis theorem.
- Edge classification: tree, back, forward, cross. **A back edge exists iff the graph has a cycle.**
- **Topological sort** = vertices in decreasing finish time; only for DAGs.
- White-path theorem.

## Reading

- [CLRS — Ch. 22.1 (representations of graphs)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=610)
- [CLRS — Ch. 22.2 (breadth-first search)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=615)
- [CLRS — Ch. 22.3 (depth-first search)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=624)
- [CLRS — Ch. 22.4 (topological sort)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=633)
- *Algorithms Illuminated* Part II — 7, 8.1-8.5

## CS161 resources

- Pre-lecture exercise: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture9-pre.pdf)
- Lecture notes: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/lecture9-notes.pdf)
- Slides: [PDF](https://stanford-cs161.github.io/winter2026/assets/files/Lecture9.pdf)
- Python notebook: [Colab](http://colab.research.google.com/github/stanford-cs161/winter2025-extra/blob/colab/lecture9_graphs.ipynb) [Zip](https://stanford-cs161.github.io/winter2025-extra/lecture9_graphs.zip)
- Concept check questions: [Interactive SVG](https://stanford-cs161.github.io/winter2025-bank/bfsdfs.svg) [Solved PDF](https://stanford-cs161.github.io/winter2025-bank/bfsdfs.pdf)

## Practice
- [ ] Implement BFS with both representations
- [ ] Trace BFS on a 8-vertex graph
- [ ] CLRS 22.1, 22.2 exercises
- [ ] Implement DFS and classify every edge
- [ ] Topologically sort a 10-vertex DAG by hand
- [ ] CLRS 22.3, 22.4 exercises

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
- [MIT 6.046 practice quiz 2](../exams/practice/quiz2_practice.pdf) — Problem 1: static graph representation

**Past exam questions**
- [EECS 340 DFS quiz](../exams/practice/Example1.pdf) (cross edges) · [second DFS quiz](../exams/practice/Example4.pdf) (back edges)
- [DFS run questions](../exams/practice/Example2.pdf) — tree edges, descendants, topological order
- [EECS 340 assignment 7](../exams/practice/Example3.pdf) — DFS on a team-ranking graph

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
