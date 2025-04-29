package q0;

import java.util.Arrays;
/* loaded from: classes.dex */
public enum a0 {
    SUCCESS,
    SERVER_ERROR,
    NO_CONNECTIVITY,
    UNKNOWN_ERROR;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static a0[] valuesCustom() {
        a0[] valuesCustom = values();
        return (a0[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }
}
