# Week 13 — Graphs II

> Fall 2025 outline: *Graphs*

**Previous:** [Week 12](12-graphs-i.md) · **Next:** [Week 14](14-dfs-and-topological-sort.md)

## Goals
- Run the standard weighted-graph algorithms and state their complexities.

## Key concepts
- **MST**: Kruskal (sort edges + union-find, `O(E lg V)`) and Prim (priority queue, `O(E lg V)` binary heap).
- Cut property and cycle property — why both MST algorithms are correct.
- **Dijkstra** `O((V+E) lg V)` — nonnegative weights only, greedy.
- **Bellman-Ford** `O(VE)` — handles negative edges, detects negative cycles.
- Relaxation as the common primitive of every shortest-path algorithm.

## Reading

- [CLRS — Ch. 23 (minimum spanning trees)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=645)
- [CLRS — Ch. 24 (single-source shortest paths)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=664)

## Practice
- [ ] Implement Kruskal with union-find and Prim with a heap
- [ ] Find a graph where Dijkstra fails with negative edges
- [ ] CLRS 23.1, 23.2, 24.1, 24.3 exercises

## Checklist
- [ ] Lecture attended
- [ ] Lab done
- [ ] Textbook section read
- [ ] Exercises done

## My notes

<!-- Lecture: what was actually covered. -->

<!-- Worked derivations and proofs. -->

<!-- Questions to ask. -->

<!-- Exam-worthy: complexities, proof templates, pitfalls. -->
