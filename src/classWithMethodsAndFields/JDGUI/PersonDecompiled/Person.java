package classWithMethodsAndFields.JDGUI.PersonDecompiled;


import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 82, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\003\n\002\020\002\n\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\006\004\b\006\020\007J\006\020\b\032\0020\tR\016\020\002\032\0020\003X\004\006\002\n\000R\016\020\004\032\0020\005X\004\006\002\n\000\006\n"}, d2 = {"LclassWithMethodsAndFields/Person/Person;", "", "name", "", "age", "", "<init>", "(Ljava/lang/String;I)V", "sayHello", "", "KotlinDecompiler"})
public final class Person {
    @NotNull
    private final String name;

    private final int age;

    public Person(@NotNull String name, int age) {
        this.name = name;
        this.age = age;
    }

    public final void sayHello() {
        System.out.println("Привет, меня зовут " + this.name);
    }
}