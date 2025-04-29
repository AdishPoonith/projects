package s0;

import java.util.Arrays;
/* loaded from: classes.dex */
public enum k {
    USER_DATA("user_data"),
    APP_DATA("app_data"),
    CUSTOM_DATA("custom_data"),
    CUSTOM_EVENTS("custom_events");
    

    /* renamed from: j  reason: collision with root package name */
    private final String f16957j;

    k(String str) {
        this.f16957j = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static k[] valuesCustom() {
        k[] valuesCustom = values();
        return (k[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String g() {
        return this.f16957j;
    }
}
