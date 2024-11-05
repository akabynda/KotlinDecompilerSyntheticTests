package syntheticExamples.operatorOverloading.CFR.OperatorOverloadingDecompiled;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 0, 0}, k=1, xi=82, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\n\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0000H\u0086\u0002J\t\u0010\f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\r\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0011\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0012\u001a\u00020\u0013H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u0014"}, d2={"LsyntheticExamples/operatorOverloading/Vector;", "", "x", "", "y", "<init>", "(II)V", "getX", "()I", "getY", "plus", "other", "component1", "component2", "copy", "equals", "", "hashCode", "toString", "", "KotlinDecompiler"})
public final class Vector {
    private final int x;
    private final int y;

    public Vector(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    @NotNull
    public final Vector plus(@NotNull Vector other) {
        Intrinsics.checkNotNullParameter((Object)other, (String)"other");
        return new Vector(this.x + other.x, this.y + other.y);
    }

    public final int component1() {
        return this.x;
    }

    public final int component2() {
        return this.y;
    }

    @NotNull
    public final Vector copy(int x, int y) {
        return new Vector(x, y);
    }

    public static /* synthetic */ Vector copy$default(Vector vector, int n, int n2, int n3, Object object) {
        if ((n3 & 1) != 0) {
            n = vector.x;
        }
        if ((n3 & 2) != 0) {
            n2 = vector.y;
        }
        return vector.copy(n, n2);
    }

    @NotNull
    public String toString() {
        return "Vector(x=" + this.x + ", y=" + this.y + ')';
    }

    public int hashCode() {
        int result = Integer.hashCode(this.x);
        result = result * 31 + Integer.hashCode(this.y);
        return result;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Vector)) {
            return false;
        }
        Vector vector = (Vector)other;
        if (this.x != vector.x) {
            return false;
        }
        return this.y == vector.y;
    }
}
