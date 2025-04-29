.class public final Ln0/q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr8/k$c;
.implements Landroid/speech/RecognitionListener;
.implements Lr8/p;
.implements Li8/a;
.implements Lj8/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln0/q$a;
    }
.end annotation


# static fields
.field public static final U:Ln0/q$a;


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:Z

.field private F:Landroid/speech/SpeechRecognizer;

.field private G:Landroid/content/Intent;

.field private H:Landroid/bluetooth/BluetoothAdapter;

.field private I:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Landroid/bluetooth/BluetoothDevice;",
            ">;"
        }
    .end annotation
.end field

.field private J:Landroid/bluetooth/BluetoothDevice;

.field private K:Landroid/bluetooth/BluetoothHeadset;

.field private L:Ljava/lang/String;

.field private M:Z

.field private N:Ln0/f;

.field private O:J

.field private P:J

.field private Q:F

.field private R:F

.field private final S:Landroid/os/Handler;

.field private final T:Ljava/lang/String;

.field private j:Landroid/content/Context;

.field private k:Lr8/k;

.field private final l:I

.field private final m:I

.field private final n:I

.field private final o:I

.field private final p:D

.field private q:I

.field private final r:Ljava/lang/String;

.field private s:Z

.field private t:Landroid/app/Activity;

.field private u:Lr8/k$d;

.field private v:Z

.field private w:Z

