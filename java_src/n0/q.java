package n0;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothHeadset;
import android.bluetooth.BluetoothProfile;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.speech.RecognitionListener;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.util.Log;
import i8.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
import r8.k;
import t9.x;
/* loaded from: classes.dex */
public final class q implements k.c, RecognitionListener, r8.p, i8.a, j8.a {
    public static final a U = new a(null);
    private boolean A;
    private boolean B;
    private boolean D;
    private boolean E;
    private SpeechRecognizer F;
    private Intent G;
    private BluetoothAdapter H;
    private Set<BluetoothDevice> I;
    private BluetoothDevice J;
    private BluetoothHeadset K;
    private String L;
    private long O;
    private long P;
    private final String T;

    /* renamed from: j  reason: collision with root package name */
    private Context f14025j;

    /* renamed from: k  reason: collision with root package name */
    private r8.k f14026k;

    /* renamed from: t  reason: collision with root package name */
    private Activity f14035t;

    /* renamed from: u  reason: collision with root package name */
    private k.d f14036u;

    /* renamed from: v  reason: collision with root package name */
    private boolean f14037v;

    /* renamed from: w  reason: collision with root package name */
    private boolean f14038w;

    /* renamed from: x  reason: collision with root package name */
    private boolean f14039x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f14040y;

    /* renamed from: z  reason: collision with root package name */
    private boolean f14041z;

    /* renamed from: l  reason: collision with root package name */
    private final int f14027l = 21;

    /* renamed from: m  reason: collision with root package name */
    private final int f14028m = 29;

    /* renamed from: n  reason: collision with root package name */
    private final int f14029n = 31;

    /* renamed from: o  reason: collision with root package name */
    private final int f14030o = 28521;

    /* renamed from: p  reason: collision with root package name */
    private final double f14031p = -1.0d;

    /* renamed from: q  reason: collision with root package name */
    private int f14032q = 9;

    /* renamed from: r  reason: collision with root package name */
    private final String f14033r = "SpeechToTextPlugin";

    /* renamed from: s  reason: collision with root package name */
    private boolean f14034s = true;
    private boolean C = true;
    private boolean M = true;
    private f N = f.deviceDefault;
    private float Q = 1000.0f;
    private float R = -100.0f;
    private final Handler S = new Handler(Looper.getMainLooper());

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    /* loaded from: classes.dex */
    public static final class b implements BluetoothProfile.ServiceListener {
        b() {
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i10, BluetoothProfile proxy) {
            kotlin.jvm.internal.l.e(proxy, "proxy");
            if (i10 == 1) {
                q.this.K = (BluetoothHeadset) proxy;
                q qVar = q.this;
                qVar.w("Found a headset: " + q.this.K);
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i10) {
            if (i10 == 1) {
                q.this.w("Clearing headset: ");
                q.this.K = null;
            }
        }
    }

    public q() {
        String languageTag = Locale.getDefault().toLanguageTag();
        kotlin.jvm.internal.l.d(languageTag, "toLanguageTag(...)");
        this.T = languageTag;
    }

    private final void A(k.d dVar) {
        if (O()) {
            dVar.a(Boolean.FALSE);
            return;
        }
        w("Start has_permission");
        Context context = this.f14025j;
        if (context != null) {
            dVar.a(Boolean.valueOf(androidx.core.content.a.a(context, "android.permission.RECORD_AUDIO") == 0));
        }
    }

    private final void B(k.d dVar) {
        if (O()) {
            dVar.a(Boolean.FALSE);
            return;
        }
        this.f14034s = Build.VERSION.SDK_INT != this.f14028m || this.f14041z;
        w("Start initialize");
        if (this.f14036u != null) {
            dVar.b(h.multipleRequests.name(), "Only one initialize at a time", null);
            return;
        }
        this.f14036u = dVar;
        C(this.f14025j);
    }

