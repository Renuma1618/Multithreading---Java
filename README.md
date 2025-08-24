# Java Multithreading & Concurrency Examples

💫  **multithreading and concurrency concepts**, essential for building scalable APIs, microservices, and cloud applications.

## Overview

Multithreading allows running multiple tasks simultaneously to make systems faster, responsive, and scalable. This repository includes practical examples that cover key Java concurrency concepts.

### Key Concepts Implemented

- **Thread Lifecycle:** Demonstrates `New → Runnable → Running → Waiting/Blocked → Terminated`.
- **Runnable vs Callable:** 
  - `Runnable` for tasks without return values.
  - `Callable` for tasks that return results.
- **Executor Service:** Efficiently manages thread pools and reduces overhead.
- **Race Conditions:** Examples of race conditions and solutions using `synchronized`, `Locks`, and `volatile` variables.
- **Concurrent Collections:** Using `ConcurrentHashMap` and `BlockingQueue` for safe multi-threaded operations.
- **Future & CompletableFuture:** Asynchronous programming without blocking the main thread.

## Real-World Scenarios

- **Web Applications & APIs:** Handling multiple user requests concurrently.
- **Microservices:** Running independent tasks in parallel, such as fetching data from multiple services.

## Examples in the Repository

1. **ThreadLifecycleDemo.java** – Shows the complete thread lifecycle.
2. **RunnableVsCallableDemo.java** – Compare `Runnable` and `Callable` execution.
3. **ExecutorServiceDemo.java** – Demonstrates using thread pools.
4. **RaceConditionDemo.java** – Illustrates a race condition and its resolution using synchronization.
5. **ConcurrentCollectionsDemo.java** – Examples of thread-safe collections.
6. **FutureAndCompletableFutureDemo.java** – Asynchronous tasks using `Future` and `CompletableFuture`.

```bash
git clone https://github.com/Renuma1618/Java-Multithreading-Examples.git
