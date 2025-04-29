package io.flutter.plugins.imagepicker;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import io.flutter.plugins.imagepicker.o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
class c {

    /* renamed from: a  reason: collision with root package name */
    private final Context f10724a;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10725a;

        static {
            int[] iArr = new int[b.values().length];
            f10725a = iArr;
            try {
                iArr[b.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10725a[b.VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        IMAGE,
        VIDEO
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context) {
        this.f10724a = context;
    }

    private void h(String str) {
        this.f10724a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_type", str).apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        this.f10724a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().clear().apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, Object> b() {
        Set<String> stringSet;
        HashMap hashMap = new HashMap();
        boolean z10 = false;
        SharedPreferences sharedPreferences = this.f10724a.getSharedPreferences("flutter_image_picker_shared_preference", 0);
        boolean z11 = true;
        if (sharedPreferences.contains("flutter_image_picker_image_path") && (stringSet = sharedPreferences.getStringSet("flutter_image_picker_image_path", null)) != null) {
            hashMap.put("pathList", new ArrayList(stringSet));
            z10 = true;
        }
        if (sharedPreferences.contains("flutter_image_picker_error_code")) {
            o.a.C0168a c0168a = new o.a.C0168a();
            c0168a.b(sharedPreferences.getString("flutter_image_picker_error_code", ""));
            if (sharedPreferences.contains("flutter_image_picker_error_message")) {
                c0168a.c(sharedPreferences.getString("flutter_image_picker_error_message", ""));
            }
            hashMap.put("error", c0168a.a());
        } else {
            z11 = z10;
        }
        if (z11) {
            if (sharedPreferences.contains("flutter_image_picker_type")) {
                hashMap.put("type", sharedPreferences.getString("flutter_image_picker_type", "").equals("video") ? o.c.VIDEO : o.c.IMAGE);
            }
            if (sharedPreferences.contains("flutter_image_picker_max_width")) {
                hashMap.put("maxWidth", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_width", 0L))));
            }
            if (sharedPreferences.contains("flutter_image_picker_max_height")) {
                hashMap.put("maxHeight", Double.valueOf(Double.longBitsToDouble(sharedPreferences.getLong("flutter_image_picker_max_height", 0L))));
            }
            hashMap.put("imageQuality", Integer.valueOf(sharedPreferences.getInt("flutter_image_picker_image_quality", 100)));
        }
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String c() {
        return this.f10724a.getSharedPreferences("flutter_image_picker_shared_preference", 0).getString("flutter_image_picker_pending_image_uri", "");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(o.g gVar) {
        SharedPreferences.Editor edit = this.f10724a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (gVar.c() != null) {
            edit.putLong("flutter_image_picker_max_width", Double.doubleToRawLongBits(gVar.c().doubleValue()));
        }
        if (gVar.b() != null) {
            edit.putLong("flutter_image_picker_max_height", Double.doubleToRawLongBits(gVar.b().doubleValue()));
        }
        edit.putInt("flutter_image_picker_image_quality", gVar.d().intValue());
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Uri uri) {
        this.f10724a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit().putString("flutter_image_picker_pending_image_uri", uri.getPath()).apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(ArrayList<String> arrayList, String str, String str2) {
        SharedPreferences.Editor edit = this.f10724a.getSharedPreferences("flutter_image_picker_shared_preference", 0).edit();
        if (arrayList != null) {
            edit.putStringSet("flutter_image_picker_image_path", new HashSet(arrayList));
        }
        if (str != null) {
            edit.putString("flutter_image_picker_error_code", str);
        }
        if (str2 != null) {
            edit.putString("flutter_image_picker_error_message", str2);
        }
        edit.apply();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(b bVar) {
        String str;
        int i10 = a.f10725a[bVar.ordinal()];
        if (i10 == 1) {
            str = "image";
        } else if (i10 != 2) {
            return;
        } else {
            str = "video";
        }
        h(str);
    }
}
