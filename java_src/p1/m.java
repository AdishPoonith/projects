package p1;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.FacebookActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.EnumSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p0.j0;
import p1.u;
/* loaded from: classes.dex */
public class m extends androidx.fragment.app.d {
    public static final a K0 = new a(null);
    private static final String L0 = "device/login";
    private static final String M0 = "device/login_status";
    private static final int N0 = 1349174;
    private TextView A0;
    private TextView B0;
    private n C0;
    private final AtomicBoolean D0 = new AtomicBoolean();
    private volatile p0.m0 E0;
    private volatile ScheduledFuture<?> F0;
    private volatile c G0;
    private boolean H0;
    private boolean I0;
    private u.e J0;

    /* renamed from: z0  reason: collision with root package name */
    private View f15163z0;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final b b(JSONObject jSONObject) {
            String optString;
            JSONArray jSONArray = jSONObject.getJSONObject("permissions").getJSONArray("data");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int length = jSONArray.length();
            if (length > 0) {
                int i10 = 0;
                while (true) {
                    int i11 = i10 + 1;
                    JSONObject optJSONObject = jSONArray.optJSONObject(i10);
                    String permission = optJSONObject.optString("permission");
                    kotlin.jvm.internal.l.d(permission, "permission");
                    if (!(permission.length() == 0) && !kotlin.jvm.internal.l.a(permission, "installed") && (optString = optJSONObject.optString("status")) != null) {
                        int hashCode = optString.hashCode();
                        if (hashCode != -1309235419) {
                            if (hashCode != 280295099) {
                                if (hashCode == 568196142 && optString.equals("declined")) {
                                    arrayList2.add(permission);
                                }
                            } else if (optString.equals("granted")) {
                                arrayList.add(permission);
                            }
                        } else if (optString.equals("expired")) {
                            arrayList3.add(permission);
                        }
                    }
                    if (i11 >= length) {
                        break;
                    }
                    i10 = i11;
                }
            }
            return new b(arrayList, arrayList2, arrayList3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private List<String> f15164a;

        /* renamed from: b  reason: collision with root package name */
        private List<String> f15165b;

        /* renamed from: c  reason: collision with root package name */
        private List<String> f15166c;

        public b(List<String> grantedPermissions, List<String> declinedPermissions, List<String> expiredPermissions) {
            kotlin.jvm.internal.l.e(grantedPermissions, "grantedPermissions");
            kotlin.jvm.internal.l.e(declinedPermissions, "declinedPermissions");
            kotlin.jvm.internal.l.e(expiredPermissions, "expiredPermissions");
            this.f15164a = grantedPermissions;
            this.f15165b = declinedPermissions;
            this.f15166c = expiredPermissions;
        }

        public final List<String> a() {
            return this.f15165b;
        }

        public final List<String> b() {
            return this.f15166c;
        }

        public final List<String> c() {
            return this.f15164a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class c implements Parcelable {

        /* renamed from: j  reason: collision with root package name */
        private String f15168j;

        /* renamed from: k  reason: collision with root package name */
        private String f15169k;

        /* renamed from: l  reason: collision with root package name */
        private String f15170l;

        /* renamed from: m  reason: collision with root package name */
        private long f15171m;

        /* renamed from: n  reason: collision with root package name */
        private long f15172n;

        /* renamed from: o  reason: collision with root package name */
        public static final b f15167o = new b(null);
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* loaded from: classes.dex */
        public static final class a implements Parcelable.Creator<c> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public c createFromParcel(Parcel parcel) {
                kotlin.jvm.internal.l.e(parcel, "parcel");
                return new c(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        /* loaded from: classes.dex */
        public static final class b {
            private b() {
            }

            public /* synthetic */ b(kotlin.jvm.internal.g gVar) {
                this();
            }
        }

        public c() {
        }

        protected c(Parcel parcel) {
            kotlin.jvm.internal.l.e(parcel, "parcel");
            this.f15168j = parcel.readString();
            this.f15169k = parcel.readString();
            this.f15170l = parcel.readString();
            this.f15171m = parcel.readLong();
            this.f15172n = parcel.readLong();
        }

        public final String a() {
            return this.f15168j;
        }

        public final long b() {
            return this.f15171m;
        }

        public final String c() {
            return this.f15170l;
        }

        public final String d() {
            return this.f15169k;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final void e(long j10) {
            this.f15171m = j10;
        }

        public final void f(long j10) {
            this.f15172n = j10;
        }

        public final void j(String str) {
            this.f15170l = str;
        }

        public final void k(String str) {
            this.f15169k = str;
            kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
            String format = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", Arrays.copyOf(new Object[]{str}, 1));
            kotlin.jvm.internal.l.d(format, "java.lang.String.format(locale, format, *args)");
            this.f15168j = format;
        }

        public final boolean l() {
            return this.f15172n != 0 && (new Date().getTime() - this.f15172n) - (this.f15171m * 1000) < 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int i10) {
            kotlin.jvm.internal.l.e(dest, "dest");
            dest.writeString(this.f15168j);
            dest.writeString(this.f15169k);
            dest.writeString(this.f15170l);
            dest.writeLong(this.f15171m);
            dest.writeLong(this.f15172n);
        }
    }

    /* loaded from: classes.dex */
    public static final class d extends Dialog {
        d(androidx.fragment.app.e eVar, int i10) {
            super(eVar, i10);
        }

        @Override // android.app.Dialog
        public void onBackPressed() {
            if (m.this.k2()) {
                super.onBackPressed();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c2(m this$0, p0.o0 response) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        kotlin.jvm.internal.l.e(response, "response");
        if (this$0.D0.get()) {
            return;
        }
        p0.v b10 = response.b();
        if (b10 == null) {
            try {
                JSONObject c10 = response.c();
                if (c10 == null) {
                    c10 = new JSONObject();
                }
                String string = c10.getString("access_token");
                kotlin.jvm.internal.l.d(string, "resultObject.getString(\"access_token\")");
                this$0.n2(string, c10.getLong("expires_in"), Long.valueOf(c10.optLong("data_access_expiration_time")));
                return;
            } catch (JSONException e10) {
                this$0.m2(new p0.s(e10));
                return;
            }
        }
        int j10 = b10.j();
        boolean z10 = true;
        if (j10 != N0 && j10 != 1349172) {
            z10 = false;
        }
        if (z10) {
            this$0.t2();
            return;
        }
        if (j10 == 1349152) {
            c cVar = this$0.G0;
            if (cVar != null) {
                e1.a aVar = e1.a.f7982a;
                e1.a.a(cVar.d());
            }
            u.e eVar = this$0.J0;
            if (eVar != null) {
                this$0.w2(eVar);
                return;
            }
        } else if (j10 != 1349173) {
            p0.v b11 = response.b();
            p0.s e11 = b11 == null ? null : b11.e();
            if (e11 == null) {
                e11 = new p0.s();
            }
            this$0.m2(e11);
            return;
        }
        this$0.l2();
    }

    private final void e2(String str, b bVar, String str2, Date date, Date date2) {
        n nVar = this.C0;
        if (nVar != null) {
            p0.f0 f0Var = p0.f0.f14852a;
            nVar.G(str2, p0.f0.m(), str, bVar.c(), bVar.a(), bVar.b(), p0.h.DEVICE_AUTH, date, null, date2);
        }
        Dialog M1 = M1();
        if (M1 == null) {
            return;
        }
        M1.dismiss();
    }

    private final p0.j0 h2() {
        Bundle bundle = new Bundle();
        c cVar = this.G0;
        bundle.putString("code", cVar == null ? null : cVar.c());
        bundle.putString("access_token", f2());
        return p0.j0.f14918n.B(null, M0, bundle, new j0.b() { // from class: p1.k
            @Override // p0.j0.b
            public final void b(p0.o0 o0Var) {
                m.c2(m.this, o0Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j2(m this$0, View view) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        this$0.l2();
    }

    private final void n2(final String str, long j10, Long l10) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        final Date date = null;
        final Date date2 = j10 != 0 ? new Date(new Date().getTime() + (j10 * 1000)) : null;
        if ((l10 == null || l10.longValue() != 0) && l10 != null) {
            date = new Date(l10.longValue() * 1000);
        }
        p0.f0 f0Var = p0.f0.f14852a;
        p0.j0 x10 = p0.j0.f14918n.x(new p0.a(str, p0.f0.m(), "0", null, null, null, null, date2, null, date, null, 1024, null), "me", new j0.b() { // from class: p1.l
            @Override // p0.j0.b
            public final void b(p0.o0 o0Var) {
                m.o2(m.this, str, date2, date, o0Var);
            }
        });
        x10.G(p0.p0.GET);
        x10.H(bundle);
        x10.l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o2(m this$0, String accessToken, Date date, Date date2, p0.o0 response) {
        EnumSet<f1.i0> j10;
        kotlin.jvm.internal.l.e(this$0, "this$0");
        kotlin.jvm.internal.l.e(accessToken, "$accessToken");
        kotlin.jvm.internal.l.e(response, "response");
        if (this$0.D0.get()) {
            return;
        }
        p0.v b10 = response.b();
        if (b10 != null) {
            p0.s e10 = b10.e();
            if (e10 == null) {
                e10 = new p0.s();
            }
            this$0.m2(e10);
            return;
        }
        try {
            JSONObject c10 = response.c();
            if (c10 == null) {
                c10 = new JSONObject();
            }
            String string = c10.getString("id");
            kotlin.jvm.internal.l.d(string, "jsonObject.getString(\"id\")");
            b b11 = K0.b(c10);
            String string2 = c10.getString("name");
            kotlin.jvm.internal.l.d(string2, "jsonObject.getString(\"name\")");
            c cVar = this$0.G0;
            if (cVar != null) {
                e1.a aVar = e1.a.f7982a;
                e1.a.a(cVar.d());
            }
            f1.v vVar = f1.v.f8582a;
            p0.f0 f0Var = p0.f0.f14852a;
            f1.r f10 = f1.v.f(p0.f0.m());
            Boolean bool = null;
            if (f10 != null && (j10 = f10.j()) != null) {
                bool = Boolean.valueOf(j10.contains(f1.i0.RequireConfirm));
            }
            if (!kotlin.jvm.internal.l.a(bool, Boolean.TRUE) || this$0.I0) {
                this$0.e2(string, b11, accessToken, date, date2);
                return;
            }
            this$0.I0 = true;
            this$0.q2(string, b11, accessToken, string2, date, date2);
        } catch (JSONException e11) {
            this$0.m2(new p0.s(e11));
        }
    }

    private final void p2() {
        c cVar = this.G0;
        if (cVar != null) {
            cVar.f(new Date().getTime());
        }
        this.E0 = h2().l();
    }

    private final void q2(final String str, final b bVar, final String str2, String str3, final Date date, final Date date2) {
        String string = J().getString(d1.d.com_facebook_smart_login_confirmation_title);
        kotlin.jvm.internal.l.d(string, "resources.getString(R.string.com_facebook_smart_login_confirmation_title)");
        String string2 = J().getString(d1.d.com_facebook_smart_login_confirmation_continue_as);
        kotlin.jvm.internal.l.d(string2, "resources.getString(R.string.com_facebook_smart_login_confirmation_continue_as)");
        String string3 = J().getString(d1.d.com_facebook_smart_login_confirmation_cancel);
        kotlin.jvm.internal.l.d(string3, "resources.getString(R.string.com_facebook_smart_login_confirmation_cancel)");
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.v.f12860a;
        String format = String.format(string2, Arrays.copyOf(new Object[]{str3}, 1));
        kotlin.jvm.internal.l.d(format, "java.lang.String.format(format, *args)");
        AlertDialog.Builder builder = new AlertDialog.Builder(u());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new DialogInterface.OnClickListener() { // from class: p1.g
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                m.r2(m.this, str, bVar, str2, date, date2, dialogInterface, i10);
            }
        }).setPositiveButton(string3, new DialogInterface.OnClickListener() { // from class: p1.f
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                m.s2(m.this, dialogInterface, i10);
            }
        });
        builder.create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r2(m this$0, String userId, b permissions, String accessToken, Date date, Date date2, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        kotlin.jvm.internal.l.e(userId, "$userId");
        kotlin.jvm.internal.l.e(permissions, "$permissions");
        kotlin.jvm.internal.l.e(accessToken, "$accessToken");
        this$0.e2(userId, permissions, accessToken, date, date2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s2(m this$0, DialogInterface dialogInterface, int i10) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        View i22 = this$0.i2(false);
        Dialog M1 = this$0.M1();
        if (M1 != null) {
            M1.setContentView(i22);
        }
        u.e eVar = this$0.J0;
        if (eVar == null) {
            return;
        }
        this$0.w2(eVar);
    }

    private final void t2() {
        c cVar = this.G0;
        Long valueOf = cVar == null ? null : Long.valueOf(cVar.b());
        if (valueOf != null) {
            this.F0 = n.f15175n.a().schedule(new Runnable() { // from class: p1.i
                @Override // java.lang.Runnable
                public final void run() {
                    m.u2(m.this);
                }
            }, valueOf.longValue(), TimeUnit.SECONDS);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u2(m this$0) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        this$0.p2();
    }

    private final void v2(c cVar) {
        this.G0 = cVar;
        TextView textView = this.A0;
        if (textView == null) {
            kotlin.jvm.internal.l.p("confirmationCode");
            throw null;
        }
        textView.setText(cVar.d());
        e1.a aVar = e1.a.f7982a;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(J(), e1.a.c(cVar.a()));
        TextView textView2 = this.B0;
        if (textView2 == null) {
            kotlin.jvm.internal.l.p("instructions");
            throw null;
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, bitmapDrawable, (Drawable) null, (Drawable) null);
        TextView textView3 = this.A0;
        if (textView3 == null) {
            kotlin.jvm.internal.l.p("confirmationCode");
            throw null;
        }
        textView3.setVisibility(0);
        View view = this.f15163z0;
        if (view == null) {
            kotlin.jvm.internal.l.p("progressBar");
            throw null;
        }
        view.setVisibility(8);
        if (!this.I0 && e1.a.f(cVar.d())) {
            new q0.c0(u()).f("fb_smart_login_service");
        }
        if (cVar.l()) {
            t2();
        } else {
            p2();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x2(m this$0, p0.o0 response) {
        kotlin.jvm.internal.l.e(this$0, "this$0");
        kotlin.jvm.internal.l.e(response, "response");
        if (this$0.H0) {
            return;
        }
        if (response.b() != null) {
            p0.v b10 = response.b();
            p0.s e10 = b10 == null ? null : b10.e();
            if (e10 == null) {
                e10 = new p0.s();
            }
            this$0.m2(e10);
            return;
        }
        JSONObject c10 = response.c();
        if (c10 == null) {
            c10 = new JSONObject();
        }
        c cVar = new c();
        try {
            cVar.k(c10.getString("user_code"));
            cVar.j(c10.getString("code"));
            cVar.e(c10.getLong("interval"));
            this$0.v2(cVar);
        } catch (JSONException e11) {
            this$0.m2(new p0.s(e11));
        }
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void J0(Bundle outState) {
        kotlin.jvm.internal.l.e(outState, "outState");
        super.J0(outState);
        if (this.G0 != null) {
            outState.putParcelable("request_state", this.G0);
        }
    }

    @Override // androidx.fragment.app.d
    public Dialog O1(Bundle bundle) {
        d dVar = new d(p1(), d1.e.com_facebook_auth_dialog);
        e1.a aVar = e1.a.f7982a;
        dVar.setContentView(i2(e1.a.e() && !this.I0));
        return dVar;
    }

    public Map<String, String> d2() {
        return null;
    }

    public String f2() {
        StringBuilder sb = new StringBuilder();
        f1.m0 m0Var = f1.m0.f8479a;
        sb.append(f1.m0.b());
        sb.append('|');
        sb.append(f1.m0.c());
        return sb.toString();
    }

    protected int g2(boolean z10) {
        return z10 ? d1.c.com_facebook_smart_device_dialog_fragment : d1.c.com_facebook_device_auth_dialog_fragment;
    }

    protected View i2(boolean z10) {
        LayoutInflater layoutInflater = p1().getLayoutInflater();
        kotlin.jvm.internal.l.d(layoutInflater, "requireActivity().layoutInflater");
        View inflate = layoutInflater.inflate(g2(z10), (ViewGroup) null);
        kotlin.jvm.internal.l.d(inflate, "inflater.inflate(getLayoutResId(isSmartLogin), null)");
        View findViewById = inflate.findViewById(d1.b.progress_bar);
        kotlin.jvm.internal.l.d(findViewById, "view.findViewById(R.id.progress_bar)");
        this.f15163z0 = findViewById;
        View findViewById2 = inflate.findViewById(d1.b.confirmation_code);
        Objects.requireNonNull(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
        this.A0 = (TextView) findViewById2;
        View findViewById3 = inflate.findViewById(d1.b.cancel_button);
        Objects.requireNonNull(findViewById3, "null cannot be cast to non-null type android.widget.Button");
        ((Button) findViewById3).setOnClickListener(new View.OnClickListener() { // from class: p1.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                m.j2(m.this, view);
            }
        });
        View findViewById4 = inflate.findViewById(d1.b.com_facebook_device_auth_instructions);
        Objects.requireNonNull(findViewById4, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) findViewById4;
        this.B0 = textView;
        textView.setText(Html.fromHtml(Q(d1.d.com_facebook_device_auth_instructions)));
        return inflate;
    }

    protected boolean k2() {
        return true;
    }

    protected void l2() {
        if (this.D0.compareAndSet(false, true)) {
            c cVar = this.G0;
            if (cVar != null) {
                e1.a aVar = e1.a.f7982a;
                e1.a.a(cVar.d());
            }
            n nVar = this.C0;
            if (nVar != null) {
                nVar.E();
            }
            Dialog M1 = M1();
            if (M1 == null) {
                return;
            }
            M1.dismiss();
        }
    }

    protected void m2(p0.s ex) {
        kotlin.jvm.internal.l.e(ex, "ex");
        if (this.D0.compareAndSet(false, true)) {
            c cVar = this.G0;
            if (cVar != null) {
                e1.a aVar = e1.a.f7982a;
                e1.a.a(cVar.d());
            }
            n nVar = this.C0;
            if (nVar != null) {
                nVar.F(ex);
            }
            Dialog M1 = M1();
            if (M1 == null) {
                return;
            }
            M1.dismiss();
        }
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialog) {
        kotlin.jvm.internal.l.e(dialog, "dialog");
        super.onDismiss(dialog);
        if (this.H0) {
            return;
        }
        l2();
    }

    @Override // androidx.fragment.app.Fragment
    public View r0(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        c cVar;
        u P1;
        kotlin.jvm.internal.l.e(inflater, "inflater");
        View r02 = super.r0(inflater, viewGroup, bundle);
        y yVar = (y) ((FacebookActivity) p1()).O();
        f0 f0Var = null;
        if (yVar != null && (P1 = yVar.P1()) != null) {
            f0Var = P1.m();
        }
        this.C0 = (n) f0Var;
        if (bundle != null && (cVar = (c) bundle.getParcelable("request_state")) != null) {
            v2(cVar);
        }
        return r02;
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public void u0() {
        this.H0 = true;
        this.D0.set(true);
        super.u0();
        p0.m0 m0Var = this.E0;
        if (m0Var != null) {
            m0Var.cancel(true);
        }
        ScheduledFuture<?> scheduledFuture = this.F0;
        if (scheduledFuture == null) {
            return;
        }
        scheduledFuture.cancel(true);
    }

    public void w2(u.e request) {
        kotlin.jvm.internal.l.e(request, "request");
        this.J0 = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.x()));
        f1.l0 l0Var = f1.l0.f8470a;
        f1.l0.l0(bundle, "redirect_uri", request.l());
        f1.l0.l0(bundle, "target_user_id", request.k());
        bundle.putString("access_token", f2());
        e1.a aVar = e1.a.f7982a;
        Map<String, String> d22 = d2();
        bundle.putString("device_info", e1.a.d(d22 == null ? null : t9.g0.o(d22)));
        p0.j0.f14918n.B(null, L0, bundle, new j0.b() { // from class: p1.j
            @Override // p0.j0.b
            public final void b(p0.o0 o0Var) {
                m.x2(m.this, o0Var);
            }
        }).l();
    }
}