.field private x:Z

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln0/q$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln0/q$a;-><init>(Lkotlin/jvm/internal/g;)V

    sput-object v0, Ln0/q;->U:Ln0/q$a;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x15

    iput v0, p0, Ln0/q;->l:I

    const/16 v0, 0x1d

    iput v0, p0, Ln0/q;->m:I

    const/16 v0, 0x1f

    iput v0, p0, Ln0/q;->n:I

    const/16 v0, 0x6f69

    iput v0, p0, Ln0/q;->o:I

    const-wide/high16 v0, -0x4010000000000000L    # -1.0

    iput-wide v0, p0, Ln0/q;->p:D

    const/16 v0, 0x9

    iput v0, p0, Ln0/q;->q:I

    const-string v0, "SpeechToTextPlugin"

    iput-object v0, p0, Ln0/q;->r:Ljava/lang/String;

    const/4 v0, 0x1

    iput-boolean v0, p0, Ln0/q;->s:Z

    iput-boolean v0, p0, Ln0/q;->C:Z

    iput-boolean v0, p0, Ln0/q;->M:Z

    sget-object v0, Ln0/f;->j:Ln0/f;

    iput-object v0, p0, Ln0/q;->N:Ln0/f;

    const/high16 v0, 0x447a0000    # 1000.0f

    iput v0, p0, Ln0/q;->Q:F

    const/high16 v0, -0x3d380000    # -100.0f

    iput v0, p0, Ln0/q;->R:F

    new-instance v0, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object v0, p0, Ln0/q;->S:Landroid/os/Handler;

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toLanguageTag(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Ln0/q;->T:Ljava/lang/String;

    return-void
.end method

.method private final A(Lr8/k$d;)V
    .locals 2

    invoke-direct {p0}, Ln0/q;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    const-string v0, "Start has_permission"

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    iget-object v0, p0, Ln0/q;->j:Landroid/content/Context;

    if-eqz v0, :cond_2

    const-string v1, "android.permission.RECORD_AUDIO"

    invoke-static {v0, v1}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method

.method private final B(Lr8/k$d;)V
    .locals 3

    invoke-direct {p0}, Ln0/q;->O()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void

    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget v1, p0, Ln0/q;->m:I

    if-ne v0, v1, :cond_2

    iget-boolean v0, p0, Ln0/q;->z:Z

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v0, 0x1

    :goto_1
    iput-boolean v0, p0, Ln0/q;->s:Z

    const-string v0, "Start initialize"

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    iget-object v0, p0, Ln0/q;->u:Lr8/k$d;

    if-eqz v0, :cond_3

    sget-object v0, Ln0/h;->j:Ln0/h;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    const-string v2, "Only one initialize at a time"

    invoke-interface {p1, v0, v2, v1}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_3
    iput-object p1, p0, Ln0/q;->u:Lr8/k$d;

    iget-object p1, p0, Ln0/q;->j:Landroid/content/Context;

    invoke-direct {p0, p1}, Ln0/q;->C(Landroid/content/Context;)V

    return-void
.end method

.method private final C(Landroid/content/Context;)V
    .locals 4

    if-nez p1, :cond_0

    invoke-direct {p0}, Ln0/q;->t()V

    return-void

    :cond_0
    const-string v0, "android.permission.RECORD_AUDIO"

    invoke-static {p1, v0}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    iput-boolean v1, p0, Ln0/q;->w:Z

    const-string v1, "android.permission.BLUETOOTH_CONNECT"

    invoke-static {p1, v1}, Landroidx/core/content/a;->a(Landroid/content/Context;Ljava/lang/String;)I

    move-result p1

    if-nez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    if-eqz p1, :cond_4

    iget-boolean p1, p0, Ln0/q;->B:Z

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :cond_4
    :goto_2
    iput-boolean v2, p0, Ln0/q;->C:Z

    const-string p1, "Checked permission"

    invoke-direct {p0, p1}, Ln0/q;->w(Ljava/lang/String;)V

    iget-boolean p1, p0, Ln0/q;->w:Z

    if-nez p1, :cond_7

    iget-object p1, p0, Ln0/q;->t:Landroid/app/Activity;

    if-eqz p1, :cond_6

    const-string v2, "Requesting permission"

    invoke-direct {p0, v2}, Ln0/q;->w(Ljava/lang/String;)V

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    iget-boolean v2, p0, Ln0/q;->B:Z

    if-nez v2, :cond_5

    invoke-static {v0, v1}, Lt9/g;->g([Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/String;

    :cond_5
    iget v1, p0, Ln0/q;->o:I

    invoke-static {p1, v0, v1}, Landroidx/core/app/b;->n(Landroid/app/Activity;[Ljava/lang/String;I)V

    goto :goto_4

    :cond_6
    const-string p1, "no permission, no activity, completing"

    goto :goto_3

    :cond_7
    const-string p1, "has permission, completing"

    :goto_3
    invoke-direct {p0, p1}, Ln0/q;->w(Ljava/lang/String;)V

    invoke-direct {p0}, Ln0/q;->t()V

    :goto_4
    const-string p1, "leaving initializeIfPermitted"

    invoke-direct {p0, p1}, Ln0/q;->w(Ljava/lang/String;)V

    return-void
.end method

.method private final D(Z)Z
    .locals 5

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iget-wide v3, p0, Ln0/q;->O:J

    sub-long/2addr v1, v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iput-wide v3, p0, Ln0/q;->O:J

    const-wide/16 v3, 0x0

    cmp-long p1, v1, v3

    if-ltz p1, :cond_1

    const/16 p1, 0x64

    int-to-long v3, p1

    cmp-long p1, v1, v3

    if-gez p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    return v0
.end method

.method private final E()Z
    .locals 1

    iget-boolean v0, p0, Ln0/q;->x:Z

    return v0
.end method

.method private final F()Z
    .locals 1

    iget-boolean v0, p0, Ln0/q;->v:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private final G()Z
    .locals 1

    iget-boolean v0, p0, Ln0/q;->x:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private final H(Lr8/k$d;)V
    .locals 10

    invoke-direct {p0}, Ln0/q;->O()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-direct {p0}, Ln0/q;->F()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ln0/q;->j:Landroid/content/Context;

    invoke-static {v0}, Landroid/speech/RecognizerIntent;->getVoiceDetailsIntent(Landroid/content/Context;)Landroid/content/Intent;

    move-result-object v0

    if-nez v0, :cond_1

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.speech.action.GET_LANGUAGE_DETAILS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "com.google.android.googlequicksearchbox"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    :cond_1
    move-object v3, v0

    iget-object v2, p0, Ln0/q;->j:Landroid/content/Context;

    if-eqz v2, :cond_2

    const/4 v4, 0x0

    new-instance v5, Ln0/e;

    iget-boolean v0, p0, Ln0/q;->y:Z

    invoke-direct {v5, p1, v0}, Ln0/e;-><init>(Lr8/k$d;Z)V

    const/4 v6, 0x0

    const/4 v7, -0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-virtual/range {v2 .. v9}, Landroid/content/Context;->sendOrderedBroadcast(Landroid/content/Intent;Ljava/lang/String;Landroid/content/BroadcastReceiver;Landroid/os/Handler;ILjava/lang/String;Landroid/os/Bundle;)V

    :cond_2
    return-void

    :cond_3
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private final J(Z)V
    .locals 4

    iget-boolean v0, p0, Ln0/q;->x:Z

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Ln0/q;->x:Z

    const/4 v0, 0x1

    if-ne p1, v0, :cond_1

    sget-object v0, Ln0/r;->j:Ln0/r;

    :goto_0
    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    if-nez p1, :cond_5

    sget-object v0, Ln0/r;->k:Ln0/r;

    goto :goto_0

    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Notify status:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Ln0/q;->w(Ljava/lang/String;)V

    iget-object v1, p0, Ln0/q;->k:Lr8/k;

    if-eqz v1, :cond_2

    sget-object v3, Ln0/g;->k:Ln0/g;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3, v0}, Lr8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_2
    if-nez p1, :cond_4

    iget-boolean p1, p0, Ln0/q;->D:Z

    if-nez p1, :cond_3

    sget-object p1, Ln0/r;->o:Ln0/r;

    goto :goto_2

    :cond_3
    sget-object p1, Ln0/r;->n:Ln0/r;

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    invoke-direct {p0}, Ln0/q;->N()V

    iget-object v0, p0, Ln0/q;->k:Lr8/k;

    if-eqz v0, :cond_4

    sget-object v1, Ln0/g;->k:Ln0/g;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lr8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    return-void

    :cond_5
    new-instance p1, Ls9/l;

    invoke-direct {p1}, Ls9/l;-><init>()V

    throw p1
.end method

.method private final K(Landroid/content/Context;Lr8/c;)V
    .locals 1

    iput-object p1, p0, Ln0/q;->j:Landroid/content/Context;

    new-instance p1, Lr8/k;

    const-string v0, "plugin.csdcorp.com/speech_to_text"

    invoke-direct {p1, p2, v0}, Lr8/k;-><init>(Lr8/c;Ljava/lang/String;)V

    iput-object p1, p0, Ln0/q;->k:Lr8/k;

    invoke-virtual {p1, p0}, Lr8/k;->e(Lr8/k$c;)V

    return-void
.end method

.method private static final L(Ln0/q;F)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ln0/q;->k:Lr8/k;

    if-eqz p0, :cond_0

    sget-object v0, Ln0/g;->m:Ln0/g;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lr8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private final M()V
    .locals 4

    iget-boolean v0, p0, Ln0/q;->C:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ln0/q;->H:Landroid/bluetooth/BluetoothAdapter;

    iget-object v1, p0, Ln0/q;->I:Ljava/util/Set;

    iget-object v2, p0, Ln0/q;->K:Landroid/bluetooth/BluetoothHeadset;

    if-eqz v0, :cond_2

    if-eqz v2, :cond_2

    if-eqz v1, :cond_2

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->isEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/bluetooth/BluetoothDevice;

    invoke-virtual {v2, v1}, Landroid/bluetooth/BluetoothHeadset;->startVoiceRecognition(Landroid/bluetooth/BluetoothDevice;)Z

    move-result v3

    if-eqz v3, :cond_1

    const-string v0, "Starting bluetooth voice recognition"

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    iput-object v1, p0, Ln0/q;->J:Landroid/bluetooth/BluetoothDevice;

    :cond_2
    return-void
.end method

.method private final N()V
    .locals 3

    iget-boolean v0, p0, Ln0/q;->C:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Ln0/q;->J:Landroid/bluetooth/BluetoothDevice;

    iget-object v1, p0, Ln0/q;->K:Landroid/bluetooth/BluetoothHeadset;

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    const-string v2, "Stopping bluetooth voice recognition"

    invoke-direct {p0, v2}, Ln0/q;->w(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Landroid/bluetooth/BluetoothHeadset;->stopVoiceRecognition(Landroid/bluetooth/BluetoothDevice;)Z

    const/4 v0, 0x0

    iput-object v0, p0, Ln0/q;->J:Landroid/bluetooth/BluetoothDevice;

    :cond_1
    return-void
.end method

.method private final O()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    iget v1, p0, Ln0/q;->l:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private final P(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "errorMsg"

    invoke-virtual {v0, v1, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string p1, "permanent"

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    iget-object p1, p0, Ln0/q;->S:Landroid/os/Handler;

    new-instance v1, Ln0/n;

    invoke-direct {v1, p0, v0}, Ln0/n;-><init>(Ln0/q;Lorg/json/JSONObject;)V

    invoke-virtual {p1, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method

.method private static final Q(Ln0/q;Lorg/json/JSONObject;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$speechError"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ln0/q;->k:Lr8/k;

    if-eqz p0, :cond_0

    sget-object v0, Ln0/g;->l:Ln0/g;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lr8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method private final R()V
    .locals 4

    iget-boolean v0, p0, Ln0/q;->C:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-static {}, Landroid/bluetooth/BluetoothAdapter;->getDefaultAdapter()Landroid/bluetooth/BluetoothAdapter;

    move-result-object v0

    iput-object v0, p0, Ln0/q;->H:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/bluetooth/BluetoothAdapter;->getBondedDevices()Ljava/util/Set;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    iput-object v0, p0, Ln0/q;->I:Ljava/util/Set;

    new-instance v0, Ln0/q$b;

    invoke-direct {v0, p0}, Ln0/q$b;-><init>(Ln0/q;)V

    iget-object v1, p0, Ln0/q;->H:Landroid/bluetooth/BluetoothAdapter;

    if-eqz v1, :cond_2

    iget-object v2, p0, Ln0/q;->j:Landroid/content/Context;

    const/4 v3, 0x1

    invoke-virtual {v1, v2, v0, v3}, Landroid/bluetooth/BluetoothAdapter;->getProfileProxy(Landroid/content/Context;Landroid/bluetooth/BluetoothProfile$ServiceListener;I)Z

    :cond_2
    return-void
.end method

.method private final S(Ljava/lang/String;ZLn0/f;Z)V
    .locals 1

    const-string v0, "setupRecognizerIntent"

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    iget-object v0, p0, Ln0/q;->L:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-static {v0, p1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Ln0/q;->M:Z

    if-ne p2, v0, :cond_0

    iget-object v0, p0, Ln0/q;->N:Ln0/f;

    if-eq v0, p3, :cond_1

    :cond_0
    iput-object p1, p0, Ln0/q;->L:Ljava/lang/String;

    iput-boolean p2, p0, Ln0/q;->M:Z

    iput-object p3, p0, Ln0/q;->N:Ln0/f;

    iget-object p3, p0, Ln0/q;->S:Landroid/os/Handler;

    new-instance v0, Ln0/p;

    invoke-direct {v0, p0, p2, p1, p4}, Ln0/p;-><init>(Ln0/q;ZLjava/lang/String;Z)V

    invoke-virtual {p3, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_1
    return-void
.end method

.method private static final T(Ln0/q;ZLjava/lang/String;Z)V
    .locals 3

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "$languageTag"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.speech.action.RECOGNIZE_SPEECH"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const-string v1, "In RecognizerIntent apply"

    invoke-direct {p0, v1}, Ln0/q;->w(Ljava/lang/String;)V

    const-string v1, "android.speech.extra.LANGUAGE_MODEL"

    const-string v2, "free_form"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "put model"

    invoke-direct {p0, v1}, Ln0/q;->w(Ljava/lang/String;)V

    iget-object v1, p0, Ln0/q;->j:Landroid/content/Context;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v1

    iget-object v1, v1, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    const-string v2, "calling_package"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    :cond_0
    const-string v1, "put package"

    invoke-direct {p0, v1}, Ln0/q;->w(Ljava/lang/String;)V

    const-string v1, "android.speech.extra.PARTIAL_RESULTS"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    const-string p1, "put partial"

    invoke-direct {p0, p1}, Ln0/q;->w(Ljava/lang/String;)V

    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/Locale;->toLanguageTag()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    const-string p1, "android.speech.extra.LANGUAGE"

    invoke-virtual {v0, p1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "put languageTag"

    invoke-direct {p0, p1}, Ln0/q;->w(Ljava/lang/String;)V

    :cond_1
    if-eqz p3, :cond_2

    const-string p1, "android.speech.extra.PREFER_OFFLINE"

    invoke-virtual {v0, p1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    :cond_2
    const/16 p1, 0xa

    const-string p2, "android.speech.extra.MAX_RESULTS"

    invoke-virtual {v0, p2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    iput-object v0, p0, Ln0/q;->G:Landroid/content/Intent;

    return-void
.end method

.method private final U(Lr8/k$d;Ljava/lang/String;ZIZ)V
    .locals 3

    invoke-direct {p0}, Ln0/q;->O()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Ln0/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Ln0/q;->E()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Ln0/q;->D:Z

    invoke-direct {p0, p5}, Ln0/q;->u(Z)V

    const/high16 v0, 0x447a0000    # 1000.0f

    iput v0, p0, Ln0/q;->Q:F

    const/high16 v0, -0x3d380000    # -100.0f

    iput v0, p0, Ln0/q;->R:F

    const-string v0, "Start listening"

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    sget-object v0, Ln0/f;->j:Ln0/f;

    sget-object v1, Ln0/f;->k:Ln0/f;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-ne p4, v2, :cond_1

    move-object v0, v1

    :cond_1
    invoke-direct {p0}, Ln0/q;->M()V

    invoke-direct {p0, p2, p3, v0, p5}, Ln0/q;->S(Ljava/lang/String;ZLn0/f;Z)V

    iget-object p2, p0, Ln0/q;->S:Landroid/os/Handler;

    new-instance p3, Ln0/j;

    invoke-direct {p3, p0}, Ln0/j;-><init>(Ln0/q;)V

    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p2

    iput-wide p2, p0, Ln0/q;->P:J

    const/4 p2, 0x1

    invoke-direct {p0, p2}, Ln0/q;->J(Z)V

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, Lr8/k$d;->a(Ljava/lang/Object;)V

    const-string p1, "Start listening done"

    invoke-direct {p0, p1}, Ln0/q;->w(Ljava/lang/String;)V

    return-void

    :cond_2
    :goto_0
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, p2}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private static final V(Ln0/q;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln0/q;->F:Landroid/speech/SpeechRecognizer;

    if-eqz v0, :cond_0

    iget-object p0, p0, Ln0/q;->G:Landroid/content/Intent;

    invoke-virtual {v0, p0}, Landroid/speech/SpeechRecognizer;->startListening(Landroid/content/Intent;)V

    :cond_0
    return-void
.end method

.method private final W(Lr8/k$d;)V
    .locals 2

    invoke-direct {p0}, Ln0/q;->O()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Ln0/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Ln0/q;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Stop listening"

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    iget-object v0, p0, Ln0/q;->S:Landroid/os/Handler;

    new-instance v1, Ln0/k;

    invoke-direct {v1, p0}, Ln0/k;-><init>(Ln0/q;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-boolean v0, p0, Ln0/q;->s:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Ln0/q;->x()V

    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ln0/q;->J(Z)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V

    const-string p1, "Stop listening done"

    invoke-direct {p0, p1}, Ln0/q;->w(Ljava/lang/String;)V

    return-void

    :cond_2
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private static final X(Ln0/q;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ln0/q;->F:Landroid/speech/SpeechRecognizer;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/speech/SpeechRecognizer;->stopListening()V

    :cond_0
    return-void
.end method

.method private final Y(Landroid/os/Bundle;Z)V
    .locals 9

    invoke-direct {p0, p2}, Ln0/q;->D(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "Discarding duplicate final"

    invoke-direct {p0, p1}, Ln0/q;->w(Ljava/lang/String;)V

    return-void

    :cond_0
    if-eqz p1, :cond_1

    const-string v0, "results_recognition"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object v0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    const/4 v2, 0x1

    xor-int/2addr v1, v2

    if-eqz v1, :cond_4

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const-string v3, "finalResult"

    invoke-virtual {v1, v3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    const-string p2, "confidence_scores"

    invoke-virtual {p1, p2}, Landroid/os/Bundle;->getFloatArray(Ljava/lang/String;)[F

    move-result-object p1

    new-instance p2, Lorg/json/JSONArray;

    invoke-direct {p2}, Lorg/json/JSONArray;-><init>()V

    const/4 v3, 0x0

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v4

    sub-int/2addr v4, v2

    if-ltz v4, :cond_3

    :goto_1
    new-instance v5, Lorg/json/JSONObject;

    invoke-direct {v5}, Lorg/json/JSONObject;-><init>()V

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v6

    const-string v7, "recognizedWords"

    invoke-virtual {v5, v7, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v6, "confidence"

    if-eqz p1, :cond_2

    array-length v7, p1

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v8

    if-lt v7, v8, :cond_2

    aget v7, p1, v3

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v5, v6, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_2

    :cond_2
    iget-wide v7, p0, Ln0/q;->p:D

    invoke-virtual {v5, v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;D)Lorg/json/JSONObject;

    :goto_2
    invoke-virtual {p2, v5}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    if-eq v3, v4, :cond_3

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_3
    const-string p1, "alternates"

    invoke-virtual {v1, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "toString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "Calling results callback"

    invoke-direct {p0, p2}, Ln0/q;->w(Ljava/lang/String;)V

    iput-boolean v2, p0, Ln0/q;->D:Z

    iget-object p2, p0, Ln0/q;->k:Lr8/k;

    if-eqz p2, :cond_5

    sget-object v0, Ln0/g;->j:Ln0/g;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2, v0, p1}, Lr8/k;->c(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    const-string p1, "Results null or empty"

    invoke-direct {p0, p1}, Ln0/q;->w(Ljava/lang/String;)V

    :cond_5
    :goto_3
    return-void
.end method

.method public static synthetic a(Ln0/q;ZLjava/lang/String;Z)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ln0/q;->T(Ln0/q;ZLjava/lang/String;Z)V

    return-void
.end method

.method public static synthetic b(Ln0/q;F)V
    .locals 0

    invoke-static {p0, p1}, Ln0/q;->L(Ln0/q;F)V

    return-void
.end method

.method public static synthetic c(Ln0/q;Lorg/json/JSONObject;)V
    .locals 0

    invoke-static {p0, p1}, Ln0/q;->Q(Ln0/q;Lorg/json/JSONObject;)V

    return-void
.end method

.method public static synthetic h(Ln0/q;)V
    .locals 0

    invoke-static {p0}, Ln0/q;->y(Ln0/q;)V

    return-void
.end method

.method public static synthetic i(Ln0/q;)V
    .locals 0

    invoke-static {p0}, Ln0/q;->V(Ln0/q;)V

    return-void
.end method

.method public static synthetic k(Ln0/q;Z)V
    .locals 0

    invoke-static {p0, p1}, Ln0/q;->v(Ln0/q;Z)V

    return-void
.end method

.method public static synthetic l(Ln0/q;)V
    .locals 0

    invoke-static {p0}, Ln0/q;->X(Ln0/q;)V

    return-void
.end method

.method public static synthetic n(Ln0/q;)V
    .locals 0

    invoke-static {p0}, Ln0/q;->s(Ln0/q;)V

    return-void
.end method

.method public static final synthetic o(Ln0/q;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ln0/q;->w(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic p(Ln0/q;)Landroid/bluetooth/BluetoothHeadset;
    .locals 0

    iget-object p0, p0, Ln0/q;->K:Landroid/bluetooth/BluetoothHeadset;

    return-object p0
.end method

.method public static final synthetic q(Ln0/q;Landroid/bluetooth/BluetoothHeadset;)V
    .locals 0

    iput-object p1, p0, Ln0/q;->K:Landroid/bluetooth/BluetoothHeadset;

    return-void
.end method

.method private final r(Lr8/k$d;)V
    .locals 2

    invoke-direct {p0}, Ln0/q;->O()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Ln0/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Ln0/q;->G()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "Cancel listening"

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    iget-object v0, p0, Ln0/q;->S:Landroid/os/Handler;

    new-instance v1, Ln0/l;

    invoke-direct {v1, p0}, Ln0/l;-><init>(Ln0/q;)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    iget-boolean v0, p0, Ln0/q;->s:Z

    if-nez v0, :cond_1

    invoke-direct {p0}, Ln0/q;->x()V

    :cond_1
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ln0/q;->J(Z)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V

    const-string p1, "Cancel listening done"

    invoke-direct {p0, p1}, Ln0/q;->w(Ljava/lang/String;)V

    return-void

    :cond_2
    :goto_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, v0}, Lr8/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method

.method private static final s(Ln0/q;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Ln0/q;->F:Landroid/speech/SpeechRecognizer;

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Landroid/speech/SpeechRecognizer;->cancel()V

    :cond_0
    return-void
.end method

.method private final t()V
    .locals 5

    const-string v0, "completeInitialize"

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    iget-boolean v0, p0, Ln0/q;->w:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    const-string v0, "Testing recognition availability"

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    iget-object v0, p0, Ln0/q;->j:Landroid/content/Context;

    const-string v2, ""

    if-eqz v0, :cond_2

    invoke-static {v0}, Landroid/speech/SpeechRecognizer;->isRecognitionAvailable(Landroid/content/Context;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Ln0/q;->r:Ljava/lang/String;

    const-string v3, "Speech recognition not available on this device"

    invoke-static {v0, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, Ln0/q;->u:Lr8/k$d;

    if-eqz v0, :cond_0

    sget-object v4, Ln0/h;->m:Ln0/h;

    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v0, v4, v3, v2}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_0
    iput-object v1, p0, Ln0/q;->u:Lr8/k$d;

    return-void

    :cond_1
    invoke-direct {p0}, Ln0/q;->R()V

    goto :goto_0

    :cond_2
    const-string v0, "null context during initialization"

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    iget-object v0, p0, Ln0/q;->u:Lr8/k$d;

    if-eqz v0, :cond_3

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {v0, v3}, Lr8/k$d;->a(Ljava/lang/Object;)V

    :cond_3
    iget-object v0, p0, Ln0/q;->u:Lr8/k$d;

    if-eqz v0, :cond_4

    sget-object v3, Ln0/h;->o:Ln0/h;

    invoke-virtual {v3}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v3

    const-string v4, "context unexpectedly null, initialization failed"

    invoke-interface {v0, v3, v4, v2}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    iput-object v1, p0, Ln0/q;->u:Lr8/k$d;

    return-void

    :cond_5
    :goto_0
    iget-boolean v0, p0, Ln0/q;->w:Z

    iput-boolean v0, p0, Ln0/q;->v:Z

    const-string v0, "sending result"

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    iget-object v0, p0, Ln0/q;->u:Lr8/k$d;

    if-eqz v0, :cond_6

    iget-boolean v2, p0, Ln0/q;->w:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-interface {v0, v2}, Lr8/k$d;->a(Ljava/lang/Object;)V

    :cond_6
    const-string v0, "leaving complete"

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    iput-object v1, p0, Ln0/q;->u:Lr8/k$d;

    return-void
.end method

.method private final u(Z)V
    .locals 3

    iget-object v0, p0, Ln0/q;->F:Landroid/speech/SpeechRecognizer;

    if-eqz v0, :cond_0

    iget-boolean v1, p0, Ln0/q;->E:Z

    if-ne p1, v1, :cond_0

    return-void

    :cond_0
    iput-boolean p1, p0, Ln0/q;->E:Z

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Landroid/speech/SpeechRecognizer;->destroy()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Ln0/q;->F:Landroid/speech/SpeechRecognizer;

    iget-object v0, p0, Ln0/q;->S:Landroid/os/Handler;

    new-instance v1, Ln0/o;

    invoke-direct {v1, p0, p1}, Ln0/o;-><init>(Ln0/q;Z)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    const-string p1, "before setup intent"

    invoke-direct {p0, p1}, Ln0/q;->w(Ljava/lang/String;)V

    iget-object p1, p0, Ln0/q;->T:Ljava/lang/String;

    const/4 v0, 0x1

    sget-object v1, Ln0/f;->j:Ln0/f;

    const/4 v2, 0x0

    invoke-direct {p0, p1, v0, v1, v2}, Ln0/q;->S(Ljava/lang/String;ZLn0/f;Z)V

    const-string p1, "after setup intent"

    invoke-direct {p0, p1}, Ln0/q;->w(Ljava/lang/String;)V

    return-void
.end method

.method private static final v(Ln0/q;Z)V
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Creating recognizer"

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    iget-boolean v0, p0, Ln0/q;->A:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    iget-object p1, p0, Ln0/q;->j:Landroid/content/Context;

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Ln0/q;->z(Landroid/content/Context;)Landroid/content/ComponentName;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-static {p1, v0}, Landroid/speech/SpeechRecognizer;->createSpeechRecognizer(Landroid/content/Context;Landroid/content/ComponentName;)Landroid/speech/SpeechRecognizer;

    move-result-object p1

    const-string v0, "Setting listener after intent lookup"

    goto :goto_1

    :cond_1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-lt v0, v2, :cond_2

    if-eqz p1, :cond_2

    iget-object p1, p0, Ln0/q;->j:Landroid/content/Context;

    invoke-static {p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    invoke-static {p1}, Landroid/speech/SpeechRecognizer;->isOnDeviceRecognitionAvailable(Landroid/content/Context;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Ln0/q;->j:Landroid/content/Context;

    invoke-static {p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    invoke-static {p1}, Landroid/speech/SpeechRecognizer;->createOnDeviceSpeechRecognizer(Landroid/content/Context;)Landroid/speech/SpeechRecognizer;

    move-result-object p1

    const-string v0, "Setting on device listener"

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Landroid/speech/SpeechRecognizer;->setRecognitionListener(Landroid/speech/RecognitionListener;)V

    iput-object p1, p0, Ln0/q;->F:Landroid/speech/SpeechRecognizer;

    :cond_2
    iget-object p1, p0, Ln0/q;->F:Landroid/speech/SpeechRecognizer;

    if-nez p1, :cond_3

    iget-object p1, p0, Ln0/q;->j:Landroid/content/Context;

    invoke-static {p1}, Landroid/speech/SpeechRecognizer;->createSpeechRecognizer(Landroid/content/Context;)Landroid/speech/SpeechRecognizer;

    move-result-object p1

    const-string v0, "Setting default listener"

    :goto_1
    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    invoke-virtual {p1, p0}, Landroid/speech/SpeechRecognizer;->setRecognitionListener(Landroid/speech/RecognitionListener;)V

    iput-object p1, p0, Ln0/q;->F:Landroid/speech/SpeechRecognizer;

    :cond_3
    iget-object p1, p0, Ln0/q;->F:Landroid/speech/SpeechRecognizer;

    if-nez p1, :cond_5

    iget-object p1, p0, Ln0/q;->r:Ljava/lang/String;

    const-string v0, "Speech recognizer null"

    invoke-static {p1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object p1, p0, Ln0/q;->u:Lr8/k$d;

    if-eqz p1, :cond_4

    sget-object v2, Ln0/h;->m:Ln0/h;

    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    const-string v3, ""

    invoke-interface {p1, v2, v0, v3}, Lr8/k$d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :cond_4
    iput-object v1, p0, Ln0/q;->u:Lr8/k$d;

    :cond_5
    return-void
.end method

.method private final w(Ljava/lang/String;)V
    .locals 1

    iget-boolean v0, p0, Ln0/q;->y:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Ln0/q;->r:Ljava/lang/String;

    invoke-static {v0, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-void
.end method

.method private final x()V
    .locals 4

    iget-object v0, p0, Ln0/q;->S:Landroid/os/Handler;

    new-instance v1, Ln0/i;

    invoke-direct {v1, p0}, Ln0/i;-><init>(Ln0/q;)V

    const-wide/16 v2, 0x32

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method private static final y(Ln0/q;)V
    .locals 1

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "Recognizer destroy"

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    iget-object v0, p0, Ln0/q;->F:Landroid/speech/SpeechRecognizer;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/speech/SpeechRecognizer;->destroy()V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Ln0/q;->F:Landroid/speech/SpeechRecognizer;

    return-void
.end method

.method private final z(Landroid/content/Context;)Landroid/content/ComponentName;
    .locals 4

    invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p1

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.speech.RecognitionService"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    move-result-object p1

    const-string v0, "queryIntentServices(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RecognitionService, found: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/pm/ResolveInfo;

    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz v1, :cond_0

    invoke-static {v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "RecognitionService: packageName: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ", name: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, v1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Ln0/q;->w(Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lt9/n;->u(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/content/pm/ResolveInfo;

    if-eqz p1, :cond_2

    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->serviceInfo:Landroid/content/pm/ServiceInfo;

    if-eqz p1, :cond_2

    new-instance v0, Landroid/content/ComponentName;

    iget-object v1, p1, Landroid/content/pm/ServiceInfo;->packageName:Ljava/lang/String;

    iget-object p1, p1, Landroid/content/pm/ServiceInfo;->name:Ljava/lang/String;

    invoke-direct {v0, v1, p1}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_2
    const/4 v0, 0x0

    :goto_1
    return-object v0
.end method


# virtual methods
.method public I(Lr8/j;Lr8/k$d;)V
    .locals 7

    const-string v0, "call"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rawrResult"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln0/d;

    invoke-direct {v0, p2}, Ln0/d;-><init>(Lr8/k$d;)V

    :try_start_0
    iget-object p2, p1, Lr8/j;->a:Ljava/lang/String;

    if-eqz p2, :cond_e

    invoke-virtual {p2}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "initialize"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_0

    goto/16 :goto_0

    :cond_0
    const-string p2, "debugLogging"

    invoke-virtual {p1, p2}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    iput-boolean p2, p0, Ln0/q;->y:Z

    :cond_1
    const-string p2, "alwaysUseStop"

    invoke-virtual {p1, p2}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    if-eqz p2, :cond_2

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    iput-boolean p2, p0, Ln0/q;->z:Z

    :cond_2
    const-string p2, "intentLookup"

    invoke-virtual {p1, p2}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    if-eqz p2, :cond_3

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p2, v1}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    iput-boolean p2, p0, Ln0/q;->A:Z

    :cond_3
    const-string p2, "noBluetooth"

    invoke-virtual {p1, p2}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    if-eqz p1, :cond_4

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    iput-boolean p1, p0, Ln0/q;->B:Z

    :cond_4
    invoke-direct {p0, v0}, Ln0/q;->B(Lr8/k$d;)V

    goto/16 :goto_1

    :sswitch_1
    const-string p1, "locales"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto/16 :goto_0

    :cond_5
    invoke-direct {p0, v0}, Ln0/q;->H(Lr8/k$d;)V

    goto/16 :goto_1

    :sswitch_2
    const-string p1, "stop"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto/16 :goto_0

    :cond_6
    invoke-direct {p0, v0}, Ln0/q;->W(Lr8/k$d;)V

    goto/16 :goto_1

    :sswitch_3
    const-string v1, "listen"

    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_7

    goto/16 :goto_0

    :cond_7
    const-string p2, "localeId"

    invoke-virtual {p1, p2}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    if-nez p2, :cond_8

    iget-object p2, p0, Ln0/q;->T:Ljava/lang/String;

    :cond_8
    move-object v3, p2

    const-string p2, "partialResults"

    invoke-virtual {p1, p2}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    if-nez p2, :cond_9

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :cond_9
    const-string v1, "onDevice"

    invoke-virtual {p1, v1}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    if-nez v1, :cond_a

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    :cond_a
    const-string v2, "listenMode"

    invoke-virtual {p1, v2}, Lr8/j;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    if-nez p1, :cond_b

    sget-object p1, Ln0/h;->n:Ln0/h;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    const-string p2, "listenMode is required"

    const/4 v1, 0x0

    invoke-virtual {v0, p1, p2, v1}, Ln0/d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    return-void

    :cond_b
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    move-object v1, p0

    move-object v2, v0

    invoke-direct/range {v1 .. v6}, Ln0/q;->U(Lr8/k$d;Ljava/lang/String;ZIZ)V

    goto :goto_1

    :sswitch_4
    const-string p1, "has_permission"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_c

    goto :goto_0

    :cond_c
    invoke-direct {p0, v0}, Ln0/q;->A(Lr8/k$d;)V

    goto :goto_1

    :sswitch_5
    const-string p1, "cancel"

    invoke-virtual {p2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    goto :goto_0

    :cond_d
    invoke-direct {p0, v0}, Ln0/q;->r(Lr8/k$d;)V

    goto :goto_1

    :cond_e
    :goto_0
    invoke-virtual {v0}, Ln0/d;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object p2, p0, Ln0/q;->r:Ljava/lang/String;

    const-string v1, "Unexpected exception"

    invoke-static {p2, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sget-object p2, Ln0/h;->p:Ln0/h;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Ljava/lang/Exception;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p2, v1, p1}, Ln0/d;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    :goto_1
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        -0x5185d186 -> :sswitch_5
        -0x476f3b6c -> :sswitch_4
        -0x41b6f239 -> :sswitch_3
        0x360802 -> :sswitch_2
        0x142bbd59 -> :sswitch_1
        0x33ebcb90 -> :sswitch_0
    .end sparse-switch
.end method

.method public d(Li8/a$b;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    iput-object p1, p0, Ln0/q;->j:Landroid/content/Context;

    iget-object v0, p0, Ln0/q;->k:Lr8/k;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p1}, Lr8/k;->e(Lr8/k$c;)V

    :cond_0
    iput-object p1, p0, Ln0/q;->k:Lr8/k;

    return-void
.end method

.method public e(Lj8/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lj8/c;->d()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Ln0/q;->t:Landroid/app/Activity;

    invoke-interface {p1, p0}, Lj8/c;->c(Lr8/p;)V

    return-void
.end method

.method public f(Lj8/c;)V
    .locals 1

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lj8/c;->d()Landroid/app/Activity;

    move-result-object v0

    iput-object v0, p0, Ln0/q;->t:Landroid/app/Activity;

    invoke-interface {p1, p0}, Lj8/c;->c(Lr8/p;)V

    return-void
.end method

.method public g()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ln0/q;->t:Landroid/app/Activity;

    return-void
.end method

.method public j()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ln0/q;->t:Landroid/app/Activity;

    return-void
.end method

.method public m(Li8/a$b;)V
    .locals 2

    const-string v0, "flutterPluginBinding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li8/a$b;->a()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getApplicationContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Li8/a$b;->b()Lr8/c;

    move-result-object p1

    const-string v1, "getBinaryMessenger(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/l;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0, p1}, Ln0/q;->K(Landroid/content/Context;Lr8/c;)V

    return-void
.end method

.method public onBeginningOfSpeech()V
    .locals 0

    return-void
.end method

.method public onBufferReceived([B)V
    .locals 0

    return-void
.end method

.method public onEndOfSpeech()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ln0/q;->J(Z)V

    return-void
.end method

.method public onError(I)V
    .locals 5

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Ln0/q;->P:J

    sub-long/2addr v0, v2

    const/4 v2, 0x7

    if-ne v2, p1, :cond_0

    iget v2, p0, Ln0/q;->R:F

    iget v3, p0, Ln0/q;->q:I

    int-to-float v3, v3

    cmpg-float v2, v2, v3

    if-gez v2, :cond_0

    const/4 v2, 0x6

    goto :goto_0

    :cond_0
    move v2, p1

    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Error "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v4, " after start at "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v0, 0x20

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget v0, p0, Ln0/q;->Q:F

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v0, " / "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v0, p0, Ln0/q;->R:F

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    packed-switch v2, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "error_unknown ("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 p1, 0x29

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :pswitch_0
    const-string p1, "error_language_unavailable"

    goto :goto_1

    :pswitch_1
    const-string p1, "error_language_not_supported"

    goto :goto_1

    :pswitch_2
    const-string p1, "error_server_disconnected"

    goto :goto_1

    :pswitch_3
    const-string p1, "error_too_many_requests"

    goto :goto_1

    :pswitch_4
    const-string p1, "error_permission"

    goto :goto_1

    :pswitch_5
    const-string p1, "error_busy"

    goto :goto_1

    :pswitch_6
    const-string p1, "error_no_match"

    goto :goto_1

    :pswitch_7
    const-string p1, "error_speech_timeout"

    goto :goto_1

    :pswitch_8
    const-string p1, "error_client"

    goto :goto_1

    :pswitch_9
    const-string p1, "error_server"

    goto :goto_1

    :pswitch_a
    const-string p1, "error_audio_error"

    goto :goto_1

    :pswitch_b
    const-string p1, "error_network"

    goto :goto_1

    :pswitch_c
    const-string p1, "error_network_timeout"

    :goto_1
    invoke-direct {p0, p1}, Ln0/q;->P(Ljava/lang/String;)V

    invoke-direct {p0}, Ln0/q;->E()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x0

    invoke-direct {p0, p1}, Ln0/q;->J(Z)V

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public onEvent(ILandroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onPartialResults(Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ln0/q;->Y(Landroid/os/Bundle;Z)V

    return-void
.end method

.method public onReadyForSpeech(Landroid/os/Bundle;)V
    .locals 0

    return-void
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)Z
    .locals 1

    const-string v0, "permissions"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "grantResults"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/l;->e(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Ln0/q;->o:I

    const/4 v0, 0x0

    if-ne p1, p2, :cond_5

    array-length p1, p3

    const/4 p2, 0x1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    xor-int/2addr p1, p2

    if-eqz p1, :cond_1

    aget p1, p3, v0

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_1

    :cond_1
    const/4 p1, 0x0

    :goto_1
    iput-boolean p1, p0, Ln0/q;->w:Z

    array-length p1, p3

    if-nez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    :goto_2
    if-nez p1, :cond_3

    array-length p1, p3

    if-eq p1, p2, :cond_3

    aget p1, p3, p2

    if-nez p1, :cond_3

    iget-boolean p1, p0, Ln0/q;->B:Z

    if-eqz p1, :cond_4

    :cond_3
    const/4 v0, 0x1

    :cond_4
    iput-boolean v0, p0, Ln0/q;->C:Z

    invoke-direct {p0}, Ln0/q;->t()V

    return p2

    :cond_5
    return v0
.end method

.method public onResults(Landroid/os/Bundle;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, v0}, Ln0/q;->Y(Landroid/os/Bundle;Z)V

    return-void
.end method

.method public onRmsChanged(F)V
    .locals 2

    iget v0, p0, Ln0/q;->Q:F

    cmpg-float v0, p1, v0

    if-gez v0, :cond_0

    iput p1, p0, Ln0/q;->Q:F

    :cond_0
    iget v0, p0, Ln0/q;->R:F

    cmpl-float v0, p1, v0

    if-lez v0, :cond_1

    iput p1, p0, Ln0/q;->R:F

    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "rmsDB "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ln0/q;->Q:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, " / "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ln0/q;->R:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ln0/q;->w(Ljava/lang/String;)V

    iget-object v0, p0, Ln0/q;->S:Landroid/os/Handler;

    new-instance v1, Ln0/m;

    invoke-direct {v1, p0, p1}, Ln0/m;-><init>(Ln0/q;F)V

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void
.end method
