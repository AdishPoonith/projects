package f1;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import q.d;
/* loaded from: classes.dex */
public class e {

    /* renamed from: b  reason: collision with root package name */
    public static final a f8415b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private Uri f8416a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        public Uri a(String action, Bundle bundle) {
            kotlin.jvm.internal.l.e(action, "action");
            l0 l0Var = l0.f8470a;
            h0 h0Var = h0.f8445a;
            String b10 = h0.b();
            StringBuilder sb = new StringBuilder();
            p0.f0 f0Var = p0.f0.f14852a;
            sb.append(p0.f0.w());
            sb.append("/dialog/");
            sb.append(action);
            return l0.g(b10, sb.toString(), bundle);
        }
    }

    public e(String action, Bundle bundle) {
        Uri a10;
        kotlin.jvm.internal.l.e(action, "action");
        bundle = bundle == null ? new Bundle() : bundle;
        w[] valuesCustom = w.valuesCustom();
        ArrayList arrayList = new ArrayList(valuesCustom.length);
        for (w wVar : valuesCustom) {
            arrayList.add(wVar.g());
        }
        if (arrayList.contains(action)) {
            l0 l0Var = l0.f8470a;
            h0 h0Var = h0.f8445a;
            a10 = l0.g(h0.g(), kotlin.jvm.internal.l.k("/dialog/", action), bundle);
        } else {
            a10 = f8415b.a(action, bundle);
        }
        this.f8416a = a10;
    }

    public final boolean a(Activity activity, String str) {
        if (k1.a.d(this)) {
            return false;
        }
        try {
            kotlin.jvm.internal.l.e(activity, "activity");
            q.d a10 = new d.a(p1.d.f15097k.b()).a();
            a10.f15868a.setPackage(str);
            try {
                a10.a(activity, this.f8416a);
                return true;
            } catch (ActivityNotFoundException unused) {
                return false;
            }
        } catch (Throwable th) {
            k1.a.b(th, this);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(Uri uri) {
        if (k1.a.d(this)) {
            return;
        }
        try {
            kotlin.jvm.internal.l.e(uri, "<set-?>");
            this.f8416a = uri;
        } catch (Throwable th) {
            k1.a.b(th, this);
        }
    }
}
