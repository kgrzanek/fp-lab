type Thunk = () => Thunk | bigint;

const trampoline = (fn: Thunk): bigint => {
    let result = fn();
    while (typeof result === 'function') {
        result = result();
    }
    return result;
};

// a. Wzór na liczbę kroków
// Liczba kroków dla rekurencyjnej funkcji Fibonacciego wynosi O(2^n).

// b. Procedura rekurencyjna z trampoliną
const fibRec = (n: number, a: bigint = 0n, b: bigint = 1n): Thunk => {
    return n === 0 ? () => a : () => fibRec(n - 1, b, a + b);
};

// c. Iteracyjne obliczanie Fibonacciego z trampoliną
const fibIter = (n: number, a: bigint = 0n, b: bigint = 1n, i: number = 0): Thunk => {
    return i === n ? () => a : () => fibIter(n, b, a + b, i + 1);
};

const n = 10000;

// Obliczanie Fibonacciego za pomocą rekurencyjnej funkcji
console.log(`Fibonacci of ${n} (recursive): ${trampoline(fibRec(n))}`);

// Obliczanie Fibonacciego za pomocą iteracyjnej funkcji
console.log(`Fibonacci of ${n} (iterative): ${trampoline(fibIter(n))}`);
