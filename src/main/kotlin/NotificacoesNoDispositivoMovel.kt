fun main() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}
fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages <100 ) {
        println("Você tem ${numberOfMessages} notificações")
}   else{
        println("você recebeu 99+ notificações")

}}