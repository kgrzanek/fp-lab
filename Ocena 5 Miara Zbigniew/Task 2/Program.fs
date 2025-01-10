//1
let cubeRoot x =
    let rec loop y =
        let nextY = (2.0 * y + x / (y * y)) / 3.0
        if abs (nextY - y) < 1e-10 then
            nextY
        else
            loop nextY
    loop x
printfn "Cube root of 25.0: %f" (cubeRoot 25.0)


//2
let heronSqrt x epsilon =
    let rec loop y =
        let nextY = (y + x / y) / 2.0
        if abs (nextY - y) < epsilon then
            nextY
        else
            loop nextY
    loop x

printfn "Square root of 25.0 with epsilon 1e-10: %f" (heronSqrt 25.0 1e-10)

//3
let heronSqrtN x n =
    let rec loop y steps =
        if steps = 0 then
            y
        else
            let nextY = (y + x / y) / 2.0
            loop nextY (steps - 1)
    loop x n

printfn "Square root of 25.0 with 10 steps: %f" (heronSqrtN 25.0 10)