package syntheticExamples.dataClass.CFR;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 0, 0}, k = 1, xi = 82, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0012\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0013\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"LsyntheticExamples/dataClass/DataClassDecompiled;", "", "name", "", "age", "", "<init>", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getAge", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "KotlinDecompiler"})
public final class DataClassDecompiled {
    @NotNull
    private final String name;
    private final int age;

    public DataClassDecompiled(@NotNull String name, int age) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.age = age;
    }

    public static /* synthetic */ DataClassDecompiled copy$default(DataClassDecompiled dataClass, String string, int n, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string = dataClass.name;
        }
        if ((n2 & 2) != 0) {
            n = dataClass.age;
        }
        return dataClass.copy(string, n);
    }

    @NotNull
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @NotNull
    public String component1() {
        return this.name;
    }

    public int component2() {
        return this.age;
    }

    @NotNull
    public DataClassDecompiled copy(@NotNull String name, int age) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new DataClassDecompiled(name, age);
    }

    @NotNull
    public String toString() {
        return "DataClassDecompiled(name=" + this.name + ", age=" + this.age + ')';
    }

    public int hashCode() {
        int result = this.name.hashCode();
        result = result * 31 + Integer.hashCode(this.age);
        return result;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataClassDecompiled dataClass)) {
            return false;
        }
        if (!Intrinsics.areEqual(this.name, dataClass.name)) {
            return false;
        }
        return this.age == dataClass.age;
    }
}