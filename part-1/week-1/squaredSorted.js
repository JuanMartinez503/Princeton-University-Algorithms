
function sortedSquaredArray (array){
    let newArray = new Array(array.length)
    let left =0
    let right = array.length -1
    for (let i = array.length -1; i >= 0; i--){
        let squaredLeft = array[left] * array[left]
        let squaredRight = array[right] * array[right]
        if (squaredLeft > squaredRight){
            newArray[i] = squaredLeft
            left++
        }
        else{
            newArray[i] = squaredRight
            right--
        }
    }
            return newArray
}

console.log(sortedSquaredArray([-4, -1, 0, 3, 10])) // [0, 1, 9, 16, 100]