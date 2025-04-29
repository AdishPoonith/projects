package x7;

import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    private final String f20269a;

    /* renamed from: b  reason: collision with root package name */
    private final String f20270b;

    /* renamed from: c  reason: collision with root package name */
    private final String f20271c;

    /* renamed from: d  reason: collision with root package name */
    private final String f20272d;

    /* renamed from: e  reason: collision with root package name */
    private final String f20273e;

    /* renamed from: f  reason: collision with root package name */
    private final Integer f20274f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f20275g;

    public f() {
        this(null, null, null, null, null, null, false, 127, null);
    }

    public f(String channelName, String title, String iconName, String str, String str2, Integer num, boolean z10) {
        l.e(channelName, "channelName");
        l.e(title, "title");
        l.e(iconName, "iconName");
        this.f20269a = channelName;
        this.f20270b = title;
        this.f20271c = iconName;
        this.f20272d = str;
        this.f20273e = str2;
        this.f20274f = num;
        this.f20275g = z10;
    }

    public /* synthetic */ f(String str, String str2, String str3, String str4, String str5, Integer num, boolean z10, int i10, g gVar) {
        this((i10 & 1) != 0 ? "Location background service" : str, (i10 & 2) != 0 ? "Location background service running" : str2, (i10 & 4) != 0 ? "navigation_empty_icon" : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : num, (i10 & 64) != 0 ? false : z10);
    }

    public final String a() {
        return this.f20269a;
    }

    public final Integer b() {
        return this.f20274f;
    }

    public final String c() {
        return this.f20273e;
    }

    public final String d() {
        return this.f20271c;
    }

    public final boolean e() {
        return this.f20275g;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return l.a(this.f20269a, fVar.f20269a) && l.a(this.f20270b, fVar.f20270b) && l.a(this.f20271c, fVar.f20271c) && l.a(this.f20272d, fVar.f20272d) && l.a(this.f20273e, fVar.f20273e) && l.a(this.f20274f, fVar.f20274f) && this.f20275g == fVar.f20275g;
        }
        return false;
    }

    public final String f() {
        return this.f20272d;
    }

    public final String g() {
        return this.f20270b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int hashCode = ((((this.f20269a.hashCode() * 31) + this.f20270b.hashCode()) * 31) + this.f20271c.hashCode()) * 31;
        String str = this.f20272d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f20273e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f20274f;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        boolean z10 = this.f20275g;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        return hashCode4 + i10;
    }

    public String toString() {
        return "NotificationOptions(channelName=" + this.f20269a + ", title=" + this.f20270b + ", iconName=" + this.f20271c + ", subtitle=" + this.f20272d + ", description=" + this.f20273e + ", color=" + this.f20274f + ", onTapBringToFront=" + this.f20275g + ')';
    }
}
