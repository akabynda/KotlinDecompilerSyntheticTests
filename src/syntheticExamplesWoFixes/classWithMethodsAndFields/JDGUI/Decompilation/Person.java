package syntheticExamplesWoFixes.classWithMethodsAndFields.JDGUI.Decompilation;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\002\n\002\020\002\n\000\030\0002\0020\001B\025\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\002\020\006J\006\020\007\032\0020\bR\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\t"}, d2 = {"LsyntheticExamplesWoFixes/classWithMethodsAndFields/Person;", "", "name", "", "age", "", "(Ljava/lang/String;I)V", "sayHello", "", "KotlinDecompiler"})
public final class Person {
    @NotNull
    private final String name;

    private final int age;

    public Person(@NotNull String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Привет, меня зовут " + this.name);
    }
}


/* Location:              /Users/akabynda/KotlinDecompiler/out/production/KotlinDecompiler/!/syntheticExamplesWoFixes/classWithMethodsAndFields/Person.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */