// const powerSet = <T>(originalSet: T[]): T[][] => {
//     if (originalSet.length === 0) {
//         return [[]];
//     } else {
//         // const [first, ...rest] = originalSet;
//         // const withoutFirst = powerSet(rest);
//         // const withFirst = withoutFirst.map(subset => [first, ...subset]);
//         // return [...withoutFirst, ...withFirst];

//         // ------------------------------ const withoutFirst = powerSet(originalSet.slice(1));
//         // const powSet = [...powerSet(originalSet.slice(1)), ...(powerSet(originalSet.slice(1))).map(subset => [originalSet[0], ...subset])]
//         return [...powerSet(originalSet.slice(1)), ...(powerSet(originalSet.slice(1))).map(subset => [originalSet[0], ...subset])]; // powSet
//     }
// };

const powerSet = <T>(originalSet: T[]): T[][] => {
    const helper = (set: T[]): T[][] => 
        set.length === 0
            ? [[]]
            : helper(set.slice(1)).reduce((acc, subset) =>
                acc.concat([subset, [set[0], ...subset]]), [] as T[][]);

    return helper(originalSet);
};


// const originalSet = [1, 2, 3];
// const result = powerSet([1, 2, 3]) // powerSet(originalSet);

// console.log(result);
console.log(powerSet([1, 2, 3]));
