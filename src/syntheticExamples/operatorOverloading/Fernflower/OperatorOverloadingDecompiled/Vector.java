package syntheticExamples.operatorOverloading.Fernflower.OperatorOverloadingDecompiled;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {2, 0, 0},
        k = 1,
        xi = 48,
        d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\u0011\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\u0000H\u0086\u0002J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"},
        d2 = {"LsyntheticExamples/operatorOverloading/Vector;", "", "x", "", "y", "(II)V", "getX", "()I", "getY", "component1", "component2", "copy", "equals", "", "other", "hashCode", "plus", "toString", "", "KotlinDecompiler"}
)
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
        Intrinsics.checkNotNullParameter(other, "other");
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

    // $FF: synthetic method
    public static Vector copy$default(Vector var0, int var1, int var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.x;
        }

        if ((var3 & 2) != 0) {
            var2 = var0.y;
        }

        return var0.copy(var1, var2);
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
        } else if (!(other instanceof Vector)) {
            return false;
        } else {
            Vector var2 = (Vector)other;
            if (this.x != var2.x) {
                return false;
            } else {
                return this.y == var2.y;
            }
        }
    }
}
