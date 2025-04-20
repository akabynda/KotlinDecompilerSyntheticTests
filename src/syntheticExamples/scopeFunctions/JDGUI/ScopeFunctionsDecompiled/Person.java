package syntheticExamples.scopeFunctions.JDGUI.ScopeFunctionsDecompiled;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 82, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\022\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B!\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\003\006\004\b\007\020\bJ\t\020\023\032\0020\003H\003J\t\020\024\032\0020\005H\003J\013\020\025\032\004\030\0010\003H\003J)\020\026\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\003H\001J\023\020\027\032\0020\0302\b\020\031\032\004\030\0010\001H\003J\t\020\032\032\0020\005H\001J\t\020\033\032\0020\003H\001R\032\020\002\032\0020\003X\016\006\016\n\000\032\004\b\t\020\n\"\004\b\013\020\fR\032\020\004\032\0020\005X\016\006\016\n\000\032\004\b\r\020\016\"\004\b\017\020\020R\034\020\006\032\004\030\0010\003X\016\006\016\n\000\032\004\b\021\020\n\"\004\b\022\020\f\006\034"}, d2 = {"LsyntheticExamples/scopeFunctions/Person;", "", "name", "", "age", "", "email", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getAge", "()I", "setAge", "(I)V", "getEmail", "setEmail", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "KotlinDecompiler"})
public final class Person {
    @NotNull
    private String name;

    private int age;

    @Nullable
    private String email;

    public Person(@NotNull String name, int age, @Nullable String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    public void setName(@NotNull String string) {
        Intrinsics.checkNotNullParameter(string, "<set-?>");
        this.name = string;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int n) {
        this.age = n;
    }

    @Nullable
    public String getEmail() {
        return this.email;
    }

    public void setEmail(@Nullable String string) {
        this.email = string;
    }

    @NotNull
    public String component1() {
        return this.name;
    }

    public int component2() {
        return this.age;
    }

    @Nullable
    public String component3() {
        return this.email;
    }

    @NotNull
    public Person copy(@NotNull String name, int age, @Nullable String email) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new Person(name, age, email);
    }

    @NotNull
    public String toString() {
        return "Person(name=" + this.name + ", age=" + this.age + ", email=" + this.email + ')';
    }

    public int hashCode() {
        int result = this.name.hashCode();
        result = result * 31 + Integer.hashCode(this.age);
        return result * 31 + ((this.email == null) ? 0 : this.email.hashCode());
    }

    public boolean equals(@Nullable Object other) {
        if (this == other)
            return true;
        if (!(other instanceof Person person))
            return false;
        return Intrinsics.areEqual(this.name, person.name) && (this.age == person.age && (Intrinsics.areEqual(this.email, person.email)));
    }
}
