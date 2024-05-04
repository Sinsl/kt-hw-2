import kotlin.math.max

fun main() {
    task1()
    task2()
    task3()
}

fun task1() {
    val commissionTax = 0.75
    val amount = 2000
    val min = 35

    val commissionValue = (amount / 100 * commissionTax).toInt()
    val result = max(commissionValue, min)
    // или
//    val result = if (commissionValue < min) min else commissionValue

    println(result)
}

fun task2() {
    val likes = 21
    var str = "людям"
    if (likes % 10 == 1 && likes != 11) {
        str = "человеку"
    }
    if (likes > 0) println("Понравилось $likes $str") else println("Еще нет лайков")
}

fun task3() {
    val amount = 1_002
    val isRegularCustomer = true
    val saleMax = 0.05
    val saleStandard = 100
    var result = 0
    if (amount > 10_000) {
        result = Math.round(amount * (1 - saleMax)).toInt()
    } else if (amount > 1000) {
        result = amount - saleStandard
    } else {
        result = amount
    }

    if (isRegularCustomer) {
        result = Math.round(result * (1 - 0.01)).toInt()
    }
    println("Сумма покупки без скидок: $amount, со скидками: $result")
}