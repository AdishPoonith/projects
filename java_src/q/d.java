package q;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import java.util.ArrayList;
import q.a;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Intent f15868a;

    /* renamed from: b  reason: collision with root package name */
    public final Bundle f15869b;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: c  reason: collision with root package name */
        private ArrayList<Bundle> f15872c;

        /* renamed from: d  reason: collision with root package name */
        private Bundle f15873d;

        /* renamed from: e  reason: collision with root package name */
        private ArrayList<Bundle> f15874e;

        /* renamed from: f  reason: collision with root package name */
        private SparseArray<Bundle> f15875f;

        /* renamed from: g  reason: collision with root package name */
        private Bundle f15876g;

        /* renamed from: a  reason: collision with root package name */
        private final Intent f15870a = new Intent("android.intent.action.VIEW");

        /* renamed from: b  reason: collision with root package name */
        private final a.C0229a f15871b = new a.C0229a();

        /* renamed from: h  reason: collision with root package name */
        private int f15877h = 0;

        /* renamed from: i  reason: collision with root package name */
        private boolean f15878i = true;

        public a() {
        }

        public a(f fVar) {
            if (fVar != null) {
                b(fVar);
            }
        }

        private void c(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            androidx.core.app.f.b(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f15870a.putExtras(bundle);
        }

        public d a() {
            if (!this.f15870a.hasExtra("android.support.customtabs.extra.SESSION")) {
                c(null, null);
            }
            ArrayList<Bundle> arrayList = this.f15872c;
            if (arrayList != null) {
                this.f15870a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f15874e;
            if (arrayList2 != null) {
                this.f15870a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f15870a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f15878i);
            this.f15870a.putExtras(this.f15871b.a().a());
            Bundle bundle = this.f15876g;
            if (bundle != null) {
                this.f15870a.putExtras(bundle);
            }
            if (this.f15875f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f15875f);
                this.f15870a.putExtras(bundle2);
            }
            this.f15870a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f15877h);
            return new d(this.f15870a, this.f15873d);
        }

        public a b(f fVar) {
            this.f15870a.setPackage(fVar.d().getPackageName());
            c(fVar.c(), fVar.e());
            return this;
        }
    }

    d(Intent intent, Bundle bundle) {
        this.f15868a = intent;
        this.f15869b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f15868a.setData(uri);
        androidx.core.content.a.i(context, this.f15868a, this.f15869b);
    }
}
