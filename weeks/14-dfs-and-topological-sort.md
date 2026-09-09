# Week 14 — DFS and Topological Sort

> Fall 2025 outline: *DFS & Topological sort*

**Previous:** [Week 13](13-graphs-ii.md)

## Goals
- Run DFS, classify its edges, and use finish times.
- Produce a topological order and find strongly connected components.

## Key concepts
- **DFS** `O(V+E)`: discovery `d[v]` and finish `f[v]` times; the parenthesis theorem.
- Edge classification: tree, back, forward, cross. **A back edge exists iff the graph has a cycle.**
- **Topological sort** = vertices in decreasing finish time; only for DAGs.
- **Strongly connected components**: DFS, transpose the graph, DFS again in decreasing finish order.
- White-path theorem.

## Reading

- [CLRS — Ch. 22.3-22.5 (DFS, topological sort, SCC)](../resources/books/clrs-introduction-to-algorithms-3e.pdf#page=610)

## Practice
- [ ] Implement DFS and classify every edge
- [ ] Topologically sort a 10-vertex DAG by hand
- [ ] Implement Kosaraju's SCC algorithm
- [ ] CLRS 22.3, 22.4, 22.5 exercises

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
