# CSE 301 — Algorithms

Akdeniz University · Computer Engineering (English) · Fall

**An open study archive for this course.** It collects the syllabus, a week-by-week
study plan linked to exact textbook pages, past exam papers going back to 2019,
worked implementations in Java and Python, and the coursework of the students who
took the course before you.

Anyone taking CSE 301 can study from it. If you take the course, your notes belong
here too — see [Contributing](#contributing).

## How to study with this repository

**1. Start from the week you are in.** [`weeks/`](weeks/) has one note per week,
built from the official course outline. Each note lists the goals, the key concepts
with their actual definitions, what to read, and what to practice.

**2. Follow the reading links.** They open the textbook at the exact page:

> [CLRS — Ch. 7 (quicksort)](resources/books/clrs-introduction-to-algorithms-3e.pdf#page=191)

No searching for chapters. In Obsidian the PDF opens at that page; on GitHub it
opens the file.

**3. Do the practice list, then check the box.** The `- [ ]` items are clickable in
Obsidian's reading mode, so the week note doubles as your progress tracker.

**4. Write in `## My notes` at the bottom of the week note.** That section is yours.
Everything above it is the shared plan.

**5. Before an exam, go to [`exams/`](exams/).** [`exams/past/`](exams/past/) has real
papers from 2019 onward, organized by term. [`exams/practice/`](exams/practice/) has
practice sets with solutions. [`exams/prep/`](exams/prep/) holds compiled analyses
written by previous students.

**6. When you get stuck on an implementation**, [`code/`](code/) has working Java and
Python versions of nearly every algorithm in the course, and
[`exercises/collections/`](exercises/collections/) has past problems with solutions.

## Layout

| Path | What it holds | Changes each term? |
|------|---------------|--------------------|
| [`weeks/`](weeks/) | The study plan — one note per week | No, it improves |
| [`docs/`](docs/) | Syllabus summary, resource map, conventions | No, it improves |
| [`terms/`](terms/) | One folder per cohort: their notes, labs, assignments, submissions | **Yes — a new folder each year** |
| [`exams/past/`](exams/past/) | Real exam papers by term | Grows |
| [`exams/practice/`](exams/practice/) | Practice sets and solutions | Grows |
| [`exams/prep/`](exams/prep/) | Compiled exam analyses | Grows |
| [`code/`](code/) | Java and Python implementations | Grows |
| [`exercises/`](exercises/) | Problem collections, case studies | Grows |
| [`resources/`](resources/) | Textbooks, lecture notes, external material | Grows |

The important split: **`weeks/` and `docs/` are shared and permanent. `terms/` is
where one person's one semester lives.** Your notes this year go under
`terms/<year>-<term>/`; next year they are the archive somebody else studies from,
and nothing has to move.

## Textbook

Primary: **CLRS, _Introduction to Algorithms_, 3rd edition** —
[`resources/books/clrs-introduction-to-algorithms-3e.pdf`](resources/books/clrs-introduction-to-algorithms-3e.pdf).
Every reading link in `weeks/` points into it. A Turkish translation and the 4th
edition are in the same folder, plus Sedgewick-Wayne and Kleinberg-Tardos.

## Grading (Fall 2025)

| Component | Weight |
|-----------|--------|
| Lab | 25% |
| Assignment | 10% |
| Midterm | 25% |
| Final | 40% |

Confirm against the current term's syllabus — see [`terms/`](terms/).

The topic list in [`weeks/`](weeks/) is derived from the Fall 2025 course outline
(the most recent one on record, in
[`terms/2025-2026-fall/`](terms/2025-2026-fall/)). If your term's outline differs,
update `weeks/` — it is the shared plan and should reflect reality.

## Who changes what

| File | Who edits it | When |
|------|-------------|------|
| `weeks/NN-*.md` | **anyone** | Only when the course itself changes — a new topic, a better reading, a correction. Never for personal notes. |
| `docs/*.md` | **anyone** | When you learn something durable: a new exam pattern, a better source. |
| `terms/<your-term>/people/<you>/notes/week-NN.md` | **only you** | Every week. This is your notebook. |
| `terms/<your-term>/people/<you>/` | **only you** | Your assignments, projects, submissions. |
| `terms/<your-term>/course/` | **anyone in that term** | Slides, syllabus and lab sheets the instructor issued. |
| `exams/past/<term>/` | **anyone** | When you get hold of a new paper — blank or answered. Exam papers never go under `terms/`. |

Two students in different years never touch the same file except to improve the
shared plan — which is the point.

## Contributing

If you are taking the course now:

1. Create `terms/<YYYY>-<YYYY>-<term>/` (e.g. `2026-2027-fall/`) with a `README.md`
   naming the instructor, the dates, and who the work belongs to.
2. Put your slides, labs, assignments and personal notes there.
3. If the course outline changed, update `weeks/` — that is the shared plan and it
   should reflect reality.
4. Add new exam papers to `exams/past/<term>/`.

Keep `weeks/` and `docs/` general. Keep anything personal, dated, or term-specific
in `terms/`.

## Academic integrity

Previous students' submissions are here as **reference**, not as answers to copy.
Copying them is academic fraud and the course syllabus is explicit about the
consequences. Read them the way you would read a solved example — then close the
file and write your own.
