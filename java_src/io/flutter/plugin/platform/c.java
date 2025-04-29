package io.flutter.plugin.platform;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ClipboardManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.core.view.e0;
import io.flutter.plugin.platform.c;
import java.io.FileNotFoundException;
import java.util.List;
import q8.i;
/* loaded from: classes.dex */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private final Activity f10436a;

    /* renamed from: b  reason: collision with root package name */
    private final q8.i f10437b;

    /* renamed from: c  reason: collision with root package name */
    private final d f10438c;

    /* renamed from: d  reason: collision with root package name */
    private i.j f10439d;

    /* renamed from: e  reason: collision with root package name */
    private int f10440e;

    /* renamed from: f  reason: collision with root package name */
    final i.h f10441f;

    /* loaded from: classes.dex */
    class a implements i.h {
        a() {
        }

        @Override // q8.i.h
        public void a(List<i.l> list) {
            c.this.x(list);
        }

        @Override // q8.i.h
        public void b() {
            c.this.r();
        }

        @Override // q8.i.h
        public void c(i.c cVar) {
            c.this.u(cVar);
        }

        @Override // q8.i.h
        public void d(i.k kVar) {
            c.this.w(kVar);
        }

        @Override // q8.i.h
        public CharSequence e(i.e eVar) {
            return c.this.p(eVar);
        }

        @Override // q8.i.h
        public void f(i.j jVar) {
            c.this.z(jVar);
        }

        @Override // q8.i.h
        public void g() {
            c.this.v();
        }

        @Override // q8.i.h
        public void h() {
            c.this.s();
        }

        @Override // q8.i.h
        public void i(String str) {
            c.this.t(str);
        }

        @Override // q8.i.h
        public void j(int i10) {
            c.this.y(i10);
        }

        @Override // q8.i.h
        public void k(i.EnumC0238i enumC0238i) {
            c.this.q(enumC0238i);
        }

        @Override // q8.i.h
        public boolean l() {
            return c.this.n();
        }

        @Override // q8.i.h
        public void m(i.g gVar) {
            c.this.B(gVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements View.OnSystemUiVisibilityChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ View f10443a;

        b(View view) {
            this.f10443a = view;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            q8.i iVar;
            boolean z10;
            if ((i10 & 4) == 0) {
                iVar = c.this.f10437b;
                z10 = true;
            } else {
                iVar = c.this.f10437b;
                z10 = false;
            }
            iVar.m(z10);
        }

        @Override // android.view.View.OnSystemUiVisibilityChangeListener
        public void onSystemUiVisibilityChange(final int i10) {
            this.f10443a.post(new Runnable() { // from class: io.flutter.plugin.platform.d
                @Override // java.lang.Runnable
                public final void run() {
                    c.b.this.b(i10);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.flutter.plugin.platform.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class C0166c {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10445a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f10446b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f10447c;

        static {
            int[] iArr = new int[i.d.values().length];
            f10447c = iArr;
            try {
                iArr[i.d.DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10447c[i.d.LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[i.l.values().length];
            f10446b = iArr2;
            try {
                iArr2[i.l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10446b[i.l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr3 = new int[i.g.values().length];
            f10445a = iArr3;
            try {
                iArr3[i.g.STANDARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10445a[i.g.LIGHT_IMPACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10445a[i.g.MEDIUM_IMPACT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10445a[i.g.HEAVY_IMPACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10445a[i.g.SELECTION_CLICK.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean b();
    }

    public c(Activity activity, q8.i iVar, d dVar) {
        a aVar = new a();
        this.f10441f = aVar;
        this.f10436a = activity;
        this.f10437b = iVar;
        iVar.l(aVar);
        this.f10438c = dVar;
        this.f10440e = 1280;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n() {
        ClipDescription primaryClipDescription;
        ClipboardManager clipboardManager = (ClipboardManager) this.f10436a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip() && (primaryClipDescription = clipboardManager.getPrimaryClipDescription()) != null) {
            return primaryClipDescription.hasMimeType("text/*");
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public CharSequence p(i.e eVar) {
        ClipboardManager clipboardManager = (ClipboardManager) this.f10436a.getSystemService("clipboard");
        if (clipboardManager.hasPrimaryClip()) {
            try {
                ClipData primaryClip = clipboardManager.getPrimaryClip();
                if (primaryClip == null) {
                    return null;
                }
                if (eVar != null && eVar != i.e.PLAIN_TEXT) {
                    return null;
                }
                ClipData.Item itemAt = primaryClip.getItemAt(0);
                if (itemAt.getUri() != null) {
                    this.f10436a.getContentResolver().openTypedAssetFileDescriptor(itemAt.getUri(), "text/*", null);
                }
                return itemAt.coerceToText(this.f10436a);
            } catch (FileNotFoundException unused) {
                return null;
            } catch (SecurityException e10) {
                d8.b.h("PlatformPlugin", "Attempted to get clipboard data that requires additional permission(s).\nSee the exception details for which permission(s) are required, and consider adding them to your Android Manifest as described in:\nhttps://developer.android.com/guide/topics/permissions/overview", e10);
                return null;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(i.EnumC0238i enumC0238i) {
        if (enumC0238i == i.EnumC0238i.CLICK) {
            this.f10436a.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        d dVar = this.f10438c;
        if (dVar == null || !dVar.b()) {
            Activity activity = this.f10436a;
            if (activity instanceof androidx.activity.l) {
                ((androidx.activity.l) activity).i().e();
            } else {
                activity.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s() {
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(String str) {
        ((ClipboardManager) this.f10436a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(i.c cVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28 && i10 > 21) {
            this.f10436a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f16355b, (Bitmap) null, cVar.f16354a));
        }
        if (i10 >= 28) {
            this.f10436a.setTaskDescription(new ActivityManager.TaskDescription(cVar.f16355b, 0, cVar.f16354a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        View decorView = this.f10436a.getWindow().getDecorView();
        decorView.setOnSystemUiVisibilityChangeListener(new b(decorView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w(i.k kVar) {
        int i10;
        if (kVar == i.k.LEAN_BACK) {
            i10 = 1798;
        } else if (kVar == i.k.IMMERSIVE) {
            i10 = 3846;
        } else if (kVar == i.k.IMMERSIVE_STICKY) {
            i10 = 5894;
        } else if (kVar != i.k.EDGE_TO_EDGE || Build.VERSION.SDK_INT < 29) {
            return;
        } else {
            i10 = 1792;
        }
        this.f10440e = i10;
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x(List<i.l> list) {
        int i10 = list.size() == 0 ? 5894 : 1798;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int i12 = C0166c.f10446b[list.get(i11).ordinal()];
            if (i12 == 1) {
                i10 &= -5;
            } else if (i12 == 2) {
                i10 = i10 & (-513) & (-3);
            }
        }
        this.f10440e = i10;
        A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y(int i10) {
        this.f10436a.setRequestedOrientation(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z(i.j jVar) {
        Window window = this.f10436a.getWindow();
        e0 e0Var = new e0(window, window.getDecorView());
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 30) {
            window.addFlags(Integer.MIN_VALUE);
            window.clearFlags(201326592);
        }
        if (i10 >= 23) {
            i.d dVar = jVar.f16381b;
            if (dVar != null) {
                int i11 = C0166c.f10447c[dVar.ordinal()];
                if (i11 == 1) {
                    e0Var.b(true);
                } else if (i11 == 2) {
                    e0Var.b(false);
                }
            }
            Integer num = jVar.f16380a;
            if (num != null) {
                window.setStatusBarColor(num.intValue());
            }
        }
        Boolean bool = jVar.f16382c;
        if (bool != null && i10 >= 29) {
            window.setStatusBarContrastEnforced(bool.booleanValue());
        }
        if (i10 >= 26) {
            i.d dVar2 = jVar.f16384e;
            if (dVar2 != null) {
                int i12 = C0166c.f10447c[dVar2.ordinal()];
                if (i12 == 1) {
                    e0Var.a(true);
                } else if (i12 == 2) {
                    e0Var.a(false);
                }
            }
            Integer num2 = jVar.f16383d;
            if (num2 != null) {
                window.setNavigationBarColor(num2.intValue());
            }
        }
        Integer num3 = jVar.f16385f;
        if (num3 != null && i10 >= 28) {
            window.setNavigationBarDividerColor(num3.intValue());
        }
        Boolean bool2 = jVar.f16386g;
        if (bool2 != null && i10 >= 29) {
            window.setNavigationBarContrastEnforced(bool2.booleanValue());
        }
        this.f10439d = jVar;
    }

    public void A() {
        this.f10436a.getWindow().getDecorView().setSystemUiVisibility(this.f10440e);
        i.j jVar = this.f10439d;
        if (jVar != null) {
            z(jVar);
        }
    }

    void B(i.g gVar) {
        int i10;
        View decorView = this.f10436a.getWindow().getDecorView();
        int i11 = C0166c.f10445a[gVar.ordinal()];
        int i12 = 1;
        if (i11 != 1) {
            if (i11 != 2) {
                i12 = 3;
                if (i11 != 3) {
                    i12 = 4;
                    if (i11 != 4) {
                        if (i11 != 5) {
                            return;
                        }
                    } else if (Build.VERSION.SDK_INT < 23) {
                        return;
                    } else {
                        i10 = 6;
                    }
                }
            }
            decorView.performHapticFeedback(i12);
            return;
        }
        i10 = 0;
        decorView.performHapticFeedback(i10);
    }

    public void o() {
        this.f10437b.l(null);
    }
}
