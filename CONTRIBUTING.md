# CONTRIBUTING

There's only a few rules I have with the project on style and if you don't follow them I'm allowed to give you shit.
Most of these are common practice but read them and write your code around them.

## Commit Messages

Imagine that your commit message comes after this starter:

``If this commit is merged it will:``

Present tense; verb form; short and sweet. Don't treat it like a description or an essay.

It also helps if you use specific verbs (listed below). They aren't enforced as not every commit works with them but they are strongly recommended where possible.

### Some Strong Recommended Verbs

**Create**
**Delete**
**Implement**
**Add**
**Remove**
**Fix**
**Modify**
**Correct**
**Refactor**
**Move**

If you can think of more please let me know.

## Naming

Booleans and methods returning them should start with ``has`` or ``is``.
The rest are up to you as long as you name them appropriately based on their use. Simple stuff.

## Indentation

4 spaces. Nothing else, thanks.

## Line length

The maximum line column span should be 120 with rare cases maxing at 130 if you really have to.
The days of 80 are far gone.

## Code Blocks/Scopes

Brackets should always be on the same line as the expression they're connected to. None of that newline before a curly brace.

``if`` statements must not be inlined *unless* they have a small expression and are for single function calls without parameters.

If you're using ``else if`` and ``else`` after then forget about inlining anything. It's confusing and may be counter-intuitive.

```java
// Bad
if (someExpr)
    object.someMethod(new OtherObject("long string with many characters", 10000000001));

// Also terrible
if (x.value.otherValue == new ObjectOfTypeT().valueXyz) doThis();

// Acceptable
if (isThisThing) doThisThen();

// Preferred in almost every case
if (isThisThing && numberOfThis == 100001001) {
    x = new ObjectOfTypeT("some string", numberX, numberY);
}
```

``else`` statements must not be inline in any case. I mean it. It's not cool.

## Comments

### Language

Comments should be in English and only English. Sounds silly but I'll say it while I can.
I also have no issue with swearing in comments as long as it's not all the time or offensive. I may fuzz swearing upon releases and revert after.

### Classes

All classes should have a block JDoc comment before them with *at least* a small explanation of what they do and the author.

### Class Members

Unless their name isn't descriptive without making it 80 chars long there isn't usually a need for member comments.

### Enums

Enums should have an accompanying JDoc comment along with their members.

### Methods

Static or not, they should have the appropriate JDoc comments. Parameter descriptions, return, description and exceptions are a must.
Link classes if you need to, don't just leave them as a string.

### TODO and FIXME Comments

These are useful, use them if you have to. I will usually do a TODO and FIXME pass every now and then if something needs to be done.
Make sure they have descriptions and are just a lone ``// TODO:``.

## TODO
