import kotlin.math.max

fun main() {
    task1()
    task2()
    task3()
}

fun task1() {
    val commissionTax = 0.75
    val amount = 20000
    val min = 35

    val commissionValue = (amount * (commissionTax / 100)).toInt()
    val result = max(commissionValue, min)
    // или
//    val result = if (commissionValue < min) min else commissionValue

    println(result)
}

fun task2() {
    val likes = 81
    var str = "людям"
    if (likes % 10 == 1 && likes != 11 && likes % 100 != 11) {
        str = "человеку"
    }
    if (likes > 0) println("Понравилось $likes $str") else println("Еще нет лайков")
}

fun task3() {
    val amount = 1_002
    val isRegularCustomer = true
    val saleMax = 0.05
    val saleStandard = 100
    var result = if (amount > 10_000) {
        Math.round(amount * (1 - saleMax)).toInt()
    } else if (amount > 1000) {
        amount - saleStandard
    } else {
        amount
    }

    if (isRegularCustomer) {
        result = Math.round(result * (1 - 0.01)).toInt()
    }
    println("Сумма покупки без скидок: $amount, со скидками: $result")
}