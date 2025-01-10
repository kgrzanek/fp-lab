//2
let fibIter n =
    let rec loop a b count =
        if count = 0 then
            a
        else
            loop b (a + b) (count - 1)
    loop 0 1 n
printfn "Fib(10) = %d" (fibIter 10)

//3
let fib10000 = fibIter 10000
printfn "Fib(10000) = %d" fib10000