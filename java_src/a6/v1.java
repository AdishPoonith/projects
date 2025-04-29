package a6;
/* loaded from: classes.dex */
public final class v1 extends com.google.firebase.auth.w {

    /* renamed from: a  reason: collision with root package name */
    private String f310a;

    /* renamed from: b  reason: collision with root package name */
    private String f311b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f312c = false;

    /* renamed from: d  reason: collision with root package name */
    private boolean f313d = false;

    @Override // com.google.firebase.auth.w
    public final void a(boolean z10) {
        this.f313d = z10;
    }

    @Override // com.google.firebase.auth.w
    public final void b(boolean z10) {
        this.f312c = z10;
    }

    @Override // com.google.firebase.auth.w
    public final void c(String str, String str2) {
        this.f310a = str;
        this.f311b = str2;
    }

    public final String d() {
        return this.f310a;
    }

    public final String e() {
        return this.f311b;
    }

    public final boolean f() {
        return this.f313d;
    }

    public final boolean g() {
        return (this.f310a == null || this.f311b == null) ? false : true;
    }

    public final boolean h() {
        return this.f312c;
    }
}
