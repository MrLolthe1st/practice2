import java.io.File
import java.util.*
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    val versionProperties = Properties()
    versionProperties.load({ }.javaClass.getResourceAsStream("/settings"))
    println(versionProperties.getProperty("count_files"))
}