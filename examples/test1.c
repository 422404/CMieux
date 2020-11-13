#include <stdio.h>

auto struct Hello {
    int a;
    string b;
};

initialize@Hello() {
    a = 1337;
    b = "yeet";
}

initialize@Hello(int a, string b) {
    self.a = a;
    self.b = b;
}

cleanup@Hello() {
    printf("ciao!\n");
}

print@Hello() {
    printf("Hello { %d, %s }\n", a, b.chars);
}

int main(void) {
    Hello *hello1 = new Hello;
    defer hello1.print();

    int a = null ?: 1337; // a will be set to 1337
    string *s = null;
    int b = s?.length ?: 0; // b will be set to 0 as s is null
    char *chars = s?.chars; // chars will be se to null as s is null

    {
        Hello hello2 = Hello("wow", 42);
    }
    return 0;
}
