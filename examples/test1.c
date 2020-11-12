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

    {
        Hello hello2 = Hello("wow", 42);
    }
    return 0;
}
