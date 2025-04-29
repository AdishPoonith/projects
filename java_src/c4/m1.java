package c4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
/* loaded from: classes.dex */
public final class m1 {

    /* renamed from: f  reason: collision with root package name */
    private static final Uri f3342f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    private final String f3343a;

    /* renamed from: b  reason: collision with root package name */
    private final String f3344b;

    /* renamed from: c  reason: collision with root package name */
    private final ComponentName f3345c;

    /* renamed from: d  reason: collision with root package name */
    private final int f3346d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f3347e;

    public m1(ComponentName componentName, int i10) {
        this.f3343a = null;
        this.f3344b = null;
        s.j(componentName);
        this.f3345c = componentName;
        this.f3346d = 4225;
        this.f3347e = false;
    }

    public m1(String str, String str2, int i10, boolean z10) {
        s.f(str);
        this.f3343a = str;
        s.f(str2);
        this.f3344b = str2;
        this.f3345c = null;
        this.f3346d = 4225;
        this.f3347e = z10;
    }

    public final ComponentName a() {
        return this.f3345c;
    }

    public final Intent b(Context context) {
        Bundle bundle;
        if (this.f3343a != null) {
            if (this.f3347e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f3343a);
                try {
                    bundle = context.getContentResolver().call(f3342f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e10) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                    bundle = null;
                }
                r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
                if (r2 == null) {
                    Log.w("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(this.f3343a)));
                }
            }
            return r2 == null ? new Intent(this.f3343a).setPackage(this.f3344b) : r2;
        }
        return new Intent().setComponent(this.f3345c);
    }

    public final String c() {
        return this.f3344b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m1) {
            m1 m1Var = (m1) obj;
            return q.b(this.f3343a, m1Var.f3343a) && q.b(this.f3344b, m1Var.f3344b) && q.b(this.f3345c, m1Var.f3345c) && this.f3347e == m1Var.f3347e;
        }
        return false;
    }

    public final int hashCode() {
        return q.c(this.f3343a, this.f3344b, this.f3345c, 4225, Boolean.valueOf(this.f3347e));
    }

    public final String toString() {
        String str = this.f3343a;
        if (str == null) {
            s.j(this.f3345c);
            return this.f3345c.flattenToString();
        }
        return str;
    }
}
