package io.flutter.plugin.editing;

import android.text.Editable;
import android.text.Selection;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import java.util.ArrayList;
import java.util.Iterator;
import q8.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class c extends SpannableStringBuilder {

    /* renamed from: j  reason: collision with root package name */
    private int f10368j = 0;

    /* renamed from: k  reason: collision with root package name */
    private int f10369k = 0;

    /* renamed from: l  reason: collision with root package name */
    private ArrayList<b> f10370l = new ArrayList<>();

    /* renamed from: m  reason: collision with root package name */
    private ArrayList<b> f10371m = new ArrayList<>();

    /* renamed from: n  reason: collision with root package name */
    private ArrayList<e> f10372n = new ArrayList<>();

    /* renamed from: o  reason: collision with root package name */
    private String f10373o;

    /* renamed from: p  reason: collision with root package name */
    private String f10374p;

    /* renamed from: q  reason: collision with root package name */
    private int f10375q;

    /* renamed from: r  reason: collision with root package name */
    private int f10376r;

    /* renamed from: s  reason: collision with root package name */
    private int f10377s;

    /* renamed from: t  reason: collision with root package name */
    private int f10378t;

    /* renamed from: u  reason: collision with root package name */
    private BaseInputConnection f10379u;

    /* loaded from: classes.dex */
    class a extends BaseInputConnection {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Editable f10380a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, boolean z10, Editable editable) {
            super(view, z10);
            this.f10380a = editable;
        }

        @Override // android.view.inputmethod.BaseInputConnection
        public Editable getEditable() {
            return this.f10380a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z10, boolean z11, boolean z12);
    }

    public c(p.e eVar, View view) {
        this.f10379u = new a(view, true, this);
        if (eVar != null) {
            n(eVar);
        }
    }

    private void j(b bVar, boolean z10, boolean z11, boolean z12) {
        this.f10369k++;
        bVar.a(z10, z11, z12);
        this.f10369k--;
    }

    private void k(boolean z10, boolean z11, boolean z12) {
        if (z10 || z11 || z12) {
            Iterator<b> it = this.f10370l.iterator();
            while (it.hasNext()) {
                j(it.next(), z10, z11, z12);
            }
        }
    }

    public void a(b bVar) {
        ArrayList<b> arrayList;
        if (this.f10369k > 0) {
            d8.b.b("ListenableEditingState", "adding a listener " + bVar.toString() + " in a listener callback");
        }
        if (this.f10368j > 0) {
            d8.b.g("ListenableEditingState", "a listener was added to EditingState while a batch edit was in progress");
            arrayList = this.f10371m;
        } else {
            arrayList = this.f10370l;
        }
        arrayList.add(bVar);
    }

    public void b() {
        this.f10368j++;
        if (this.f10369k > 0) {
            d8.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        if (this.f10368j != 1 || this.f10370l.isEmpty()) {
            return;
        }
        this.f10374p = toString();
        this.f10375q = i();
        this.f10376r = h();
        this.f10377s = g();
        this.f10378t = f();
    }

    public void c() {
        this.f10372n.clear();
    }

    public void d() {
        int i10 = this.f10368j;
        if (i10 == 0) {
            d8.b.b("ListenableEditingState", "endBatchEdit called without a matching beginBatchEdit");
            return;
        }
        if (i10 == 1) {
            Iterator<b> it = this.f10371m.iterator();
            while (it.hasNext()) {
                j(it.next(), true, true, true);
            }
            if (!this.f10370l.isEmpty()) {
                d8.b.f("ListenableEditingState", "didFinishBatchEdit with " + String.valueOf(this.f10370l.size()) + " listener(s)");
                boolean z10 = false;
                k(!toString().equals(this.f10374p), (this.f10375q == i() && this.f10376r == h()) ? false : true, (this.f10377s == g() && this.f10378t == f()) ? true : true);
            }
        }
        this.f10370l.addAll(this.f10371m);
        this.f10371m.clear();
        this.f10368j--;
    }

    public ArrayList<e> e() {
        ArrayList<e> arrayList = new ArrayList<>(this.f10372n);
        this.f10372n.clear();
        return arrayList;
    }

    public final int f() {
        return BaseInputConnection.getComposingSpanEnd(this);
    }

    public final int g() {
        return BaseInputConnection.getComposingSpanStart(this);
    }

    public final int h() {
        return Selection.getSelectionEnd(this);
    }

    public final int i() {
        return Selection.getSelectionStart(this);
    }

    public void l(b bVar) {
        if (this.f10369k > 0) {
            d8.b.b("ListenableEditingState", "removing a listener " + bVar.toString() + " in a listener callback");
        }
        this.f10370l.remove(bVar);
        if (this.f10368j > 0) {
            this.f10371m.remove(bVar);
        }
    }

    public void m(int i10, int i11) {
        if (i10 < 0 || i10 >= i11) {
            BaseInputConnection.removeComposingSpans(this);
        } else {
            this.f10379u.setComposingRegion(i10, i11);
        }
    }

    public void n(p.e eVar) {
        b();
        replace(0, length(), (CharSequence) eVar.f16487a);
        if (eVar.c()) {
            Selection.setSelection(this, eVar.f16488b, eVar.f16489c);
        } else {
            Selection.removeSelection(this);
        }
        m(eVar.f16490d, eVar.f16491e);
        c();
        d();
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        boolean z10;
        boolean z11;
        if (this.f10369k > 0) {
            d8.b.b("ListenableEditingState", "editing state should not be changed in a listener callback");
        }
        String cVar = toString();
        int i14 = i11 - i10;
        boolean z12 = i14 != i13 - i12;
        for (int i15 = 0; i15 < i14 && !z12; i15++) {
            z12 |= charAt(i10 + i15) != charSequence.charAt(i12 + i15);
        }
        if (z12) {
            this.f10373o = null;
        }
        int i16 = i();
        int h10 = h();
        int g10 = g();
        int f10 = f();
        SpannableStringBuilder replace = super.replace(i10, i11, charSequence, i12, i13);
        boolean z13 = z12;
        this.f10372n.add(new e(cVar, i10, i11, charSequence, i(), h(), g(), f()));
        if (this.f10368j > 0) {
            return replace;
        }
        boolean z14 = (i() == i16 && h() == h10) ? false : true;
        if (g() == g10 && f() == f10) {
            z10 = z13;
            z11 = false;
        } else {
            z10 = z13;
            z11 = true;
        }
        k(z10, z14, z11);
        return replace;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i10, int i11, int i12) {
        super.setSpan(obj, i10, i11, i12);
        this.f10372n.add(new e(toString(), i(), h(), g(), f()));
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public String toString() {
        String str = this.f10373o;
        if (str != null) {
            return str;
        }
        String spannableStringBuilder = super.toString();
        this.f10373o = spannableStringBuilder;
        return spannableStringBuilder;
    }
}
