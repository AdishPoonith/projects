package p0;

import java.util.Arrays;
/* loaded from: classes.dex */
public enum p0 {
    GET,
    POST,
    DELETE;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static p0[] valuesCustom() {
        p0[] valuesCustom = values();
        return (p0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