    private final void C(Context context) {
        String str;
        Object[] g10;
        if (context == null) {
            t();
            return;
        }
        boolean z10 = true;
        this.f14038w = androidx.core.content.a.a(context, "android.permission.RECORD_AUDIO") == 0;
        if ((androidx.core.content.a.a(context, "android.permission.BLUETOOTH_CONNECT") == 0) && !this.B) {
            z10 = false;
        }
        this.C = z10;
        w("Checked permission");
        if (this.f14038w) {
            str = "has permission, completing";
        } else {
            Activity activity = this.f14035t;
            if (activity != null) {
                w("Requesting permission");
                String[] strArr = {"android.permission.RECORD_AUDIO"};
                if (!this.B) {
                    g10 = t9.j.g(strArr, "android.permission.BLUETOOTH_CONNECT");
                    strArr = (String[]) g10;
                }
                androidx.core.app.b.n(activity, strArr, this.f14030o);
                w("leaving initializeIfPermitted");
            }
            str = "no permission, no activity, completing";
        }
        w(str);
        t();
        w("leaving initializeIfPermitted");
    }

    private final boolean D(boolean z10) {
        if (z10) {
            long currentTimeMillis = System.currentTimeMillis() - this.O;
            this.O = System.currentTimeMillis();
            return currentTimeMillis >= 0 && currentTimeMillis < ((long) 100);
        }
        return false;
    }

    private final boolean E() {
        return this.f14039x;
    }

    private final boolean F() {
        return !this.f14037v;
    }

    private final boolean G() {
        return !this.f14039x;
    }

    private final void H(k.d dVar) {
        if (O() || F()) {
            dVar.a(Boolean.FALSE);
            return;
        }
        Intent voiceDetailsIntent = RecognizerIntent.getVoiceDetailsIntent(this.f14025j);
        if (voiceDetailsIntent == null) {
            voiceDetailsIntent = new Intent("android.speech.action.GET_LANGUAGE_DETAILS");
            voiceDetailsIntent.setPackage("com.google.android.googlequicksearchbox");
        }
        Intent intent = voiceDetailsIntent;
        Context context = this.f14025j;
        if (context != null) {
            context.sendOrderedBroadcast(intent, null, new e(dVar, this.f14040y), null, -1, null, null);
        }
    }

    private final void J(boolean z10) {
        r rVar;
        if (this.f14039x == z10) {
            return;
        }
        this.f14039x = z10;
        if (z10) {
            rVar = r.listening;
        } else if (z10) {
            throw new s9.l();
        } else {
            rVar = r.notListening;
        }
        String name = rVar.name();
        w("Notify status:" + name);
        r8.k kVar = this.f14026k;
        if (kVar != null) {
            kVar.c(g.notifyStatus.name(), name);
        }
        if (z10) {
            return;
        }
        String name2 = (!this.D ? r.doneNoResult : r.done).name();
        w("Notify status:" + name2);
        N();
        r8.k kVar2 = this.f14026k;
        if (kVar2 != null) {
            kVar2.c(g.notifyStatus.name(), name2);
        }
    }

