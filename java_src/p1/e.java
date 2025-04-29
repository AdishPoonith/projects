package p1;

import java.util.Arrays;
/* loaded from: classes.dex */
public enum e {
    NONE(null),
    ONLY_ME("only_me"),
    FRIENDS("friends"),
    EVERYONE("everyone");
    

    /* renamed from: j  reason: collision with root package name */
    private final String f15110j;

    e(String str) {
        this.f15110j = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static e[] valuesCustom() {
        e[] valuesCustom = values();
        return (e[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String g() {
        return this.f15110j;
    }
}
