package q;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Integer f15854a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f15855b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f15856c;

    /* renamed from: d  reason: collision with root package name */
    public final Integer f15857d;

    /* renamed from: q.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0229a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f15858a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f15859b;

        /* renamed from: c  reason: collision with root package name */
        private Integer f15860c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f15861d;

        public a a() {
            return new a(this.f15858a, this.f15859b, this.f15860c, this.f15861d);
        }
    }

    a(Integer num, Integer num2, Integer num3, Integer num4) {
        this.f15854a = num;
        this.f15855b = num2;
        this.f15856c = num3;
        this.f15857d = num4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bundle a() {
        Bundle bundle = new Bundle();
        Integer num = this.f15854a;
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        Integer num2 = this.f15855b;
        if (num2 != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", num2.intValue());
        }
        Integer num3 = this.f15856c;
        if (num3 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", num3.intValue());
        }
        Integer num4 = this.f15857d;
        if (num4 != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_DIVIDER_COLOR", num4.intValue());
        }
        return bundle;
    }
}
