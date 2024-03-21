package jetbrains.refactoring.course.extracting

import java.io.File
import java.io.FileNotFoundException

fun wordCount(fileName: String): Int {
    val file = File(fileName)
    extracted(file)
    var wordCount = 0
    file.forEachLine { line ->
        wordCount += line.split("\\s+".toRegex()).count()
    }
    return wordCount
}

fun copyFile(srcName: String, destName: String) {
    val file = File(srcName)
    val to = File(destName)
    extracted(file)
    file.copyTo(to)
}

private fun extracted(file: File) {
    if (!file.exists() || !file.isFile) {
        throw FileNotFoundException()
    }
}
