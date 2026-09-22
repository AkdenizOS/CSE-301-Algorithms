# CSE 301 — Course Information

Resource map, the Fall 2025-2026 outline, the pseudocode convention and a Turkish ↔ English glossary.

## Resource Map

### Textbooks

| File | Book | Use |
|------|------|-----|
| [`clrs-introduction-to-algorithms-3e.pdf`](resources/books/clrs-introduction-to-algorithms-3e.pdf) | CLRS 3rd ed. | **Primary.** Every reading link in `weeks/` points here |
| [`clrs-introduction-to-algorithms-3e-tr.pdf`](resources/books/clrs-introduction-to-algorithms-3e-tr.pdf) | CLRS 3rd ed., Turkish | Same book if the English is slowing you down |
| [`clrs-introduction-to-algorithms-4e.pdf`](resources/books/clrs-introduction-to-algorithms-4e.pdf) | CLRS 4th ed. | Newer; chapter numbers differ from the course outline |
| [`clrs-3e-chapters/`](resources/books/clrs-3e-chapters/) | CLRS 3rd ed., split by part | Lighter files when you only need one part |
| [`sedgewick-wayne-algorithms-4e.pdf`](resources/books/sedgewick-wayne-algorithms-4e.pdf) | Sedgewick & Wayne | Suggested text; strong on implementations |
| [`kleinberg-tardos-algorithm-design.pdf`](resources/books/kleinberg-tardos-algorithm-design.pdf) | Kleinberg & Tardos | Suggested text; strong on design and proofs |
| [`abdul-bari-algorithms-tr-notes.pdf`](resources/books/abdul-bari-algorithms-tr-notes.pdf) | Abdul Bari lecture notes, Turkish | Companion to the popular video course |

### Week → CLRS chapter

Links use the PDF's own bookmarks, so the pages are exact.

| Week | Topic | CLRS 3e |
|------|-------|---------|
| 1 | Analysing and designing algorithms | Ch. 1, 2, 3 |
| 2 | Solving recurrences | Ch. 4.3-4.6 |
| 3 | Divide and conquer | Ch. 4.1-4.2 |
| 4 | Quicksort | Ch. 7.1-7.3 |
| 5 | Analysis of quicksort | Ch. 7.4, Ch. 5 |
| 6 | Medians and order statistics | Ch. 9 |
| 9-10 | Dynamic programming | Ch. 15 |
| 11 | Greedy algorithms | Ch. 16 |
| 12 | Graphs: representations, BFS | Ch. 22.1-22.2 |
| 13 | Graphs: MST, shortest paths | Ch. 23, 24 |
| 14 | DFS, topological sort, SCC | Ch. 22.3-22.5 |

Chapter start pages in the 3e PDF: Ch1 26 · Ch2 37 · Ch3 64 · Ch4 86 · Ch5 135 ·
Ch6 172 · Ch7 191 · Ch8 212 · Ch9 234 · Ch15 380 · Ch16 435 · Ch17 472 · Ch22 610 ·
Ch23 645 · Ch24 664.

### Other material

| Path | What it is |
|------|-----------|
| [`resources/bilkent/`](resources/bilkent/) | Bilkent CS473 exams and cheat sheets — harder than this course, good stretch practice |
| [`resources/lecture-notes/`](resources/lecture-notes/) | Lecture PDFs and an asymptotics cheat sheet |
| [`resources/Recitation-Practice.pdf`](resources/Recitation-Practice.pdf) | Recitation practice |
| [`resources/bilkent-intro.pdf`](resources/bilkent-intro.pdf) | Reference slide deck |
| [`resources/algorithm-dynamic-programming-and-amortized.html`](resources/algorithm-dynamic-programming-and-amortized.html) | Saved bookmarks on dynamic programming and amortized analysis |
| [`resources/2025-2026-fall/`](resources/2025-2026-fall/) | What the instructor issued in Fall 2025-2026: syllabus, slides, labs, biweekly contest, exercises |
| [`resources/2026-2027-fall/`](resources/2026-2027-fall/) | Fall 2026-2027 student guide |
| [`exercises/algorithm-analysis/`](exercises/algorithm-analysis/) | Named problems with Java solutions and write-ups (Bank Office, Hungarian Folk Dance, Missing Patient, Phone Operator, Optimal BST) |
| [`exercises/crazy-eight/`](exercises/crazy-eight/) | Crazy Eights, with MIT 6.006 lecture notes |
| [`code/java/`](code/java/) | Algorithm implementations, lecture examples, coursework |
| [`code/python/`](code/python/) | Sorting, divide and conquer, dynamic programming |

