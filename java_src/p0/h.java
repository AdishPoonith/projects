package p0;

import java.util.Arrays;
/* loaded from: classes.dex */
public enum h {
    NONE(false),
    FACEBOOK_APPLICATION_WEB(true),
    FACEBOOK_APPLICATION_NATIVE(true),
    FACEBOOK_APPLICATION_SERVICE(true),
    WEB_VIEW(true),
    CHROME_CUSTOM_TAB(true),
    TEST_USER(true),
    CLIENT_TOKEN(true),
    DEVICE_AUTH(true),
    INSTAGRAM_APPLICATION_WEB(true),
    INSTAGRAM_CUSTOM_CHROME_TAB(true),
    INSTAGRAM_WEB_VIEW(true);
    

    /* renamed from: j  reason: collision with root package name */
    private final boolean f14906j;

    h(boolean z10) {
        this.f14906j = z10;
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static h[] valuesCustom() {
        h[] valuesCustom = values();
        return (h[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    public final boolean g() {
        return this.f14906j;
    }
}
