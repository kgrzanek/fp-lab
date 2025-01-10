//1
let fixedPoint f firstGuess tolerance =
    let rec loop guess =
        let next = f guess
        if abs (next - guess) < tolerance then
            next
        else
            loop next
    loop firstGuess

let averageDamp f =
    fun x -> (x + f x) / 2.0

let cubeRoot x =
    let cube y = x / (y * y)
    fixedPoint (averageDamp cube) 1.0 1e-10

printfn "Cube root of 27.0 (Average-damp): %f" (cubeRoot 27.0)

//2

let newtonCubeRoot x =
    let improve guess = (2.0 * guess + x / (guess * guess)) / 3.0
    let goodEnough guess = abs ((guess ** 3.0) - x) < 1e-10
    let rec loop guess =
        if goodEnough guess then
            guess
        else
            loop (improve guess)
    loop 1.0

printfn "Cube root of 27.0 (Newton's method): %f" (newtonCubeRoot 27.0)

//3

let compose f g =
    fun x -> f (g x)

let square x = x * x
let inc x = x + 1
let composedFunction = compose square inc
printfn "Result of composed function (square and inc) for 6: %d" (composedFunction 6)

//4

let rec repeatCompose f n =
    if n = 1 then
        f
    else
        compose f (repeatCompose f (n - 1))


let repeatInc3 = repeatCompose inc 3
printfn "Result of repeatCompose (inc 3 times) for 6: %d" (repeatInc3 6)