Note: `code/java/algorithms/src/Algorithms/` and
`code/java/lecture-examples/algorithm-analysis/` hold the same implementations —
the first is packaged as a buildable project, the second is standalone files. Use
whichever suits you; do not edit both.

## Fall 2025-2026 as taught

**Instructor:** Hüseyin Gökhan Akçay (hgakcay@akdeniz.edu.tr), Computer Engineering Building, 2nd floor, by appointment
**Assistant:** Ömer Kuru (omerkuru@akdeniz.edu.tr), Tue 15:30-16:30

**Theory:** Wednesday 09:00, AMFİ 2 · **Lab:** Ylab 1
Slides, announcements and homework were distributed through Microsoft Teams.

### Grading

| Component | Weight |
|-----------|--------|
| Lab | 25% |
| Assignment | 10% |
| Midterm | 25% |
| Final | 40% |

### Course outline as taught

| Week | Date | Subject |
|------|------|---------|
| 1 | Sept 17 | Introduction: analysing algorithms, designing algorithms |
| 2 | Sept 24 | Solving recurrences |
| 3 | Oct 1 | Divide and conquer design paradigm |
| 4 | Oct 8 | Quicksort |
| 5 | Oct 15 | Analysis of quicksort |
| 6 | Oct 22 | Medians and order statistics |
| 7 | Oct 29 | Cumhuriyet Bayramı — no lecture |
| 8 | Nov 5 | Tentative midterm week |
| 9 | Nov 12 | Dynamic programming |
| 10 | Nov 19 | Dynamic programming |
| 11 | Nov 26 | Greedy algorithms |
| 12 | Dec 3 | Graphs |
| 13 | Dec 10 | Graphs |
| 14 | Dec 17 | DFS and topological sort |

The shared plan in [`weeks/`](weeks/) is derived from this outline.

## Psudo-code convention
Example psudocode
```
for j = 2 to A.length
    key = A[j]
    i = j - 1
    while i > 0 and A[i] > key
        A[i + 1] = A[i]
        i = i - 1
    A[i + 1] = key
```

- Use indentation for block structure.
- Use C like languages element for code flow: while, for, if-else. 
- Use double slash for comments: // this is a comment
- A[i] indicates specific element of array, A[1..j] indicates subarray consisting of j element.
- Pass parameter by value
- **return** statement transfer control back to the point of call in the calling procedure. 
- Use **and**, **or** for boolean operations.

## Glossary — Turkish ↔ English

| Turkish | English |
|---------|---------|
| algoritma çözümlemesi | algorithm analysis |
| çalışma zamanı | running time |
| en kötü / ortalama / en iyi durum | worst / average / best case |
| asimptotik gösterim | asymptotic notation |
| sıkı sınır | tight bound (Θ) |
| üst sınır / alt sınır | upper bound (O) / lower bound (Ω) |
| döngü değişmezi | loop invariant |
| yineleme bağıntısı | recurrence relation |
| yerine koyma yöntemi | substitution method |
| yineleme ağacı | recursion tree |
| ana teorem | master theorem |
| böl ve yönet | divide and conquer |
| birleştirmeli sıralama | merge sort |
| hızlı sıralama | quicksort |
| bölümleme | partition |
| özyineleme | recursion |
| rastgeleleştirilmiş | randomized |
| gösterge rastgele değişken | indicator random variable |
| beklenen değer | expected value |
| sıra istatistiği | order statistic |
| medyan | median |
| seçim problemi | selection problem |
| dinamik programlama | dynamic programming |
| en iyi altyapı | optimal substructure |
| örtüşen altproblemler | overlapping subproblems |
| bellekleme | memoization |
| yukarıdan aşağı / aşağıdan yukarı | top-down / bottom-up |
| en uzun ortak altdizi | longest common subsequence |
| sırt çantası problemi | knapsack problem |
| açgözlü algoritma | greedy algorithm |
| değiş tokuş savı | exchange argument |
| çizge | graph |
| komşuluk listesi / matrisi | adjacency list / matrix |
| enine arama | breadth-first search |
| derinlemesine arama | depth-first search |
| en küçük kapsayan ağaç | minimum spanning tree |
| en kısa yol | shortest path |
| gevşetme | relaxation |
| topolojik sıralama | topological sort |
| güçlü bağlı bileşen | strongly connected component |
| geri kenar | back edge |
| amortize edilmiş çözümleme | amortized analysis |
