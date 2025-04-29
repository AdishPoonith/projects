package io.flutter.plugin.editing;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextPaint;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.InputMethodManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.plugin.editing.c;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import q8.p;
/* loaded from: classes.dex */
public class b extends BaseInputConnection implements c.b {

    /* renamed from: a  reason: collision with root package name */
    private final View f10354a;

    /* renamed from: b  reason: collision with root package name */
    private final int f10355b;

    /* renamed from: c  reason: collision with root package name */
    private final p f10356c;

    /* renamed from: d  reason: collision with root package name */
    private final c f10357d;

    /* renamed from: e  reason: collision with root package name */
    private final EditorInfo f10358e;

    /* renamed from: f  reason: collision with root package name */
    private ExtractedTextRequest f10359f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f10360g;

    /* renamed from: h  reason: collision with root package name */
    private CursorAnchorInfo.Builder f10361h;

    /* renamed from: i  reason: collision with root package name */
    private ExtractedText f10362i;

    /* renamed from: j  reason: collision with root package name */
    private InputMethodManager f10363j;

    /* renamed from: k  reason: collision with root package name */
    private final Layout f10364k;

    /* renamed from: l  reason: collision with root package name */
    private io.flutter.plugin.editing.a f10365l;

    /* renamed from: m  reason: collision with root package name */
    private final a f10366m;

    /* renamed from: n  reason: collision with root package name */
    private int f10367n;

    /* loaded from: classes.dex */
    public interface a {
        boolean a(KeyEvent keyEvent);
    }

    public b(View view, int i10, p pVar, a aVar, c cVar, EditorInfo editorInfo) {
        this(view, i10, pVar, aVar, cVar, editorInfo, new FlutterJNI());
    }

    public b(View view, int i10, p pVar, a aVar, c cVar, EditorInfo editorInfo, FlutterJNI flutterJNI) {
        super(view, true);
        this.f10360g = false;
        this.f10362i = new ExtractedText();
        this.f10367n = 0;
        this.f10354a = view;
        this.f10355b = i10;
        this.f10356c = pVar;
        this.f10357d = cVar;
        cVar.a(this);
        this.f10358e = editorInfo;
        this.f10366m = aVar;
        this.f10365l = new io.flutter.plugin.editing.a(flutterJNI);
        this.f10364k = new DynamicLayout(cVar, new TextPaint(), Integer.MAX_VALUE, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        this.f10363j = (InputMethodManager) view.getContext().getSystemService("input_method");
    }

    private boolean b(int i10) {
        if (i10 == 16908319) {
            setSelection(0, this.f10357d.length());
            return true;
        } else if (i10 == 16908320) {
            int selectionStart = Selection.getSelectionStart(this.f10357d);
            int selectionEnd = Selection.getSelectionEnd(this.f10357d);
            if (selectionStart != selectionEnd) {
                int min = Math.min(selectionStart, selectionEnd);
                int max = Math.max(selectionStart, selectionEnd);
                ((ClipboardManager) this.f10354a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f10357d.subSequence(min, max)));
                this.f10357d.delete(min, max);
                setSelection(min, min);
            }
            return true;
        } else if (i10 == 16908321) {
            int selectionStart2 = Selection.getSelectionStart(this.f10357d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f10357d);
            if (selectionStart2 != selectionEnd2) {
                ((ClipboardManager) this.f10354a.getContext().getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("text label?", this.f10357d.subSequence(Math.min(selectionStart2, selectionEnd2), Math.max(selectionStart2, selectionEnd2))));
            }
            return true;
        } else if (i10 == 16908322) {
            ClipData primaryClip = ((ClipboardManager) this.f10354a.getContext().getSystemService("clipboard")).getPrimaryClip();
            if (primaryClip != null) {
                CharSequence coerceToText = primaryClip.getItemAt(0).coerceToText(this.f10354a.getContext());
                int max2 = Math.max(0, Selection.getSelectionStart(this.f10357d));
                int max3 = Math.max(0, Selection.getSelectionEnd(this.f10357d));
                int min2 = Math.min(max2, max3);
                int max4 = Math.max(max2, max3);
                if (min2 != max4) {
                    this.f10357d.delete(min2, max4);
                }
                this.f10357d.insert(min2, coerceToText);
                int length = min2 + coerceToText.length();
                setSelection(length, length);
            }
            return true;
        } else {
            return false;
        }
    }

