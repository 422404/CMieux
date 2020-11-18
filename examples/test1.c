#include <stdio.h>

auto struct Hello {
    int a;
    string b;
};

void initialize@Hello() {
    a = 1337;
    b = "yeet";
}

void initialize@Hello(int a, string b) {
    self.a = a;
    self.b = b;
}

void cleanup@Hello() {
    printf("ciao!\n");
}

void print@Hello() {
    printf("Hello { %d, %s }\n", a, b.chars);
}

int main(void) {
    Hello *hello1 = new Hello;
    defer hello1.print();

    int a = null ?: 1337; // a will be set to 1337
    string *s = null;
    int b = s?.length ?: 0; // b will be set to 0 as s is null
    char *chars = s?.chars; // chars will be se to null as s is null

    void* someVar = NULL;
    super_long_type_name_t *anotherVar = ()someVar; // No need to specify the
                                                    // type in an obvious cast

    auto infer = a; // type inferred to int

    {
        Hello hello2 = Hello("wow", 42);
    }
    return 0;
}