    private final void K(Context context, r8.c cVar) {
        this.f14025j = context;
        r8.k kVar = new r8.k(cVar, "plugin.csdcorp.com/speech_to_text");
        this.f14026k = kVar;
        kVar.e(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(q this$0, float f10) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        r8.k kVar = this$0.f14026k;
        if (kVar != null) {
            kVar.c(g.soundLevelChange.name(), Float.valueOf(f10));
        }
    }

    private final void M() {
        if (this.C) {
            return;
        }
        BluetoothAdapter bluetoothAdapter = this.H;
        Set<BluetoothDevice> set = this.I;
        BluetoothHeadset bluetoothHeadset = this.K;
        if (bluetoothAdapter == null || bluetoothHeadset == null || set == null || !bluetoothAdapter.isEnabled()) {
            return;
        }
        for (BluetoothDevice bluetoothDevice : set) {
            if (bluetoothHeadset.startVoiceRecognition(bluetoothDevice)) {
                w("Starting bluetooth voice recognition");
                this.J = bluetoothDevice;
                return;
            }
        }
    }

    private final void N() {
        if (this.C) {
            return;
        }
        BluetoothDevice bluetoothDevice = this.J;
        BluetoothHeadset bluetoothHeadset = this.K;
        if (bluetoothDevice == null || bluetoothHeadset == null) {
            return;
        }
        w("Stopping bluetooth voice recognition");
        bluetoothHeadset.stopVoiceRecognition(bluetoothDevice);
        this.J = null;
    }

    private final boolean O() {
        return Build.VERSION.SDK_INT < this.f14027l;
    }

    private final void P(String str) {
        final JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorMsg", str);
        jSONObject.put("permanent", true);
        this.S.post(new Runnable() { // from class: n0.n
            @Override // java.lang.Runnable
            public final void run() {
                q.Q(q.this, jSONObject);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(q this$0, JSONObject speechError) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        kotlin.jvm.internal.l.e(speechError, "$speechError");
        r8.k kVar = this$0.f14026k;
        if (kVar != null) {
            kVar.c(g.notifyError.name(), speechError.toString());
        }
    }

    private final void R() {
        if (this.C) {
            return;
        }
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.H = defaultAdapter;
        this.I = defaultAdapter != null ? defaultAdapter.getBondedDevices() : null;
        b bVar = new b();
        BluetoothAdapter bluetoothAdapter = this.H;
        if (bluetoothAdapter != null) {
            bluetoothAdapter.getProfileProxy(this.f14025j, bVar, 1);
        }
    }

    private final void S(final String str, final boolean z10, f fVar, final boolean z11) {
        w("setupRecognizerIntent");
        String str2 = this.L;
        if (str2 != null && kotlin.jvm.internal.l.a(str2, str) && z10 == this.M && this.N == fVar) {
            return;
        }
        this.L = str;
        this.M = z10;
        this.N = fVar;
        this.S.post(new Runnable() { // from class: n0.p
            @Override // java.lang.Runnable
            public final void run() {
                q.T(q.this, z10, str, z11);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(q this$0, boolean z10, String languageTag, boolean z11) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        kotlin.jvm.internal.l.e(languageTag, "$languageTag");
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this$0.w("In RecognizerIntent apply");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        this$0.w("put model");
        Context context = this$0.f14025j;
        if (context != null) {
            intent.putExtra("calling_package", context.getApplicationInfo().packageName);
        }
        this$0.w("put package");
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", z10);
        this$0.w("put partial");
        if (!kotlin.jvm.internal.l.a(languageTag, Locale.getDefault().toLanguageTag())) {
            intent.putExtra("android.speech.extra.LANGUAGE", languageTag);
            this$0.w("put languageTag");
        }
        if (z11) {
            intent.putExtra("android.speech.extra.PREFER_OFFLINE", z11);
        }
        intent.putExtra("android.speech.extra.MAX_RESULTS", 10);
        this$0.G = intent;
    }

    private final void U(k.d dVar, String str, boolean z10, int i10, boolean z11) {
        if (O() || F() || E()) {
            dVar.a(Boolean.FALSE);
            return;
        }
        this.D = false;
        u(z11);
        this.Q = 1000.0f;
        this.R = -100.0f;
        w("Start listening");
        f fVar = f.deviceDefault;
        f fVar2 = f.dictation;
        if (i10 == fVar2.ordinal()) {
            fVar = fVar2;
        }
        M();
        S(str, z10, fVar, z11);
        this.S.post(new Runnable() { // from class: n0.j
            @Override // java.lang.Runnable
            public final void run() {
                q.V(q.this);
            }
        });
        this.P = System.currentTimeMillis();
        J(true);
        dVar.a(Boolean.TRUE);
        w("Start listening done");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V(q this$0) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        SpeechRecognizer speechRecognizer = this$0.F;
        if (speechRecognizer != null) {
            speechRecognizer.startListening(this$0.G);
        }
    }

    private final void W(k.d dVar) {
        if (O() || F() || G()) {
            dVar.a(Boolean.FALSE);
            return;
        }
        w("Stop listening");
        this.S.post(new Runnable() { // from class: n0.k
            @Override // java.lang.Runnable
            public final void run() {
                q.X(q.this);
            }
        });
        if (!this.f14034s) {
            x();
        }
        J(false);
        dVar.a(Boolean.TRUE);
        w("Stop listening done");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(q this$0) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        SpeechRecognizer speechRecognizer = this$0.F;
        if (speechRecognizer != null) {
            speechRecognizer.stopListening();
        }
    }

    private final void Y(Bundle bundle, boolean z10) {
        if (D(z10)) {
            w("Discarding duplicate final");
            return;
        }
        ArrayList<String> stringArrayList = bundle != null ? bundle.getStringArrayList("results_recognition") : null;
        if (stringArrayList == null || !(!stringArrayList.isEmpty())) {
            w("Results null or empty");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("finalResult", z10);
        float[] floatArray = bundle.getFloatArray("confidence_scores");
        JSONArray jSONArray = new JSONArray();
        int i10 = 0;
        int size = stringArrayList.size() - 1;
        if (size >= 0) {
            while (true) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("recognizedWords", stringArrayList.get(i10));
                if (floatArray == null || floatArray.length < stringArrayList.size()) {
                    jSONObject2.put("confidence", this.f14031p);
                } else {
                    jSONObject2.put("confidence", Float.valueOf(floatArray[i10]));
                }
                jSONArray.put(jSONObject2);
                if (i10 == size) {
                    break;
                }
                i10++;
            }
        }
        jSONObject.put("alternates", jSONArray);
        String jSONObject3 = jSONObject.toString();
        kotlin.jvm.internal.l.d(jSONObject3, "toString(...)");
        w("Calling results callback");
        this.D = true;
        r8.k kVar = this.f14026k;
        if (kVar != null) {
            kVar.c(g.textRecognition.name(), jSONObject3);
        }
    }

    private final void r(k.d dVar) {
        if (O() || F() || G()) {
            dVar.a(Boolean.FALSE);
            return;
        }
        w("Cancel listening");
        this.S.post(new Runnable() { // from class: n0.l
            @Override // java.lang.Runnable
            public final void run() {
                q.s(q.this);
            }
        });
        if (!this.f14034s) {
            x();
        }
        J(false);
        dVar.a(Boolean.TRUE);
        w("Cancel listening done");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(q this$0) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        SpeechRecognizer speechRecognizer = this$0.F;
        if (speechRecognizer != null) {
            speechRecognizer.cancel();
        }
    }

    private final void t() {
        w("completeInitialize");
        if (this.f14038w) {
            w("Testing recognition availability");
            Context context = this.f14025j;
            if (context == null) {
                w("null context during initialization");
                k.d dVar = this.f14036u;
                if (dVar != null) {
                    dVar.a(Boolean.FALSE);
                }
                k.d dVar2 = this.f14036u;
                if (dVar2 != null) {
                    dVar2.b(h.missingContext.name(), "context unexpectedly null, initialization failed", "");
                }
                this.f14036u = null;
                return;
            } else if (!SpeechRecognizer.isRecognitionAvailable(context)) {
                Log.e(this.f14033r, "Speech recognition not available on this device");
                k.d dVar3 = this.f14036u;
                if (dVar3 != null) {
                    dVar3.b(h.recognizerNotAvailable.name(), "Speech recognition not available on this device", "");
                }
                this.f14036u = null;
                return;
            } else {
                R();
            }
        }
        this.f14037v = this.f14038w;
        w("sending result");
        k.d dVar4 = this.f14036u;
        if (dVar4 != null) {
            dVar4.a(Boolean.valueOf(this.f14038w));
        }
        w("leaving complete");
        this.f14036u = null;
    }

    private final void u(final boolean z10) {
        SpeechRecognizer speechRecognizer = this.F;
        if (speechRecognizer == null || z10 != this.E) {
            this.E = z10;
            if (speechRecognizer != null) {
                speechRecognizer.destroy();
            }
            this.F = null;
            this.S.post(new Runnable() { // from class: n0.o
                @Override // java.lang.Runnable
                public final void run() {
                    q.v(q.this, z10);
                }
            });
            w("before setup intent");
            S(this.T, true, f.deviceDefault, false);
            w("after setup intent");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void v(n0.q r4, boolean r5) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.l.e(r4, r0)
            java.lang.String r0 = "Creating recognizer"
            r4.w(r0)
            boolean r0 = r4.A
            r1 = 0
            if (r0 == 0) goto L20
            android.content.Context r5 = r4.f14025j
            if (r5 == 0) goto L18
            android.content.ComponentName r0 = r4.z(r5)
            goto L19
        L18:
            r0 = r1
        L19:
            android.speech.SpeechRecognizer r5 = android.speech.SpeechRecognizer.createSpeechRecognizer(r5, r0)
            java.lang.String r0 = "Setting listener after intent lookup"
            goto L52
        L20:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 31
            if (r0 < r2) goto L46
            if (r5 == 0) goto L46
            android.content.Context r5 = r4.f14025j
            kotlin.jvm.internal.l.b(r5)
            boolean r5 = android.speech.SpeechRecognizer.isOnDeviceRecognitionAvailable(r5)
            if (r5 == 0) goto L46
            android.content.Context r5 = r4.f14025j
            kotlin.jvm.internal.l.b(r5)
            android.speech.SpeechRecognizer r5 = android.speech.SpeechRecognizer.createOnDeviceSpeechRecognizer(r5)
            java.lang.String r0 = "Setting on device listener"
            r4.w(r0)
            r5.setRecognitionListener(r4)
            r4.F = r5
        L46:
            android.speech.SpeechRecognizer r5 = r4.F
            if (r5 != 0) goto L5a
            android.content.Context r5 = r4.f14025j
            android.speech.SpeechRecognizer r5 = android.speech.SpeechRecognizer.createSpeechRecognizer(r5)
            java.lang.String r0 = "Setting default listener"
        L52:
            r4.w(r0)
            r5.setRecognitionListener(r4)
            r4.F = r5
        L5a:
            android.speech.SpeechRecognizer r5 = r4.F
            if (r5 != 0) goto L76
            java.lang.String r5 = r4.f14033r
            java.lang.String r0 = "Speech recognizer null"
            android.util.Log.e(r5, r0)
            r8.k$d r5 = r4.f14036u
            if (r5 == 0) goto L74
            n0.h r2 = n0.h.recognizerNotAvailable
            java.lang.String r2 = r2.name()
            java.lang.String r3 = ""
            r5.b(r2, r0, r3)
        L74:
            r4.f14036u = r1
        L76:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n0.q.v(n0.q, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void w(String str) {
        if (this.f14040y) {
            Log.d(this.f14033r, str);
        }
    }

    private final void x() {
        this.S.postDelayed(new Runnable() { // from class: n0.i
            @Override // java.lang.Runnable
            public final void run() {
                q.y(q.this);
            }
        }, 50L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(q this$0) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        this$0.w("Recognizer destroy");
        SpeechRecognizer speechRecognizer = this$0.F;
        if (speechRecognizer != null) {
            speechRecognizer.destroy();
        }
        this$0.F = null;
    }

    private final ComponentName z(Context context) {
        Object u10;
        ServiceInfo serviceInfo;
        List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent("android.speech.RecognitionService"), 0);
        kotlin.jvm.internal.l.d(queryIntentServices, "queryIntentServices(...)");
        w("RecognitionService, found: " + queryIntentServices.size());
        for (ResolveInfo resolveInfo : queryIntentServices) {
            ServiceInfo serviceInfo2 = resolveInfo.serviceInfo;
            if (serviceInfo2 != null) {
                kotlin.jvm.internal.l.b(serviceInfo2);
                w("RecognitionService: packageName: " + serviceInfo2.packageName + ", name: " + serviceInfo2.name);
            }
        }
        u10 = x.u(queryIntentServices);
        ResolveInfo resolveInfo2 = (ResolveInfo) u10;
        if (resolveInfo2 == null || (serviceInfo = resolveInfo2.serviceInfo) == null) {
            return null;
        }
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }

    @Override // r8.k.c
    public void I(r8.j call, k.d rawrResult) {
        kotlin.jvm.internal.l.e(call, "call");
        kotlin.jvm.internal.l.e(rawrResult, "rawrResult");
        d dVar = new d(rawrResult);
        try {
            String str = call.f16777a;
            if (str != null) {
                switch (str.hashCode()) {
                    case -1367724422:
                        if (!str.equals("cancel")) {
                            break;
                        } else {
                            r(dVar);
                            return;
                        }
                    case -1198472044:
                        if (!str.equals("has_permission")) {
                            break;
                        } else {
                            A(dVar);
                            return;
                        }
                    case -1102508601:
                        if (!str.equals("listen")) {
                            break;
                        } else {
                            String str2 = (String) call.a("localeId");
                            if (str2 == null) {
                                str2 = this.T;
                            }
                            String str3 = str2;
                            Boolean bool = (Boolean) call.a("partialResults");
                            if (bool == null) {
                                bool = Boolean.TRUE;
                            }
                            Boolean bool2 = (Boolean) call.a("onDevice");
                            if (bool2 == null) {
                                bool2 = Boolean.FALSE;
                            }
                            Integer num = (Integer) call.a("listenMode");
                            if (num == null) {
                                dVar.b(h.missingOrInvalidArg.name(), "listenMode is required", null);
                                return;
                            } else {
                                U(dVar, str3, bool.booleanValue(), num.intValue(), bool2.booleanValue());
                                return;
                            }
                        }
                    case 3540994:
                        if (!str.equals("stop")) {
                            break;
                        } else {
                            W(dVar);
                            return;
                        }
                    case 338410841:
                        if (!str.equals("locales")) {
                            break;
                        } else {
                            H(dVar);
                            return;
                        }
                    case 871091088:
                        if (!str.equals("initialize")) {
                            break;
                        } else {
                            Boolean bool3 = (Boolean) call.a("debugLogging");
                            if (bool3 != null) {
                                this.f14040y = bool3.booleanValue();
                            }
                            Boolean bool4 = (Boolean) call.a("alwaysUseStop");
                            if (bool4 != null) {
                                this.f14041z = kotlin.jvm.internal.l.a(bool4, Boolean.TRUE);
                            }
                            Boolean bool5 = (Boolean) call.a("intentLookup");
                            if (bool5 != null) {
                                this.A = kotlin.jvm.internal.l.a(bool5, Boolean.TRUE);
                            }
                            Boolean bool6 = (Boolean) call.a("noBluetooth");
                            if (bool6 != null) {
                                this.B = kotlin.jvm.internal.l.a(bool6, Boolean.TRUE);
                            }
                            B(dVar);
                            return;
                        }
                }
            }
            dVar.c();
        } catch (Exception e10) {
            Log.e(this.f14033r, "Unexpected exception", e10);
            dVar.b(h.unknown.name(), "Unexpected exception", e10.getLocalizedMessage());
        }
    }

    @Override // i8.a
    public void d(a.b binding) {
        kotlin.jvm.internal.l.e(binding, "binding");
        this.f14025j = null;
        r8.k kVar = this.f14026k;
        if (kVar != null) {
            kVar.e(null);
        }
        this.f14026k = null;
    }

    @Override // j8.a
    public void e(j8.c binding) {
        kotlin.jvm.internal.l.e(binding, "binding");
        this.f14035t = binding.d();
        binding.c(this);
    }

    @Override // j8.a
    public void f(j8.c binding) {
        kotlin.jvm.internal.l.e(binding, "binding");
        this.f14035t = binding.d();
        binding.c(this);
    }

    @Override // j8.a
    public void g() {
        this.f14035t = null;
    }

    @Override // j8.a
    public void j() {
        this.f14035t = null;
    }

    @Override // i8.a
    public void m(a.b flutterPluginBinding) {
        kotlin.jvm.internal.l.e(flutterPluginBinding, "flutterPluginBinding");
        Context a10 = flutterPluginBinding.a();
        kotlin.jvm.internal.l.d(a10, "getApplicationContext(...)");
        r8.c b10 = flutterPluginBinding.b();
        kotlin.jvm.internal.l.d(b10, "getBinaryMessenger(...)");
        K(a10, b10);
    }

    @Override // android.speech.RecognitionListener
    public void onBeginningOfSpeech() {
    }

    @Override // android.speech.RecognitionListener
    public void onBufferReceived(byte[] bArr) {
    }

    @Override // android.speech.RecognitionListener
    public void onEndOfSpeech() {
        J(false);
    }

    @Override // android.speech.RecognitionListener
    public void onError(int i10) {
        String str;
        long currentTimeMillis = System.currentTimeMillis() - this.P;
        int i11 = (7 != i10 || this.R >= ((float) this.f14032q)) ? i10 : 6;
        w("Error " + i10 + " after start at " + currentTimeMillis + ' ' + this.Q + " / " + this.R);
        switch (i11) {
            case 1:
                str = "error_network_timeout";
                break;
            case 2:
                str = "error_network";
                break;
            case 3:
                str = "error_audio_error";
                break;
            case 4:
                str = "error_server";
                break;
            case 5:
                str = "error_client";
                break;
            case 6:
                str = "error_speech_timeout";
                break;
            case 7:
                str = "error_no_match";
                break;
            case 8:
                str = "error_busy";
                break;
            case 9:
                str = "error_permission";
                break;
            case 10:
                str = "error_too_many_requests";
                break;
            case 11:
                str = "error_server_disconnected";
                break;
            case 12:
                str = "error_language_not_supported";
                break;
            case 13:
                str = "error_language_unavailable";
                break;
            default:
                str = "error_unknown (" + i10 + ')';
                break;
        }
        P(str);
        if (E()) {
            J(false);
        }
    }

    @Override // android.speech.RecognitionListener
    public void onEvent(int i10, Bundle bundle) {
    }

    @Override // android.speech.RecognitionListener
    public void onPartialResults(Bundle bundle) {
        Y(bundle, false);
    }

    @Override // android.speech.RecognitionListener
    public void onReadyForSpeech(Bundle bundle) {
    }

    @Override // r8.p
    public boolean onRequestPermissionsResult(int i10, String[] permissions, int[] grantResults) {
        kotlin.jvm.internal.l.e(permissions, "permissions");
        kotlin.jvm.internal.l.e(grantResults, "grantResults");
        boolean z10 = false;
        if (i10 == this.f14030o) {
            this.f14038w = ((grantResults.length == 0) ^ true) && grantResults[0] == 0;
            this.C = ((grantResults.length == 0) || grantResults.length == 1 || grantResults[1] != 0 || this.B) ? true : true;
            t();
            return true;
        }
        return false;
    }

    @Override // android.speech.RecognitionListener
    public void onResults(Bundle bundle) {
        Y(bundle, true);
    }

    @Override // android.speech.RecognitionListener
    public void onRmsChanged(final float f10) {
        if (f10 < this.Q) {
            this.Q = f10;
        }
        if (f10 > this.R) {
            this.R = f10;
        }
        w("rmsDB " + this.Q + " / " + this.R);
        this.S.post(new Runnable() { // from class: n0.m
            @Override // java.lang.Runnable
            public final void run() {
                q.L(q.this, f10);
            }
        });
    }
}
