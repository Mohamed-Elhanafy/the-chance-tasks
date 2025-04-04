package week1.ipv4_checker

import week1.common.check

fun main() {
    check(actual = isValidIPv4("192.168.1.1"), expected = true, name = "given standard IP then returns true")
    check(actual = isValidIPv4("0.0.0.0"), expected = true, name = "given zero IP then returns true")
    check(actual = isValidIPv4("255.255.255.255"), expected = true, name = "given max value IP then returns true")
    check(actual = isValidIPv4("127.0.0.1"), expected = true, name = "given localhost then returns true")
    check(actual = isValidIPv4("10.0.0.1"), expected = true, name = "given private network IP then returns true")

    check(actual = isValidIPv4(""), expected = false, name = "given empty string then returns false")
    check(actual = isValidIPv4("192.168.1"), expected = false, name = "given too few segments then returns false")
    check(actual = isValidIPv4("192.168.1.1.1"), expected = false, name = "given too many segments then returns false")
    check(actual = isValidIPv4("192.168.01.1"), expected = false, name = "given leading zero then returns false")
    check(actual = isValidIPv4("192.168.1.01"), expected = false, name = "given leading zero in last segment then returns false")
    check(actual = isValidIPv4("192.168.1."), expected = false, name = "given empty segment then returns false")
    check(actual = isValidIPv4(".192.168.1"), expected = false, name = "given empty first segment then returns false")
    check(actual = isValidIPv4("192..168.1"), expected = false, name = "given empty middle segment then returns false")
    check(actual = isValidIPv4("192.168.256.1"), expected = false, name = "given segment value too high then returns false")
    check(actual = isValidIPv4("192.168.-1.1"), expected = false, name = "given negative segment value then returns false")
    check(actual = isValidIPv4("192.168.a.1"), expected = false, name = "given non-numeric character then returns false")
    check(actual = isValidIPv4("192.168.1.1."), expected = false, name = "given trailing dot then returns false")
    check(actual = isValidIPv4("192.168.1+1"), expected = false, name = "given invalid separator then returns false")
    check(actual = isValidIPv4("192,168,1,1"), expected = false, name = "given commas instead of dots then returns false")
    check(actual = isValidIPv4("192.168.1.1 "), expected = false, name = "given trailing space then returns false")
    check(actual = isValidIPv4(" 192.168.1.1"), expected = false, name = "given leading space then returns false")
}