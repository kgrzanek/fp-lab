// Task 5a: Cube root using average-damp and FIXED-POINT
const fixedPoint = (f: (x: number) => number, guess: number): number => {
    const tolerance = 1e-6;
    const closeEnough = (x: number): number =>
        Math.abs(f(x) - x) < tolerance ? x : closeEnough(f(x));
    return closeEnough(guess);
};

const averageDamp = (f: (x: number) => number) => (x: number) =>
    (x + f(x)) / 2;

const cubeRootFixedPoint = (x: number): number =>
    fixedPoint(averageDamp((y) => x / (y * y)), 1.0);

// Task 5b: Cube root using Newton's method
const newtonMethod = (
    f: (x: number) => number,
    df: (x: number) => number,
    guess: number
): number => {
    const tolerance = 1e-6;
    const closeEnough = (x: number): number =>
        Math.abs(f(x)) < tolerance ? x : closeEnough(x - f(x) / df(x));
    return closeEnough(guess);
};

const cubeRootNewton = (x: number): number => {
    const f = (y: number) => y * y * y - x;
    const df = (y: number) => 3 * y * y;
    return newtonMethod(f, df, 1.0);
};

// Task 5c: Function composition
const compose = <T, R, V>(
    f: (x: R) => V,
    g: (x: T) => R
): ((x: T) => V) => (x: T) => f(g(x));

// Task 5d: N-fold function composition
// const nFoldCompose = <T>(
//     f: (x: T) => T,
//     n: number
// ): ((x: T) => T) => (n === 0 ? (x: T) => x : compose(f, nFoldCompose(f, n - 1)));

// Usage examples
const root = 34;
console.log(`Cube root of ${root} (fixed-point):`, cubeRootFixedPoint(root)); // can be: // console.log("Cube root of 34 (fixed-point):", cubeRootFixedPoint(34));
console.log(`Cube root of ${root} (Newton's method):`, cubeRootNewton(root)); // can be: // console.log("Cube root of 34 (Newton's method):", cubeRootNewton(34));

const square = (x: number) => x * x;
const inc = (x: number) => x + 1;
const squareAfterInc = compose(square, inc);
console.log("(compose square inc) applied to 6:", squareAfterInc(6));

// const inc4Times = nFoldCompose(inc, 4);
// console.log("(inc 4 times) applied to 6:", inc4Times(6));
const pow_inc_func = (x: number, y: number): number => Math.pow(x+1, y); // other implementation for zad5c. It's more simple. Function allows you to do this too zad5d, becouse has power parameter.
console.log(pow_inc_func(6, 3))
