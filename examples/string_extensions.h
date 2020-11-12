#pragma once

#include <string.h>
#include <wchar.h>

length@char*() {
    return strlen(self);
}

length@wchar_t*() {
    return wcslen(self);
}
