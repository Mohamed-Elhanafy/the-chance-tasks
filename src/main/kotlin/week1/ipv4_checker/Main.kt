package week1.ipv4_checker

fun main() {}

fun isValidIPv4(ip: String): Boolean {
    if (ip.isEmpty() || ip != ip.trim()) return false

    val segments = ip.split('.')
    if (segments.size != 4) return false

    return segments.all { segment ->
        segment.isNotEmpty() &&
                segment.all { it.isDigit() } &&
                (segment.length == 1 || segment[0] != '0') &&
                segment.toInt() in 0..255
    }
}