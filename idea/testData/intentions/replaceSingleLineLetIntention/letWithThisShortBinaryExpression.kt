// WITH_RUNTIME
// IS_APPLICABLE: true

fun Int.foo() {
    let<caret> { it + 1 }
}