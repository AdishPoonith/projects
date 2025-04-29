package u8;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
/* loaded from: classes.dex */
public class u0 extends Exception {

    /* renamed from: j  reason: collision with root package name */
    private final String f19294j;

    /* renamed from: k  reason: collision with root package name */
    private final String f19295k;

    /* renamed from: l  reason: collision with root package name */
    private Map<String, Object> f19296l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(Exception exc, Throwable th) {
        super(exc.getMessage(), th);
        this.f19296l = new HashMap();
        String message = exc.getMessage();
        HashMap hashMap = new HashMap();
        String a10 = exc instanceof com.google.firebase.auth.q ? ((com.google.firebase.auth.q) exc).a() : "UNKNOWN";
        message = exc instanceof com.google.firebase.auth.y ? ((com.google.firebase.auth.y) exc).b() : message;
        if (exc instanceof com.google.firebase.auth.x) {
            com.google.firebase.auth.x xVar = (com.google.firebase.auth.x) exc;
            String b10 = xVar.b();
            if (b10 != null) {
                hashMap.put("email", b10);
            }
            com.google.firebase.auth.h c10 = xVar.c();
            if (c10 != null) {
                hashMap.put("authCredential", t0.q1(c10));
            }
        }
        this.f19294j = a10;
        this.f19295k = message;
        this.f19296l = hashMap;
    }

    u0(String str, String str2) {
        super(str2, null);
        this.f19296l = new HashMap();
        this.f19294j = str;
        this.f19295k = str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public u0(String str, String str2, Map<String, Object> map) {
        super(str2, null);
        new HashMap();
        this.f19294j = str;
        this.f19295k = str2;
        this.f19296l = map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u0 a() {
        return new u0("PROVIDER_ALREADY_LINKED", "User has already been linked to the given provider.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u0 d() {
        return new u0("INVALID_CREDENTIAL", "The supplied auth credential is malformed, has expired or is not currently supported.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u0 e() {
        return new u0("NO_SUCH_PROVIDER", "User was not linked to an account with the given provider.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u0 f() {
        return new u0("NO_CURRENT_USER", "No user currently signed in.");
    }

    public Map<String, Object> b() {
        return this.f19296l;
    }

    public String c() {
        return this.f19294j.toLowerCase(Locale.ROOT).replace("error_", "").replace("_", "-");
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f19295k;
    }
}
