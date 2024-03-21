package jetbrains.refactoring.course.patterns

fun main(args: Array<String>) {
    val transportName = args[0]
    val transport = TransportationServiceFactory()
    val driveMessage = transport.getTransportation(transportName).drive()
    println(driveMessage)
}
