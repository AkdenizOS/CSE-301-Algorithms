# Terms

One folder per cohort. Everything that belongs to a single run of the course —
that term's syllabus, slides, labs, assignments, personal notes and submissions —
lives in its own folder and stays there.

| Term | Instructor | What is here |
|------|-----------|--------------|
| [2025-2026-fall](2025-2026-fall/) | Hüseyin Gökhan Akçay | Syllabus, 12 lecture slide decks, lab questions for 4 groups, biweekly contest, one assignment |
| [2020-2021-fall](2020-2021-fall/) | unknown | Two students' graded midterm and final papers |
| [undated](undated/) | unknown | Student submissions and coursework whose term could not be determined |

## How a term folder is laid out

```
terms/2026-2027-fall/
├── README.md          instructor, dates, and who took the course this term
├── course/            what the instructor gave everyone: syllabus, slides, lab sheets
├── people/
│   ├── efe-kurucay/   one folder per person
│   │   ├── notes/week-01.md …
│   │   ├── assignments/
│   │   └── exams/
│   └── zeynep-yilmaz/
└── unattributed/      material from this term whose author is not known
```

`course/` is shared by everyone in that term. `people/<name>/` belongs to one
person and nobody else edits it. Several students in the same term work side by
side without ever touching the same file.

Use a lowercase, hyphenated folder name — `efe-kurucay`, not `Efe Kuruçay`.

Copy [`_notes-template/_template.md`](_notes-template/_template.md) into your own
`notes/` folder when you start a week.
