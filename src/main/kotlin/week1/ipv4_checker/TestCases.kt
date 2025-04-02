package week1.ipv4_checker

/** ##### Test cases for `isValidIPv4()`
 * ###### Valid test cases
 * - Valid standard IP (192.168.1.1)
 * - Valid zero IP (0.0.0.0)
 * - Valid maximum value IP (255.255.255.255)
 * - Valid localhost (127.0.0.1)
 * - Valid private network IP (10.0.0.1)
 *
 * ##### Invalid test cases
 * - Empty string
 * - Too few segments (192.168.1)
 * - Too many segments (192.168.1.1.1)
 * - Leading zero (192.168.01.1)
 * - Empty segment (192.168.1.)
 * - Empty segment at beginning (.192.168.1)
 * - Empty middle segment (192..168.1)
 * - Segment value too high (192.168.256.1)
 * - Negative segment value (192.168.-1.1)
 * - Non-numeric character (192.168.a.1)
 * - Trailing dot (192.168.1.1.)
 * - Invalid separator (192.168.1+1)
 * - Wrong separator type (192,168,1,1)
 * - Trailing space (192.168.1.1 )
 * - Leading space ( 192.168.1.1)
 */

fun main() {
    // Valid IPv4 addresses
    check(isValidIPv4("192.168.1.1"), true, "Valid standard IP")
    check(isValidIPv4("0.0.0.0"), true, "Valid zero IP")
    check(isValidIPv4("255.255.255.255"), true, "Valid max value IP")
    check(isValidIPv4("127.0.0.1"), true, "Valid localhost")
    check(isValidIPv4("10.0.0.1"), true, "Valid private network IP")

    // Invalid IPv4 addresses
    check(isValidIPv4(""), false, "Empty string")
    check(isValidIPv4("192.168.1"), false, "Too few segments")
    check(isValidIPv4("192.168.1.1.1"), false, "Too many segments")
    check(isValidIPv4("192.168.01.1"), false, "Leading zero")
    check(isValidIPv4("192.168.1.01"), false, "Leading zero in last segment")
    check(isValidIPv4("192.168.1."), false, "Empty segment")
    check(isValidIPv4(".192.168.1"), false, "Empty first segment")
    check(isValidIPv4("192..168.1"), false, "Empty middle segment")
    check(isValidIPv4("192.168.256.1"), false, "Segment value too high")
    check(isValidIPv4("192.168.-1.1"), false, "Negative segment value")
    check(isValidIPv4("192.168.a.1"), false, "Non-numeric character")
    check(isValidIPv4("192.168.1.1."), false, "Trailing dot")
    check(isValidIPv4("192.168.1+1"), false, "Invalid separator")
    check(isValidIPv4("192,168,1,1"), false, "Commas instead of dots")
    check(isValidIPv4("192.168.1.1 "), false, "Trailing space")
    check(isValidIPv4(" 192.168.1.1"), false, "Leading space")
}

fun check(actual: Boolean, expected: Boolean, name: String) {
    if (actual == expected) {
        println("✓ - $name")
    } else {
        System.err.println("✗ - $name. Expected $expected, but got $actual")
    }
}