package io.flutter.view;

import android.app.Activity;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.LocaleSpan;
import android.text.style.TtsSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import io.flutter.view.c;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import q8.a;
/* loaded from: classes.dex */
public class c extends AccessibilityNodeProvider {

    /* renamed from: a  reason: collision with root package name */
    private final View f10824a;

    /* renamed from: b  reason: collision with root package name */
    private final q8.a f10825b;

    /* renamed from: c  reason: collision with root package name */
    private final AccessibilityManager f10826c;

    /* renamed from: d  reason: collision with root package name */
    private final AccessibilityViewEmbedder f10827d;

    /* renamed from: e  reason: collision with root package name */
    private final io.flutter.plugin.platform.k f10828e;

    /* renamed from: f  reason: collision with root package name */
    private final ContentResolver f10829f;

    /* renamed from: g  reason: collision with root package name */
    private final Map<Integer, l> f10830g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<Integer, h> f10831h;

    /* renamed from: i  reason: collision with root package name */
    private l f10832i;

    /* renamed from: j  reason: collision with root package name */
    private Integer f10833j;

    /* renamed from: k  reason: collision with root package name */
    private Integer f10834k;

    /* renamed from: l  reason: collision with root package name */
    private int f10835l;

    /* renamed from: m  reason: collision with root package name */
    private l f10836m;

    /* renamed from: n  reason: collision with root package name */
    private l f10837n;

    /* renamed from: o  reason: collision with root package name */
    private l f10838o;

    /* renamed from: p  reason: collision with root package name */
    private final List<Integer> f10839p;

    /* renamed from: q  reason: collision with root package name */
    private int f10840q;

    /* renamed from: r  reason: collision with root package name */
    private Integer f10841r;

    /* renamed from: s  reason: collision with root package name */
    private k f10842s;

    /* renamed from: t  reason: collision with root package name */
    private boolean f10843t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f10844u;

    /* renamed from: v  reason: collision with root package name */
    private final a.b f10845v;

    /* renamed from: w  reason: collision with root package name */
    private final AccessibilityManager.AccessibilityStateChangeListener f10846w;

    /* renamed from: x  reason: collision with root package name */
    private final AccessibilityManager.TouchExplorationStateChangeListener f10847x;

    /* renamed from: y  reason: collision with root package name */
    private final ContentObserver f10848y;

