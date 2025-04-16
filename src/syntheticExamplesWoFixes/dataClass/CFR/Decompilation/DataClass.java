/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package syntheticExamplesWoFixes.dataClass.CFR.Decompilation;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\f\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2={"LsyntheticExamplesWoFixes/dataClass/DataClass;", "", "name", "", "age", "", "(Ljava/lang/String;I)V", "getAge", "()I", "getName", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "KotlinDecompiler"})
public final class DataClass {
    @NotNull
    private final String name;
    private final int age;

    public DataClass(@NotNull String name, int age) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
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
    public final DataClass copy(@NotNull String name, int age) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        return new DataClass(name, age);
    }

    public static /* synthetic */ DataClass copy$default(DataClass dataClass, String string, int n, int n2, Object object) {
        if ((n2 & 1) != 0) {
            string = dataClass.name;
        }
        if ((n2 & 2) != 0) {
            n = dataClass.age;
        }
        return dataClass.copy(string, n);
    }

    @NotNull
    public String toString() {
        return "DataClass(name=" + this.name + ", age=" + this.age + ')';
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
        if (!(other instanceof DataClass)) {
            return false;
        }
        DataClass dataClass = (DataClass)other;
        if (!Intrinsics.areEqual((Object)this.name, (Object)dataClass.name)) {
            return false;
        }
        return this.age == dataClass.age;
    }
}