    private CursorAnchorInfo c() {
        CursorAnchorInfo.Builder builder = this.f10361h;
        if (builder == null) {
            this.f10361h = new CursorAnchorInfo.Builder();
        } else {
            builder.reset();
        }
        this.f10361h.setSelectionRange(this.f10357d.i(), this.f10357d.h());
        int g10 = this.f10357d.g();
        int f10 = this.f10357d.f();
        if (g10 < 0 || f10 <= g10) {
            this.f10361h.setComposingText(-1, "");
        } else {
            this.f10361h.setComposingText(g10, this.f10357d.toString().subSequence(g10, f10));
        }
        return this.f10361h.build();
    }

    private ExtractedText d(ExtractedTextRequest extractedTextRequest) {
        ExtractedText extractedText = this.f10362i;
        extractedText.startOffset = 0;
        extractedText.partialStartOffset = -1;
        extractedText.partialEndOffset = -1;
        extractedText.selectionStart = this.f10357d.i();
        this.f10362i.selectionEnd = this.f10357d.h();
        this.f10362i.text = (extractedTextRequest == null || (extractedTextRequest.flags & 1) == 0) ? this.f10357d.toString() : this.f10357d;
        return this.f10362i;
    }

    private boolean e(boolean z10, boolean z11) {
        int selectionStart = Selection.getSelectionStart(this.f10357d);
        int selectionEnd = Selection.getSelectionEnd(this.f10357d);
        boolean z12 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        int max = z10 ? Math.max(this.f10365l.b(this.f10357d, selectionEnd), 0) : Math.min(this.f10365l.a(this.f10357d, selectionEnd), this.f10357d.length());
        if (selectionStart == selectionEnd && !z11) {
            z12 = true;
        }
        if (z12) {
            setSelection(max, max);
        } else {
            setSelection(selectionStart, max);
        }
        return true;
    }

    private boolean g(boolean z10, boolean z11) {
        int selectionStart = Selection.getSelectionStart(this.f10357d);
        int selectionEnd = Selection.getSelectionEnd(this.f10357d);
        boolean z12 = false;
        if (selectionStart < 0 || selectionEnd < 0) {
            return false;
        }
        if (selectionStart == selectionEnd && !z11) {
            z12 = true;
        }
        beginBatchEdit();
        if (z12) {
            if (z10) {
                Selection.moveUp(this.f10357d, this.f10364k);
            } else {
                Selection.moveDown(this.f10357d, this.f10364k);
            }
            int selectionStart2 = Selection.getSelectionStart(this.f10357d);
            setSelection(selectionStart2, selectionStart2);
        } else {
            if (z10) {
                Selection.extendUp(this.f10357d, this.f10364k);
            } else {
                Selection.extendDown(this.f10357d, this.f10364k);
            }
            setSelection(Selection.getSelectionStart(this.f10357d), Selection.getSelectionEnd(this.f10357d));
        }
        endBatchEdit();
        return true;
    }

    private byte[] h(InputStream inputStream, int i10) {
        int i11;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[i10];
        while (true) {
            try {
                i11 = inputStream.read(bArr);
            } catch (IOException unused) {
                i11 = -1;
            }
            if (i11 == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i11);
        }
    }

