package c4;

import android.os.Bundle;
import com.google.android.gms.common.api.a;
/* loaded from: classes.dex */
public class z implements a.d {

    /* renamed from: k  reason: collision with root package name */
    public static final z f3411k = a().a();

    /* renamed from: j  reason: collision with root package name */
    private final String f3412j;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f3413a;

        /* synthetic */ a(c0 c0Var) {
        }

        public z a() {
            return new z(this.f3413a, null);
        }
    }

    /* synthetic */ z(String str, d0 d0Var) {
        this.f3412j = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f3412j;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z) {
            return q.b(this.f3412j, ((z) obj).f3412j);
        }
        return false;
    }

    public final int hashCode() {
        return q.c(this.f3412j);
    }
}
