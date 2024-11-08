package syntheticExamples.dataClass.JDGUI;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 82, d1 = {"\000 \n\002\030\002\n\002\020\000\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\n\n\002\020\013\n\002\b\004\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\006\004\b\006\020\007J\t\020\f\032\0020\003H\003J\t\020\r\032\0020\005H\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005H\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001H\003J\t\020\022\032\0020\005H\001J\t\020\023\032\0020\003H\001R\021\020\002\032\0020\003\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005\006\b\n\000\032\004\b\n\020\013\006\024"}, d2 = {"LsyntheticExamples/dataClass/DataClassDecompiled;", "", "name", "", "age", "", "<init>", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getAge", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "KotlinDecompiler"})
public final class DataClassDecompiled {
    @NotNull
    private final String name;

    private final int age;

    public DataClassDecompiled(@NotNull String name, int age) {
        this.name = name;
        this.age = age;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    public final int getAge() {
        return this.age;
    }

    @NotNull
    public final String component1() {
        return this.name;
    }

    public final int component2() {
        return this.age;
    }

    @NotNull
    public final DataClassDecompiled copy(@NotNull String name, int age) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new DataClassDecompiled(name, age);
    }

    @NotNull
    public String toString() {
        return "DataClassDecompiled(name=" + this.name + ", age=" + this.age + ')';
    }

    public int hashCode() {
        int result = this.name.hashCode();
        return result * 31 + Integer.hashCode(this.age);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other)
            return true;
        if (!(other instanceof DataClassDecompiled))
            return false;
        DataClassDecompiled dataClass = (DataClassDecompiled)other;
        return !Intrinsics.areEqual(this.name, dataClass.name) ? false : (!(this.age != dataClass.age));
    }
}
