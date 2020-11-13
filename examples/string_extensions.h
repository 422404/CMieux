#pragma once

#include <string.h>
#include <wchar.h>

int length@char*() {
    return strlen(self);
}

int length@wchar_t*() {
    return wcslen(self);
}
