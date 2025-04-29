package s0;

import java.util.Arrays;
/* loaded from: classes.dex */
public enum o {
    URL("endpoint"),
    ENABLED("is_enabled"),
    DATASETID("dataset_id"),
    ACCESSKEY("access_key");
    

    /* renamed from: j  reason: collision with root package name */
    private final String f17004j;

    o(String str) {
        this.f17004j = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static o[] valuesCustom() {
        o[] valuesCustom = values();
        return (o[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String g() {
        return this.f17004j;
    }
}
