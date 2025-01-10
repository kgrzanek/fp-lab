// Zadanie 2a: Pierwiastek sześcienny
const cubeRoot = (x: number, guess: number = x / 3): number => {
    const nextGuess = (g: number): number => (2 * g + x / (g * g)) / 3;
    return Math.abs(guess ** 3 - x) < 1e-10 ? guess : cubeRoot(x, nextGuess((guess)));
};

// Zadanie 2b: Metoda Herona uzależniona od Epsilon
const sqrtEpsilon = (x: number, epsilon: number, guess: number = x / 2): number => {
    const nextGuess = (g: number): number => (g + x / g) / 2;
    return Math.abs(guess ** 2 - x) < epsilon ? guess : sqrtEpsilon(x, epsilon, nextGuess(guess));
};

// Zadanie 2c: Metoda Herona uzależniona od N (ilości kroków)
const sqrtSteps = (x: number, steps: number, guess: number = x / 2): number => {
    const nextGuess = (g: number): number => (g + x / g) / 2;
    return steps === 0 ? guess : sqrtSteps(x, steps - 1, nextGuess(guess));
};

const x = 27; // Vars can be in a parameters in functions e.g. cubeRoot(27), but vars are const

console.log(`Cube root of ${x} is: ${cubeRoot(x)}`); 

const epsilon = 1e-10;
console.log(`Square root of ${x} with epsilon ${epsilon} is: ${sqrtEpsilon(x, epsilon)}`);

const steps = 10;
console.log(`Square root of ${x} with ${steps} steps is: ${sqrtSteps(x, steps)}`);