    @Override // io.flutter.plugin.editing.c.b
    public void a(boolean z10, boolean z11, boolean z12) {
        this.f10363j.updateSelection(this.f10354a, this.f10357d.i(), this.f10357d.h(), this.f10357d.g(), this.f10357d.f());
        ExtractedTextRequest extractedTextRequest = this.f10359f;
        if (extractedTextRequest != null) {
            this.f10363j.updateExtractedText(this.f10354a, extractedTextRequest.token, d(extractedTextRequest));
        }
        if (this.f10360g) {
            this.f10363j.updateCursorAnchorInfo(this.f10354a, c());
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        this.f10357d.b();
        this.f10367n++;
        return super.beginBatchEdit();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i10) {
        return super.clearMetaKeyStates(i10);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public void closeConnection() {
        super.closeConnection();
        this.f10357d.l(this);
        while (this.f10367n > 0) {
            endBatchEdit();
            this.f10367n--;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
            try {
                inputContentInfo.requestPermission();
                if (inputContentInfo.getDescription().getMimeTypeCount() > 0) {
                    inputContentInfo.requestPermission();
                    Uri contentUri = inputContentInfo.getContentUri();
                    String mimeType = inputContentInfo.getDescription().getMimeType(0);
                    Context context = this.f10354a.getContext();
                    if (contentUri != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(contentUri);
                            if (openInputStream != null) {
                                byte[] h10 = h(openInputStream, 65536);
                                HashMap hashMap = new HashMap();
                                hashMap.put("mimeType", mimeType);
                                hashMap.put("data", h10);
                                hashMap.put("uri", contentUri.toString());
                                this.f10356c.b(this.f10355b, hashMap);
                                inputContentInfo.releasePermission();
                                return true;
                            }
                        } catch (FileNotFoundException unused) {
                            inputContentInfo.releasePermission();
                            return false;
                        }
                    }
                    inputContentInfo.releasePermission();
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i10) {
        return super.commitText(charSequence, i10);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i10, int i11) {
        if (this.f10357d.i() == -1) {
            return true;
        }
        return super.deleteSurroundingText(i10, i11);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return super.deleteSurroundingTextInCodePoints(i10, i11);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        boolean endBatchEdit = super.endBatchEdit();
        this.f10367n--;
        this.f10357d.d();
        return endBatchEdit;
    }

    public boolean f(KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0) {
            if (keyEvent.getAction() == 1 && (keyEvent.getKeyCode() == 59 || keyEvent.getKeyCode() == 60)) {
                int selectionEnd = Selection.getSelectionEnd(this.f10357d);
                setSelection(selectionEnd, selectionEnd);
                return true;
            }
            return false;
        } else if (keyEvent.getKeyCode() == 21) {
            return e(true, keyEvent.isShiftPressed());
        } else {
            if (keyEvent.getKeyCode() == 22) {
                return e(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 19) {
                return g(true, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 20) {
                return g(false, keyEvent.isShiftPressed());
            }
            if (keyEvent.getKeyCode() == 66 || keyEvent.getKeyCode() == 160) {
                EditorInfo editorInfo = this.f10358e;
                if ((131072 & editorInfo.inputType) == 0) {
                    performEditorAction(editorInfo.imeOptions & 255);
                    return true;
                }
            }
            int selectionStart = Selection.getSelectionStart(this.f10357d);
            int selectionEnd2 = Selection.getSelectionEnd(this.f10357d);
            int unicodeChar = keyEvent.getUnicodeChar();
            if (selectionStart < 0 || selectionEnd2 < 0 || unicodeChar == 0) {
                return false;
            }
            int min = Math.min(selectionStart, selectionEnd2);
            int max = Math.max(selectionStart, selectionEnd2);
            beginBatchEdit();
            if (min != max) {
                this.f10357d.delete(min, max);
            }
            this.f10357d.insert(min, (CharSequence) String.valueOf((char) unicodeChar));
            int i10 = min + 1;
            setSelection(i10, i10);
            endBatchEdit();
            return true;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        return super.finishComposingText();
    }

    @Override // android.view.inputmethod.BaseInputConnection
    public Editable getEditable() {
        return this.f10357d;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        boolean z10 = (i10 & 1) != 0;
        if (z10 == (this.f10359f == null)) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled text monitoring ");
            sb.append(z10 ? "on" : "off");
            d8.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f10359f = z10 ? extractedTextRequest : null;
        return d(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i10) {
        beginBatchEdit();
        boolean b10 = b(i10);
        endBatchEdit();
        return b10;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i10) {
        if (i10 == 0) {
            this.f10356c.o(this.f10355b);
        } else if (i10 == 1) {
            this.f10356c.g(this.f10355b);
        } else if (i10 == 2) {
            this.f10356c.f(this.f10355b);
        } else if (i10 == 3) {
            this.f10356c.l(this.f10355b);
        } else if (i10 == 4) {
            this.f10356c.m(this.f10355b);
        } else if (i10 == 5) {
            this.f10356c.h(this.f10355b);
        } else if (i10 != 7) {
            this.f10356c.e(this.f10355b);
        } else {
            this.f10356c.j(this.f10355b);
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        this.f10356c.i(this.f10355b, str, bundle);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i10) {
        if ((i10 & 1) != 0) {
            this.f10363j.updateCursorAnchorInfo(this.f10354a, c());
        }
        boolean z10 = (i10 & 2) != 0;
        if (z10 != this.f10360g) {
            StringBuilder sb = new StringBuilder();
            sb.append("The input method toggled cursor monitoring ");
            sb.append(z10 ? "on" : "off");
            d8.b.a("InputConnectionAdaptor", sb.toString());
        }
        this.f10360g = z10;
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        return this.f10366m.a(keyEvent);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i10, int i11) {
        return super.setComposingRegion(i10, i11);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i10) {
        beginBatchEdit();
        boolean commitText = charSequence.length() == 0 ? super.commitText(charSequence, i10) : super.setComposingText(charSequence, i10);
        endBatchEdit();
        return commitText;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public boolean setSelection(int i10, int i11) {
        beginBatchEdit();
        boolean selection = super.setSelection(i10, i11);
        endBatchEdit();
        return selection;
    }
}