    /* renamed from: z  reason: collision with root package name */
    private static final int f10823z = ((g.SCROLL_RIGHT.f10880j | g.SCROLL_LEFT.f10880j) | g.SCROLL_UP.f10880j) | g.SCROLL_DOWN.f10880j;
    private static final int A = ((((((((((i.HAS_CHECKED_STATE.f10902j | i.IS_CHECKED.f10902j) | i.IS_SELECTED.f10902j) | i.IS_TEXT_FIELD.f10902j) | i.IS_FOCUSED.f10902j) | i.HAS_ENABLED_STATE.f10902j) | i.IS_ENABLED.f10902j) | i.IS_IN_MUTUALLY_EXCLUSIVE_GROUP.f10902j) | i.HAS_TOGGLED_STATE.f10902j) | i.IS_TOGGLED.f10902j) | i.IS_FOCUSABLE.f10902j) | i.IS_SLIDER.f10902j;
    private static int B = 267386881;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements a.b {
        a() {
        }

        @Override // q8.a.b
        public void a(String str) {
            c.this.f10824a.announceForAccessibility(str);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void b(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            for (ByteBuffer byteBuffer2 : byteBufferArr) {
                byteBuffer2.order(ByteOrder.LITTLE_ENDIAN);
            }
            c.this.b0(byteBuffer, strArr, byteBufferArr);
        }

        @Override // io.flutter.embedding.engine.FlutterJNI.a
        public void c(ByteBuffer byteBuffer, String[] strArr) {
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            c.this.a0(byteBuffer, strArr);
        }

        @Override // q8.a.b
        public void d(String str) {
            if (Build.VERSION.SDK_INT >= 28) {
                return;
            }
            AccessibilityEvent H = c.this.H(0, 32);
            H.getText().add(str);
            c.this.S(H);
        }

        @Override // q8.a.b
        public void e(int i10) {
            c.this.R(i10, 2);
        }

        @Override // q8.a.b
        public void f(int i10) {
            c.this.R(i10, 1);
        }
    }

    /* loaded from: classes.dex */
    class b implements AccessibilityManager.AccessibilityStateChangeListener {
        b() {
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public void onAccessibilityStateChanged(boolean z10) {
            if (c.this.f10844u) {
                return;
            }
            c cVar = c.this;
            if (z10) {
                cVar.f10825b.g(c.this.f10845v);
                c.this.f10825b.e();
            } else {
                cVar.W(false);
                c.this.f10825b.g(null);
                c.this.f10825b.d();
            }
            if (c.this.f10842s != null) {
                c.this.f10842s.a(z10, c.this.f10826c.isTouchExplorationEnabled());
            }
        }
    }

    /* renamed from: io.flutter.view.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    class C0169c extends ContentObserver {
        C0169c(Handler handler) {
            super(handler);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10) {
            onChange(z10, null);
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z10, Uri uri) {
            if (c.this.f10844u) {
                return;
            }
            String string = Settings.Global.getString(c.this.f10829f, "transition_animation_scale");
            if (string != null && string.equals("0")) {
                c.g(c.this, f.DISABLE_ANIMATIONS.f10863j);
            } else {
                c.f(c.this, ~f.DISABLE_ANIMATIONS.f10863j);
            }
            c.this.T();
        }
    }

    /* loaded from: classes.dex */
    class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ AccessibilityManager f10852a;

        d(AccessibilityManager accessibilityManager) {
            this.f10852a = accessibilityManager;
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z10) {
            if (c.this.f10844u) {
                return;
            }
            if (!z10) {
                c.this.W(false);
                c.this.L();
            }
            if (c.this.f10842s != null) {
                c.this.f10842s.a(this.f10852a.isEnabled(), z10);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class e {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f10854a;

        static {
            int[] iArr = new int[o.values().length];
            f10854a = iArr;
            try {
                iArr[o.SPELLOUT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10854a[o.LOCALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum f {
        ACCESSIBLE_NAVIGATION(1),
        INVERT_COLORS(2),
        DISABLE_ANIMATIONS(4),
        BOLD_TEXT(8),
        REDUCE_MOTION(16),
        HIGH_CONTRAST(32),
        ON_OFF_SWITCH_LABELS(64);
        

        /* renamed from: j  reason: collision with root package name */
        final int f10863j;

        f(int i10) {
            this.f10863j = i10;
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        TAP(1),
        LONG_PRESS(2),
        SCROLL_LEFT(4),
        SCROLL_RIGHT(8),
        SCROLL_UP(16),
        SCROLL_DOWN(32),
        INCREASE(64),
        DECREASE(128),
        SHOW_ON_SCREEN(256),
        MOVE_CURSOR_FORWARD_BY_CHARACTER(512),
        MOVE_CURSOR_BACKWARD_BY_CHARACTER(1024),
        SET_SELECTION(2048),
        COPY(4096),
        CUT(8192),
        PASTE(16384),
        DID_GAIN_ACCESSIBILITY_FOCUS(32768),
        DID_LOSE_ACCESSIBILITY_FOCUS(65536),
        CUSTOM_ACTION(131072),
        DISMISS(262144),
        MOVE_CURSOR_FORWARD_BY_WORD(524288),
        MOVE_CURSOR_BACKWARD_BY_WORD(1048576),
        SET_TEXT(2097152);
        

        /* renamed from: j  reason: collision with root package name */
        public final int f10880j;

        g(int i10) {
            this.f10880j = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class h {

        /* renamed from: a  reason: collision with root package name */
        private int f10881a = -1;

        /* renamed from: b  reason: collision with root package name */
        private int f10882b = -1;

        /* renamed from: c  reason: collision with root package name */
        private int f10883c = -1;

        /* renamed from: d  reason: collision with root package name */
        private String f10884d;

        /* renamed from: e  reason: collision with root package name */
        private String f10885e;

        h() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public enum i {
        HAS_CHECKED_STATE(1),
        IS_CHECKED(2),
        IS_SELECTED(4),
        IS_BUTTON(8),
        IS_TEXT_FIELD(16),
        IS_FOCUSED(32),
        HAS_ENABLED_STATE(64),
        IS_ENABLED(128),
        IS_IN_MUTUALLY_EXCLUSIVE_GROUP(256),
        IS_HEADER(512),
        IS_OBSCURED(1024),
        SCOPES_ROUTE(2048),
        NAMES_ROUTE(4096),
        IS_HIDDEN(8192),
        IS_IMAGE(16384),
        IS_LIVE_REGION(32768),
        HAS_TOGGLED_STATE(65536),
        IS_TOGGLED(131072),
        HAS_IMPLICIT_SCROLLING(262144),
        IS_MULTILINE(524288),
        IS_READ_ONLY(1048576),
        IS_FOCUSABLE(2097152),
        IS_LINK(4194304),
        IS_SLIDER(8388608),
        IS_KEYBOARD_KEY(16777216),
        IS_CHECK_STATE_MIXED(33554432);
        

        /* renamed from: j  reason: collision with root package name */
        final int f10902j;

        i(int i10) {
            this.f10902j = i10;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class j extends n {

        /* renamed from: d  reason: collision with root package name */
        String f10903d;

        private j() {
            super(null);
        }

        /* synthetic */ j(a aVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public interface k {
        void a(boolean z10, boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class l {
        private p A;
        private int C;
        private int D;
        private int E;
        private int F;
        private float G;
        private float H;
        private float I;
        private String J;
        private String K;
        private float L;
        private float M;
        private float N;
        private float O;
        private float[] P;
        private l Q;
        private List<h> T;
        private h U;
        private h V;
        private float[] X;
        private float[] Z;

        /* renamed from: a  reason: collision with root package name */
        final c f10904a;

        /* renamed from: a0  reason: collision with root package name */
        private Rect f10905a0;

        /* renamed from: c  reason: collision with root package name */
        private int f10907c;

        /* renamed from: d  reason: collision with root package name */
        private int f10908d;

        /* renamed from: e  reason: collision with root package name */
        private int f10909e;

        /* renamed from: f  reason: collision with root package name */
        private int f10910f;

        /* renamed from: g  reason: collision with root package name */
        private int f10911g;

        /* renamed from: h  reason: collision with root package name */
        private int f10912h;

        /* renamed from: i  reason: collision with root package name */
        private int f10913i;

        /* renamed from: j  reason: collision with root package name */
        private int f10914j;

        /* renamed from: k  reason: collision with root package name */
        private int f10915k;

        /* renamed from: l  reason: collision with root package name */
        private float f10916l;

        /* renamed from: m  reason: collision with root package name */
        private float f10917m;

        /* renamed from: n  reason: collision with root package name */
        private float f10918n;

        /* renamed from: o  reason: collision with root package name */
        private String f10919o;

        /* renamed from: p  reason: collision with root package name */
        private List<n> f10920p;

        /* renamed from: q  reason: collision with root package name */
        private String f10921q;

        /* renamed from: r  reason: collision with root package name */
        private List<n> f10922r;

        /* renamed from: s  reason: collision with root package name */
        private String f10923s;

        /* renamed from: t  reason: collision with root package name */
        private List<n> f10924t;

        /* renamed from: u  reason: collision with root package name */
        private String f10925u;

        /* renamed from: v  reason: collision with root package name */
        private List<n> f10926v;

        /* renamed from: w  reason: collision with root package name */
        private String f10927w;

        /* renamed from: x  reason: collision with root package name */
        private List<n> f10928x;

        /* renamed from: y  reason: collision with root package name */
        private String f10929y;

        /* renamed from: b  reason: collision with root package name */
        private int f10906b = -1;

        /* renamed from: z  reason: collision with root package name */
        private int f10930z = -1;
        private boolean B = false;
        private List<l> R = new ArrayList();
        private List<l> S = new ArrayList();
        private boolean W = true;
        private boolean Y = true;

        l(c cVar) {
            this.f10904a = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean A0(l lVar, f9.d<l> dVar) {
            return (lVar == null || lVar.j0(dVar) == null) ? false : true;
        }

        private void B0(float[] fArr, float[] fArr2, float[] fArr3) {
            Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
            float f10 = fArr[3];
            fArr[0] = fArr[0] / f10;
            fArr[1] = fArr[1] / f10;
            fArr[2] = fArr[2] / f10;
            fArr[3] = 0.0f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void C0(float[] fArr, Set<l> set, boolean z10) {
            set.add(this);
            if (this.Y) {
                z10 = true;
            }
            if (z10) {
                if (this.Z == null) {
                    this.Z = new float[16];
                }
                if (this.P == null) {
                    this.P = new float[16];
                }
                Matrix.multiplyMM(this.Z, 0, fArr, 0, this.P, 0);
                float[] fArr2 = {this.L, this.M, 0.0f, 1.0f};
                float[] fArr3 = new float[4];
                float[] fArr4 = new float[4];
                float[] fArr5 = new float[4];
                float[] fArr6 = new float[4];
                B0(fArr3, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.M;
                B0(fArr4, this.Z, fArr2);
                fArr2[0] = this.N;
                fArr2[1] = this.O;
                B0(fArr5, this.Z, fArr2);
                fArr2[0] = this.L;
                fArr2[1] = this.O;
                B0(fArr6, this.Z, fArr2);
                if (this.f10905a0 == null) {
                    this.f10905a0 = new Rect();
                }
                this.f10905a0.set(Math.round(z0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(z0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])), Math.round(y0(fArr3[0], fArr4[0], fArr5[0], fArr6[0])), Math.round(y0(fArr3[1], fArr4[1], fArr5[1], fArr6[1])));
                this.Y = false;
            }
            int i10 = -1;
            for (l lVar : this.R) {
                lVar.f10930z = i10;
                i10 = lVar.f10906b;
                lVar.C0(this.Z, set, z10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void D0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
            this.B = true;
            this.J = this.f10921q;
            this.K = this.f10919o;
            this.C = this.f10907c;
            this.D = this.f10908d;
            this.E = this.f10911g;
            this.F = this.f10912h;
            this.G = this.f10916l;
            this.H = this.f10917m;
            this.I = this.f10918n;
            this.f10907c = byteBuffer.getInt();
            this.f10908d = byteBuffer.getInt();
            this.f10909e = byteBuffer.getInt();
            this.f10910f = byteBuffer.getInt();
            this.f10911g = byteBuffer.getInt();
            this.f10912h = byteBuffer.getInt();
            this.f10913i = byteBuffer.getInt();
            this.f10914j = byteBuffer.getInt();
            this.f10915k = byteBuffer.getInt();
            this.f10916l = byteBuffer.getFloat();
            this.f10917m = byteBuffer.getFloat();
            this.f10918n = byteBuffer.getFloat();
            int i10 = byteBuffer.getInt();
            this.f10919o = i10 == -1 ? null : strArr[i10];
            this.f10920p = o0(byteBuffer, byteBufferArr);
            int i11 = byteBuffer.getInt();
            this.f10921q = i11 == -1 ? null : strArr[i11];
            this.f10922r = o0(byteBuffer, byteBufferArr);
            int i12 = byteBuffer.getInt();
            this.f10923s = i12 == -1 ? null : strArr[i12];
            this.f10924t = o0(byteBuffer, byteBufferArr);
            int i13 = byteBuffer.getInt();
            this.f10925u = i13 == -1 ? null : strArr[i13];
            this.f10926v = o0(byteBuffer, byteBufferArr);
            int i14 = byteBuffer.getInt();
            this.f10927w = i14 == -1 ? null : strArr[i14];
            this.f10928x = o0(byteBuffer, byteBufferArr);
            int i15 = byteBuffer.getInt();
            this.f10929y = i15 == -1 ? null : strArr[i15];
            this.A = p.b(byteBuffer.getInt());
            this.L = byteBuffer.getFloat();
            this.M = byteBuffer.getFloat();
            this.N = byteBuffer.getFloat();
            this.O = byteBuffer.getFloat();
            if (this.P == null) {
                this.P = new float[16];
            }
            for (int i16 = 0; i16 < 16; i16++) {
                this.P[i16] = byteBuffer.getFloat();
            }
            this.W = true;
            this.Y = true;
            int i17 = byteBuffer.getInt();
            this.R.clear();
            this.S.clear();
            for (int i18 = 0; i18 < i17; i18++) {
                l A = this.f10904a.A(byteBuffer.getInt());
                A.Q = this;
                this.R.add(A);
            }
            for (int i19 = 0; i19 < i17; i19++) {
                l A2 = this.f10904a.A(byteBuffer.getInt());
                A2.Q = this;
                this.S.add(A2);
            }
            int i20 = byteBuffer.getInt();
            if (i20 == 0) {
                this.T = null;
                return;
            }
            List<h> list = this.T;
            if (list == null) {
                this.T = new ArrayList(i20);
            } else {
                list.clear();
            }
            for (int i21 = 0; i21 < i20; i21++) {
                h z10 = this.f10904a.z(byteBuffer.getInt());
                if (z10.f10883c == g.TAP.f10880j) {
                    this.U = z10;
                } else if (z10.f10883c == g.LONG_PRESS.f10880j) {
                    this.V = z10;
                } else {
                    this.T.add(z10);
                }
                this.T.add(z10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void e0(List<l> list) {
            if (v0(i.SCOPES_ROUTE)) {
                list.add(this);
            }
            for (l lVar : this.R) {
                lVar.e0(list);
            }
        }

        private SpannableString f0(String str, List<n> list) {
            if (str == null) {
                return null;
            }
            SpannableString spannableString = new SpannableString(str);
            if (list != null) {
                for (n nVar : list) {
                    int i10 = e.f10854a[nVar.f10933c.ordinal()];
                    if (i10 == 1) {
                        spannableString.setSpan(new TtsSpan.Builder("android.type.verbatim").build(), nVar.f10931a, nVar.f10932b, 0);
                    } else if (i10 == 2) {
                        spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(((j) nVar).f10903d)), nVar.f10931a, nVar.f10932b, 0);
                    }
                }
            }
            return spannableString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g0() {
            String str;
            String str2 = this.f10919o;
            if (str2 == null && this.K == null) {
                return false;
            }
            return str2 == null || (str = this.K) == null || !str2.equals(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean h0() {
            return (Float.isNaN(this.f10916l) || Float.isNaN(this.G) || this.G == this.f10916l) ? false : true;
        }

        private void i0() {
            if (this.W) {
                this.W = false;
                if (this.X == null) {
                    this.X = new float[16];
                }
                if (Matrix.invertM(this.X, 0, this.P, 0)) {
                    return;
                }
                Arrays.fill(this.X, 0.0f);
            }
        }

        private l j0(f9.d<l> dVar) {
            for (l lVar = this.Q; lVar != null; lVar = lVar.Q) {
                if (dVar.test(lVar)) {
                    return lVar;
                }
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Rect k0() {
            return this.f10905a0;
        }

        private CharSequence l0() {
            return f0(this.f10927w, this.f10928x);
        }

        static /* synthetic */ int m(l lVar, int i10) {
            int i11 = lVar.f10912h + i10;
            lVar.f10912h = i11;
            return i11;
        }

        private CharSequence m0() {
            return f0(this.f10919o, this.f10920p);
        }

        static /* synthetic */ int n(l lVar, int i10) {
            int i11 = lVar.f10912h - i10;
            lVar.f10912h = i11;
            return i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String n0() {
            String str;
            if (!v0(i.NAMES_ROUTE) || (str = this.f10919o) == null || str.isEmpty()) {
                for (l lVar : this.R) {
                    String n02 = lVar.n0();
                    if (n02 != null && !n02.isEmpty()) {
                        return n02;
                    }
                }
                return null;
            }
            return this.f10919o;
        }

        private List<n> o0(ByteBuffer byteBuffer, ByteBuffer[] byteBufferArr) {
            int i10 = byteBuffer.getInt();
            if (i10 == -1) {
                return null;
            }
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                int i12 = byteBuffer.getInt();
                int i13 = byteBuffer.getInt();
                o oVar = o.values()[byteBuffer.getInt()];
                int i14 = e.f10854a[oVar.ordinal()];
                if (i14 == 1) {
                    byteBuffer.getInt();
                    m mVar = new m(null);
                    mVar.f10931a = i12;
                    mVar.f10932b = i13;
                    mVar.f10933c = oVar;
                    arrayList.add(mVar);
                } else if (i14 == 2) {
                    ByteBuffer byteBuffer2 = byteBufferArr[byteBuffer.getInt()];
                    j jVar = new j(null);
                    jVar.f10931a = i12;
                    jVar.f10932b = i13;
                    jVar.f10933c = oVar;
                    jVar.f10903d = Charset.forName("UTF-8").decode(byteBuffer2).toString();
                    arrayList.add(jVar);
                }
            }
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence p0() {
            CharSequence[] charSequenceArr = {m0(), l0()};
            CharSequence charSequence = null;
            for (int i10 = 0; i10 < 2; i10++) {
                CharSequence charSequence2 = charSequenceArr[i10];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence q0() {
            return f0(this.f10921q, this.f10922r);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public CharSequence r0() {
            CharSequence[] charSequenceArr = {q0(), m0(), l0()};
            CharSequence charSequence = null;
            for (int i10 = 0; i10 < 3; i10++) {
                CharSequence charSequence2 = charSequenceArr[i10];
                if (charSequence2 != null && charSequence2.length() > 0) {
                    charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : TextUtils.concat(charSequence, ", ", charSequence2);
                }
            }
            return charSequence;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean s0(g gVar) {
            return (gVar.f10880j & this.D) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean t0(i iVar) {
            return (iVar.f10902j & this.C) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean u0(g gVar) {
            return (gVar.f10880j & this.f10908d) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean v0(i iVar) {
            return (iVar.f10902j & this.f10907c) != 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public l w0(float[] fArr, boolean z10) {
            float f10 = fArr[3];
            boolean z11 = false;
            float f11 = fArr[0] / f10;
            float f12 = fArr[1] / f10;
            if (f11 < this.L || f11 >= this.N || f12 < this.M || f12 >= this.O) {
                return null;
            }
            float[] fArr2 = new float[4];
            for (l lVar : this.S) {
                if (!lVar.v0(i.IS_HIDDEN)) {
                    lVar.i0();
                    Matrix.multiplyMV(fArr2, 0, lVar.X, 0, fArr, 0);
                    l w02 = lVar.w0(fArr2, z10);
                    if (w02 != null) {
                        return w02;
                    }
                }
            }
            if (z10 && this.f10913i != -1) {
                z11 = true;
            }
            if (x0() || z11) {
                return this;
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean x0() {
            String str;
            String str2;
            String str3;
            if (v0(i.SCOPES_ROUTE)) {
                return false;
            }
            return (!v0(i.IS_FOCUSABLE) && (this.f10908d & (~c.f10823z)) == 0 && (this.f10907c & c.A) == 0 && ((str = this.f10919o) == null || str.isEmpty()) && (((str2 = this.f10921q) == null || str2.isEmpty()) && ((str3 = this.f10927w) == null || str3.isEmpty()))) ? false : true;
        }

        private float y0(float f10, float f11, float f12, float f13) {
            return Math.max(f10, Math.max(f11, Math.max(f12, f13)));
        }

        private float z0(float f10, float f11, float f12, float f13) {
            return Math.min(f10, Math.min(f11, Math.min(f12, f13)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class m extends n {
        private m() {
            super(null);
        }

        /* synthetic */ m(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static class n {

        /* renamed from: a  reason: collision with root package name */
        int f10931a;

        /* renamed from: b  reason: collision with root package name */
        int f10932b;

        /* renamed from: c  reason: collision with root package name */
        o f10933c;

        private n() {
        }

        /* synthetic */ n(a aVar) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum o {
        SPELLOUT,
        LOCALE
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum p {
        UNKNOWN,
        LTR,
        RTL;

        public static p b(int i10) {
            return i10 != 1 ? i10 != 2 ? UNKNOWN : LTR : RTL;
        }
    }

    public c(View view, q8.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, io.flutter.plugin.platform.k kVar) {
        this(view, aVar, accessibilityManager, contentResolver, new AccessibilityViewEmbedder(view, 65536), kVar);
    }

    public c(View view, q8.a aVar, AccessibilityManager accessibilityManager, ContentResolver contentResolver, AccessibilityViewEmbedder accessibilityViewEmbedder, io.flutter.plugin.platform.k kVar) {
        this.f10830g = new HashMap();
        this.f10831h = new HashMap();
        this.f10835l = 0;
        this.f10839p = new ArrayList();
        this.f10840q = 0;
        this.f10841r = 0;
        this.f10843t = false;
        this.f10844u = false;
        this.f10845v = new a();
        b bVar = new b();
        this.f10846w = bVar;
        C0169c c0169c = new C0169c(new Handler());
        this.f10848y = c0169c;
        this.f10824a = view;
        this.f10825b = aVar;
        this.f10826c = accessibilityManager;
        this.f10829f = contentResolver;
        this.f10827d = accessibilityViewEmbedder;
        this.f10828e = kVar;
        bVar.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        accessibilityManager.addAccessibilityStateChangeListener(bVar);
        int i10 = Build.VERSION.SDK_INT;
        d dVar = new d(accessibilityManager);
        this.f10847x = dVar;
        dVar.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
        accessibilityManager.addTouchExplorationStateChangeListener(dVar);
        c0169c.onChange(false);
        contentResolver.registerContentObserver(Settings.Global.getUriFor("transition_animation_scale"), false, c0169c);
        if (i10 >= 31) {
            X();
        }
        kVar.a(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l A(int i10) {
        l lVar = this.f10830g.get(Integer.valueOf(i10));
        if (lVar == null) {
            l lVar2 = new l(this);
            lVar2.f10906b = i10;
            this.f10830g.put(Integer.valueOf(i10), lVar2);
            return lVar2;
        }
        return lVar;
    }

    private l B() {
        return this.f10830g.get(0);
    }

    private void C(float f10, float f11, boolean z10) {
        l w02;
        if (this.f10830g.isEmpty() || (w02 = B().w0(new float[]{f10, f11, 0.0f, 1.0f}, z10)) == this.f10838o) {
            return;
        }
        if (w02 != null) {
            R(w02.f10906b, 128);
        }
        l lVar = this.f10838o;
        if (lVar != null) {
            R(lVar.f10906b, 256);
        }
        this.f10838o = w02;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean F(l lVar, l lVar2) {
        return lVar2 == lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean G(l lVar) {
        return lVar.v0(i.HAS_IMPLICIT_SCROLLING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AccessibilityEvent H(int i10, int i11) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i11);
        obtain.setPackageName(this.f10824a.getContext().getPackageName());
        obtain.setSource(this.f10824a, i10);
        return obtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        l lVar = this.f10838o;
        if (lVar != null) {
            R(lVar.f10906b, 256);
            this.f10838o = null;
        }
    }

    private void M(l lVar) {
        String n02 = lVar.n0();
        if (n02 == null) {
            n02 = " ";
        }
        if (Build.VERSION.SDK_INT >= 28) {
            V(n02);
            return;
        }
        AccessibilityEvent H = H(lVar.f10906b, 32);
        H.getText().add(n02);
        S(H);
    }

    private boolean N(l lVar, int i10, Bundle bundle, boolean z10) {
        int i11 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean z11 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        int i12 = lVar.f10911g;
        int i13 = lVar.f10912h;
        P(lVar, i11, z10, z11);
        if (i12 != lVar.f10911g || i13 != lVar.f10912h) {
            String str = lVar.f10921q != null ? lVar.f10921q : "";
            AccessibilityEvent H = H(lVar.f10906b, 8192);
            H.getText().add(str);
            H.setFromIndex(lVar.f10911g);
            H.setToIndex(lVar.f10912h);
            H.setItemCount(str.length());
            S(H);
        }
        if (i11 == 1) {
            if (z10) {
                g gVar = g.MOVE_CURSOR_FORWARD_BY_CHARACTER;
                if (lVar.u0(gVar)) {
                    this.f10825b.c(i10, gVar, Boolean.valueOf(z11));
                    return true;
                }
            }
            if (z10) {
                return false;
            }
            g gVar2 = g.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
            if (lVar.u0(gVar2)) {
                this.f10825b.c(i10, gVar2, Boolean.valueOf(z11));
                return true;
            }
            return false;
        } else if (i11 != 2) {
            return i11 == 4 || i11 == 8 || i11 == 16;
        } else {
            if (z10) {
                g gVar3 = g.MOVE_CURSOR_FORWARD_BY_WORD;
                if (lVar.u0(gVar3)) {
                    this.f10825b.c(i10, gVar3, Boolean.valueOf(z11));
                    return true;
                }
            }
            if (z10) {
                return false;
            }
            g gVar4 = g.MOVE_CURSOR_BACKWARD_BY_WORD;
            if (lVar.u0(gVar4)) {
                this.f10825b.c(i10, gVar4, Boolean.valueOf(z11));
                return true;
            }
            return false;
        }
    }

    private boolean O(l lVar, int i10, Bundle bundle) {
        String string = (bundle == null || !bundle.containsKey("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE")) ? "" : bundle.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE");
        this.f10825b.c(i10, g.SET_TEXT, string);
        lVar.f10921q = string;
        lVar.f10922r = null;
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0022, code lost:
        if (r6 != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0024, code lost:
        r5 = r4.f10921q.length();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
        r4.f10912h = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0031, code lost:
        r4.f10912h = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0060, code lost:
        if (r5.find() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
        io.flutter.view.c.l.m(r4, r5.start(1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
        if (r5.find() != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008f, code lost:
        r5 = r5.start(1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c1, code lost:
        if (r5.find() != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00e6, code lost:
        if (r5.find() != false) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void P(io.flutter.view.c.l r4, int r5, boolean r6, boolean r7) {
        /*
            r3 = this;
            int r0 = io.flutter.view.c.l.k(r4)
            if (r0 < 0) goto L111
            int r0 = io.flutter.view.c.l.i(r4)
            if (r0 >= 0) goto Le
            goto L111
        Le:
            r0 = 1
            if (r5 == r0) goto Le9
            r1 = 2
            r2 = 0
            if (r5 == r1) goto L94
            r1 = 4
            if (r5 == r1) goto L36
            r0 = 8
            if (r5 == r0) goto L22
            r0 = 16
            if (r5 == r0) goto L22
            goto L108
        L22:
            if (r6 == 0) goto L31
        L24:
            java.lang.String r5 = io.flutter.view.c.l.q(r4)
            int r5 = r5.length()
        L2c:
            io.flutter.view.c.l.l(r4, r5)
            goto L108
        L31:
            io.flutter.view.c.l.l(r4, r2)
            goto L108
        L36:
            if (r6 == 0) goto L6b
            int r5 = io.flutter.view.c.l.k(r4)
            java.lang.String r1 = io.flutter.view.c.l.q(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto L6b
            java.lang.String r5 = "(?!^)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.c.l.q(r4)
            int r1 = io.flutter.view.c.l.k(r4)
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L24
        L62:
            int r5 = r5.start(r0)
            io.flutter.view.c.l.m(r4, r5)
            goto L108
        L6b:
            if (r6 != 0) goto L108
            int r5 = io.flutter.view.c.l.k(r4)
            if (r5 <= 0) goto L108
            java.lang.String r5 = "(?s:.*)(\\n)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.c.l.q(r4)
            int r1 = io.flutter.view.c.l.k(r4)
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L31
        L8f:
            int r5 = r5.start(r0)
            goto L2c
        L94:
            if (r6 == 0) goto Lc4
            int r5 = io.flutter.view.c.l.k(r4)
            java.lang.String r1 = io.flutter.view.c.l.q(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto Lc4
            java.lang.String r5 = "\\p{L}(\\b)"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.c.l.q(r4)
            int r1 = io.flutter.view.c.l.k(r4)
            java.lang.String r6 = r6.substring(r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            r5.find()
            boolean r6 = r5.find()
            if (r6 == 0) goto L24
            goto L62
        Lc4:
            if (r6 != 0) goto L108
            int r5 = io.flutter.view.c.l.k(r4)
            if (r5 <= 0) goto L108
            java.lang.String r5 = "(?s:.*)(\\b)\\p{L}"
            java.util.regex.Pattern r5 = java.util.regex.Pattern.compile(r5)
            java.lang.String r6 = io.flutter.view.c.l.q(r4)
            int r1 = io.flutter.view.c.l.k(r4)
            java.lang.String r6 = r6.substring(r2, r1)
            java.util.regex.Matcher r5 = r5.matcher(r6)
            boolean r6 = r5.find()
            if (r6 == 0) goto L108
            goto L8f
        Le9:
            if (r6 == 0) goto Lfd
            int r5 = io.flutter.view.c.l.k(r4)
            java.lang.String r1 = io.flutter.view.c.l.q(r4)
            int r1 = r1.length()
            if (r5 >= r1) goto Lfd
            io.flutter.view.c.l.m(r4, r0)
            goto L108
        Lfd:
            if (r6 != 0) goto L108
            int r5 = io.flutter.view.c.l.k(r4)
            if (r5 <= 0) goto L108
            io.flutter.view.c.l.n(r4, r0)
        L108:
            if (r7 != 0) goto L111
            int r5 = io.flutter.view.c.l.k(r4)
            io.flutter.view.c.l.j(r4, r5)
        L111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.P(io.flutter.view.c$l, int, boolean, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void R(int i10, int i11) {
        if (this.f10826c.isEnabled()) {
            S(H(i10, i11));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S(AccessibilityEvent accessibilityEvent) {
        if (this.f10826c.isEnabled()) {
            this.f10824a.getParent().requestSendAccessibilityEvent(this.f10824a, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        this.f10825b.f(this.f10835l);
    }

    private void U(int i10) {
        AccessibilityEvent H = H(i10, 2048);
        H.setContentChangeTypes(1);
        S(H);
    }

    private void V(String str) {
        this.f10824a.setAccessibilityPaneTitle(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void W(boolean z10) {
        if (this.f10843t == z10) {
            return;
        }
        this.f10843t = z10;
        this.f10835l = z10 ? this.f10835l | f.ACCESSIBLE_NAVIGATION.f10863j : this.f10835l & (~f.ACCESSIBLE_NAVIGATION.f10863j);
        T();
    }

    private void X() {
        View view = this.f10824a;
        if (view == null || view.getResources() == null) {
            return;
        }
        int i10 = this.f10824a.getResources().getConfiguration().fontWeightAdjustment;
        this.f10835l = i10 != Integer.MAX_VALUE && i10 >= 300 ? this.f10835l | f.BOLD_TEXT.f10863j : this.f10835l & f.BOLD_TEXT.f10863j;
        T();
    }

    private boolean Z(final l lVar) {
        return lVar.f10914j > 0 && (l.A0(this.f10832i, new f9.d() { // from class: io.flutter.view.a
            @Override // f9.d
            public final boolean test(Object obj) {
                boolean F;
                F = c.F(c.l.this, (c.l) obj);
                return F;
            }
        }) || !l.A0(this.f10832i, new f9.d() { // from class: io.flutter.view.b
            @Override // f9.d
            public final boolean test(Object obj) {
                boolean G;
                G = c.G((c.l) obj);
                return G;
            }
        }));
    }

    private void c0(l lVar) {
        View c10;
        Integer num;
        lVar.Q = null;
        if (lVar.f10913i != -1 && (num = this.f10833j) != null && this.f10827d.platformViewOfNode(num.intValue()) == this.f10828e.c(lVar.f10913i)) {
            R(this.f10833j.intValue(), 65536);
            this.f10833j = null;
        }
        if (lVar.f10913i != -1 && (c10 = this.f10828e.c(lVar.f10913i)) != null) {
            c10.setImportantForAccessibility(4);
        }
        l lVar2 = this.f10832i;
        if (lVar2 == lVar) {
            R(lVar2.f10906b, 65536);
            this.f10832i = null;
        }
        if (this.f10836m == lVar) {
            this.f10836m = null;
        }
        if (this.f10838o == lVar) {
            this.f10838o = null;
        }
    }

    static /* synthetic */ int f(c cVar, int i10) {
        int i11 = i10 & cVar.f10835l;
        cVar.f10835l = i11;
        return i11;
    }

    static /* synthetic */ int g(c cVar, int i10) {
        int i11 = i10 | cVar.f10835l;
        cVar.f10835l = i11;
        return i11;
    }

    private AccessibilityEvent v(int i10, String str, String str2) {
        AccessibilityEvent H = H(i10, 16);
        H.setBeforeText(str);
        H.getText().add(str2);
        int i11 = 0;
        while (i11 < str.length() && i11 < str2.length() && str.charAt(i11) == str2.charAt(i11)) {
            i11++;
        }
        if (i11 < str.length() || i11 < str2.length()) {
            H.setFromIndex(i11);
            int length = str.length() - 1;
            int length2 = str2.length() - 1;
            while (length >= i11 && length2 >= i11 && str.charAt(length) == str2.charAt(length2)) {
                length--;
                length2--;
            }
            H.setRemovedCount((length - i11) + 1);
            H.setAddedCount((length2 - i11) + 1);
            return H;
        }
        return null;
    }

    private boolean w() {
        Activity e10 = f9.h.e(this.f10824a.getContext());
        if (e10 == null || e10.getWindow() == null) {
            return false;
        }
        int i10 = e10.getWindow().getAttributes().layoutInDisplayCutoutMode;
        return i10 == 2 || i10 == 0;
    }

    private Rect y(Rect rect) {
        Rect rect2 = new Rect(rect);
        int[] iArr = new int[2];
        this.f10824a.getLocationOnScreen(iArr);
        rect2.offset(iArr[0], iArr[1]);
        return rect2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public h z(int i10) {
        h hVar = this.f10831h.get(Integer.valueOf(i10));
        if (hVar == null) {
            h hVar2 = new h();
            hVar2.f10882b = i10;
            hVar2.f10881a = B + i10;
            this.f10831h.put(Integer.valueOf(i10), hVar2);
            return hVar2;
        }
        return hVar;
    }

    public boolean D() {
        return this.f10826c.isEnabled();
    }

    public boolean E() {
        return this.f10826c.isTouchExplorationEnabled();
    }

    public AccessibilityNodeInfo I(View view, int i10) {
        return AccessibilityNodeInfo.obtain(view, i10);
    }

    public boolean J(MotionEvent motionEvent) {
        return K(motionEvent, false);
    }

    public boolean K(MotionEvent motionEvent, boolean z10) {
        if (this.f10826c.isTouchExplorationEnabled() && !this.f10830g.isEmpty()) {
            l w02 = B().w0(new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f}, z10);
            if (w02 != null && w02.f10913i != -1) {
                if (z10) {
                    return false;
                }
                return this.f10827d.onAccessibilityHoverEvent(w02.f10906b, motionEvent);
            }
            if (motionEvent.getAction() == 9 || motionEvent.getAction() == 7) {
                C(motionEvent.getX(), motionEvent.getY(), z10);
            } else if (motionEvent.getAction() != 10) {
                d8.b.a("flutter", "unexpected accessibility hover event: " + motionEvent);
                return false;
            } else {
                L();
            }
            return true;
        }
        return false;
    }

    public void Q() {
        this.f10844u = true;
        this.f10828e.d();
        Y(null);
        this.f10826c.removeAccessibilityStateChangeListener(this.f10846w);
        this.f10826c.removeTouchExplorationStateChangeListener(this.f10847x);
        this.f10829f.unregisterContentObserver(this.f10848y);
        this.f10825b.g(null);
    }

    public void Y(k kVar) {
        this.f10842s = kVar;
    }

    void a0(ByteBuffer byteBuffer, String[] strArr) {
        while (byteBuffer.hasRemaining()) {
            h z10 = z(byteBuffer.getInt());
            z10.f10883c = byteBuffer.getInt();
            int i10 = byteBuffer.getInt();
            String str = null;
            z10.f10884d = i10 == -1 ? null : strArr[i10];
            int i11 = byteBuffer.getInt();
            if (i11 != -1) {
                str = strArr[i11];
            }
            z10.f10885e = str;
        }
    }

    void b0(ByteBuffer byteBuffer, String[] strArr, ByteBuffer[] byteBufferArr) {
        l lVar;
        l lVar2;
        float f10;
        float f11;
        WindowInsets rootWindowInsets;
        Integer valueOf;
        View c10;
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            l A2 = A(byteBuffer.getInt());
            A2.D0(byteBuffer, strArr, byteBufferArr);
            if (!A2.v0(i.IS_HIDDEN)) {
                if (A2.v0(i.IS_FOCUSED)) {
                    this.f10836m = A2;
                }
                if (A2.B) {
                    arrayList.add(A2);
                }
                if (A2.f10913i != -1 && !this.f10828e.b(A2.f10913i) && (c10 = this.f10828e.c(A2.f10913i)) != null) {
                    c10.setImportantForAccessibility(0);
                }
            }
        }
        HashSet hashSet = new HashSet();
        l B2 = B();
        ArrayList<l> arrayList2 = new ArrayList();
        if (B2 != null) {
            float[] fArr = new float[16];
            Matrix.setIdentityM(fArr, 0);
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                if ((i10 >= 28 ? w() : true) && (rootWindowInsets = this.f10824a.getRootWindowInsets()) != null) {
                    if (!this.f10841r.equals(Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft()))) {
                        B2.Y = true;
                        B2.W = true;
                    }
                    this.f10841r = Integer.valueOf(rootWindowInsets.getSystemWindowInsetLeft());
                    Matrix.translateM(fArr, 0, valueOf.intValue(), 0.0f, 0.0f);
                }
            }
            B2.C0(fArr, hashSet, false);
            B2.e0(arrayList2);
        }
        l lVar3 = null;
        for (l lVar4 : arrayList2) {
            if (!this.f10839p.contains(Integer.valueOf(lVar4.f10906b))) {
                lVar3 = lVar4;
            }
        }
        if (lVar3 == null && arrayList2.size() > 0) {
            lVar3 = (l) arrayList2.get(arrayList2.size() - 1);
        }
        if (lVar3 != null && (lVar3.f10906b != this.f10840q || arrayList2.size() != this.f10839p.size())) {
            this.f10840q = lVar3.f10906b;
            M(lVar3);
        }
        this.f10839p.clear();
        for (l lVar5 : arrayList2) {
            this.f10839p.add(Integer.valueOf(lVar5.f10906b));
        }
        Iterator<Map.Entry<Integer, l>> it = this.f10830g.entrySet().iterator();
        while (it.hasNext()) {
            l value = it.next().getValue();
            if (!hashSet.contains(value)) {
                c0(value);
                it.remove();
            }
        }
        U(0);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            l lVar6 = (l) it2.next();
            if (lVar6.h0()) {
                AccessibilityEvent H = H(lVar6.f10906b, 4096);
                float f12 = lVar6.f10916l;
                float f13 = lVar6.f10917m;
                if (Float.isInfinite(lVar6.f10917m)) {
                    if (f12 > 70000.0f) {
                        f12 = 70000.0f;
                    }
                    f13 = 100000.0f;
                }
                if (Float.isInfinite(lVar6.f10918n)) {
                    f10 = f13 + 100000.0f;
                    if (f12 < -70000.0f) {
                        f12 = -70000.0f;
                    }
                    f11 = f12 + 100000.0f;
                } else {
                    f10 = f13 - lVar6.f10918n;
                    f11 = f12 - lVar6.f10918n;
                }
                if (lVar6.s0(g.SCROLL_UP) || lVar6.s0(g.SCROLL_DOWN)) {
                    H.setScrollY((int) f11);
                    H.setMaxScrollY((int) f10);
                } else if (lVar6.s0(g.SCROLL_LEFT) || lVar6.s0(g.SCROLL_RIGHT)) {
                    H.setScrollX((int) f11);
                    H.setMaxScrollX((int) f10);
                }
                if (lVar6.f10914j > 0) {
                    H.setItemCount(lVar6.f10914j);
                    H.setFromIndex(lVar6.f10915k);
                    int i11 = 0;
                    for (l lVar7 : lVar6.S) {
                        if (!lVar7.v0(i.IS_HIDDEN)) {
                            i11++;
                        }
                    }
                    H.setToIndex((lVar6.f10915k + i11) - 1);
                }
                S(H);
            }
            if (lVar6.v0(i.IS_LIVE_REGION) && lVar6.g0()) {
                U(lVar6.f10906b);
            }
            l lVar8 = this.f10832i;
            if (lVar8 != null && lVar8.f10906b == lVar6.f10906b) {
                i iVar = i.IS_SELECTED;
                if (!lVar6.t0(iVar) && lVar6.v0(iVar)) {
                    AccessibilityEvent H2 = H(lVar6.f10906b, 4);
                    H2.getText().add(lVar6.f10919o);
                    S(H2);
                }
            }
            l lVar9 = this.f10836m;
            if (lVar9 != null && lVar9.f10906b == lVar6.f10906b && ((lVar2 = this.f10837n) == null || lVar2.f10906b != this.f10836m.f10906b)) {
                this.f10837n = this.f10836m;
                S(H(lVar6.f10906b, 8));
            } else if (this.f10836m == null) {
                this.f10837n = null;
            }
            l lVar10 = this.f10836m;
            if (lVar10 != null && lVar10.f10906b == lVar6.f10906b) {
                i iVar2 = i.IS_TEXT_FIELD;
                if (lVar6.t0(iVar2) && lVar6.v0(iVar2) && ((lVar = this.f10832i) == null || lVar.f10906b == this.f10836m.f10906b)) {
                    String str = lVar6.J != null ? lVar6.J : "";
                    String str2 = lVar6.f10921q != null ? lVar6.f10921q : "";
                    AccessibilityEvent v10 = v(lVar6.f10906b, str, str2);
                    if (v10 != null) {
                        S(v10);
                    }
                    if (lVar6.E != lVar6.f10911g || lVar6.F != lVar6.f10912h) {
                        AccessibilityEvent H3 = H(lVar6.f10906b, 8192);
                        H3.getText().add(str2);
                        H3.setFromIndex(lVar6.f10911g);
                        H3.setToIndex(lVar6.f10912h);
                        H3.setItemCount(str2.length());
                        S(H3);
                    }
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:217:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0454  */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.accessibility.AccessibilityNodeInfo createAccessibilityNodeInfo(int r14) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.createAccessibilityNodeInfo(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0016, code lost:
        if (r2 != null) goto L11;
     */
    @Override // android.view.accessibility.AccessibilityNodeProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.accessibility.AccessibilityNodeInfo findFocus(int r2) {
        /*
            r1 = this;
            r0 = 1
            if (r2 == r0) goto L7
            r0 = 2
            if (r2 == r0) goto L1d
            goto L27
        L7:
            io.flutter.view.c$l r2 = r1.f10836m
            if (r2 == 0) goto L14
        Lb:
            int r2 = io.flutter.view.c.l.a(r2)
        Lf:
            android.view.accessibility.AccessibilityNodeInfo r2 = r1.createAccessibilityNodeInfo(r2)
            return r2
        L14:
            java.lang.Integer r2 = r1.f10834k
            if (r2 == 0) goto L1d
        L18:
            int r2 = r2.intValue()
            goto Lf
        L1d:
            io.flutter.view.c$l r2 = r1.f10832i
            if (r2 == 0) goto L22
            goto Lb
        L22:
            java.lang.Integer r2 = r1.f10833j
            if (r2 == 0) goto L27
            goto L18
        L27:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.view.c.findFocus(int):android.view.accessibility.AccessibilityNodeInfo");
    }

    @Override // android.view.accessibility.AccessibilityNodeProvider
    public boolean performAction(int i10, int i11, Bundle bundle) {
        int i12;
        if (i10 >= 65536) {
            boolean performAction = this.f10827d.performAction(i10, i11, bundle);
            if (performAction && i11 == 128) {
                this.f10833j = null;
            }
            return performAction;
        }
        l lVar = this.f10830g.get(Integer.valueOf(i10));
        boolean z10 = false;
        if (lVar == null) {
            return false;
        }
        switch (i11) {
            case 16:
                this.f10825b.b(i10, g.TAP);
                return true;
            case 32:
                this.f10825b.b(i10, g.LONG_PRESS);
                return true;
            case 64:
                if (this.f10832i == null) {
                    this.f10824a.invalidate();
                }
                this.f10832i = lVar;
                this.f10825b.b(i10, g.DID_GAIN_ACCESSIBILITY_FOCUS);
                R(i10, 32768);
                if (lVar.u0(g.INCREASE) || lVar.u0(g.DECREASE)) {
                    R(i10, 4);
                }
                return true;
            case 128:
                l lVar2 = this.f10832i;
                if (lVar2 != null && lVar2.f10906b == i10) {
                    this.f10832i = null;
                }
                Integer num = this.f10833j;
                if (num != null && num.intValue() == i10) {
                    this.f10833j = null;
                }
                this.f10825b.b(i10, g.DID_LOSE_ACCESSIBILITY_FOCUS);
                R(i10, 65536);
                return true;
            case 256:
                return N(lVar, i10, bundle, true);
            case 512:
                return N(lVar, i10, bundle, false);
            case 4096:
                g gVar = g.SCROLL_UP;
                if (!lVar.u0(gVar)) {
                    gVar = g.SCROLL_LEFT;
                    if (!lVar.u0(gVar)) {
                        gVar = g.INCREASE;
                        if (!lVar.u0(gVar)) {
                            return false;
                        }
                        lVar.f10921q = lVar.f10923s;
                        lVar.f10922r = lVar.f10924t;
                        R(i10, 4);
                    }
                }
                this.f10825b.b(i10, gVar);
                return true;
            case 8192:
                g gVar2 = g.SCROLL_DOWN;
                if (!lVar.u0(gVar2)) {
                    gVar2 = g.SCROLL_RIGHT;
                    if (!lVar.u0(gVar2)) {
                        gVar2 = g.DECREASE;
                        if (!lVar.u0(gVar2)) {
                            return false;
                        }
                        lVar.f10921q = lVar.f10925u;
                        lVar.f10922r = lVar.f10926v;
                        R(i10, 4);
                    }
                }
                this.f10825b.b(i10, gVar2);
                return true;
            case 16384:
                this.f10825b.b(i10, g.COPY);
                return true;
            case 32768:
                this.f10825b.b(i10, g.PASTE);
                return true;
            case 65536:
                this.f10825b.b(i10, g.CUT);
                return true;
            case 131072:
                HashMap hashMap = new HashMap();
                if (bundle != null && bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT") && bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT")) {
                    z10 = true;
                }
                if (z10) {
                    hashMap.put("base", Integer.valueOf(bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT")));
                    i12 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    hashMap.put("base", Integer.valueOf(lVar.f10912h));
                    i12 = lVar.f10912h;
                }
                hashMap.put("extent", Integer.valueOf(i12));
                this.f10825b.c(i10, g.SET_SELECTION, hashMap);
                l lVar3 = this.f10830g.get(Integer.valueOf(i10));
                lVar3.f10911g = ((Integer) hashMap.get("base")).intValue();
                lVar3.f10912h = ((Integer) hashMap.get("extent")).intValue();
                return true;
            case 1048576:
                this.f10825b.b(i10, g.DISMISS);
                return true;
            case 2097152:
                return O(lVar, i10, bundle);
            case 16908342:
                this.f10825b.b(i10, g.SHOW_ON_SCREEN);
                return true;
            default:
                h hVar = this.f10831h.get(Integer.valueOf(i11 - B));
                if (hVar != null) {
                    this.f10825b.c(i10, g.CUSTOM_ACTION, Integer.valueOf(hVar.f10882b));
                    return true;
                }
                return false;
        }
    }

    public boolean x(View view, View view2, AccessibilityEvent accessibilityEvent) {
        Integer recordFlutterId;
        if (this.f10827d.requestSendAccessibilityEvent(view, view2, accessibilityEvent) && (recordFlutterId = this.f10827d.getRecordFlutterId(view, accessibilityEvent)) != null) {
            int eventType = accessibilityEvent.getEventType();
            if (eventType == 8) {
                this.f10834k = recordFlutterId;
                this.f10836m = null;
                return true;
            } else if (eventType == 128) {
                this.f10838o = null;
                return true;
            } else if (eventType == 32768) {
                this.f10833j = recordFlutterId;
                this.f10832i = null;
                return true;
            } else if (eventType != 65536) {
                return true;
            } else {
                this.f10834k = null;
                this.f10833j = null;
                return true;
            }
        }
        return false;
    }
}
