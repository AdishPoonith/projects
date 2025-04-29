.class public final Lm4/f;
.super Lc4/h;
.source "SourceFile"


# instance fields
.field private final R:Lu3/a$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/os/Looper;Lc4/e;Lu3/a$a;Lcom/google/android/gms/common/api/f$a;Lcom/google/android/gms/common/api/f$b;)V
    .locals 7

    const/16 v3, 0x44

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p3

    move-object v5, p5

    move-object v6, p6

    invoke-direct/range {v0 .. v6}, Lc4/h;-><init>(Landroid/content/Context;Landroid/os/Looper;ILc4/e;Lcom/google/android/gms/common/api/f$a;Lcom/google/android/gms/common/api/f$b;)V

    new-instance p1, Lu3/a$a$a;

    if-nez p4, :cond_0

    sget-object p4, Lu3/a$a;->m:Lu3/a$a;

    :cond_0
    invoke-direct {p1, p4}, Lu3/a$a$a;-><init>(Lu3/a$a;)V

    invoke-static {}, Lm4/c;->a()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lu3/a$a$a;->a(Ljava/lang/String;)Lu3/a$a$a;

    new-instance p2, Lu3/a$a;

    invoke-direct {p2, p1}, Lu3/a$a;-><init>(Lu3/a$a$a;)V

    iput-object p2, p0, Lm4/f;->R:Lu3/a$a;

    return-void
.end method


# virtual methods
.method protected final D()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    return-object v0
.end method

.method protected final E()Ljava/lang/String;
    .locals 1

    const-string v0, "com.google.android.gms.auth.api.credentials.service.START"

    return-object v0
.end method

.method public final h()I
    .locals 1

    const v0, 0xc35000

    return v0
.end method

.method protected final synthetic r(Landroid/os/IBinder;)Landroid/os/IInterface;
    .locals 2

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const-string v0, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lm4/g;

    if-eqz v1, :cond_1

    move-object p1, v0

    check-cast p1, Lm4/g;

    goto :goto_0

    :cond_1
    new-instance v0, Lm4/g;

    invoke-direct {v0, p1}, Lm4/g;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    :goto_0
    return-object p1
.end method

.method protected final z()Landroid/os/Bundle;
    .locals 1

    iget-object v0, p0, Lm4/f;->R:Lu3/a$a;

    invoke-virtual {v0}, Lu3/a$a;->a()Landroid/os/Bundle;

    move-result-object v0

    return-object v0
.end method
