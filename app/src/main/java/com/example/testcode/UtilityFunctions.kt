package com.example.testcode

import java.time.LocalDate

/**
 * 인사말 형식 지정 함수 - null 이름 처리 버그 포함
 */
fun formatGreeting(name: String?): String {
    val upperCaseName = name?.uppercase() ?: "GUEST"
    return "Hello, $upperCaseName!"
}

/**
 * 만기일 계산 함수 - 0으로 나누기 버그 포함
 */
fun calculateDueDate(startDate: LocalDate, days: Int, divisor: Int): LocalDate {
    val adjustedDays = days / divisor
    return startDate.plusDays(adjustedDays.toLong())
}

/**
 * 문자열 리스트의 숫자를 파싱하고 합산하는 함수 - 입력값 검증 버그 포함
 */
fun parseAndSum(strings: List<String>): Int {
    return strings.map { it.toInt() }.sum()
} 