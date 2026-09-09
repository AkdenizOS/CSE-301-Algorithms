# Week 12 — Graphs I

> Topic: *Graphs*

**Previous:** [Week 11](11-greedy-algorithms.md) · **Next:** [Week 13](13-graphs-ii.md)

## Goals
- Represent a graph and choose between adjacency list and matrix.
- Run BFS and derive shortest paths in an unweighted graph.

## Key concepts
- Adjacency list `Θ(V+E)` space vs. adjacency matrix `Θ(V²)` — dense vs. sparse.
- **BFS** in `O(V+E)`: FIFO queue, computes shortest-path distance in edge count, builds the BFS tree.
- Colour scheme white/grey/black; `d[v]` and `π[v]`.
- BFS applications: connected components, bipartiteness testing, shortest path in unweighted graphs.

## Reading

- [CLRS — Ch. 22.1-22.2 (representations, BFS)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=610)

## Practice
- [ ] Implement BFS with both representations
- [ ] Trace BFS on a 8-vertex graph
- [ ] CLRS 22.1, 22.2 exercises

## Checklist
- [ ] Lecture attended
- [ ] Lab done
- [ ] Textbook section read
- [ ] Exercises done

---

Your own notes for this week go in `terms/<your-term>/notes/week-12.md`, not here.
This file is the shared plan — improve it if the course changes, but keep it general.
