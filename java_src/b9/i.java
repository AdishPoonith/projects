package b9;

import android.content.Context;
import android.util.Log;
import b9.a;
import i8.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class i implements i8.a, a.b {

    /* renamed from: j  reason: collision with root package name */
    private Context f3116j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f3117a;

        static {
            int[] iArr = new int[a.c.values().length];
            f3117a = iArr;
            try {
                iArr[a.c.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3117a[a.c.MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3117a[a.c.PODCASTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3117a[a.c.RINGTONES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3117a[a.c.ALARMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3117a[a.c.NOTIFICATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f3117a[a.c.PICTURES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f3117a[a.c.MOVIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f3117a[a.c.DOWNLOADS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f3117a[a.c.DCIM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f3117a[a.c.DOCUMENTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private String h() {
        return f9.b.d(this.f3116j);
    }

    private String i() {
        return f9.b.c(this.f3116j);
    }

    private List<String> j() {
        File[] externalCacheDirs;
        ArrayList arrayList = new ArrayList();
        for (File file : this.f3116j.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private List<String> k(a.c cVar) {
        File[] externalFilesDirs;
        ArrayList arrayList = new ArrayList();
        for (File file : this.f3116j.getExternalFilesDirs(o(cVar))) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private String l() {
        File externalFilesDir = this.f3116j.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    private String n() {
        return this.f3116j.getCacheDir().getPath();
    }

    private String o(a.c cVar) {
        switch (a.f3117a[cVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + cVar);
        }
    }

    private void p(r8.c cVar, Context context) {
        try {
            h.h(cVar, this);
        } catch (Exception e10) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e10);
        }
        this.f3116j = context;
    }

    @Override // b9.a.b
    public List<String> a(a.c cVar) {
        return k(cVar);
    }

    @Override // b9.a.b
    public String b() {
        return n();
    }

    @Override // b9.a.b
    public String c() {
        return i();
    }

    @Override // i8.a
    public void d(a.b bVar) {
        h.h(bVar.b(), null);
    }

    @Override // b9.a.b
    public List<String> e() {
        return j();
    }

    @Override // b9.a.b
    public String f() {
        return h();
    }

    @Override // b9.a.b
    public String g() {
        return l();
    }

    @Override // i8.a
    public void m(a.b bVar) {
        p(bVar.b(), bVar.a());
    }
}
