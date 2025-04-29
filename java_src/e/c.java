package e;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.MediaStore;
import e.a;
import e.d;
import java.util.List;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import t9.p;
/* loaded from: classes.dex */
public class c extends e.a<androidx.activity.result.f, List<Uri>> {

    /* renamed from: b  reason: collision with root package name */
    public static final a f7959b = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final int f7960a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }

        public final int a() {
            if (d.f7961a.f()) {
                return MediaStore.getPickImagesMaxLimit();
            }
            return Integer.MAX_VALUE;
        }
    }

    public c() {
        this(0, 1, null);
    }

    public c(int i10) {
        this.f7960a = i10;
        if (!(i10 > 1)) {
            throw new IllegalArgumentException("Max items must be higher than 1".toString());
        }
    }

    public /* synthetic */ c(int i10, int i11, g gVar) {
        this((i11 & 1) != 0 ? f7959b.a() : i10);
    }

    @Override // e.a
    /* renamed from: d */
    public Intent a(Context context, androidx.activity.result.f input) {
        l.e(context, "context");
        l.e(input, "input");
        d.a aVar = d.f7961a;
        if (aVar.f()) {
            Intent intent = new Intent("android.provider.action.PICK_IMAGES");
            intent.setType(aVar.c(input.a()));
            if (this.f7960a <= MediaStore.getPickImagesMaxLimit()) {
                intent.putExtra("android.provider.extra.PICK_IMAGES_MAX", this.f7960a);
                return intent;
            }
            throw new IllegalArgumentException("Max items must be less or equals MediaStore.getPickImagesMaxLimit()".toString());
        } else if (aVar.e(context)) {
            ResolveInfo b10 = aVar.b(context);
            if (b10 != null) {
                ActivityInfo activityInfo = b10.activityInfo;
                Intent intent2 = new Intent("androidx.activity.result.contract.action.PICK_IMAGES");
                intent2.setClassName(activityInfo.applicationInfo.packageName, activityInfo.name);
                intent2.setType(aVar.c(input.a()));
                intent2.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.f7960a);
                return intent2;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } else if (aVar.d(context)) {
            ResolveInfo a10 = aVar.a(context);
            if (a10 != null) {
                ActivityInfo activityInfo2 = a10.activityInfo;
                Intent intent3 = new Intent("com.google.android.gms.provider.action.PICK_IMAGES");
                intent3.setClassName(activityInfo2.applicationInfo.packageName, activityInfo2.name);
                intent3.putExtra("com.google.android.gms.provider.extra.PICK_IMAGES_MAX", this.f7960a);
                return intent3;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } else {
            Intent intent4 = new Intent("android.intent.action.OPEN_DOCUMENT");
            intent4.setType(aVar.c(input.a()));
            intent4.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            if (intent4.getType() == null) {
                intent4.setType("*/*");
                intent4.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
                return intent4;
            }
            return intent4;
        }
    }

    @Override // e.a
    /* renamed from: e */
    public final a.C0128a<List<Uri>> b(Context context, androidx.activity.result.f input) {
        l.e(context, "context");
        l.e(input, "input");
        return null;
    }

    @Override // e.a
    /* renamed from: f */
    public final List<Uri> c(int i10, Intent intent) {
        List<Uri> e10;
        List<Uri> a10;
        if (!(i10 == -1)) {
            intent = null;
        }
        if (intent == null || (a10 = b.f7958a.a(intent)) == null) {
            e10 = p.e();
            return e10;
        }
        return a10;
    }
}
