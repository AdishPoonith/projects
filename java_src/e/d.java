package e;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.ext.SdkExtensions;
import e.a;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import t9.x;
/* loaded from: classes.dex */
public class d extends e.a<androidx.activity.result.f, Uri> {

    /* renamed from: a  reason: collision with root package name */
    public static final a f7961a = new a(null);

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final ResolveInfo a(Context context) {
            l.e(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("com.google.android.gms.provider.action.PICK_IMAGES"), 1114112);
        }

        public final ResolveInfo b(Context context) {
            l.e(context, "context");
            return context.getPackageManager().resolveActivity(new Intent("androidx.activity.result.contract.action.PICK_IMAGES"), 1114112);
        }

        public final String c(f input) {
            l.e(input, "input");
            if (input instanceof c) {
                return "image/*";
            }
            if (input instanceof e) {
                return "video/*";
            }
            if (input instanceof C0129d) {
                return ((C0129d) input).a();
            }
            if (input instanceof b) {
                return null;
            }
            throw new s9.l();
        }

        public final boolean d(Context context) {
            l.e(context, "context");
            return a(context) != null;
        }

        public final boolean e(Context context) {
            l.e(context, "context");
            return b(context) != null;
        }

        public final boolean f() {
            int i10 = Build.VERSION.SDK_INT;
            return i10 >= 33 || (i10 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final b f7962a = new b();

        private b() {
        }
    }

    /* loaded from: classes.dex */
    public static final class c implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final c f7963a = new c();

        private c() {
        }
    }

    /* renamed from: e.d$d  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0129d implements f {

        /* renamed from: a  reason: collision with root package name */
        private final String f7964a;

        public final String a() {
            return this.f7964a;
        }
    }

    /* loaded from: classes.dex */
    public static final class e implements f {

        /* renamed from: a  reason: collision with root package name */
        public static final e f7965a = new e();

        private e() {
        }
    }

    /* loaded from: classes.dex */
    public interface f {
    }

    @Override // e.a
    /* renamed from: d */
    public Intent a(Context context, androidx.activity.result.f input) {
        ActivityInfo activityInfo;
        Intent intent;
        l.e(context, "context");
        l.e(input, "input");
        a aVar = f7961a;
        if (aVar.f()) {
            Intent intent2 = new Intent("android.provider.action.PICK_IMAGES");
            intent2.setType(aVar.c(input.a()));
            return intent2;
        }
        if (aVar.e(context)) {
            ResolveInfo b10 = aVar.b(context);
            if (b10 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            activityInfo = b10.activityInfo;
            intent = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
        } else if (!aVar.d(context)) {
            Intent intent3 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent3.setType(aVar.c(input.a()));
            if (intent3.getType() == null) {
                intent3.setType("*/*");
                intent3.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent3;
            }
            return intent3;
        } else {
            ResolveInfo a10 = aVar.a(context);
            if (a10 == null) {
                throw new IllegalStateException("Required value was null.".toString());
            }
            activityInfo = a10.activityInfo;
            intent = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
        }
        intent.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
        intent.setType(aVar.c(input.a()));
        return intent;
    }

    @Override // e.a
    /* renamed from: e */
    public final a.C0128a<Uri> b(Context context, androidx.activity.result.f input) {
        l.e(context, "context");
        l.e(input, "input");
        return null;
    }

    @Override // e.a
    /* renamed from: f */
    public final Uri c(int i10, Intent intent) {
        Object u10;
        if (!(i10 == -1)) {
            intent = null;
        }
        if (intent != null) {
            Uri data = intent.getData();
            if (data == null) {
                u10 = x.u(e.b.f7958a.a(intent));
                data = (Uri) u10;
            }
            return data;
        }
        return null;
    }
}
