/*
package syntheticExamplesWoFixes.scopeFunctions.JDGUI.Decompilation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\021\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B\037\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\020\006\032\004\030\0010\003¢\006\002\020\007J\t\020\022\032\0020\003HÆ\003J\t\020\023\032\0020\005HÆ\003J\013\020\024\032\004\030\0010\003HÆ\003J)\020\025\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\0052\n\b\002\020\006\032\004\030\0010\003HÆ\001J\023\020\026\032\0020\0272\b\020\030\032\004\030\0010\001HÖ\003J\t\020\031\032\0020\005HÖ\001J\t\020\032\032\0020\003HÖ\001R\032\020\004\032\0020\005X\016¢\006\016\n\000\032\004\b\b\020\t\"\004\b\n\020\013R\034\020\006\032\004\030\0010\003X\016¢\006\016\n\000\032\004\b\f\020\r\"\004\b\016\020\017R\032\020\002\032\0020\003X\016¢\006\016\n\000\032\004\b\020\020\r\"\004\b\021\020\017¨\006\033"}, d2 = {"LsyntheticExamplesWoFixes/scopeFunctions/Person;", "", "name", "", "age", "", "email", "(Ljava/lang/String;ILjava/lang/String;)V", "getAge", "()I", "setAge", "(I)V", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "getName", "setName", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "KotlinDecompiler"})
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

    public void setName(@NotNull String<set-?>) {
        Intrinsics.checkNotNullParameter( < set - ?>,"<set-?>")
        this.name = <set - ?>
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int <set-?>) {
        this.age = <set - ?>
    }

    @Nullable
    public String getEmail() {
        return this.email;
    }

    public void setEmail(@Nullable String<set-?>) {
        this.email = <set - ?>
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
        result = this.name.hashCode();
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
 */