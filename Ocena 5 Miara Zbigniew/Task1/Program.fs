let square x = 
    printfn "Square of %d: %d" x (x * x)
    x * x

let sum_of_square max =
    let result = 
        Seq.unfold (fun x -> if x > max then None else Some(x*x, x+1)) 1
        |> Seq.sum
    printfn "Sum of squares up to %d: %d" max result
    result

let square_of_sum max =
    let sum = {1 .. max} |> Seq.sum
    let result = square sum
    printfn "Square of sum up to %d: %d" max result
    result

let problem_6 max =
    let squareSum = square_of_sum(max)
    let sumSquare = sum_of_square(max)
    let result = squareSum - sumSquare
    printfn "Result of problem 6 with max %d: %d" max result
    result

problem_6 100
