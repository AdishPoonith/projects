package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build;
import androidx.activity.result.f;
import e.d;
import io.flutter.plugins.imagepicker.c;
import io.flutter.plugins.imagepicker.k;
import io.flutter.plugins.imagepicker.o;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class k implements r8.m, r8.p {

    /* renamed from: j  reason: collision with root package name */
    final String f10744j;

    /* renamed from: k  reason: collision with root package name */
    private final Activity f10745k;

    /* renamed from: l  reason: collision with root package name */
    private final n f10746l;

    /* renamed from: m  reason: collision with root package name */
    private final io.flutter.plugins.imagepicker.c f10747m;

    /* renamed from: n  reason: collision with root package name */
    private final g f10748n;

    /* renamed from: o  reason: collision with root package name */
    private final d f10749o;

    /* renamed from: p  reason: collision with root package name */
    private final io.flutter.plugins.imagepicker.b f10750p;

    /* renamed from: q  reason: collision with root package name */
    private final ExecutorService f10751q;

    /* renamed from: r  reason: collision with root package name */
    private c f10752r;

    /* renamed from: s  reason: collision with root package name */
    private Uri f10753s;

    /* renamed from: t  reason: collision with root package name */
    private f f10754t;

    /* renamed from: u  reason: collision with root package name */
    private final Object f10755u;

    /* loaded from: classes.dex */
    class a implements g {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f10756a;

        a(Activity activity) {
            this.f10756a = activity;
        }

        @Override // io.flutter.plugins.imagepicker.k.g
        public void a(String str, int i10) {
            androidx.core.app.b.n(this.f10756a, new String[]{str}, i10);
        }

        @Override // io.flutter.plugins.imagepicker.k.g
        public boolean b(String str) {
            return androidx.core.content.a.a(this.f10756a, str) == 0;
        }

        @Override // io.flutter.plugins.imagepicker.k.g
        public boolean c() {
            return m.b(this.f10756a);
        }
    }

    /* loaded from: classes.dex */
    class b implements d {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Activity f10757a;

        b(Activity activity) {
            this.f10757a = activity;
        }

        @Override // io.flutter.plugins.imagepicker.k.d
        public Uri a(String str, File file) {
            return androidx.core.content.b.f(this.f10757a, str, file);
        }

        @Override // io.flutter.plugins.imagepicker.k.d
        public void b(Uri uri, final e eVar) {
            Activity activity = this.f10757a;
            String[] strArr = new String[1];
            strArr[0] = uri != null ? uri.getPath() : "";
            MediaScannerConnection.scanFile(activity, strArr, null, new MediaScannerConnection.OnScanCompletedListener() { // from class: io.flutter.plugins.imagepicker.l
                @Override // android.media.MediaScannerConnection.OnScanCompletedListener
                public final void onScanCompleted(String str, Uri uri2) {
                    k.e.this.a(str);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        REAR,
        FRONT
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface d {
        Uri a(String str, File file);

        void b(Uri uri, e eVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface e {
        void a(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a  reason: collision with root package name */
        public final o.g f10761a;

        /* renamed from: b  reason: collision with root package name */
        public final o.l f10762b;

        /* renamed from: c  reason: collision with root package name */
        public final o.h<List<String>> f10763c;

        f(o.g gVar, o.l lVar, o.h<List<String>> hVar) {
            this.f10761a = gVar;
            this.f10762b = lVar;
            this.f10763c = hVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface g {
        void a(String str, int i10);

        boolean b(String str);

        boolean c();
    }

    public k(Activity activity, n nVar, io.flutter.plugins.imagepicker.c cVar) {
        this(activity, nVar, null, null, null, cVar, new a(activity), new b(activity), new io.flutter.plugins.imagepicker.b(), Executors.newSingleThreadExecutor());
    }

    k(Activity activity, n nVar, o.g gVar, o.l lVar, o.h<List<String>> hVar, io.flutter.plugins.imagepicker.c cVar, g gVar2, d dVar, io.flutter.plugins.imagepicker.b bVar, ExecutorService executorService) {
        this.f10755u = new Object();
        this.f10745k = activity;
        this.f10746l = nVar;
        this.f10744j = activity.getPackageName() + ".flutter.image_provider";
        if (hVar != null) {
            this.f10754t = new f(gVar, lVar, hVar);
        }
        this.f10748n = gVar2;
        this.f10749o = dVar;
        this.f10750p = bVar;
        this.f10747m = cVar;
        this.f10751q = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B(String str) {
        y(str, true);
    }

    private void H(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new e.c().a(this.f10745k, new f.a().b(d.c.f7963a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
        }
        this.f10745k.startActivityForResult(intent, 2346);
    }

    private void I(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new e.d().a(this.f10745k, new f.a().b(d.c.f7963a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("image/*");
        }
        this.f10745k.startActivityForResult(intent, 2342);
    }

    private void J(Boolean bool) {
        Intent intent;
        if (bool.booleanValue()) {
            intent = new e.d().a(this.f10745k, new f.a().b(d.e.f7965a).a());
        } else {
            intent = new Intent("android.intent.action.GET_CONTENT");
            intent.setType("video/*");
        }
        this.f10745k.startActivityForResult(intent, 2352);
    }

    private void K() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (this.f10752r == c.FRONT) {
            T(intent);
        }
        File l10 = l();
        this.f10753s = Uri.parse("file:" + l10.getAbsolutePath());
        Uri a10 = this.f10749o.a(this.f10744j, l10);
        intent.putExtra("output", a10);
        s(intent, a10);
        try {
            try {
                this.f10745k.startActivityForResult(intent, 2343);
            } catch (ActivityNotFoundException unused) {
                l10.delete();
                o("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (SecurityException e10) {
            e10.printStackTrace();
            o("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    private void L() {
        o.l lVar;
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        synchronized (this.f10755u) {
            f fVar = this.f10754t;
            lVar = fVar != null ? fVar.f10762b : null;
        }
        if (lVar != null && lVar.b() != null) {
            intent.putExtra("android.intent.extra.durationLimit", lVar.b().intValue());
        }
        if (this.f10752r == c.FRONT) {
            T(intent);
        }
        File m10 = m();
        this.f10753s = Uri.parse("file:" + m10.getAbsolutePath());
        Uri a10 = this.f10749o.a(this.f10744j, m10);
        intent.putExtra("output", a10);
        s(intent, a10);
        try {
            try {
                this.f10745k.startActivityForResult(intent, 2353);
            } catch (ActivityNotFoundException unused) {
                m10.delete();
                o("no_available_camera", "No cameras available for taking pictures.");
            }
        } catch (SecurityException e10) {
            e10.printStackTrace();
            o("no_available_camera", "No cameras available for taking pictures.");
        }
    }

    private boolean M() {
        g gVar = this.f10748n;
        if (gVar == null) {
            return false;
        }
        return gVar.c();
    }

    private boolean Q(o.g gVar, o.l lVar, o.h<List<String>> hVar) {
        synchronized (this.f10755u) {
            if (this.f10754t != null) {
                return false;
            }
            this.f10754t = new f(gVar, lVar, hVar);
            this.f10747m.a();
            return true;
        }
    }

    private void T(Intent intent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 22) {
            intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
            return;
        }
        intent.putExtra("android.intent.extras.CAMERA_FACING", 0);
        if (i10 >= 26) {
            intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
        }
    }

    private File k(String str) {
        String uuid = UUID.randomUUID().toString();
        File cacheDir = this.f10745k.getCacheDir();
        try {
            cacheDir.mkdirs();
            return File.createTempFile(uuid, str, cacheDir);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }

    private File l() {
        return k(".jpg");
    }

    private File m() {
        return k(".mp4");
    }

    private void n(o.h<List<String>> hVar) {
        hVar.b(new o.d("already_active", "Image picker is already active", null));
    }

    private void o(String str, String str2) {
        o.h<List<String>> hVar;
        synchronized (this.f10755u) {
            f fVar = this.f10754t;
            hVar = fVar != null ? fVar.f10763c : null;
            this.f10754t = null;
        }
        if (hVar == null) {
            this.f10747m.f(null, str, str2);
        } else {
            hVar.b(new o.d(str, str2, null));
        }
    }

    private void p(ArrayList<String> arrayList) {
        o.h<List<String>> hVar;
        synchronized (this.f10755u) {
            f fVar = this.f10754t;
            hVar = fVar != null ? fVar.f10763c : null;
            this.f10754t = null;
        }
        if (hVar == null) {
            this.f10747m.f(arrayList, null, null);
        } else {
            hVar.a(arrayList);
        }
    }

    private void q(String str) {
        o.h<List<String>> hVar;
        ArrayList<String> arrayList = new ArrayList<>();
        if (str != null) {
            arrayList.add(str);
        }
        synchronized (this.f10755u) {
            f fVar = this.f10754t;
            hVar = fVar != null ? fVar.f10763c : null;
            this.f10754t = null;
        }
        if (hVar != null) {
            hVar.a(arrayList);
        } else if (arrayList.isEmpty()) {
        } else {
            this.f10747m.f(arrayList, null, null);
        }
    }

    private String r(String str, o.g gVar) {
        return this.f10746l.j(str, gVar.c(), gVar.b(), gVar.d().intValue());
    }

    private void s(Intent intent, Uri uri) {
        for (ResolveInfo resolveInfo : this.f10745k.getPackageManager().queryIntentActivities(intent, 65536)) {
            this.f10745k.grantUriPermission(resolveInfo.activityInfo.packageName, uri, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void E(int i10) {
        if (i10 != -1) {
            q(null);
            return;
        }
        Uri uri = this.f10753s;
        d dVar = this.f10749o;
        if (uri == null) {
            uri = Uri.parse(this.f10747m.c());
        }
        dVar.b(uri, new e() { // from class: io.flutter.plugins.imagepicker.e
            @Override // io.flutter.plugins.imagepicker.k.e
            public final void a(String str) {
                k.this.B(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: u */
    public void G(int i10) {
        if (i10 != -1) {
            q(null);
            return;
        }
        Uri uri = this.f10753s;
        d dVar = this.f10749o;
        if (uri == null) {
            uri = Uri.parse(this.f10747m.c());
        }
        dVar.b(uri, new e() { // from class: io.flutter.plugins.imagepicker.d
            @Override // io.flutter.plugins.imagepicker.k.e
            public final void a(String str) {
                k.this.A(str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: v */
    public void C(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            q(null);
        } else {
            y(this.f10750p.e(this.f10745k, intent.getData()), false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public void D(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            q(null);
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        if (intent.getClipData() != null) {
            for (int i11 = 0; i11 < intent.getClipData().getItemCount(); i11++) {
                arrayList.add(this.f10750p.e(this.f10745k, intent.getClipData().getItemAt(i11).getUri()));
            }
        } else {
            arrayList.add(this.f10750p.e(this.f10745k, intent.getData()));
        }
        z(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: x */
    public void F(int i10, Intent intent) {
        if (i10 != -1 || intent == null) {
            q(null);
        } else {
            A(this.f10750p.e(this.f10745k, intent.getData()));
        }
    }

    private void z(ArrayList<String> arrayList) {
        o.g gVar;
        synchronized (this.f10755u) {
            f fVar = this.f10754t;
            gVar = fVar != null ? fVar.f10761a : null;
        }
        if (gVar == null) {
            p(arrayList);
            return;
        }
        ArrayList<String> arrayList2 = new ArrayList<>();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            arrayList2.add(i10, r(arrayList.get(i10), gVar));
        }
        p(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void A(String str) {
        q(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o.b N() {
        Map<String, Object> b10 = this.f10747m.b();
        if (b10.isEmpty()) {
            return null;
        }
        o.b.a aVar = new o.b.a();
        o.c cVar = (o.c) b10.get("type");
        if (cVar != null) {
            aVar.d(cVar);
        }
        aVar.b((o.a) b10.get("error"));
        ArrayList arrayList = (ArrayList) b10.get("pathList");
        if (arrayList != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Double d10 = (Double) b10.get("maxWidth");
                Double d11 = (Double) b10.get("maxHeight");
                Integer num = (Integer) b10.get("imageQuality");
                arrayList2.add(this.f10746l.j(str, d10, d11, num == null ? 100 : num.intValue()));
            }
            aVar.c(arrayList2);
        }
        this.f10747m.a();
        return aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void O() {
        synchronized (this.f10755u) {
            f fVar = this.f10754t;
            if (fVar == null) {
                return;
            }
            o.g gVar = fVar.f10761a;
            this.f10747m.g(gVar != null ? c.b.IMAGE : c.b.VIDEO);
            if (gVar != null) {
                this.f10747m.d(gVar);
            }
            Uri uri = this.f10753s;
            if (uri != null) {
                this.f10747m.e(uri);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void P(c cVar) {
        this.f10752r = cVar;
    }

    public void R(o.g gVar, o.h<List<String>> hVar) {
        if (!Q(gVar, null, hVar)) {
            n(hVar);
        } else if (!M() || this.f10748n.b("android.permission.CAMERA")) {
            K();
        } else {
            this.f10748n.a("android.permission.CAMERA", 2345);
        }
    }

    public void S(o.l lVar, o.h<List<String>> hVar) {
        if (!Q(null, lVar, hVar)) {
            n(hVar);
        } else if (!M() || this.f10748n.b("android.permission.CAMERA")) {
            L();
        } else {
            this.f10748n.a("android.permission.CAMERA", 2355);
        }
    }

    @Override // r8.m
    public boolean b(int i10, final int i11, final Intent intent) {
        Runnable runnable;
        if (i10 == 2342) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.h
                @Override // java.lang.Runnable
                public final void run() {
                    k.this.C(i11, intent);
                }
            };
        } else if (i10 == 2343) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.g
                @Override // java.lang.Runnable
                public final void run() {
                    k.this.E(i11);
                }
            };
        } else if (i10 == 2346) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.i
                @Override // java.lang.Runnable
                public final void run() {
                    k.this.D(i11, intent);
                }
            };
        } else if (i10 == 2352) {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.j
                @Override // java.lang.Runnable
                public final void run() {
                    k.this.F(i11, intent);
                }
            };
        } else if (i10 != 2353) {
            return false;
        } else {
            runnable = new Runnable() { // from class: io.flutter.plugins.imagepicker.f
                @Override // java.lang.Runnable
                public final void run() {
                    k.this.G(i11);
                }
            };
        }
        this.f10751q.execute(runnable);
        return true;
    }

    public void h(o.g gVar, boolean z10, o.h<List<String>> hVar) {
        if (Q(gVar, null, hVar)) {
            I(Boolean.valueOf(z10));
        } else {
            n(hVar);
        }
    }

    public void i(o.g gVar, boolean z10, o.h<List<String>> hVar) {
        if (Q(gVar, null, hVar)) {
            H(Boolean.valueOf(z10));
        } else {
            n(hVar);
        }
    }

    public void j(o.l lVar, boolean z10, o.h<List<String>> hVar) {
        if (Q(null, lVar, hVar)) {
            J(Boolean.valueOf(z10));
        } else {
            n(hVar);
        }
    }

    @Override // r8.p
    public boolean onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        boolean z10 = iArr.length > 0 && iArr[0] == 0;
        if (i10 != 2345) {
            if (i10 != 2355) {
                return false;
            }
            if (z10) {
                L();
            }
        } else if (z10) {
            K();
        }
        if (!z10 && (i10 == 2345 || i10 == 2355)) {
            o("camera_access_denied", "The user did not allow camera access.");
        }
        return true;
    }

    void y(String str, boolean z10) {
        o.g gVar;
        synchronized (this.f10755u) {
            f fVar = this.f10754t;
            gVar = fVar != null ? fVar.f10761a : null;
        }
        if (gVar == null) {
            q(str);
            return;
        }
        String r10 = r(str, gVar);
        if (r10 != null && !r10.equals(str) && z10) {
            new File(str).delete();
        }
        q(r10);
    }
}
