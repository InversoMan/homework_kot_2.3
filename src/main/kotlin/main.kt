const val DISCOUNT = 100

fun main() {
    val regularCustomer: Boolean = true
    val previousPurchases = 5_500
    val purchase = 1_000

    val result = regularCustomerDiscount(regularCustomer, calculateDiscount(previousPurchases, purchase))

    println("К оплате, с учетом скидки: $result руб.")
}

fun calculateDiscount(previousPurchases: Int, purchase: Int): Int {
    if (previousPurchases > 10_000) {
        return (purchase - (purchase * 0.05)).toInt()
    } else if (previousPurchases > 1_000) {
        return purchase - DISCOUNT
    } else {
        return purchase
    }
}

fun regularCustomerDiscount(regularCustomer: Boolean, purchase: Int): Int {
    return if (regularCustomer) (purchase - (purchase * 0.01)).toInt() else purchase
}