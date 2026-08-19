Got it — you want it to look like a **real GitHub README**, with a natural flow and concise explanations, not a collection of notes.

# `equals()` and `hashCode()` in Java

`equals()` and `hashCode()` are two important methods inherited from the `Object` class. They become especially important when objects are stored in hash-based collections such as `HashSet` and `HashMap`.

## `equals()`

The `equals()` method is used to compare two objects based on their logical equality.

The default implementation of `equals()` compares object references. If we want two objects to be considered equal based on their data, we need to override `equals()`.

## `hashCode()`

The `hashCode()` method returns an integer value associated with an object. Hash-based collections use this value to determine where an object should be stored.

`HashSet` and `HashMap` use `hashCode()` to quickly locate the possible bucket and then use `equals()` to check whether the objects are actually equal.

```text
hashCode() → Find bucket
     ↓
equals() → Check equality
```

## Why Do We Override Both?

Whenever we override `equals()`, we should also override `hashCode()`.

Java follows an important contract:

> If two objects are equal according to `equals()`, they must have the same `hashCode()`.

The reverse is not required:

> Two objects can have the same `hashCode()` but still be unequal.

This situation is called a **hash collision**.

## `HashSet`

`HashSet` uses both `hashCode()` and `equals()` to prevent duplicate objects.

When an object is added:

```text
Object
  ↓
hashCode()
  ↓
Find bucket
  ↓
equals()
  ↓
Check whether an equal object already exists
```

If `equals()` returns `true`, the new object is considered a duplicate.

## `HashMap`

`HashMap` uses `hashCode()` and `equals()` for its **keys**.

When a key is inserted or searched, `HashMap` first uses the key's `hashCode()` to find the appropriate bucket. It then uses `equals()` to identify the exact key.

This is why custom objects used as `HashMap` keys should correctly override both methods.

## What If We Override Only `equals()`?

If `equals()` is overridden but `hashCode()` is not, two logically equal objects may produce different hash codes.

They can therefore be placed into different buckets, causing `HashSet` or `HashMap` to behave incorrectly.

## What If We Override Only `hashCode()`?

Having the same hash code does **not** mean that two objects are equal.

`hashCode()` only helps locate the bucket. `equals()` is still required to determine actual equality.

Therefore, overriding only `hashCode()` is not enough.

## Primitive Types and `hashCode()`

Primitive types such as `int`, `double`, `float`, and `long` are not objects, so they do not have methods.

Therefore, `hashCode()` cannot be called directly on a primitive.

Java provides wrapper classes such as `Integer`, `Double`, `Float`, and `Long`, which provide static `hashCode()` methods for their corresponding primitive values.

Reference types such as `String` are objects, so their `hashCode()` method can be called directly.

## Important Rule

The fields used in `equals()` should normally also be used in `hashCode()`.

This ensures that logically equal objects always produce the same hash code.

### Remember

```text
equals()   → Determines logical equality
hashCode() → Helps locate the bucket

HashSet → uses both
HashMap → uses both for keys
```

> **Equal objects must have the same hash code, but objects with the same hash code do not necessarily have to be equal.**

This version is suitable for directly saving as **`README.md`** in your Java revision repository.
