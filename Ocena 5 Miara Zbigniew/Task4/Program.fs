let rec powerset (coll: 'a list) : 'a list list =
    match coll with
    | [] -> [[]]
    | x::xs ->
        let restPowerset = powerset xs
        restPowerset @ (restPowerset |> List.map (fun subset -> x :: subset))

let result = powerset [1; 2; 3]
printfn "Powerset: %A" result
