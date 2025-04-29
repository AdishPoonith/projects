package s0;

import java.util.Arrays;
/* loaded from: classes.dex */
public enum n {
    EVENT("event"),
    ACTION_SOURCE("action_source"),
    APP("app"),
    MOBILE_APP_INSTALL("MobileAppInstall"),
    INSTALL_EVENT_TIME("install_timestamp");
    

    /* renamed from: j  reason: collision with root package name */
    private final String f16998j;

    n(String str) {
        this.f16998j = str;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static n[] valuesCustom() {
        n[] valuesCustom = values();
        return (n[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final String g() {
        return this.f16998j;
    }
}
