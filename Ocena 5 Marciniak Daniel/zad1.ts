function sumOfSquares(n: number): number {
    return Array.from({ length: n }, (_, i) => (i + 1) ** 2).reduce((a, b) => a + b, 0);
}

function squareOfSum(n: number): number {
    return Math.pow(Array.from({ length: n }, (_, i) => i + 1).reduce((a, b) => a + b, 0), 2)
}

function difference(n: number): number {
    return squareOfSum(n) - sumOfSquares(n);
}

const n = 100; // it is const
console.log(`Difference: ${difference(n)}`); // can be diffrence(100), then const n can be remove
