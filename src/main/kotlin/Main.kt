fun main() {
    print(solution(2, 7))
}

fun solution(a: Int, b: Int): Int {
    var count = 0
    for (i in a until b + 1) {
        count += Integer.toBinaryString(i).replace("0", "").length
    }
    return count
}