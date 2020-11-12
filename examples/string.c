#include "string_extensions.h"

/**
 * string struct contains a cached length
 *
 * Type parameter T defaults to the first type in the list (char)
 */
auto struct string<T: char | wchar_t> {
    T *chars;
    int length;
};

/**
 * This initializer is called on assignment of
 * a value with the sole parameter type on the
 * rhs to a variable of this type on the lhs
 *
 * Example:
 *   string s = "hello";
 */
initialize@string(T *chars) {
    self.chars = chars;
    length = chars.length();
}

/** fields can be added to structs provided they are constants */
const isWide@string<T: char> = false;

const isWide@string<T: wchar_t> = true;
